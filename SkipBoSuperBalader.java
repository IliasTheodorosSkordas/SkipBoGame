//icsd13170,icsd13122

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SkipBoSuperBalader extends Card implements MyInterface {

    public int number_to_change = 0;

    Scanner in = new Scanner(System.in);
    //δημιουργος της κλασης SkipBoSuperBalader

    public SkipBoSuperBalader() {
        super(14);
    }

    public void card_thrown() {
        //παιρνει τον αριθμό της τελευταίας κάρτας από το buildingpile που επέλεξε ο παίχτης, 
        //ή θα τον μετατρέπει σε ότι θέλει ο χρήστης μέσω μεθόδου που θα κληρονομεί απο interface και θα ρίχνει την κάρτα
    }

    @Override
    public void set_card_number() {
//        System.out.println("Σε τί αριθμό θέλεις να μετατρέψεις αυτό το super balader?");
        JFrame frame = new JFrame("InputDialog");
        number_to_change = Integer.parseInt(JOptionPane.showInputDialog(frame, "What number do you want to want"));
        number_to_change = in.nextInt();

        if ((number_to_change == (int) number_to_change) && number_to_change > 0 && number_to_change <= 12) //ελεγχω αν ο αριθμος που εδωσε ο χρηστης ειναι ακεραιος και μεταξυ των 0,13
        {
            this.set_number(number_to_change);
        }
        number_to_change = 0;

    }

}
