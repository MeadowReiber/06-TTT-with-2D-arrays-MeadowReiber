import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ScoreBoard{
  //fields and properties------------------------
  private File f;
  private Scanner scanMan;
  private FileWriter writer;

  //constructor----------------------------------
  public ScoreBoard(String csvName) throws FileNotFoundException, IOException{
    this.f = new File(csvName);
    this.scanMan = new Scanner(this.f);
  }
  //methods--------------------------------------
  public void updateBoard(String fileName) throws IOException{
    
  }
  public int getFileLength(){
    int fileLength = 0;
    while(this.scanMan.hasNextLine()){
      scanMan.nextLine();
      fileLength++;
    }
    return fileLength;
  }
}