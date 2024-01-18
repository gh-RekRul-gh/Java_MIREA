import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo2 {
    public  void getKey() throws NullPointerException {
        Scanner myScanner = new Scanner(System.in);
        String key = "";
        while(key.isEmpty()){
            System.out.print("key: ");
            key = myScanner.nextLine();
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println("Try again");
            }
        }
    }
    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
    @org.jetbrains.annotations.NotNull
    private String getDetails(String key){
        if(key.isEmpty()) {
            throw new RuntimeException("Key set to empty string");
        }
        return "Entered data is " + key;
    }
}