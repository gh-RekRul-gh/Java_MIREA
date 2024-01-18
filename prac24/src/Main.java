public class Main {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        Client client = new Client();
        VictorianChair victorianChair = chairFactory.createVictorianChair();
        FunctionalChair functionalChair = chairFactory.createFunctionalChair();
        MagicChair magicChair = chairFactory.createMagicChair();
        System.out.println(victorianChair.getAge());
        client.setChair(victorianChair);
        client.sit();
        System.out.println(functionalChair.sum(17,8));
        System.out.println("That's the number of pracs");
        client.setChair(functionalChair);
        client.sit();
        magicChair.doMagic();
    }
}