import java.util.Scanner;
public class Player{
  //fields and properties------------------------
  private int symbol;
  private Scanner user = new Scanner(System.in);
  
  //constructor----------------------------------
  public Player(int symbol){
      this.symbol = symbol;
  }
  //methods--------------------------------------
  public int getSymbol(){
    return this.symbol;
  }
  public String[] getTurn(){
    System.out.print("Player " + this.symbol + ": " + "(x,y): ");
    return this.user.next().split(",");
  }
}