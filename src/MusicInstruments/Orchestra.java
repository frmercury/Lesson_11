package MusicInstruments;

public class Orchestra {


    public static void main(String[] args) {

        Instrument guitar1 = new Guitar(6);
        Instrument dram1 = new Dramm(10);
        Instrument pipe1 = new Pipe(15);

        Instrument[] instruments = {guitar1, dram1, pipe1};
        getInstrument(instruments);

    }

    public static void getInstrument (Instrument[] instruments){
        for (Instrument instrument: instruments) {
            instrument.play();
            System.out.println("");
        }
    }
}
