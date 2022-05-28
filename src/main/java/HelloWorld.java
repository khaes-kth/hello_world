import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
	String[] names={"skywalker","yoda","Obi-Wan","Kenobi", "Qui-Gon","Jinn"};
        System.out.println("Hi, whats your name?");//are you a jedi?
	Scanner input = new Scanner(System.in);
        String myString = input.next();
	for(String name :names){
		if(myString.contains(name)){
			System.out.println("May the Force be with you!");
			return;
		}
	}
	System.out.println("Hello " +myString);
	
    }
}
