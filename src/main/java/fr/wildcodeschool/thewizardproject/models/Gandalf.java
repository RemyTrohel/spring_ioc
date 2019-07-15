package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {

    private Outfit outfit;

    public Gandalf(Outfit outfit) {
        this.outfit = outfit;
    }

    @Override
    public String giveAdvice() {
        return "Fly, you fools!";
    }

    @Override
    public String changeDress() {
        return this.outfit.color();
    }
}