package Patterns_new;

public class count {

	public static void main(String[] args) {

		
		int a=0,b=1;
		int n=20;
		System.out.println(" a is : "+a +" b is : "+ b);
		
		for(int i=3;i<=n;i++) {
			int c=a+b;
			System.out.println("c is : "+c);

		a=b;
		b=c;
		}

	}

}
