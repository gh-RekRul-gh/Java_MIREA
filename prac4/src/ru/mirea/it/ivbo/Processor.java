package ru.mirea.it.ivbo;

public class Processor {
    private final Brand brand = Brand.Intel;
    private double frequency = 1.07;

    public Processor() {
    }

    public Brand getBrand() {
        return brand;
    }

    public String getFrequency() {
        return frequency + "GHz";
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
