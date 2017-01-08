package ru.yalymar.model;


public class Item {

    protected String name;
    protected String description;
    protected long time;
    protected String[] comment;
    protected String id;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getTime() {
        return time;
    }

    public String[] getComment() {
        return comment;
    }

    public String getId() {
        return id;
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

    public void setComment(String[] comment) {
        this.comment = comment;
    }

    public void setId(String id) {
        this.id = id;
    }
}
