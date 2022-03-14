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
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
  }
}

class Controller implements ActionListener {
  Controller() {
  }

  public void actionPerformed(ActionEvent e) {
  }
}

public class Game extends JFrame {
  public Game() {
    Controller c = new Controller();
    View v = new View(c);
    setTitle("Flappy");
    setSize(500, 500);
    getContentPane().add(v);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Game();
  }
}