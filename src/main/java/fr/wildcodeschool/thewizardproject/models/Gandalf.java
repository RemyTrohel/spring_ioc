package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("gandalf")
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