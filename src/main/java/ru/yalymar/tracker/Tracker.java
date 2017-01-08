package ru.yalymar.tracker;
import ru.yalymar.model.Item;

import java.util.*;

public class Tracker {

    private Item[] items = new Item[10];

    public Item[] getItems() {
        return items;
    }

    private int position = 0;
    private static final Random RANDOM = new Random();

    public Item add(Item item){
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }

    public void update(Item item){
        for(int i = 0; i!=this.items.length;i++){
            if(this.items[i]!=null && this.items[i].getId().equals(item.getId())){
                this.items[i] = item;
                break;
            }
        }
    }

    public void delete(Item item){
        for(int i = 0; i!=this.items.length;i++){
            if(this.items[i]!=null && this.items[i].getId().equals(item.getId())){
                this.items[i] = null;
                break;
            }
        }
    }

    public Item[] findAll(){
        Item[] result = new Item[this.position];
        for(int i = 0; i!=this.position;i++){
            result[i] = this.items[i];
        }
        return result;
    }

    public Item[] findByName(String key){
        Item[] tmp = new Item[this.position];
        int count = 0;
        for(int i = 0; i!= this.position;i++){
            if(this.items[i]!=null && this.items[i].getName().equals(key)){
                tmp[i] = this.items[i];
                count++;
            }
        }
        Item[] result = new Item[count];
        int j = 0;
        for(int i = 0; i<tmp.length; i++){
            if(tmp[i]!= null){
                result[j] = tmp[i];
                j++;
            }
        }
        return result;
    }

    public void addComment(Item item, String comment){

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







}
