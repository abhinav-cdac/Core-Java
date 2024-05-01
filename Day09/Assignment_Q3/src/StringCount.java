import java.util.StringTokenizer;

public class StringCount {

	public static void main(String[] args) {
		String data = "The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a stringwith all characters translated to uppercase or to lowercase. Case mapping is based on the UnicodeStandard version specified by the Character class.";
		
			StringTokenizer stk = new StringTokenizer(data);
			int count = stk.countTokens();
			System.out.println("Word count:- "+count);
			
			for(int i = 0; i< count;i++) {
				System.out.println("Token["+i+"] = "+stk.nextToken());
			}
	}

}
