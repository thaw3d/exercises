import javax.swing.*;

/*

Assignment for my intro to java cource, comments not in english.

*/ 



public class Aupp7 {

    static double alderMan = 0;
    static double antalMan = 0;
    static double alderKvinna = 0;
    static double antalKvinna = 0;

    // Skapar här variabler som ska vara synliga för alla metoder.
    


    public static void main (String[] args) {
        genderAndAge(); //Undviker kod i Main-metoden
    }
    



    private static void genderAndAge() {        
    String[] namnAlternativ = { "Man", "Kvinna" }; //skapar en array med två alternativ


    String svarNamn = (String) JOptionPane.showInputDialog(null, "Är personen man eller kvinna?",
        "Mata in en person.", JOptionPane.QUESTION_MESSAGE, null, namnAlternativ, namnAlternativ[1]);
    String svar = JOptionPane.showInputDialog(null, "Vad är personens ålder?");

    /*
    Här ovan använder jag tidigare skapad array i en InputDialog. 
    Hittade det här som alternativ till att ta in en sträng och använda str.equalsIgnoreCase().

    */

    double svarAlder = 0; 

    /*
    
    Måste initialisera variabeln svarAlder för att kunna använda den i ett catch/try block. 
    Får felmeddelande annars.
    
    */
        try { 
        svarAlder = Double.parseDouble(svar);
    }

    catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Vänligen ange ålder med siffror. ");
        genderAndAge();  //startar om utifall att det inte går att parsa till double.
    }



    if (svarNamn == namnAlternativ[0]) {
    
        antalMan += 1;
        alderMan += svarAlder;
    }

    else if (svarNamn == namnAlternativ[1]) {
        antalKvinna += 1;
        alderKvinna += svarAlder;
    }

   /*
   Här ovan matchar vi alternativet de valde mot alternativen som fanns i arrayen, dvs antinge man eller kvinna.
   Beroende på vad som valdes ändras värdet i de tidigare skapade variablerna.
   */


    int igen = JOptionPane.showConfirmDialog(null, "vill du lägga till en person?", "Igen?", JOptionPane.YES_NO_OPTION);
        if (igen == JOptionPane.YES_OPTION) {
          genderAndAge();
        }
        else {
           resultat();
        }
    }


/*
Biten här ovanför avgör huruvida en till person ska läggas till.
Om nej, så går vi vidare till den sista metoden som ger oss resultatet, annars upprepas genderAndAge.
*/



    private static void resultat() {
        JOptionPane.showMessageDialog(null, "Antal kvinnor: " + antalKvinna + ", deras sammanlagda ålder: " + alderKvinna);

        double medel = (alderKvinna / antalKvinna);
        JOptionPane.showMessageDialog(null, "Genomsnittsåldern för kvinnor: " + medel);


        JOptionPane.showMessageDialog(null, "Antal män: " + antalMan + ", deras sammanlagda ålder: " + alderMan);

        double medeltva = (alderMan / antalMan);
        JOptionPane.showMessageDialog(null, "Genomsnittsåldern för män: " + medeltva);
        System.exit(0);
    }
}






