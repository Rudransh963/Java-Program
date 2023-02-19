import java.util.scanner;
class another{
public static void main(){
	Scanner sc = new scanner(System.in);
	System.out.println("Enter the first number :- ");
	int a = nextInt();
	System.out.println("Enter the second number :- ");
	int b = nextInt();
	Sum s = new sum(x,y);
	s.PrintSum();
	}
}

class Sum{
Sum(int x, int y){

}public void PrintSum(){
System.out.println("The sum is :-"+(x+y));
}
}