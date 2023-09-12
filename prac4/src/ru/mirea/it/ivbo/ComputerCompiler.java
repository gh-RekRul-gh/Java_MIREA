package ru.mirea.it.ivbo;

public class ComputerCompiler {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.printAllCurrent();
        computer.setGameMode();
        computer.setNewMessage("I like Jaba");
        computer.setNewMessage("I love Dota2");
        computer.printAllCurrent();
    }
}
