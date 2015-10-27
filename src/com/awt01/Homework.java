package com.awt01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Homework extends Frame implements ActionListener, WindowListener {

    private Button buttonClose;
    private Button buttonNew;

    // constructor
    public Homework(){
        setTitle("Java AWT Homework 1 - Matúš Petrofčík");

        setSize(300, 100);

//        setLayout(new FlowLayout());
        setLayout(new GridLayout(1, 3));

//        Label label = new Label();
//        label.setText("First Homework");
//        label.setAlignment(Label.CENTER);
//        add(label);

        buttonNew = new Button("New");
        buttonNew.addActionListener(this);
        add(buttonNew);

        buttonClose = new Button("Close window bitch!");
        buttonClose.addActionListener(this);
        add(buttonClose);

        addWindowListener(this);

        setResizable(false);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();

        if (source == buttonClose){
            System.exit(0);
        }

        if (source == buttonNew){
            new Homework();
        }
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {

    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {

    }
}
