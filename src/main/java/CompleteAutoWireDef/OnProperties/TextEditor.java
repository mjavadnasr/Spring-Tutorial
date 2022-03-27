package CompleteAutoWireDef.OnProperties;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
    @Autowired
    private SpellChecker spellChecker;
    public TextEditor()
    {
        System.out.println("inside text editor Constructor");
    }

    public SpellChecker getSpellChecker()
    {
        return spellChecker;

    }

    public void spellCheck()
    {
        spellChecker.checkSpelling();
    }
}
