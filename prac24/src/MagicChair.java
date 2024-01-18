public class MagicChair implements Chair{
    @Override
    public String getType() {
        return "MagicChair";
    }
    public void doMagic(){
        System.out.println("You want some magic? Get some:");
        int a = 3/0;
    }
}