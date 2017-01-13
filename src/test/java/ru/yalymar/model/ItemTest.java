package ru.yalymar.model;

import org.junit.Test;
import ru.yalymar.tracker.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemTest {

    @Test
    public void addToListCommentsTest(){
        Tracker tracker = new Tracker();
        Item item1 = new Item("Task1", "Description of task1");
        tracker.add(item1);
        Comment c = new Comment("Commentariy");
        item1.addToListComments(c);
        assertThat(item1.getComments().get(0).getComment(), is("Commentariy"));
    }

}