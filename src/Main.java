import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Kaiser
*****************************************************************************************************
*/

public class Main {
    public static void main(String[] args) {
    int age = 0;
    String firstName="";
    String favouriteFood="";
    System.out.println("How old are you? ");
    Scanner ageScan = new Scanner(System.in);
    String ageStr = ageScan.nextLine();
    age = Integer.parseInt(ageStr);
    System.out.println("What is your name? ");
    Scanner name=new Scanner(System.in);
    firstName=name.nextLine();
    System.out.println("What is your favourite food? ");
    Scanner food=new Scanner(System.in);
    favouriteFood=name.nextLine();
    System.out.println("Name: "+firstName+"\n"+"Age: "+age+"\n"+"Favourite food: "+favouriteFood);

    }

}
