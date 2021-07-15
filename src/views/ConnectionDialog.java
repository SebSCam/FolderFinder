package views;

import java.util.Scanner;
public class ConnectionDialog {

private Scanner reader;
    public ConnectionDialog() {
        this.reader = new Scanner(System.in);
    }

    public String getUser() {
        System.out.println("Please enter User");
        return reader.next();
    }

    public String getIp() {
        System.out.println("Please enter host");
        return reader.next();
    }

    public String getPass() {
        System.out.println("Please enter password");
        return reader.next();
    }
}
