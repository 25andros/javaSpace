public class acre extends andria {
    private String words;
    private int strength;

    public acre() {
        words = "I have the high ground!";
        strength = 7;
    }

    public void setStrength() {
        strength = rInt("What is your strength level?");
    }

    public Integer getStrength() {
        return strength;
    }

    public void setWords() {
        words = "You under-estimate my powers!!!";
    }

    public void getWords() {
        pTextln(words);
    }

    public void dialogue() {
        getWords();
        setWords();
        getWords();
        setStrength();
        getStrength();
    }
}