package MusicInstruments;

public class Pipe implements Instrument {
    public Pipe(int diameter) {
        this.diameter = diameter;
    }

    private int diameter;

    public void play() {
        System.out.printf("Играет турба диаметром %s сантиметров", diameter);
    }
}
