//icsd13170,icsd13122

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.util.Arrays;
import javax.swing.JPanel;

public class Game extends JFrame {
//primitive τυποι που θα χρειαστουμε

    boolean start_flag = false;
//    pane stin klassi drawgamepanel
//    public ArrayList<Card> buildingpile1 = new ArrayList<>();
//    public ArrayList<Card> buildingpile2 = new ArrayList<>();
//    private ArrayList<Card> buildingpile3 = new ArrayList<>();
//    private ArrayList<Card> buildingpile4 = new ArrayList<>();

    private boolean flag;
    private Random rand = new Random();
    public static String name1, name2;
    private JPanel row1, row2, row3, row4, row5;
    private JLabel welcome_label, label_name1, label_name2;

    public static Player p1;
    public static Player p2;

//δημιουργος της κλασης Game
    public Game() {

        JFrame frame = new JFrame("InputDialog");
        name1 = JOptionPane.showInputDialog(frame, "First player's name:");
        name2 = JOptionPane.showInputDialog(frame, "Second player's name:");
        p1 = new Player(name1);
        p2 = new Player(name2);

        Player.create_Allcards();

        p1.deal_cards();
        p2.deal_cards();

        Player.create_drawpile();
        JFrame application = new JFrame("Skip bo game");
        DrawGamePanel panel = new DrawGamePanel();
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 800);
        setVisible(true);

//        System.out.println("swdsdasddasdas");
        //poios paizei prwtos
        if (p1.get_stockpile_number(0) > p2.get_stockpile_number(0)) {
            flag = true;
            new JFrame("New Title"); 
            application.setTitle(name1);
            revalidate();
        } else if (p1.get_stockpile_number(0) < p2.get_stockpile_number(0)) {
            flag = false;
            application.setTitle(name2);
            revalidate();
        } else {
            int randNum = rand.nextInt(2);
            if (randNum == 1) {
                flag = true; //prwtos
                application.setTitle(name1);
                revalidate();
            } else {
                flag = false; //prwtos
                application.setTitle(name2);
                revalidate();
            }
        }

        //Guros paixnidiou
        while (p1.Get_stockpile_size() == 0 || p2.Get_stockpile_size() == 0) {
            if (flag == true) {
                application.setTitle(name1);
                revalidate();

                flag = !flag;//αλλαγη σειρας
                //application.revalidate();

            } else {
                application.setTitle(name2);
                revalidate();

                flag = !flag;//αλλαγη σειρας
                //application.revalidate();

            }

        }

    }
}
