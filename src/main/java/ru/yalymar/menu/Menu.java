package ru.yalymar.menu;


import java.util.ArrayList;
import java.util.List;

public class Menu {

    private int numberOfMenu;
    private String textOfMenu;

    public int getNumberOfMenu() {
        return numberOfMenu;
    }

    public String getTextOfMenu() {
        return textOfMenu;
    }

    public Menu(int numberOfMenu, String textOfMenu) {
        this.numberOfMenu = numberOfMenu;
        this.textOfMenu = textOfMenu;
    }

    private List<Menu> menus = new ArrayList<Menu>();

    public void greetings(){
        System.out.println("Welcome! +\n+ This is a Tracker. ");
    }

    public void createMenu(){
        menus.add(new Menu(1, "Add the Item"));
        menus.add(new Menu(2, "Edit the Item"));
        menus.add(new Menu(3, "Delete the Item"));
        menus.add(new Menu(4, "Show all Items"));
        menus.add(new Menu(5, "Show the Items by name"));
        menus.add(new Menu(6, "Add comment in to the Item"));
        menus.add(new Menu(7, "Exit"));
    }

    public void showMenu(){
        for(Menu m: menus){
            System.out.println(m.getNumberOfMenu()+". "+m.getTextOfMenu());
        }
    }

    public void selectInMenu(){

    }

}
