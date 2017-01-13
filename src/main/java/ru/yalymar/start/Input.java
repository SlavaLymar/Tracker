package ru.yalymar.start;

public interface Input {

    String ask(String question);

    int ask(String question, int[] arr);

    int getNumber(String question);


}
