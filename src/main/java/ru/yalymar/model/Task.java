package ru.yalymar.model;


public class Task extends Item{

    public Task(String name, String description, long time, String[] comment) {
        this.name = name;
        this.description = description;
        this.time = time;
        this.comment = comment;
    }
}
