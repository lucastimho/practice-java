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
import java.awt.Color;

class Model {
  int turtle_x;
  int turtle_y;
  int dest_x;
  int dest_y;

  Model() {

  }

  void update() {
    if (turtle_x < dest_x)
      turtle_x++;
    if (turtle_x > dest_x)
      turtle_x--;
    if (turtle_y < dest_y)
      turtle_y++;
    if (turtle_y > dest_y)
      turtle_y--;
  }

  void setDestination(int dx, int dy) {
    dest_x = dx;
    dest_y = dy;
  }
}

class View extends JPanel {
  JButton b1;
  Image turtle_image;
  Model mod;

  View(Controller c, Model m) {
    mod = m;
    b1 = new JButton("Push me");
    add(b1);
    b1.addActionListener(c);

    try {
      turtle_image = ImageIO.read(new File("turtle.png"));
    } catch (Exception e) {
      e.printStackTrace(System.err);
      System.exit(1);
    }
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.cyan);
    g.fillRect(0, 0, 500, 500);
    g.drawImage(turtle_image, mod.turtle_x, mod.turtle_y, null);
  }
}

class Controller implements ActionListener, MouseListener {
  Model mod;

  Controller(Model m) {
    mod = m;
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("You really know how to push my buttons.");
  }

  public void mousePressed(MouseEvent e) {
    // Control the turtle
    mod.setDestination(e.getX(), e.getY());
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public void mouseClicked(MouseEvent e) {
  }
}

public class Game extends JFrame {
  View view;
  Model model;

  public Game() {
    model = new Model();
    Controller c = new Controller(model);
    view = new View(c, model);
    view.addMouseListener(c);
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
      g.model.update();
      g.view.repaint(); // calls View.paintComponent
      take_a_nap(50); // sleeps for 50 miliseconds
    }
  }
}