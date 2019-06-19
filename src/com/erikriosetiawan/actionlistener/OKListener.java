package com.erikriosetiawan.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OKListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Tombol OK diklik");
    }
}
