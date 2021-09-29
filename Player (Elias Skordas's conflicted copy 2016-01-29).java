//icsd13170,icsd13122

import java.util.Random;
import java.util.ArrayList;

public class Player {
//    primitive τυποι που θα χρειαστουμε

    private int spPosition = 0;
    private static ArrayList<Card> Allcards = new ArrayList<>();
    private static ArrayList<Card> Drawpile = new ArrayList<>();
    private String name;
    private Card[] stockpile = new Card[30];
    private ArrayList<Card> discardpile1 = new ArrayList<>();
    private ArrayList<Card> discardpile2 = new ArrayList<>();
    private ArrayList<Card> discardpile3 = new ArrayList<>();
    private ArrayList<Card> discardpile4 = new ArrayList<>();
    private Card[] handcollection = new Card[5];

    //δημιουργος της κλασης Player
    public Player(String name) {
        this.name = name;
    }

    //δημιουργουμε στατικό πίνακα που δημιουργει την τραπουλα πριν μοιρασει τα φυλα στους παιχτες
    public void create_Allcards() {
        for (int i = 0; i <= 144; i++) {
            if (i < 12) {
                Card nc = new NumberCard(1);
                Allcards.add(nc);
            }
            if (i < 24) {
                Card nc = new NumberCard(2);
                Allcards.add(nc);
            }
            if (i < 36) {
                Card nc = new NumberCard(3);
                Allcards.add(nc);
            }
            if (i < 48) {
                Card nc = new NumberCard(4);
                Allcards.add(nc);
            }
            if (i < 60) {
                Card nc = new NumberCard(5);
                Allcards.add(nc);
            }
            if (i < 72) {
                Card nc = new NumberCard(6);
                Allcards.add(nc);
            }
            if (i < 84) {
                Card nc = new NumberCard(7);
                Allcards.add(nc);
            }
            if (i < 96) {
                Card nc = new NumberCard(8);
                Allcards.add(nc);
            }
            if (i < 108) {
                Card nc = new NumberCard(9);
                Allcards.add(nc);
            }
            if (i < 120) {
                Card nc = new NumberCard(10);
                Allcards.add(nc);
            }
            if (i < 132) {
                Card nc = new NumberCard(11);
                Allcards.add(nc);
            }
            if (i < 144) {
                Card nc = new NumberCard(12);
                Allcards.add(nc);
            }
            if (i < 152) {
                Card nc = new SkipBoBalader();
                Allcards.add(nc);
            }
            if (i < 156) {
                Card nc = new SkipBoSuperBalader();
                Allcards.add(nc);
            }
            if (i < 160) {
                Card nc = new SkipBoEraser();
                Allcards.add(nc);
            }
        }
    }

    //με αυτη τη μεθοδο μοιραζουμε τυχαια την τραπουλα στους παιχτες.
    //30 φυλλα για το stockpile του καθε παιχτη
    //5 φυλλα για το handcollection
    //και τα υπολοιποα στο drawpile
    public void deal_cards() {
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {

            int randNum = rand.nextInt(Allcards.size() + 1);
            stockpile[i] = (Allcards.get(randNum));
            Allcards.remove(randNum);
        }
        for (int i = 0; i < 5; i++) {
            int randNum = rand.nextInt(Allcards.size() + 1);
            handcollection[i] = (Allcards.get(randNum));
            Allcards.remove(randNum);
        }
    }

    //δημιουργουμε την μεθοδο drawpile
    public void create_drawpile() {
        for (int i = 0; i < Allcards.size(); i++) {
            Drawpile.add(Allcards.get(i));
        }
    }

    //επιστρεφει το μεγεθος του stockpile
    public int Get_stockpile_size() {
        return stockpile.length - spPosition;
    }

    //επιστρεφει το μεγεθος του drawpile
    public int get_drawpile_size() {
        return Drawpile.size();
    }

    public int get_stockpile_number(int position) {
        return stockpile[position].get_number();
    }
}
