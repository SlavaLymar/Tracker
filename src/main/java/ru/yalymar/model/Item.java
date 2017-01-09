package ru.yalymar.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Item {

    private String name;
    private String description;
    private Date time;
    private String id;
    private List <Comment> comments = new ArrayList<Comment>();

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
        this.time = new Date();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addCommentInList(Comment comment){
        this.comments.add(comment);
    }

    public List<Comment> getComments() {
        return comments;
    }

}
