public class Schulkraft {

    private int beliebtheit;
    private Lehrkraft lehrkraft;
    private String name;

    public Schulkraft(Lehrkraft kl, String n){

        this.lehrkraft = kl;
        this.name = n;

    }

    public int getBeliebtheit() {
        return beliebtheit;
    }

    public void setBeliebtheit(int wert) {
        this.beliebtheit = wert;
    }
    
}
