import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
            //        } catch (Exception e) {
//            System.out.println("What you entered is not and integer");
//        } finally {
//            System.out.println("Just to check \"finally\" works");
//        }
        } catch (NumberFormatException e) {
            System.out.println("What you entered is not and integer");
        } catch (ArithmeticException e) {
            System.out.println("Eww, dont divide by 0...");
        } catch(Exception e) {
            System.out.println("What just happened....");
        } finally {
            System.out.println("Just to check \"finally\" works");
        }
    }
}