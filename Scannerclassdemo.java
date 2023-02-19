import java.util.Scanner;
class Scannerclassdemo{
public static void main(String[] demo){
	Scanner myobj = new Scanner(System.in);
	System.out.print("Enter the name of the student : ");
	String name = myobj.nextLine();
	System.out.print("Enter age of the student : ");
	int age = myobj.nextInt();
	System.out.print("Enter the gender of the student");
	char gender = myobj.next().charAt(0);
System.out.println(gender);
	}
}