import java.util.Scanner;
class Scd{
public static void main(String[] demo){
	Scanner myobj= new Scanner(System.in);
	System.out.print("Enter the name of the student : ");
	String name = myobj.nextLine();
	System.out.print("Enter age of the student : ");
	int age = myobj.nextInt();
	System.out.print("Enter the gender of the student : ");
	char gender = myobj.next().charAt(0);
	System.out.print("Enter mobile number of the studdent : ");
	long number = myobj.nextLong();
	System.out.println("name : "+name);
	System.out.println("age : "+age);
	System.out.println("gender : "+gender);
	System.out.println("mobile number : "+number);
	}
}