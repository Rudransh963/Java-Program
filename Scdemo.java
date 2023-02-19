import java.util.Scanner;
class Scdemo{
	public static void main(String[] demo)
		{
			Scanner sc = new Scanner(System.in);
			
			
			
			System.out.println("enter name :-");
			String name = sc.nextLine();
			System.out.println("name : "+name);
			System.out.println("enter age");
			int age = sc.nextInt();
			System.out.println("age : "+age);
			System.out.println("Enter mobile number");
			long mobileNo = sc.nextLong();
			System.out.println("moblie number : "+mobileNo);
			
		}
}