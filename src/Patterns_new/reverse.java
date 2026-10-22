package Patterns_new;

public class reverse {

	public static void main(String[] args) {
		
		String str="aba";
//		for(int i=str.length()-1;i>=0;i--) {
//			System.out.print(str.charAt(i));
//		}
		
		String reverse=new StringBuilder(str).reverse().toString();
		System.out.println(reverse);
		
		
		if(str==reverse){
			System.out.println("palindrome");
		}else {
			System.out.println("not palindorme");
		}
		
	}
}
