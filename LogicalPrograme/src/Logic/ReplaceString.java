package Logic;

public class ReplaceString {
public static void main(String[] args) {
	String s ="Hassan";
	for(int i=0;i<=s.length()-1;i++) {
		if(s.charAt(i)!='s') {
			System.out.print(s.charAt(i));
		}
	}
}
}
