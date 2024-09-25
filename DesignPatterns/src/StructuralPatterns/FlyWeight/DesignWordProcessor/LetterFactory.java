package StructuralPatterns.FlyWeight.DesignWordProcessor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LetterFactory {

    // Using ConcurrentHashMap to make it thread-safe
    private static Map<Character, ILetter> characterCache = new ConcurrentHashMap<>();

    public static ILetter createLetter(char characterValue) {

        // Check if the character already exists in the cache
        if (characterCache.containsKey(characterValue)) {
            return characterCache.get(characterValue);
        } else {
            // Create a new DocumentCharacter and store it in the cache
            DocumentCharacter characterObj = new DocumentCharacter(characterValue, "Arial", 10);
            characterCache.put(characterValue, characterObj);
            return characterObj;
        }
    }
}
