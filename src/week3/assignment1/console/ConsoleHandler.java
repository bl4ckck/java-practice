package week3.assignment1.console;

import week3.assignment1.helper.Helper;
import week3.assignment1.state.Action;
import week3.assignment1.state.Store;
import week3.assignment1.menu.MenuList;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleHandler implements Console {
    private boolean isError;
    private final Store store;
    public static final Scanner in = new Scanner(System.in);
    public static final String APP_NAME = "Aplikasi pengolah Nilai Siswa";

    public ConsoleHandler(Store store) {
        this.store = store;
    }

    protected void printHeader() {
        String title = Helper.symbol(APP_NAME.length(), "-") + "\n"
                + APP_NAME + "\n" + Helper.symbol(APP_NAME.length(), "-");
        System.out.println(title);
    }

    @Override
    public void execute() throws IOException {
        while (store.isContinue) {
            this.printHeader();
            store.display(); // Display current page
            this.printError();
            this.keyHandler(in.nextInt());
        }
    }

    @Override
    public void printError() {
        if (this.isError) System.out.println("Something went wrong!");
        this.isError = false;
    }

    @Override
    public void keyHandler(int args) throws IOException {
        if (args == 0) store.dispatch(Action.EXIT);
        else {
            // User in home menu
            if (store.getSelectedMenu() == null) {
                if (args > 4 || args < 0) this.isError = true;
                else store.setSelectedMenu(MenuList.MAIN_MENU[args-1]);
            }
            // User already selected menu
            else {
                if ((args > 1 || args < 0)) this.isError = true;
                else store.dispatch(Action.BACK);
            }
        }
    }
}
