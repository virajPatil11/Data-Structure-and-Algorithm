package string;

class Find{
	static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];
    
    static void getCharCount(String str) {
    	for(int  i = 0 ;i < str.length(); i++) {
    		count[str.charAt(i)]++;
    	}
    }
    static int firstNonRepeating(String str) {
    	getCharCount(str);
    	int index = -1,i;
    	
    	for(i = 0; i < str.length(); i++) {
    		if(count[str.charAt(i)] == 1) {
    			index = i;
    			break;
    		}
    	}
    	return index;
    }
}


public class leftMostNotRepeat {
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		Find f = new Find();
		System.out.println(f.firstNonRepeating(str));
        
	}
	
}
