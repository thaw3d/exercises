import java.io.*;
import java.util.*;

public class Words {
  public static void main(String[] arg) throws IOException {
      BufferedReader instrom = new BufferedReader
       (new InputStreamReader(System.in));
   PrintWriter utstrom = new PrintWriter
                    (new BufferedWriter
                    (new FileWriter("filen.txt")));
    
    System.out.println("Skriv 10 ord.");

    int ord = 0;
    while (ord <10) {
      
      String namn = instrom.readLine();
      
        if (namn.contains(" ")) {
        int i = namn.indexOf(" ");
        utstrom.println(namn.substring(0,i));
        ord++;
      }

        else if (namn.length() < 1) {
          System.out.println("Funkar! yay");
          continue;
        }
      else {
        utstrom.println(namn);
        ord++;
      }
  }

    utstrom.close();
  }      
}