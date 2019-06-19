package com.erikriosetiawan.actionlistener;

import javax.swing.*;
import java.awt.*;

public class PenangananEvent extends JFrame {

    public PenangananEvent() {
        // Menciptakan dua tombol;
        JButton jbtOK = new JButton("OK");
        JButton jbtBatal = new JButton("Batal");

        // Menciptakan panel yang menampung tombol
        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtBatal);

        add(panel); // Menambahkan panel ke dalam frame

        // Mendapatkan listener
        OKListener listener1 = new OKListener();
        CancelListener listener2 = new CancelListener();
        jbtOK.addActionListener(listener1);
        jbtBatal.addActionListener(listener2);
    }

    public static void main(String[] args) {
        JFrame frame = new PenangananEvent();
        frame.setTitle("Penanganan Event");
        frame.setSize(200, 150);
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
