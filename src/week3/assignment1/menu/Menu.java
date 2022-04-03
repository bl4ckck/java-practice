package week3.assignment1.menu;

import week3.assignment1.state.Action;

public class Menu {
    private final int argument;
    private final String message;
    private final Action action;

    public Menu(int argument, String message, Action action) {
        this.argument = argument;
        this.message = message;
        this.action = action;
    }

    public int getArgument() {
        return argument;
    }

    public String getMessage() {
        return message;
    }

    public Action getAction() {
        return action;
    }
}
