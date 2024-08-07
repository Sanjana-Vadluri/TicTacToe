import board.*;
import game.Game;
import player.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
      System.out.println("First Project -> Tic Tac Toe");

      Scanner scn = new Scanner(System.in);
      System.out.println("Enter the 1st player name");
      String player1 = scn.nextLine();

      System.out.println("Enter the 2nd player name");
      String player2 = scn.nextLine();


      Board b = new Board(3, '-');
      Player p1 = new Player();
      p1.setPlayerNameAndSymbol(player1, 'X');
      p1.getPlayerNameAndSymbol();

      Player p2 = new Player();
      p2.setPlayerNameAndSymbol(player2, 'O');
      p2.getPlayerNameAndSymbol();

      Game game  = new Game(new Player[] {p1, p2}, b);
      game.play();

      scn.close();
    }

}
