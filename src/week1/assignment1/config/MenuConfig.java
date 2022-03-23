package week1.assignment1.config;

import week1.assignment1.Menu;

public class MenuConfig {
    public static Menu[] selectedMenu() {
        Menu beef = new Menu("beef", 75000);
        Menu mutton = new Menu("mutton", 35000);
        Menu chicken = new Menu("chicken", 35000);
        Menu duck = new Menu("duck", 50000);

        return new Menu[]{beef, mutton, chicken, duck};
    }
}
