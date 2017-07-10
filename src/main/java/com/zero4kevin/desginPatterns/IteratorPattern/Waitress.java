package com.zero4kevin.desginPatterns.IteratorPattern;

/**
 * Created by kevin on 7/10/17.
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator pancakeMenuIterator= pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator= dinerMenu.createIterator();
        System.out.println("Menu-----breakfast");
        printMenu(pancakeMenuIterator);
        System.out.println("Menu-----launch");
        printMenu(dinerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()){
            MenuItem menuItem=(MenuItem) iterator.next();
            System.out.println(menuItem.getName() + " "+ menuItem.getPrice()+ " " + menuItem.getDescription());
        }
    }
}
