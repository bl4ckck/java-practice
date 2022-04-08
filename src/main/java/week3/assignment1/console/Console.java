package week3.assignment1.console;

import java.io.IOException;

public interface Console {
    void execute() throws IOException;
    void printError();
    void keyHandler(int args) throws IOException;
}
