// -------------------------------------------------------------
// The contents of this file are dedicated to the public domain.
// (See http://creativecommons.org/publicdomain/zero/1.0/).
// -------------------------------------------------------------

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Image;
import java.awt.Graphics;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.JPanel;
import javax.swing.JButton;

class View extends JPanel {
  View(Controller c) {
    JButton b1 = new JButton("Push me");
    add(b1);
    b1.addActionListener(c);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
  }
}

class Controller implements ActionListener {
  Controller() {
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("You really know how to push my buttons.");
  }
}

public class Game extends JFrame {
  View view;

  public Game() {
    Controller c = new Controller();
    view = new View(c);
    setTitle("Flappy");
    setSize(500, 500);
    getContentPane().add(view);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  static void take_a_nap(int miliseconds) {
    try {
      java.lang.Thread.sleep(miliseconds);
    } catch (Exception e) {
      e.printStackTrace(System.err);
      System.exit(1);
    }
  }

  public static void main(String[] args) {
    Game g = new Game();
    while (true) {
      g.view.repaint(); // calls View.paintComponent
      take_a_nap(50); // sleeps for 50 miliseconds
    }
  }
}