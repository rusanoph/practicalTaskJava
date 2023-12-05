package ru.rusanoph;

public class App {

    public static void main(String[] args) {
        String text = "aaa ddv 42 bdfv adv dsa";

        String emojiText = "🤗😋🤔🤓";

        System.out.println(StringMethod.countDuplicateCharacters(emojiText));        
        System.out.println(StringMethod.countDuplicateCharactersUnicode(emojiText));

    }
    
}
