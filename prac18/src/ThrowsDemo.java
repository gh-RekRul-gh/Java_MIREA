public class ThrowsDemo {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public String getDetails(String key) throws NullPointerException, EmptyStringException {
        if (key == null) {
            throw new NullPointerException("null key in getDetails" );
        }
        if (key.isEmpty()) {
            throw new EmptyStringException("String is empty, not interesting ;)");
        }
        return "data for " + key;
    }
}