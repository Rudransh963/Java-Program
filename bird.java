class NewBird{
public static void main(String[] args){
	Bird b = new Bird("Peacock");
	b.PrintName();
	}
}

class Bird{
String name;
Bird(String name1){
	name=name1;
	}
Public void PrintName(){
System.out.println(name);
}
}