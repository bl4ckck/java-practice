package week3.assignment1.state;

import week3.assignment1.menu.Menu;
import week3.assignment1.menu.MenuList;

import java.io.IOException;

final public class Store {
    private Menu selectedMenu;
    public boolean isContinue = true;

    public void display() throws IOException {
        if (selectedMenu == null) MenuList.displayMainMenu();
        else {
            this.dispatch(selectedMenu.getAction());
            MenuList.displaySelectedMenu();
        }
    }

    public void dispatch(Action action) throws IOException {
        Action.execute(this, action);
    }

    public Menu getSelectedMenu() {
        return selectedMenu;
    }

    public void setSelectedMenu(Menu selectedMenu) {
        this.selectedMenu = selectedMenu;
    }

    public void setContinue(boolean isContinue) {
        this.isContinue = isContinue;
    }
}
