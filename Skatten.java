import javax.swing.*;


/* 
idk how i messed it up but i did
*/

public class Skatten {

    public static void main(String[] args) {
    	beraknaSkatt();


private static void beraknaSkatt() { 
    
    String s = JOptionPane.showInputDialog("Vad är din arsinkomst?");
    double inkomst = Double.parseDouble(s);
    inkomst-=13100; //drar av grundavdraget

    if (inkomst <= 430200) {
    	JOptionPane.showMessageDialog(null, "du betalar ingen statlig skatt, utan endast kommunalskatt.");
    }

    else if (inkomst > 430200) {
    	double nedreSkikt = inkomst - 430200;
    	double nedreSkiktSkatt = nedreSkikt * 0.20;
    	JOptionPane.showMessageDialog(null, "Du betalar såhär mycket i statlig skatt: " + nedreSkiktSkatt + " kr.");
    
        if (inkomst > 616100) { //nästlad if-sats, blir mindre kod och villkor på så vis
        double ovreSkikt = inkomst - 616100;
        double ovreSkiktSkatt = ovreSkikt * 0.05;
        JOptionPane.showMessageDialog(null, "Hur mycket som tillkommer i värnskatt: " + ovreSkiktSkatt + " kr.");
        double totalSkatt = ovreSkiktSkatt + nedreSkiktSkatt;
        JOptionPane.showMessageDialog(null, "Om vi slår ihop din värnskatt och statlig skatt får vi er sammanlagda skatt: " + totalSkatt + " kr.");
    	    }
    	}
    


int svar = JOptionPane.showConfirmDialog(null, "vill du räkna ut skatt en gång till?", "Meddelande", JOptionPane.YES_NO_OPTION);
        if (svar == JOptionPane.YES_OPTION) {
          beraknaSkatt(); 
        }
        else {
           System.exit(0);
        }

}
}
}
