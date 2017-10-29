package pl.majkel.krypto.analizer.model;

public class CryptocurrencyStats {

    private String name;
    private Trend trend;
    private Oscillator oscillator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trend getTrend() {
        return trend;
    }

    public void setTrend(Trend trend) {
        this.trend = trend;
    }

    public Oscillator getOscillator() {
        return oscillator;
    }

    public void setOscillator(Oscillator oscillator) {
        this.oscillator = oscillator;
    }
}
