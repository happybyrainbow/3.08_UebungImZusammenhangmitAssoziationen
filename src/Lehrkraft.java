public class Lehrkraft {

    private String besoldungsstufe;
    private String name;

    public Lehrkraft(String n){

        this.besoldungsstufe = "A13";
        this.name = n;

    }

    public String getBesoldungsstufe() {
        return besoldungsstufe;
    }

    public String getName() {
        return name;
    }

    public void setBesoldungsstufe(String s) {
        this.besoldungsstufe = s;
    }
}
