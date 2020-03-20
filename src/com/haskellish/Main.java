package com.haskellish;

public class Main {

    public static void main(String[] args) {
        System.out.println("Creating RUS table...");
        Vigenere ru = new Vigenere(Vigenere.RU, Vigenere.RU_LENGTH);
        ru.printTable();

        System.out.println("\nCreating ENG table...");
        Vigenere en = new Vigenere(Vigenere.EN, Vigenere.EN_LENGTH);
        en.printTable();

        //testing encrypting/decrypting
        System.out.println("\nEncrypting \"привет\" using key \"кот\"");
        String cipher = ru.encrypt("привет", "кот");
        System.out.println("Cipher - " + cipher);

        System.out.println("\nDecrypting \"" + cipher + "\" using key \"кот\"");
        String original = ru.decrypt(cipher, "кот");
        System.out.println("Original text - " + original);
    }
}