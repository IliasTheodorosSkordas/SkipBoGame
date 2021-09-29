//icsd13170,icsd13122

public abstract class Card {

    private int number;

    //δημιουργος της κλασης Card
    public Card(int number) {
        this.number = number;
    }

    public int get_number() {
        return number;
    }

    public void set_number(int a) {
        number = a;
    }
}
