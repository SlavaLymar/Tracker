package ru.yalymar.tracker;

import ru.yalymar.model.Comment;
import ru.yalymar.model.Item;
import java.util.*;

public class Tracker {

    private List <Item> items = new ArrayList<Item>();
    private static final Random RANDOM = new Random();

    public Item add(Item item){
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    public void update(Item item){
        if(this.items.indexOf(item) != -1)
            Collections.replaceAll(this.items, this.items.get(this.items.indexOf(item)), item);
    }

    public void delete(Item item){
            if(this.items.indexOf(item) != -1)
                this.items.remove(this.items.indexOf(item));
    }

    public List <Item> findAll(){
        List <Item> result = new ArrayList<Item>();
        for(Item i: this.items) {
            if (i!=null) {
                result.add(i);
            }
        }
        return result;
    }

    public List <Item> findByName(String key){
        List <Item> result = new ArrayList<Item>();
        for(Item i: this.items){
            if(i!= null && i.getName().equals(key)){
                result.add(i);
            }
        }
        return result;
    }

    public void addCommentById(String id, Comment comment){
        Item item = this.findById(id);
        item.addToListComments(comment);
    }

    public void addCommentByName(String name, Comment comment){
        List<Item> item = this.findByName(name);
        for(Item i: item){
            i.addToListComments(comment);
        }
    }

    public String generateId(){

        return String.valueOf(System.currentTimeMillis()+RANDOM.nextInt());
    }

    public Item findById(String id){
        Item result = null;
        for(Item i: items){
            if(i != null && i.getId().equals(id)){
                result = i;
                break;
            }
        }
        return result;
    }

    public List <Item> findByDescription(String desc){
        List <Item> result = new ArrayList<Item>();
        for(Item i: this.items){
            if(i!= null && i.getDescription().equals(desc)){
                result.add(i);
            }
        }
        return result;
    }

    public List <Item> getItems() {
        return items;
    }

    public void showAllItems(){
        System.out.printf("%1$-30s%2$-30s%3$-30s\n", "Id", "Name", "Description");
        System.out.printf("------------------------------------------------------------------------------------------\n");
        for(Item i: this.items){
            if(i != null) {
                System.out.printf("%1$-30s%2$-30s%3$-30s\n", i.getId(), i.getName(), i.getDescription());
            }
        }
    }

    public void showAllItems(List<Item> item){
        System.out.printf("%1$-30s%2$-30s%3$-30s\n", "Id", "Name", "Description");
        System.out.printf("------------------------------------------------------------------------------------------\n");
        for(Item i: item){
            if(i != null) {
                System.out.printf("%1$-30s%2$-30s%3$-30s\n", i.getId(), i.getName(), i.getDescription());
            }
        }
    }

    public void showOneItems(Item item){
        System.out.printf("%1$-30s%2$-30s%3$-30s\n", "Id", "Name", "Description");
        System.out.printf("------------------------------------------------------------------------------------------\n");
        if(item!=null)
        System.out.printf("%1$-30s%2$-30s%3$-30s\n", item.getId(), item.getName(), item.getDescription());
    }

    public void showComments(String id){
        Item item = this.findById(id);
        List<Comment> commentsItem = item.getComments();
        int position = 1;
        for (Comment c: commentsItem){
            System.out.printf("%1$-3d%2$s\n", position++, c.getComment());
        }
    }

}
