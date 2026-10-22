package Patterns_new;

public class patterns1 {

	public static void main(String[] args) {
		
		
//	int n=-23455;
//	int num=Math.abs(n);
//	int count=0;
//	while(num>0) {
//		
//			num=num/10;
//		count++;
//	}
//	System.out.println(count);
		
		String name="saurabh";
//		int count= name.length();
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a') {
				count++;
			}
		}
		
		System.out.println("count is " +  count);
		
	}
	}


