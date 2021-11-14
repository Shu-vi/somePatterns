package Iterator.BadCode;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        for (MenuItem menuItem : breakfastItems) {
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
        for (MenuItem menuItem : lunchItems) {
            if (menuItem!=null) {
                System.out.print(menuItem.getName());
                System.out.println("\t\t" + menuItem.getPrice());
                System.out.println("\t" + menuItem.getDescription());
            }
        }
    }
}
