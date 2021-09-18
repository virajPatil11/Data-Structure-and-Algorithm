package stackk;
import java.util.*;
public class BalancedParanthesis {
	public static void main(String[] args) {
		String exp = "([{}])";
		if(check(exp))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
	static boolean check(String exp) {
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for(int i = 0; i < exp.length(); i++) {
			char x = exp.charAt(i);
			
			if(x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			if(stack.isEmpty())
				return false;
			char check;
			switch(x) {
			case ')' :
				check = stack.pop();
				if(check == '{' || check == '[')
					return false;
				break;
			case ']' :
				check = stack.pop();
				if(check == '{' || check == '(')
					return false;
				break;
			case '}' :
				check = stack.pop();
				if(check == '(' || check == '[')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
}
