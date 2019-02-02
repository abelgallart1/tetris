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
public class T extends Figura{
JButton b1;
JButton b2;
JButton b3;
JButton b4;
int x,y;

int pos;

public T(JButton[][] matris){
 super(matris);
 
 pos=0;
 
 detenida=false;
 b1=matris[dimx/2][0]; 
 b2=matris[dimx/2+1][0];
 b3=matris[dimx/2+2][0];
 b4=matris[dimx/2+1][1];
 b1.setBackground(Color.PINK);
 b2.setBackground(Color.PINK);
 b3.setBackground(Color.PINK);
 b4.setBackground(Color.PINK);
x=dimx/2;y=1;
}

public void baja(){

if (detenida) return;

if (pos==0&&y>=dimy-1) {detenida=true;return ;}
if (pos==1&&y+1>=dimy-1) {detenida=true;return ;}
if (pos==3&&y+1>=dimy-1) {detenida=true;return ;}
if (pos==2&&y>=dimy-1) {detenida=true;return ;}

if (pos==0&&
        
           (!matris[x][y].getBackground().equals(new Color(240,240,240))
           ||
           !matris[x+1][y+1].getBackground().equals(new Color(240,240,240))||
           !matris[x+2][y].getBackground().equals(new Color(240,240,240))
            ) ) {detenida=true;return;}          


if (pos==1&&
        
           (!matris[x][y+1].getBackground().equals(new Color(240,240,240))
           ||
           !matris[x+1][y+2].getBackground().equals(new Color(240,240,240))
            ) ) {detenida=true;return;}          

if (pos==2&&
        
           (!matris[x][y+1].getBackground().equals(new Color(240,240,240))
           ||
           !matris[x+1][y+1].getBackground().equals(new Color(240,240,240))
           ||
           !matris[x+2][y+1].getBackground().equals(new Color(240,240,240))
            
        ) ) {detenida=true;return;}          

if (pos==3&&
        
           (!matris[x+1][y+2].getBackground().equals(new Color(240,240,240))
           ||
           !matris[x+2][y+1].getBackground().equals(new Color(240,240,240))
           ) ) {detenida=true;return;}          

if (pos==0) {
      
       b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
       y++;
       b1=matris[x][y-1]; 
       b2=matris[x+1][y-1];
       b3=matris[x+2][y-1];
       b4=matris[x+1][y];
      b1.setBackground(Color.PINK);
      b2.setBackground(Color.PINK);
      b3.setBackground(Color.PINK);
      b4.setBackground(Color.PINK);   }
 
 if (pos==1){
             b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
        y++;
       b4=matris[x+1][y-1];
       b3=matris[x+1][y];
       b2=matris[x][y];
       b1=matris[x+1][y+1];
       b1.setBackground(Color.PINK);
       b2.setBackground(Color.PINK);
       b3.setBackground(Color.PINK);
       b4.setBackground(Color.PINK);
       
 
 
            
           }
 
 if (pos==2){
b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
        b4.setBackground(new Color(240,240,240));
       y++;       
       b4=matris[x+1][y-1];
       b3=matris[x][y];
       b2=matris[x+1][y];
       b1=matris[x+2][y];
       b1.setBackground(Color.PINK);
       b2.setBackground(Color.PINK);
       b3.setBackground(Color.PINK);
       b4.setBackground(Color.PINK);
       
    
      
          }
if (pos==3)
  {b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
        b4.setBackground(new Color(240,240,240));
       y++;       
       b4=matris[x+1][y-1];
       b3=matris[x+1][y];
       b2=matris[x+2][y];
       b1=matris[x+1][y+1];
       b1.setBackground(Color.PINK);
       b2.setBackground(Color.PINK);
       b3.setBackground(Color.PINK);
       b4.setBackground(Color.PINK);
       
    
      
    }
}

public void der(){
if (detenida) return;     
if (pos==0&&x+2>=dimx-1) return ;
if (pos==1&&x+1>=dimx-1) return ;
if (pos==2&&x+2>=dimx-1) return ;
if (pos==3&&x+2>=dimx-1) return ;
if (pos==0)
      {b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
      x++;
       b1=matris[x][y-1]; 
       b2=matris[x+1][y-1];
       b3=matris[x+2][y-1];
       b4=matris[x+1][y];
         b1.setBackground(Color.PINK);
      b2.setBackground(Color.PINK);
      b3.setBackground(Color.PINK);
      b4.setBackground(Color.PINK);   
      }
if (pos==1) {
 b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
        x++;
       b4=matris[x+1][y-1];
       b3=matris[x+1][y];
       b2=matris[x][y];
       b1=matris[x+1][y+1];
       b1.setBackground(Color.PINK);
       b2.setBackground(Color.PINK);
       b3.setBackground(Color.PINK);
       b4.setBackground(Color.PINK);
       
}
if (pos==2){
b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
        b4.setBackground(new Color(240,240,240));
       x++;       
       b4=matris[x+1][y-1];
       b3=matris[x][y];
       b2=matris[x+1][y];
       b1=matris[x+2][y];
       b1.setBackground(Color.PINK);
       b2.setBackground(Color.PINK);
       b3.setBackground(Color.PINK);
       b4.setBackground(Color.PINK);
       
    
      
          }
if (pos==3)
  {b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
        b4.setBackground(new Color(240,240,240));
       x++;       
       b4=matris[x+1][y-1];
       b3=matris[x+1][y];
       b2=matris[x+2][y];
       b1=matris[x+1][y+1];
       b1.setBackground(Color.PINK);
       b2.setBackground(Color.PINK);
       b3.setBackground(Color.PINK);
       b4.setBackground(Color.PINK);
       
    
      
    }
}

public void izq(){
if (detenida) return; 
if (pos==3&&x<0) return;
if (pos==0&&x-1<0) return;
if (pos==2&&x-1<0) return;
if (pos==1&&x-1<0) return;

if (pos==0) 
     { b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
      
       x--;
       b1=matris[x][y-1]; 
       b2=matris[x+1][y-1];
       b3=matris[x+2][y-1];
       b4=matris[x+1][y];
      b1.setBackground(Color.PINK);
      b2.setBackground(Color.PINK);
      b3.setBackground(Color.PINK);
      b4.setBackground(Color.PINK);   
     }

if (pos==1){
      b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
        b4.setBackground(new Color(240,240,240));
       x--;       
       b4=matris[x+1][y-1];
       b3=matris[x+1][y];
       b2=matris[x][y];
       b1=matris[x+1][y+1];
       b1.setBackground(Color.PINK);
       b2.setBackground(Color.PINK);
       b3.setBackground(Color.PINK);
       b4.setBackground(Color.PINK);
       
    
      }
if (pos==2){
      b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
        b4.setBackground(new Color(240,240,240));
       x--;       
       b4=matris[x+1][y-1];
       b3=matris[x][y];
       b2=matris[x+1][y];
       b1=matris[x+2][y];
       b1.setBackground(Color.PINK);
       b2.setBackground(Color.PINK);
       b3.setBackground(Color.PINK);
       b4.setBackground(Color.PINK);
       
    
      
          }
if (pos==3)
  {b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
        b4.setBackground(new Color(240,240,240));
       x--;       
       b4=matris[x+1][y-1];
       b3=matris[x+1][y];
       b2=matris[x+2][y];
       b1=matris[x+1][y+1];
       b1.setBackground(Color.PINK);
       b2.setBackground(Color.PINK);
       b3.setBackground(Color.PINK);
       b4.setBackground(Color.PINK);
       
    
      
    }

     }

public void gira(){
if (x+2>dimx-1||x<0) return ;

if (pos==0){
       b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
        
       b4=matris[x+1][y-1];
       b3=matris[x+1][y];
       b2=matris[x][y];
       b1=matris[x+1][y+1];
       b1.setBackground(Color.PINK);
       b2.setBackground(Color.PINK);
       b3.setBackground(Color.PINK);
       b4.setBackground(Color.PINK);
       
       pos=1;    
        }
else if (pos==1){   
       b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
        
       b4=matris[x+1][y-1];
       b3=matris[x][y];
       b2=matris[x+1][y];
       b1=matris[x+2][y];
       b1.setBackground(Color.PINK);
       b2.setBackground(Color.PINK);
       b3.setBackground(Color.PINK);
       b4.setBackground(Color.PINK);
       
       pos=2;    
       }
else if (pos==2)
      { b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
        
       b4=matris[x+1][y-1];
       b3=matris[x+1][y];
       b2=matris[x+2][y];
       b1=matris[x+1][y+1];
       b1.setBackground(Color.PINK);
       b2.setBackground(Color.PINK);
       b3.setBackground(Color.PINK);
       b4.setBackground(Color.PINK);
       
       pos=3;    
      
      }
else if (pos==3)
      {b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
       
       b1=matris[x][y-1]; 
       b2=matris[x+1][y-1];
       b3=matris[x+2][y-1];
       b4=matris[x+1][y];
     
      b1.setBackground(Color.PINK);
      b2.setBackground(Color.PINK);
      b3.setBackground(Color.PINK);
      b4.setBackground(Color.PINK);
     pos=0;   
     }

}

}
