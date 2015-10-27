package com.awt01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Homework extends Frame implements ActionListener, WindowListener {

    private String fileName = "/src/com/awt01/file.txt";

    private int radius = 15; // Xpx radius of Oval

    private String content;
    private String[][] points;

    // constructor
    public Homework() throws IOException {
        setTitle("Java AWT Homework 1 - Matúš Petrofčík");

        setSize(500, 500);
        addWindowListener(this);
        setResizable(false);

        content = getFileContent(fileName);

        points = getPoints(content);

        setVisible(true);
    }


    private String getFileContent(String fileName) throws IOException {
        String filePath = System.getProperty("user.dir") + fileName;

        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    private String[][] getPoints(String content){
        String[] lines = content.split("\n");

        int ll = lines.length;

        String[][] points = new String[ll][2];

        for (int i = 0; i < ll; i++){
            points[i] = lines[i].split(" ");
        }
        return points;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GRAY);

        for (int i = 0; i < points.length; i++){
            int x = Integer.parseInt(points[i][0]);
            int y = Integer.parseInt(points[i][1]);
//          g.drawOval(x, y, radius, radius);
            g.fillOval(x, y, radius, radius);

            System.out.println(x + " " + y);
        }

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

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
