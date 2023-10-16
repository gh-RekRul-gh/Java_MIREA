public class ProcessString implements StringWork {
    private String string;

    public ProcessString(String string) {
        this.string = string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    @Override
    public StringBuilder oddCharacters() {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < string.length(); i += 2)
            answer.append(string.charAt(i));
        return answer;
    }

    @Override
    public String invertString() {
        String answer = "";
        for (int i = string.length() - 1; i >= 0; --i)
            answer += string.charAt(i);
        return answer;
    }

    @Override
    public int NumberOfCharacters(char symbol) {
        int answer = 0;
        for (int i = 0; i < string.length(); ++i) {
            if (string.charAt(i) == symbol)
                answer++;
        }
        return answer;
    }
}
