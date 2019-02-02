/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author abel
 */
public class Z extends Figura{
JButton b1;
JButton b2;
JButton b3;
JButton b4;
int x,y;
boolean horizontal;

public Z(JButton[][] matris){
 super(matris);
 horizontal=true;
 detenida=false;
 b1=matris[dimx/2][0]; 
 b2=matris[dimx/2+1][0];
 b3=matris[dimx/2+1][1];
 b4=matris[dimx/2+2][1];
 b1.setBackground(Color.cyan);
 b2.setBackground(Color.cyan);
 b3.setBackground(Color.cyan);
 b4.setBackground(Color.cyan);
x=dimx/2;y=1;
}

public void baja(){

if (detenida) return;

if (y>=dimy-1) {detenida=true;return ;}

if (horizontal&&
        
           (!matris[x+1][y+1].getBackground().equals(new Color(240,240,240))||
            !matris[x][y].getBackground().equals(new Color(240,240,240))||
           !matris[x+2][y+1].getBackground().equals(new Color(240,240,240)))) {detenida=true;return;}          

if (!horizontal&&
        
           (!matris[x+1][y].getBackground().equals(new Color(240,240,240))||
            !matris[x][y+1].getBackground().equals(new Color(240,240,240)))) {detenida=true;return;}          


if (horizontal) {
      
       b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
       y++;
      b1=matris[x][y-1]; 
      b2=matris[x+1][y-1];
      b3=matris[x+1][y];
      b4=matris[x+2][y];
      b1.setBackground(Color.cyan);
      b2.setBackground(Color.cyan);
      b3.setBackground(Color.cyan);
      b4.setBackground(Color.cyan);   }
else {  b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
       y++;
       b4=matris[x+1][y-2];
       b3=matris[x+1][y-1];
       b2=matris[x][y-1];
       b1=matris[x][y];
      b1.setBackground(Color.cyan);
      b2.setBackground(Color.cyan);
      b3.setBackground(Color.cyan);
      b4.setBackground(Color.cyan);  
    }
}

public void der(){
if (detenida) return;     
if (horizontal&&x+2>=dimx-1) return ;
if (!horizontal&&x+1>=dimx-1) return ;
 if (horizontal)
      {b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
      x++;
      b1=matris[x][y-1]; 
      b2=matris[x+1][y-1];
      b3=matris[x+1][y];
      b4=matris[x+2][y];
      b1.setBackground(Color.cyan);
      b2.setBackground(Color.cyan);
      b3.setBackground(Color.cyan);
      b4.setBackground(Color.cyan);   
      }
 else{b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
      x++;
      
       b4=matris[x+1][y-2];
       b3=matris[x+1][y-1];
       b2=matris[x][y-1];
       b1=matris[x][y];
      b1.setBackground(Color.cyan);
      b2.setBackground(Color.cyan);
      b3.setBackground(Color.cyan);
      b4.setBackground(Color.cyan);   
       
     }
}

public void izq(){
if (detenida) return; 
if (x-1<0) return;
  
if (horizontal) 
     { b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
      
       x--;
      b1=matris[x][y-1]; 
      b2=matris[x+1][y-1];
      b3=matris[x+1][y];
      b4=matris[x+2][y];
      b1.setBackground(Color.cyan);
      b2.setBackground(Color.cyan);
      b3.setBackground(Color.cyan);
      b4.setBackground(Color.cyan);   
     }
else{b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
      
       x--;
      b4=matris[x+1][y-2];
       b3=matris[x+1][y-1];
       b2=matris[x][y-1];
       b1=matris[x][y];
       b1.setBackground(Color.cyan);
      b2.setBackground(Color.cyan);
      b3.setBackground(Color.cyan);
      b4.setBackground(Color.cyan);   


    }
     }

public void gira(){
if (x+1>dimx-1||x<0) return ;

if (horizontal){
       b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
        
       b4=matris[x+1][y-2];
       b3=matris[x+1][y-1];
       b2=matris[x][y-1];
       b1=matris[x][y];
       b1.setBackground(Color.cyan);
       b2.setBackground(Color.cyan);
       b3.setBackground(Color.cyan);
       b4.setBackground(Color.cyan);
    
        }
else  {b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
       
      b1=matris[x][y-1]; 
      b2=matris[x+1][y-1];
      b3=matris[x+1][y];
      b4=matris[x+2][y];
       
      b1.setBackground(Color.cyan);
      b2.setBackground(Color.cyan);
      b3.setBackground(Color.cyan);
      b4.setBackground(Color.cyan);
    
     }

horizontal=!horizontal;
}


}

