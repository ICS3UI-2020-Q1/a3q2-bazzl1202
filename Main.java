import java.util.Scanner;
/**
 * Creating a dichotomous key to determine the animal the user has chosen.
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user if the animal has feathers
    System.out.println("Does the animal have feathers?");
    String featherAnswer = input.nextLine();

    // see if the animal has feathers or not
    if(featherAnswer.equals("yes")){
      // ask if the anmial swims
      System.out.println("Does the animal swim?");
      String swims = input.nextLine();

      // determine what swimming animal it is
      if(swims.equals("yes")){
        System.out.println("This is a duck");
      }else{
        System.out.println("This is a hen");
      }
    }else{
      // ask if the animal has legs
      System.out.println("Does the animal have legs?");
      String legs = input.nextLine();

      // determine what leg animal it is
      if(legs.equals("yes")){
        System.out.println("This is a Lizard");
      }else{ 
        System.out.println("This is a snake");
      }
    }
    
  }
}
