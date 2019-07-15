package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {

    @Override
    public String giveAdvice() {
        return "One can never have enough socks.";
    }

    @Override
    public Outfit changeDress() {
        return null;
    }

    
}