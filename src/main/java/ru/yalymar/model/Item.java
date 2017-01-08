package ru.yalymar.model;


public class Item {

    public String name;
    public String description;
    public long time;
    public String[] comment;

    public void setComment(String[] comment) {
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

    public String[] getComment() {
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


}
