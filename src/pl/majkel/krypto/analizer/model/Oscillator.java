package pl.majkel.krypto.analizer.model;

public enum Oscillator {

    BUY("Kup"),
    NEUTRAL("Neutralnie"),
    SELL("Sprzedaj");

    private String doIt;

    Oscillator(String doIt){
        this.doIt=doIt;
    }

    public String getDoIt() {
        return doIt;
    }
}
