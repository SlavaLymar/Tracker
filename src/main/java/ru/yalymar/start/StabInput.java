package ru.yalymar.start;

public class StabInput implements Input {
    private String[] answers;
    private int[] numbers;
    private int position = 0;
    private int positionNumber = 0;

    public StabInput(String[] answers) {
        this.answers = answers;
    }

    public String ask(String question) {
        return this.answers[position++];
    }

    public int getNumber(String question) {
        return this.numbers[positionNumber++];
    }
}
