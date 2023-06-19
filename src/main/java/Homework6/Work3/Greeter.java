package Homework6.Work3;

public class Greeter implements formalityType {
    private String formality;

    public Greeter() {
        this.formality = DEFAULT;
    }

    public String greet() {
        switch (this.formality) {
            case "formal":
                return "Good evening, sir.";
            case "casual":
                return "Sup bro?";
            case "intimate":
                return "Hello Darling!";
            default:
                return "Hello.";
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
