package MusicInstruments;

public class Dramm implements Instrument {

    public Dramm(int dimension) {
        this.dimension = dimension;
    }

    private int dimension;

    public void play() {
        System.out.printf("Играет %s-ти сантиметровый барабан", dimension);
    }
}
