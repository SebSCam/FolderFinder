package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServerConnector {
    public void connectRemoteServer(String user, String ip,String password) throws IOException {
        String[] cmd = {"sshpass","-p",password,"ssh",user+"@"+ip,"bash","-s","<","search.sh"};
        Process process = Runtime.getRuntime().exec(cmd);

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}