package ru.yalymar.start;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner sc = new Scanner(System.in);

    public String ask(String question) {
        System.out.println(question);
        return sc.nextLine();
    }

    public int getNumber(String question) {
        System.out.println(question);
        return sc.nextInt();
    }
}
