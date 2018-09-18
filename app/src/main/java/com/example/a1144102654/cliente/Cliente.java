package com.example.a1144102654.cliente;

import android.util.Log;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente extends Thread {

    @Override
    public void run() {
        try {
            Socket s= new Socket("10.0.2.2",5000);

       OutputStream os= s.getOutputStream();
            PrintWriter out= new PrintWriter(new OutputStreamWriter(os));
            out.print("hola mundo");
            out.flush();

            Log.e("DEBUG","conexion exitosas");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
