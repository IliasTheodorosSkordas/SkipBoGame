//icsd13170,icsd13122

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
//primitive τυποι που θα χρειαστουμε

    private ArrayList<Card> buildingpile1 = new ArrayList<>();
    private ArrayList<Card> buildingpile2 = new ArrayList<>();
    private ArrayList<Card> buildingpile3 = new ArrayList<>();
    private ArrayList<Card> buildingpile4 = new ArrayList<>();
    private int flag;
    private Random rand = new Random();
//δημιουργος της κλασης Game

    public Game() {
        Scanner in = new Scanner(System.in);
        String name;

        System.out.println("Dwse to onoma tou prwtou paixth");
        name = in.next();
        Player p1 = new Player(name);

        System.out.println("Dwse to onoma tou deuterou paixth");
        name = in.next();
        Player p2 = new Player(name);

        p1.deal_cards();
        p2.deal_cards();
        if (p1.get_stockpile_number(0) > p2.get_stockpile_number(0)) {
            flag = 1;
        } else if (p1.get_stockpile_number(0) < p2.get_stockpile_number(0)) {
            flag = 2;
        } else {
            int randNum = rand.nextInt(2);
            flag = randNum + 1;
        }

        p1.create_drawpile();
//τα flags μας δειχνουν ποιος παιχτης εχει σειρα στο παιχνιδι
        while (p1.Get_stockpile_size() > 0 && p2.Get_stockpile_size() > 0 && p1.get_drawpile_size() > 0) {
            if (flag == 1) {
                //παιζει ο πρωτος παιχτης
            }
            if (flag == 2) {
                //παιζει ο δευτερος παιχτης
            }
        }
    }
}
