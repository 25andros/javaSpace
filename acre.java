public class acre extends andria {
    private String words;

    public acre() {
        words = "I have the high ground!";
    }

    public void getWords() {
        pTextln(words);
    }

    public void setWords() {
        words = "You under-estimate my powers!!!";
    }

    public void dialogue() {
        getWords();
        setWords();
        getWords();
    }
}