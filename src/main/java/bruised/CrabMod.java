package bruised;

import basemod.BaseMod;
import basemod.ModLabel;
import basemod.ModPanel;
import basemod.interfaces.*;
import bruised.characters.Bruised;
import bruised.enums.BruisedCharEnum;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.localization.*;


@SpireInitializer
public class CrabMod implements EditCharactersSubscriber {

    private static Bruised bruisedCharacter;

    public CrabMod() {
        BaseMod.subscribe(this);
    }

    public static final String getResourcePath(String resource) {
        return "BruisedMod/img/" + resource;
    }

    public static void initialize() {
        new CrabMod();
    }

    @Override
    public void receiveEditCharacters() {
        bruisedCharacter = new Bruised("The Bruised");
        BaseMod.addCharacter(
                bruisedCharacter, getResourcePath("charSelect/button.png"), getResourcePath("charSelect/portrait.png"),
                BruisedCharEnum.BRUISED);
    }

    private static String getLanguageString() {
        // Note to translators - add your language here (by alphabetical order).
        switch (Settings.language) {
            case FRA:
                return "fra";
            case KOR:
                return "kor";
            case SPA:
                return "spa";
            case ZHS:
                return "zhs";
            case JPN:
                return "jpn";
            case RUS:
                return "rus";
            default:
                return "eng";
        }
    }
}
