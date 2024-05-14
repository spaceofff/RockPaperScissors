import java.util.Scanner;


public class rockpaperscissors {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Let's play Rock Paper Scissors.");
  System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
  System.out.print("\n Are you ready? Write 'yes' if you are: ");
  String answer = scan.nextLine();
  

  if (answer.equals("yes")) {
   System.out.println("Great!");
   System.out.println("rock -- paper -- scissors, shoot!");
   String yourChoice = scan.nextLine();
   String pcChoice = computerChoice();

    String finalResult = result(yourChoice, pcChoice);
    printResults(yourChoice, pcChoice, finalResult);

  }else {
   System.out.println("Okay, some other time...");
  }

 scan.close();

 }
 
 public static String computerChoice() {
  int randomNumber = (int) (Math.random() * 3);
  if (randomNumber == 0) {
   return "rock";
  } else if (randomNumber == 1) {
   return "paper";
  } else if (randomNumber == 2) {
   return "scissors";
  } else {
   return "Error in the app";
  }


  
 }
 public static String result(String yourChoice , String pcChoice ) {
   String result = "";

   if (yourChoice.equals("rock") && pcChoice.equals("scissors")) {
    return"You win!";
    
   } else if (yourChoice.equals("scissors") && pcChoice.equals("paper")) {
    return"You win!";

   } else if (yourChoice.equals("paper") && pcChoice.equals("rock")){
    return"You win!";
  
   } else if (pcChoice.equals("rock") && yourChoice.equals("scissors")) {
    return"You lose!";

   } else if (pcChoice.equals("scissors") && yourChoice.equals("paper")) {
    return"You lose!";

   } else if (pcChoice.equals("paper") && yourChoice.equals("rock")) {
    return"You lose!";
   } else if (yourChoice.equals(pcChoice)){
    return "It's a tie!";
   } else {
    System.out.println("Invalid choice");;
    System.exit(0);
    return result;
   }
   
  }
  public static void printResults(String yourChoice, String pcChoice, String finalResult) {
   System.out.println("\n\n\n\nYou chose:        " + yourChoice);
   System.out.println("The computer chose: " + pcChoice);
   System.out.println(finalResult);
  }
}