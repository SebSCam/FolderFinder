package controllers;

import models.ServerConnector;
import views.ConnectionDialog;
import java.io.IOException;

public class Controller {
    private ServerConnector conection;
    private ConnectionDialog dialog;

    public Controller() {
        this.conection = new ServerConnector();
        this.dialog = new ConnectionDialog();
        init();
    }

    private void init() {
        try {
            conection.connectRemoteServer(dialog.getUser(), dialog.getIp(),dialog.getPass());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Controller();
    }
}
