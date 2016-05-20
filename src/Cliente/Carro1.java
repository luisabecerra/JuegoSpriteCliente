/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Personaje principal
 */
public class Carro1 {
    private int x;
    private int y;
    private Image tileset;
        
    public Carro1(int x, int y) {
        this.x = x;
        this.y = y;
        this.tileset = loadImage("free_radical_game_sprites.png");
    }
   

    public Image getTileset() {
        return tileset;
    }

    public void setTileset(Image tileset) {
        this.tileset = tileset;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public Carro1(){
       this.x=20;
       this.y=20;
    }
    public void dibujar(Graphics g, JPanel panel){
       g.setColor(Color.red);
       g.drawImage(tileset, x, y, x+32, y+32, 0, 0, 32, 32, panel);
    }
    
    protected Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN: y += 10; break;
            case KeyEvent.VK_UP: y -= 10; break;
            case KeyEvent.VK_LEFT: x -= 10; break;
            case KeyEvent.VK_RIGHT: x += 10; break;
              
        }
    }
    
    public void mover(){
       this.x+=1;
       //this.y+=1;
    }
    
    public Rectangle obtenerRectangulo(){
       return new Rectangle(x, y, 20, 20);
    }
}
