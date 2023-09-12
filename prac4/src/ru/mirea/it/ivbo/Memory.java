package ru.mirea.it.ivbo;

public class Memory {
    private final Brand brand = Brand.Kingston;
    private final String[] memory = new String[100];
    private int firstFreePlace = 0;

    public Memory() {
    }

    public Brand getBrand() {
        return brand;
    }

    public String[] getMemory() {
        return memory;
    }

    public int getFirstFreePlace() {
        return firstFreePlace;
    }

    public void setNewMessage(String message) {
        this.memory[firstFreePlace] = message;
        firstFreePlace++;
    }
}
