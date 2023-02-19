import java.util.Scanner;
class PRIME {
    public static void main(String[] prime) {
int flag =-1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :-");
        long a = sc.nextLong();
		if(a==1){
			System.out.println("It is unit number");
			}else if(a!=1){	
		for(long i=2;i<a;i++){
		if(a%i==0){
			System.out.println("The number is not a prime number");
			flag=1;
			break;
		}
		}
		}
		if(flag == -1){
		System.out.println("The number is a prime number");
		}
    }
}