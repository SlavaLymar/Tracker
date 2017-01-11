package ru.yalymar.tracker;

import ru.yalymar.model.Comment;
import ru.yalymar.model.Item;
import java.util.*;

public class Tracker {

    private List <Item> items = new ArrayList<Item>();
    private static final Random RANDOM = new Random();
    private int position = 0;

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

    public Item addComment(String id, Comment comment){
        Item item = this.findById(id);
        item.addCommentInList(comment);
        return item;
    }

    public String generateId(){

        return String.valueOf(System.currentTimeMillis()+RANDOM.nextInt());
    }

    private Item findById(String id){
        Item result = null;
        for(Item i: items){
            if(i != null && i.getId().equals(id)){
                result = i;
                break;
            }
        }
        return result;
    }

    public List <Item> getItems() {
        return items;
    }

}
