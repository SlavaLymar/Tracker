package ru.yalymar.start;

import ru.yalymar.menu.Menu;
import ru.yalymar.tracker.Tracker;

public class StartUI {

    private Input input;

    public StartUI(Input input) {
        this.input = input;
    }

   public void init(){
       Tracker tracker = new Tracker();
       Menu menu = new Menu(this.input, tracker);
       menu.fillMenu();

       do{
           menu.greetings();
           menu.showMenu();
           menu.select(this.input.ask("Select a number of menu: ", menu.getIntArr()));
       }
        while(menu.isB());
    }

    public static void main(String[] args) {

       new StartUI(new ConsoleInput()).init();
    }
}
