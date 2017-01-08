package ru.yalymar.tracker;
import ru.yalymar.model.Item;
import ru.yalymar.model.Task;

public class Tracker {

    private Item[] items = new Task[100];

    public void setItems(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public Item add(Item item){
    }

    public void update(Item item){
    }

    public void delete(Item item){
    }

    public Item[] findAll(){
    }

    public Item[] findByName(String key){
    }

    public void addComment(Item item, String comment){
    }







}
