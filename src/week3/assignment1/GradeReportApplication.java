package week3.assignment1;

import week3.assignment1.console.Console;
import week3.assignment1.console.ConsoleHandler;
import week3.assignment1.state.Store;

import java.io.IOException;

public class GradeReportApplication {
    public static void main(String[] args) throws IOException {
        Store store = new Store();
        Console menu = new ConsoleHandler(store);
        menu.execute();
    }
}
