class NewBird{
public static void main(String[] args){
	Bird b = new Bird("Peacock");
	Bird c = new Bird("Hen");
	b.PrintName();
	c.PrintName();
	}
}

class Bird{
String name;
Bird(String name1){
	name=name1;
	}
public void PrintName(){
System.out.println(name);
}
}