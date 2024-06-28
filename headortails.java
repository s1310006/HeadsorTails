import java.util.Random;

class HeadorTails {
    public static void main(String[] args){
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
