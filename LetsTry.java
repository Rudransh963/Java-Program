import java.util.Scanner;
class LetsTry{
public static void main(String[] let){
	Scanner sc = new Scanner(System.in);
	System.out.println("Do you want to write words");
	System.out.println("or");
	System.out.println("Do you want to write numbers");
	System.out.println("Please enter your choice by pressing 1 for words \n or \n by pressing 2 for number");
	int a = sc.nextInt();
	if(a==1){
		System.out.println("Please write your words here:-");
		String word = sc.nextLine();
		System.out.println("The words you have written are as follows :- "+word);
		}
		else if(a==2){
			System.out.println("Please write your numbers here:-");
		long c = sc.nextLong();
		System.out.println("The numbers you have written are as follows :- "+c);
		
			}
			else{
				System.out.println("The entered choice is invalid");
				 }
	}
}