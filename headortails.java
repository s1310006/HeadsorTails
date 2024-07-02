import java.util.Random;
import java.util.Scanner;

class HeadorTails {
    public static void main(String[] args){
	    
	Scanner s = new Scanner(System.in);
	String name = new String();
	System.out.println("Who are you?");
	System.out.print(">");
	name=s.nextLine();
	System.out.println("Hallo,"+name+"!");
	    
	Random rand = new Random();
	int head=0,tail=0;
	System.out.println("Tossing a coin...");
	for(int i=1;i<=3;i++){
	    int num = rand.nextInt(2);
	    if(num%2==0){
		System.out.println("Round"+i+": Heads");
		head++;
	    }
	    else {
		System.out.println("Round"+i+": Tails");
		tail++;
	    }
	}
	System.out.println("Heads: "+head+", Tails: "+tail);
    }
}
