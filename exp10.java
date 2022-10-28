/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp10;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author ambi
 */
public class exp10 extends JPanel {
    int midX = 400;
    int midY = 300;
   public void paintComponent(Graphics g) {
       super.paintComponent(g);
       setBackground(new Color(255,0,0));
       g.setColor (Color.black);
       g.fillOval (midX-20, midY-60, 40, 40); // head
       g.fillOval (midX-35, midY-25, 70, 60); // upper body
       g.fillOval (midX-50, midY+20, 100, 80); // lower body
       g.setColor (Color.white);
       g.fillOval (midX-10, midY-50, 5, 5); // left eye
       g.fillOval (midX+5, midY-50, 5, 5); // right eye
       g.drawArc (midX-10, midY-40, 20, 10, 190, 160); // smile
       g.drawLine (midX-25, midY, midX-55, midY); // left arm
       g.drawLine (midX+25, midY, midX+55, midY); // right arm
       g.drawLine (midX-20, midY-55, midX+20, midY-55); // brim of hat
       g.fillRect (midX-15, midY-80, 30, 25); // hat
}
public static void main(String args[]) {
JFrame frame = new JFrame("Snowman");
frame.add(new expt10snowman());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(500,500);
frame.setVisible(true);
}
}
