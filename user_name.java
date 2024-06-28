import java.util.Scanner;

class username{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	String name = new String();
	System.out.println("Who are you?");
	System.out.print(">");
	name=s.nextLine();
	System.out.println("Hallo,"+name+"!");
    }
}
