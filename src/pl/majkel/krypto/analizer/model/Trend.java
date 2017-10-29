package pl.majkel.krypto.analizer.model;

public enum Trend {
    STRONG_BUY("Silne Kup"),
    BUY("Kup"),
    NEUTRAL("Neutralnie"),
    SELL("Sprzedaj"),
    STRONG_SELL("Mocne Sprzedaj");

    private String doIt;

    Trend(String doIt){
        this.doIt=doIt;
    }

    public String getDoIt() {
        return doIt;
    }
}
