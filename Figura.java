/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import javax.swing.JButton;

/**
 *
 * @author abel
 */
public abstract class Figura {
JButton [][]matris;
int dimx,dimy;
boolean detenida;

public Figura(JButton [][]matris){
    this.matris=matris;
    dimx=matris.length; 
    dimy=matris[0].length;
    detenida=false;
}


public abstract void baja();
public abstract void der();
public abstract void izq();
public abstract void gira();
  
}
