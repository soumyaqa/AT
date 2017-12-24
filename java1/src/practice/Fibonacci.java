package practice;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum=0;
		System.out.println("User input : "+a+"  "+b);
		for(int i = 0; i <=i+2 ; i++) {
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
	}

}
