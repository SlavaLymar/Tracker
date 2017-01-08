package ru.yalymar.action;

import java.util.Scanner;

public class ConsoleInput {

    public int getNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public String getText(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }



}
