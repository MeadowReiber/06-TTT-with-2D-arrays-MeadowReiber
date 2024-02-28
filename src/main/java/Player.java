import java.util.Scanner;
public class Player{
  //fields and properties------------------------
  private int symbol;
  private Scanner user = new Scanner(System.in);
  private String name;
  
  //constructor----------------------------------
  public Player(int symbol, int playerNum){
    this.symbol = symbol;


    System.out.print("Name for Player " + playerNum + ": ");
    this.name = this.user.next();
  }
  //methods--------------------------------------
  public int getSymbol(){
    return this.symbol;
  }
  public String getName(){
    return this.name;
  }
  //returns a String[] of the coordinate of the tile the player claims
  public String[] getTurn(){
    System.out.print("Player " + this.symbol + ": " + "(x,y): ");
    return this.user.next().split(",");
  }
}