package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {

    @Override
    public String giveAdvice() {
        return "Fly, you fools!";
    }

    @Override
    public Outfit changeDress() {
        return null;
    }
    
}