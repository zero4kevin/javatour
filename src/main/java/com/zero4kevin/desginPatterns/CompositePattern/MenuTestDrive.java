package com.zero4kevin.desginPatterns.CompositePattern;

import static com.zero4kevin.desginPatterns.CompositePattern.GenerateMenuItems.generateMenuItems;

/**
 * Created by kevin on 7/10/17.
 */
public class MenuTestDrive {
    public static void main (String[] args){
        MenuComponent pancakeHouseMenu=new Menu("Pancake House Menu","breakfast");
        MenuComponent dinerMenu=new Menu("Dinner Menu","Lunch");
        MenuComponent cafeMenu=new Menu("Cafe Menu", "Dinner");
        MenuComponent dessertMenu=new Menu("Dessert menu", "Dessert of course!");
        MenuComponent coffeeMenu=new Menu("Coffee menu", "All stuff to go with your afternoon coffee");

        MenuComponent allMenus= new Menu("All menus", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        generateMenuItems(MenuType.PANCAKEHOUSE,pancakeHouseMenu);
        generateMenuItems(MenuType.DINER,dinerMenu);
        dinerMenu.add(dessertMenu);
        generateMenuItems(MenuType.DESSERT,dessertMenu);
        generateMenuItems(MenuType.CAFE, cafeMenu);
        cafeMenu.add(coffeeMenu);
        generateMenuItems(MenuType.COFFEE, coffeeMenu);

        Waitress waitress=new Waitress(allMenus);
//        waitress.printMenu();

        waitress.printVegetarianMenu();
    }
}
