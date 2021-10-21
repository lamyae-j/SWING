package Dessin;

import java.awt.Graphics;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//pour afficher une balle sur l'ecran
// first qs

public class Cercle extends JPanel
{

    public static int N =220;
    public static int M=300;

    // generation de balles pleines
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

        //Créer le bouton
        JButton btn = new JButton("Cliquez ici");
        Cercle cercle = new Cercle();
        //Définir la position du bouton
        btn.setBounds(50,200,100,40);
        // presser le bouton
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

            }
        });

        f.add(btn);
        f.getContentPane().add(new Cercle());
        f.setSize(300,300);
        f.setLayout(null);


        f.setSize(N, M);
        f.setVisible(true);
        f.setResizable(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}