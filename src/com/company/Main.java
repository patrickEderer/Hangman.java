package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wort?");
        String word = scanner.next().toUpperCase();
        int wrong = 0;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        for (int x = 0; x < word.length(); x++)
            System.out.print("_ ");

        System.out.println("\nBuchstabe?");
        ArrayList<String> guesses = new ArrayList<>();
        while (!Correct(word, guesses) & wrong <= 10) {
            String input = scanner.next().toUpperCase();
            if (input.length() == 1) {
                if (word.contains(input)) {
                    guesses.add(input);
                } else {
                    wrong++;
                    System.out.println(input + " ist falsch! " + (11 - wrong) + " Versuch(e)");
                }
                Draw(wrong);
            } else if (input.equals(word)) {
                System.out.println("Korrekt!");
                break;
            } else {
                wrong++;
                Draw(wrong);
                System.out.println(input + " ist falsch! " + (11 - wrong) + " Versuch(e)");
            }
            Wort(guesses, word);
            if (!Correct(word, guesses)) System.out.println("\nBuchstabe?");
        }
        if (Correct(word, guesses))
            System.out.println("Korrekt!");
        else if (wrong == 11)
            System.out.println("Verloren!");
    }

    public static boolean Correct(String Wort, ArrayList<String> guesses) {
        for (char c : Wort.toCharArray()) {
            if (!guesses.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    public static void Wort(List<String> guesses, String Wort) {
        for (char c : Wort.toCharArray()) {
            if (guesses.contains(String.valueOf(c)))
                System.out.print(c + " ");
            else
                System.out.print("_ ");
        }
    }

    public static void Draw(int x) {
        switch (x) {
            case 1 -> System.out.println("\n\n\n\n\n\n======");
            case 2 -> {
                System.out.println("     +");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("======");
            }
            case 3 -> {
                System.out.println(" +---+");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("======");
            }
            case 4 -> {
                System.out.println(" +---+");
                System.out.println("    \\|");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("======");
            }
            case 5 -> {
                System.out.println(" +---+");
                System.out.println(" |  \\|");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("======");
            }
            case 6 -> {
                System.out.println(" +---+");
                System.out.println(" |  \\|");
                System.out.println(" O   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("======");
            }
            case 7 -> {
                System.out.println(" +---+");
                System.out.println(" |  \\|");
                System.out.println(" O   |");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("======");
            }
            case 8 -> {
                System.out.println(" +---+");
                System.out.println(" |  \\|");
                System.out.println(" O   |");
                System.out.println("/|   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("======");
            }
            case 9 -> {
                System.out.println(" +---+");
                System.out.println(" |  \\|");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("======");
            }
            case 10 -> {
                System.out.println(" +---+");
                System.out.println(" |  \\|");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/    |");
                System.out.println("     |");
                System.out.println("======");
            }
            case 11 -> {
                System.out.println(" +---+");
                System.out.println(" |  \\|");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/ \\  |");
                System.out.println("     |");
                System.out.println("======");
            }
        }
    }
}
