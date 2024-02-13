public class Game{
    //fields and properties----------------------
    private int[][] board;
    private Player[] players;
    
    //constructor--------------------------------
    public Game(Player x, Player o, int size){
        this.players = new Player[] {x, o};
        this.board = new int[size][size];
    }

    //methods------------------------------------
}