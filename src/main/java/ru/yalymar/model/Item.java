package ru.yalymar.model;


public class Item {

    public String name;
    public String description;
    public long time;
    public String comment;

    public Item(String name, String description, long time) {
        this.name = name;
        this.description = description;
        this.time = time;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getComment() {
        return comment;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getTime() {
        return time;
    }

    public void add(String name, String description){
    }

    public void edit(String name, String description){
    }

    public void delete(Item item){
    }

    public void showAll(Item[] item){
    }

    public void showWithFilters(Item[] item, String name, long time){
    }

    public void addComment(Item item, String comment){
    }

}
