package MusicInstruments;

public class Guitar implements Instrument {
    public Guitar(int stringAmount) {
        this.stringAmount = stringAmount;
    }

    private int stringAmount;


    public void play() {
        System.out.printf("Играет %s-ти струнная гитара", stringAmount);
    }
}

