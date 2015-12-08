package com.awt02;

import java.awt.*;
import java.awt.event.*;

public class Homework02 extends Frame implements WindowListener, MouseMotionListener, MouseListener {

    TextField tfX=null,tfY=null;
    private int radius = 10; // Xpx radius of Oval

    private int size = 500;

    public Homework02(){
        setTitle("Java AWT Homework 2 - Matúš Petrofčík");

        setSize(size, size);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setResizable(false);

        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        add(new Label("X="));
        tfX=new TextField(5);add(tfX);

        add(new Label("Y="));
        tfY=new TextField(5);add(tfY);

        addWindowListener(this);
        setVisible(true);
    }

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawLine(0,size/2,size, size/2);
        g.drawLine(size/2,0, size/2, size);
    }

    private void painDot(int x, int y){
        Graphics g = getGraphics();

        if (x < size / 2){
            if (y < size / 2){
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.ORANGE);
            }
        } else {
            if (y < size / 2){
                g.setColor(Color.GREEN);
            } else {
                g.setColor(Color.BLUE);
            }
        }

        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
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
        add(new Label("X="));

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
        tfX.setText(String.format("%d", mX));
        tfY.setText(String.format("%d", mY));
//        repaint();
        setTitle(String.format("Súradnice myši sú %d a %d", mX, mY));
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int mX = (int) mouseEvent.getPoint().getX();
        int mY = (int) mouseEvent.getPoint().getY();

        System.out.println(String.format("%dx%d", mX, mY));

        painDot(mX, mY);
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
