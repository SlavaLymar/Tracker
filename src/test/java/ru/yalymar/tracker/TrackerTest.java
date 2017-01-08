package ru.yalymar.tracker;

import org.junit.Test;
import ru.yalymar.model.Item;
import ru.yalymar.model.Task;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void addTest() {
        Tracker tracker = new Tracker();
        Item item = new Task("Task1", "Description of task1", System.currentTimeMillis(), new String[10]);
        Item result = tracker.add(item);
        assertThat(result, is(item));
    }

    @Test
    public void updateTest() {
        Tracker tracker = new Tracker();
        Item item = new Task("Task1", "Description of task1", System.currentTimeMillis(), new String[10]);
        tracker.add(item);
        Item expected = new Task("Task2", "Description of task2", System.currentTimeMillis()+1, new String[10], item.getId());
        tracker.update(expected);
        Item result = tracker.getItems()[0];
        assertThat(result, is(expected));
    }

    @Test
    public void deleteTest() {
        Tracker tracker = new Tracker();
        Item item = new Task("Task1", "Description of task1", System.currentTimeMillis(), new String[10]);
        tracker.add(item);
        Item expected = null;
        tracker.delete(item);
        Item result = tracker.getItems()[0];
        assertThat(result,is(expected));
    }

    @Test
    public void findAllTest() {
        Tracker tracker = new Tracker();
        Item item1 = new Task("Task1", "Description of task1", System.currentTimeMillis(), new String[10]);
        Item item2 = new Task("Task2", "Description of task2", System.currentTimeMillis()+2, new String[10]);
        Item item3 = new Task("Task3", "Description of task3", System.currentTimeMillis()+3, new String[10]);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] expected = new Item[3];
        for(int i = 0; i<3; i++){
            if(tracker.getItems()[i]!=null){
                expected[i] = tracker.getItems()[i];
            }
        }
        Item[] result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void findByNameTest() {
        Tracker tracker = new Tracker();
        Item item1 = new Task("Task1", "Description of task1", System.currentTimeMillis(), new String[10]);
        Item item2 = new Task("Task2", "Description of task2", System.currentTimeMillis()+2, new String[10]);
        Item item3 = new Task("Task1", "Description of task3", System.currentTimeMillis()+3, new String[10]);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] result = tracker.findByName("Task1");
        Item[] expected = new Item[2];


        assertThat(result, is(expected));
    }

    @Test
    public void addCommentTest() {

    }

}