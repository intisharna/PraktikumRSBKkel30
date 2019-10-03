/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colors;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 *
 * @author admin
 */
public class Colors extends Canvas implements Serializable {
//BUAT WARNA 
    private Color color;
    private boolean rect;
    public Colors(){
        rect=false; setSize(100,100); //UKURAN CANVAS
        change();}
    public boolean getRect(){
        return rect;}
    public void setRect(boolean flag){
        this.rect=flag; repaint();}
    public void change(){
        color = blue ();
        repaint();}
    private Color blue (){
        int r=(int)(255*Math.random());
        int g =(int)(255*Math.random());
        int b=(int)(255*Math.random());
        return new Color(r,g,b);}
    public void paint(Graphics g){
        Dimension d = getSize();
        int h=d.height;
        int w=d.width;

        // LINGKARAN
        if(rect){
        g.setColor(Color.red);
        g.fillRect(0,0,w-1,h-1) ;}
        else
        g.fillOval(0,0, w-1,h-1) ;}

}

