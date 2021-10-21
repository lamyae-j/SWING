package Dessin;

import java.awt.Graphics;
import javax.swing.*;
import java.awt.Color;


//pour afficher une balle sur l'ecran

public class Cercle extends JPanel
{

    public static int N =220;
    public static int M=300;
    public void paint(Graphics g){
        int x=5,y=4,z=15,h=15;
        do{
            g.fillOval(x,y,z,h);
            g.drawOval(x, y, z, h);
            g.setColor(Color.BLACK);
            x+=20;

            if(x >N){
                y+=20;
                x=5;
            }

        }while(y<N);


    }

    public static void main(String[] args){
        JFrame f = new JFrame("Dessiner un cercle");
        f.getContentPane().add(new Cercle());
        f.setSize(N, M);
        f.setVisible(true);
        f.setResizable(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}