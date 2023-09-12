package ru.mirea.it.ivbo;

public class Computer {
    private final Processor processor = new Processor();
    private final Monitor monitor = new Monitor();
    private final Memory memory = new Memory();

    public void setGameMode() {
        processor.setFrequency(4.47);
        monitor.setFrequency(144);
    }

    public void printAllCurrent() {
        System.out.println("Brand of the processor is " + processor.getBrand());
        System.out.println("Current processor frequency is " + processor.getFrequency());
        System.out.println("Brand of the monitor is " + monitor.getBrand());
        System.out.println("Current monitor frequency is " + monitor.getFrequency());
        System.out.println("Brand of the memory is " + memory.getBrand());
        System.out.println("Current messages in the memory are");
        String[] memoryMessages = memory.getMemory();
        int firstFreePlace = memory.getFirstFreePlace();
        System.out.println();
        if (firstFreePlace == 0) {
            System.out.println("Memory is currently clear");
        }
        else {
            for (int i = 0; i < firstFreePlace; ++i) {
                System.out.println(memoryMessages[i]);
            }
        }
        System.out.println();
    }

    public void setNewMessage(String string) {
        memory.setNewMessage(string);
    }

}
