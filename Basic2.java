//Program 3
//Mutliplication of 2 numbers
package almamatter2;

import java.util.Scanner;

public class Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter value for i ....:\n");
			int i=scan.nextInt();
		System.out.println("Enter value for s1 ....:\n");
			short s1=scan.nextShort();
			
		System.out.println("Enter value for j .....:\n");
		    int j=scan.nextInt();
		System.out.println("Enter value for s2 ....:\n");
		    short s2=scan.nextShort();
		    
		    
		    int mul=i*j;
		    //short s=(s1*s2);
		    int s=s1*s2;
		    
		System.out .println("The multiplication of "+i+" and "+j+ "   is...:"+mul);
	    System.out .println("The multiplication of "+s1+" and "+s2+ "   is...:"+s);

	}
}
