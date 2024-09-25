package StructuralPatterns.FlyWeight.DesignWordProcessor;

public class DocumentCharacter implements ILetter {

    private char character;
    private String fontType;
    private int size;

    DocumentCharacter(char character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    // Getter methods (if needed)
    public char getCharacter() {
        return character;
    }

    public String getFontType() {
        return fontType;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void display(int row, int column) {
        // Displaying the character along with its properties at a specific location
        System.out.println("Displaying '" + character + "' at (" + row + ", " + column + ")"
                + " with font: " + fontType + ", size: " + size);
    }
}
