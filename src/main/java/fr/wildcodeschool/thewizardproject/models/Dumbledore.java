package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("dumbledore")
public class Dumbledore implements WizardInterface {

    private Outfit outfit;

    public Dumbledore(Outfit outfit) {
        this.outfit = outfit;
    }

    @Override
    public String giveAdvice() {
        return "One can never have enough socks.";
    }

    @Override
    public String changeDress() {
        return this.outfit.color();
    }
}