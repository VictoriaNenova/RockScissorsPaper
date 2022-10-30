import java.util.Random;
import java.util.Scanner;
public class RockScissorsPaper {
    private static final String ROCK = "Rock";
    private static final String SCISSORS = "Scissors";
    private static final String PAPER = "Paper";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose [r]ock, [s]cissors or [p]aper: ");
        String playerMove = scanner.nextLine();
        if (playerMove.equals("r")|| playerMove.equals("rock")){
            playerMove = ROCK;
        }else if (playerMove.equals("s")|| playerMove.equals("scissors")){
            playerMove = SCISSORS;
        }else if (playerMove.equals("p")|| playerMove.equals("paper")){
            playerMove = PAPER;
        }else {
            System.out.println("Invalid input. Try Again...");
            return;
        }
            Random random = new Random();
            int computerRandomNumber = random.nextInt(4);
            String computerMove = "";
            switch(computerRandomNumber){
                case 1:
                    computerMove = ROCK;
                    break;
                case 2:
                    computerMove = SCISSORS;
                    break;
                case 3:
                    computerMove = PAPER;
                    break;

            }
            System.out.printf("The computer chose %s%n", computerMove);

            if ((playerMove.equals(ROCK)&& computerMove.equals(SCISSORS))||
                    (playerMove.equals(SCISSORS)&& computerMove.equals(PAPER))||
                    (playerMove.equals(PAPER))&& computerMove.equals(ROCK)){
                System.out.println("You win.");
                }else if ((playerMove.equals(ROCK)&& computerMove.equals(ROCK))||
                    (playerMove.equals(SCISSORS)&& computerMove.equals(SCISSORS))||
                    (playerMove.equals(PAPER)&& computerMove.equals(PAPER))){
                System.out.println("This game was a draw");
            }else if ((playerMove.equals(SCISSORS)&&computerMove.equals(ROCK))||
                    (playerMove.equals(PAPER)&& computerMove.equals(SCISSORS))||
                    (playerMove.equals(ROCK)&&computerMove.equals(PAPER))){
                System.out.println("You lose.");
            }

    }

    }

