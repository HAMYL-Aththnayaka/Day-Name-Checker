//switch case

/*********************
*switch (expression)

*case value1:
	statement 1;
*case value2:
	statement 2;
*case value 3:
	statement 3;
	******/

//write a java program to find the day of the week using switch case
	
import java.util.Scanner;
public class Switch1{
	public static void main(String args[]){
		
		Scanner reader=new Scanner(System.in);
		
		System.out.print("\nEnter Your day:");	
		int day=reader.nextInt();
		
		switch (day)
		{

case 1:
	System.out.print("To day is Monday");
	break;
	
case 2:
	System.out.print("To day is Tuesday");
	break;
	
case 3:
	System.out.print("To day is Wednesday");
	break;
	
case 4:
	System.out.print("To day is Thursday");
	break;
	
case 5:	
	System.out.print("To day is Friday");
	break;
	
case 6:	
	System.out.print("To day is Saturday");
	break;
	
case 7:	
	System.out.print("To day is Sunday");
	break;
	
default:
	System.out.print("Incorrect value");
	
		}
	}
}
	