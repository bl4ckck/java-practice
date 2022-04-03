package week3.assignment1.console;

import week3.assignment1.state.Store;

import java.io.IOException;

public interface Console {
    void execute() throws IOException;
    void printError();
    void keyHandler(int args) throws IOException;
}
