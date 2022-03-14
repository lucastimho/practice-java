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
  int bird_x;
  int bird_y;
  double vert_vel;
  int time_since_flap;

  Model() {

  }

  void update() {
    vert_vel += 1.5;
    bird_y += vert_vel;
    time_since_flap++;
  }

  void onClick() {
    vert_vel = -18;
    time_since_flap = 0;
  }
}

class View extends JPanel {
  JButton b1;
  Image bird_image1;
  Image bird_image2;
  Model mod;

  View(Controller c, Model m) {
    mod = m;
    b1 = new JButton("Push me");
    add(b1);
    b1.addActionListener(c);

    try {
      bird_image1 = ImageIO.read(new File("bird1.png"));
      bird_image2 = ImageIO.read(new File("bird2.png"));
    } catch (Exception e) {
      e.printStackTrace(System.err);
      System.exit(1);
    }
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (mod.time_since_flap < 5)
      g.drawImage(bird_image2, mod.bird_x, mod.bird_y, null);
    else
      g.drawImage(bird_image1, mod.bird_x, mod.bird_y, null);
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
    mod.onClick();
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