import java.io.*;
import java.util.*;

public class writeFile {
  public static void main(String[] arg) throws IOException {
   PrintWriter pw = new PrintWriter (new FileWriter("file.txt"));
   Scanner sc = new Scanner (System.in);
   System.out.println("Write 10 words.");
      for (int i=0; i<=10; i++) {
      String word = sc.next();
      pw.println(word);
      }
   pw.close();
}}

