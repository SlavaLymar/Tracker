package ru.yalymar;

import ru.yalymar.action.ConsoleInput;
import ru.yalymar.menu.Menu;
import ru.yalymar.model.Item;
import ru.yalymar.tracker.Tracker;

public class StartUI {




    /*public static void main(String[] args) {
        Tracker tracker = new Tracker();
        ConsoleInput consoleInput = new ConsoleInput();
        Menu menu = new Menu();
        menu.greetings();

        while(true) {
            menu.showMenu();
            switch (consoleInput.getNumber()) {
                case 1:
                    for (Item i : tracker.getItems()) {
                        if (i != null) tracker.add(i);
                    }
                case 2:
                    for (Item i : tracker.getItems()) {
                        tracker.update(i);
                    }
                case 3:
                    for(Item i: tracker.getItems()){
                        if(i.getName().equals(consoleInput.getText())) {
                            tracker.delete(i);
                        }
                    }
                case 4:
                    for(Item i: tracker.getItems()){
                        tracker.findAll();
                    }
                case 5:
                    for(Item i: tracker.getItems()){
                        tracker.findByName(consoleInput.getText());
                    }
                case 6:
                    for(Item i: tracker.getItems()){
                        tracker.addComment(i, consoleInput.getText());
                    }
                case 7:
                    break;
                default:
            }
        }
    }*/
}
