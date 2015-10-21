import java.util.*;

/*
The answer to exercise nr 4 in chapter 9 in the (swedish) book java steg för steg.
*/


public class tal {
	public static void main (String[] args) {
    List<Integer> sifferLista = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Skriv in ett antal tal.");
    while (sc.hasNext()) {
        int input = sc.nextInt();    
        sifferLista.add(input);
      }
    int i = Collections.max(sifferLista);
    System.out.println("Största siffran var: " + i);
    }
}
