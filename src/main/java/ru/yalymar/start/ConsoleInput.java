package ru.yalymar.start;

import java.util.Scanner;

/**
 * @author slavalymar
 * @since 13.01.2017
 * @version 1
 */
public class ConsoleInput implements Input {
    private Scanner sc = new Scanner(System.in);

    /**
     * @param question
     * @return result
     */
    @Override
    public String ask(String question) {
        System.out.println(question);
        String result = sc.nextLine();
        return result;
    }

    /**
     * @param question
     * @param arrLength
     * @return result
     */
    @Override
    public int ask(String question, int[] arrLength) {
        int result = 0;
        int number = Integer.parseInt(this.ask(question));
        for(int i: arrLength){
            if(i == number-1){
                result = i;
                break;
            }
        }
        return result;
    }

    /**
     * @param question
     * @return result
     */
    @Override
    public int getNumber(String question) {
        System.out.println(question);
        int result = sc.nextInt();
        sc.nextLine();
        return result;
    }



}
