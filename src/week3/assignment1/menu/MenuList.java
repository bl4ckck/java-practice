package week3.assignment1.menu;

import week3.assignment1.state.Action;

public final class MenuList {
    public static Menu EXIT_BTN = new Menu(0, "0. Exit", Action.EXIT);
    public static Menu BACK_BTN = new Menu(1, "1. Kembali ke menu utama", Action.BACK);
    public static Menu MODUS_BTN = new Menu(1, "1. Generate txt untuk menampilkan modus", Action.GENERATE_MODUS);
    public static Menu AVG_BTN = new Menu(2, "2. Generate txt untuk menampilkan nilai rata-rata, median", Action.GENERATE_AVG_MEDIAN);
    public static Menu ALL_BTN = new Menu(3, "3. Generate kedua file", Action.GENERATE_ALL);
    public static Menu READ_CSV_BTN = new Menu(4, "4. Read CSV", Action.READ_CSV);

    public static Menu[] MAIN_MENU = new Menu[]{ MODUS_BTN, AVG_BTN, ALL_BTN, READ_CSV_BTN, EXIT_BTN };

    public static void displayMainMenu() {
        StringBuilder title = new StringBuilder();
        System.out.println("Pilih menu: ");
        for (Menu item : MAIN_MENU) {
            title.append(item.getMessage()).append("\n");
        }
        System.out.println(title);
    }

    public static void displaySelectedMenu() {
        String exitMsg = EXIT_BTN.getMessage();
        String backMsg = BACK_BTN.getMessage();
        System.out.printf("\n%s\n%s%n", exitMsg, backMsg);
    }
}
