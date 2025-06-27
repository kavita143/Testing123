import java.util.Scanner;

public class Test {
	
	
	int traineeId; // instance variables
	

	public static void main(String[] arg) {
		// TODO Auto-generated method stub
		
		int id;  // local variables
		
		//System.out.println(id);
		
		String[] arr = new String[10]; // collection of similar data type elements
		arr[7]="testing array";
		System.out.println(arr[11]);// 0
		
		System.out.println("hello world");
		System.out.println(arg[2]);
		
		Scanner scr = new Scanner(System.in);
		String s=scr.next();
		System.out.println(s);
		
		int a= 30;
		
		int b = 70;
		
		System.out.print(a+b);
		
		System.out.print(a-b);
		
		
		int number=1;
		
		switch(number) {
		
		case 1: System.out.println(a);
			break;
				
		case 2: System.out.println("number is 2");
		break;
			
		default:System.out.println("does not match");	
		
		}
		int i=10;
		for(;i<10;) {
			System.out.println("inside for loop");
			i=i+1;
		}
		int j=1;
		while(j<10) {
			System.out.println("inside while loop");
			if(j==5)
				break;
			j++;
		}
		int k=1;
		do {
			System.out.println("inside do while");
			if(k==2)
				continue;
			k++;
		}while(k<10);
		
		
		
		
		
		

	}

}
