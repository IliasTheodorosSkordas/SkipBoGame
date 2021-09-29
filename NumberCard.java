//icsd13170,icsd13122

public class NumberCard extends Card {
    //δημιουργος της κλασης NumberCard

    public NumberCard(int number) {
        super(number);

    }//icsd13170,icsd13122


    public void card_thrown() {
        //παιρνει τον αριθμό της τελευταίας κάρτας από το buildingpile που επέλεξε ο παίχτης, θα ελέγχει οτι η λίστα δείχνει τον προηγούμενο αριμό από αυτόν της τρέχουσας κάρτας, και τότε θα την τοποθετεί
        //αν ο παίχτης ρίξει 12, τότε η 12άδα ανακατεύεται και πάει στο drawpile, για το buildingpile καλείται η μέθοδος clear
    }
}
