//icsd13170,icsd13122
import java.util.*;
import java.util.Random;
import java.util.ArrayList;

public class Player {
//    primitive τυποι που θα χρειαστουμε

    private int spPosition = 0;
      //pane stin drawpanelgame
//    public  static ArrayList<Card> Allcards = new ArrayList<>();
//    public  static ArrayList<Card> Drawpile = new ArrayList<>();
    private String name;
    
    
    //pane stin drawpanelgame
//    public  ArrayList<Card> discardpile1 = new ArrayList<>();
//    public  ArrayList<Card> discardpile2 = new ArrayList<>();
//    public   ArrayList<Card> discardpile3 = new ArrayList<>();
//    public  ArrayList<Card> discardpile4 = new ArrayList<>();
    
    public  static Card[] handcollection = new Card[5];
    public static Card[] stockpile = new Card[30];
    
    
    boolean drawpile_created = false;

    //δημιουργος της κλασης Player
    public Player(String name) {
        this.name = name;

    }

    //δημιουργουμε στατικό πίνακα που δημιουργει την τραπουλα πριν μοιρασει τα φυλα στους παιχτες
    public static void create_Allcards() {
        for (int i = 0; i <= 144; i++) {
            if (i < 12) {
                Card nc = new NumberCard(1);
                DrawGamePanel.Allcards.add(nc);
            }
            if (i < 24) {
                Card nc = new NumberCard(2);
                DrawGamePanel.Allcards.add(nc);
            }
            if (i < 36) {
                Card nc = new NumberCard(3);
                DrawGamePanel.Allcards.add(nc);
            }
            if (i < 48) {
                Card nc = new NumberCard(4);
                DrawGamePanel.Allcards.add(nc);
            }
            if (i < 60) {
                Card nc = new NumberCard(5);
                DrawGamePanel.Allcards.add(nc);
            }
            if (i < 72) {
                Card nc = new NumberCard(6);
                DrawGamePanel.Allcards.add(nc);
            }
            if (i < 84) {
                Card nc = new NumberCard(7);
                DrawGamePanel.Allcards.add(nc);
            }
            if (i < 96) {
                Card nc = new NumberCard(8);
                DrawGamePanel.Allcards.add(nc);
            }
            if (i < 108) {
                Card nc = new NumberCard(9);
                DrawGamePanel.Allcards.add(nc);
            }
            if (i < 120) {
                Card nc = new NumberCard(10);
                DrawGamePanel.Allcards.add(nc);
            }
            if (i < 132) {
                Card nc = new NumberCard(11);
                DrawGamePanel.Allcards.add(nc);
            }
            if (i < 144) {
                Card nc = new NumberCard(12);
                DrawGamePanel.Allcards.add(nc);
            }
            if (i < 152) {
                Card nc = new SkipBoBalader();
                DrawGamePanel.Allcards.add(nc);
            }
            if (i < 156) {
                Card nc = new SkipBoSuperBalader();
                DrawGamePanel.Allcards.add(nc);
            }
            if (i < 160) {
                Card nc = new SkipBoEraser();
                DrawGamePanel.Allcards.add(nc);
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

            int randNum = rand.nextInt(DrawGamePanel.Allcards.size() + 1);
            stockpile[i] = (DrawGamePanel.Allcards.get(randNum));
            DrawGamePanel.Allcards.remove(randNum);
        }
        for (int i = 0; i < 5; i++) {
            int randNum = rand.nextInt(DrawGamePanel.Allcards.size() + 1);
            handcollection[i] = (DrawGamePanel.Allcards.get(randNum));
            DrawGamePanel.Allcards.remove(randNum);
        }
        
    }

    //δημιουργουμε την μεθοδο drawpile
    public static void create_drawpile() {
        for (int i = 0; i < DrawGamePanel.Allcards.size(); i++) {
            DrawGamePanel.Drawpile.add(DrawGamePanel.Allcards.get(i));
        }
    }

    //επιστρεφει το μεγεθος του stockpile
    public int Get_stockpile_size() {
        return stockpile.length - spPosition;
    }

    //επιστρεφει το μεγεθος του drawpile
    public int get_drawpile_size() {
        return DrawGamePanel.Drawpile.size();
    }

    public int get_stockpile_number(int position) {
        return stockpile[position].get_number();
    }
    
    public String get_name()
    {
        return this.name;
    }
}
