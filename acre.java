public class acre extends andria {
    private String words;
    private int strength;
    private String name;

    public acre() {
        words = "It's over, I have the high ground!";
        strength = 7;
        name = "Anakin";
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

    public void yankname() {
        // name = rStr("Input your name:");
        name = "Kenobi";
    }

    public String putName() {
        return name;
    }

    public void dialogue() {
        getWords();
        pTextln(putName());

        setWords();
        getWords();
        yankname();
        pTextln(putName());

        setStrength();
        getStrength();
    }
}
