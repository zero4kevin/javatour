package com.zero4kevin.desginPatterns.CompositePattern;

/**
 * Created by xi1zhang on 2017/7/12.
 */
public class GenerateMenuItems {
    public static void generateMenuItems(MenuType type, MenuComponent component){
        switch (type){
            case PANCAKEHOUSE:
                component.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
                component.add(new MenuItem("Regular Pancake Breakfast","Pancakes with fried eggs, sausage", false, 2.99));
                component.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries, and blueberry syrup", true,3.49));
                break;
            case DINER:
                component.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
                component.add(new MenuItem("Hot dog","A hot dog, with saurkraut, relish, onions, topped with cheese", false,3.05));
                break;
            case COFFEE:
                component.add(new MenuItem("Coffee Cake", "Crumbly cake topped with cinnamon and walnuts", true, 1.59));
                component.add(new MenuItem("Bagel", "Flavors include sesame, poppyseed, cinnamon raisin, pumpkin", false, 0.69));
                break;
            case CAFE:
                component.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
                component.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));
                break;
            case DESSERT:
                component.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));
                component.add(new MenuItem("Cheesecake", "Creamy New York cheesecake, with a chocolate graham crust", true, 1.99));
                break;
            default:
                throw new UnsupportedOperationException("unsupported type "+ type.toString());
        }
    }

}
