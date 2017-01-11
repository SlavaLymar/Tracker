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
    }

    public Item(String name, String description, String id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }


    public String getDescription() {
        return description;
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

    @Override
    public boolean equals(Object o){
        Item i = (Item) o;
        return (this.getId() == i.getId());
    }

     @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (description == null ? 0 : description.hashCode());
        result = prime * result + (id == null ? 0 : id.hashCode());
        return result;
    }
}
