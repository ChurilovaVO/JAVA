package Work3;

public class Greeter {
    private String formality;
    private String greet;

   public void setFormality(String formality) {
        this.formality = formality;
        switch (this.formality) {
            case "formal":
                this.greet ="Good evening, sir.";
                break;
            case "casual":
                this.greet= "Sup bro?";
                break;
            case "intimate":
                this.greet="Hello Darling!";
                break;
            default:
                this.greet="Hello.";
                break;
        }
    }

    public String getFormality() {
        return formality;
    }

    public String getGreet() {
        return greet;
    }

}
