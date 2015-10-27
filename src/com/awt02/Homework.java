package com.awt02;

import java.awt.*;
import java.awt.event.*;

public class Homework extends Frame implements ActionListener, WindowListener, MouseMotionListener, MouseListener {

    private int radius = 5; // Xpx radius of Oval

//    private Panel quadrants[] = { new Panel(), new Panel(), new Panel(), new Panel()};

    public Homework(){
        setTitle("Java AWT Homework 2 - Matúš Petrofčík");

        setSize(500, 500);
        setLayout(new FlowLayout());
        setResizable(false);

        this.addMouseMotionListener(this);
        this.addMouseListener(this);

        addWindowListener(this);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
//        g.setColor(Color.GRAY);

//        g.fillOval(x, y, radius, radius);

    }

    private void paintOval(Graphics g){

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
//        Object source = actionEvent.getSource();

//        if (source == buttonNew){
//
//        }
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

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        int mX = (int) mouseEvent.getPoint().getX();
        int mY = (int) mouseEvent.getPoint().getY();
        setTitle(String.format("Súradnice myši sú %d a %d", mX, mY));
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int mX = (int) mouseEvent.getPoint().getX();
        int mY = (int) mouseEvent.getPoint().getY();

        System.out.println(String.format("%dx%d", mX, mY));

//        Graphics g = new Graphics();
//        g.fillOval(mX, mY, radius, radius);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
