package ru.mirea.it.ivbo;

public class Monitor {
    private final Brand brand = Brand.Samsung;
    private int frequency = 60;

    public Monitor() {
    }

    public Brand getBrand() {
        return brand;
    }

    public String getFrequency() {
        return frequency + "Hz";
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
