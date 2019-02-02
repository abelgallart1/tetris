/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author abel
 */
public class I extends Figura{
JButton b1;
JButton b2;
JButton b3;
JButton b4;
int x,y;
boolean horizontal;

public I(JButton[][] matris){
 super(matris);
 horizontal=false;
 detenida=false;
 b1=matris[dimx/2][0]; 
 b2=matris[dimx/2][1];
 b3=matris[dimx/2][2];
 b4=matris[dimx/2][3];
 b1.setBackground(Color.red);
 b2.setBackground(Color.red);
 b3.setBackground(Color.red);
 b4.setBackground(Color.red);
x=dimx/2;y=3;
}

public void baja(){

if (detenida) return;

if (y>=dimy-1) {detenida=true;return ;}

if (!horizontal&&!matris[x][y+1].getBackground().equals(new Color(240,240,240))) {detenida=true;return;}
if (horizontal&&
        
           (!matris[x+1][y+1].getBackground().equals(new Color(240,240,240))||
           !matris[x][y+1].getBackground().equals(new Color(240,240,240))||
           ((x-1>0)&&!matris[x-1][y+1].getBackground().equals(new Color(240,240,240)))||
           ((x-2>0)&&!matris[x-2][y+1].getBackground().equals(new Color(240,240,240))))) {detenida=true;return;}          
if (horizontal) {
      
       b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
       y++;
       b1=matris[x+1][y];
       b2=matris[x][y];
       b3=matris[x-1][y];
       b4=matris[x-2][y];
       
       b1.setBackground(Color.red);
       b2.setBackground(Color.red);
       b3.setBackground(Color.red);
       b4.setBackground(Color.red);
       
        }
else { b1.setBackground(new Color(240,240,240));
       b1=b2;
       b2=b3;
       b3=b4;
       b4=matris[x][++y];
       b4.setBackground(Color.red);
    }
}

public void der(){
if (detenida) return;     
if (x>=dimx-1) return ;
 if (!horizontal&&
         !matris[x+1][y].getBackground().equals(new Color(240,240,240))||
           !matris[x+1][y-1].getBackground().equals(new Color(240,240,240))||
           !matris[x+1][y-2].getBackground().equals(new Color(240,240,240))||
           !matris[x+1][y-3].getBackground().equals(new Color(240,240,240))
          ) return;
 else if (horizontal&&
          (x+1>=dimx-1)) return;
if (horizontal) {
         b1.setBackground(new Color(240,240,240));
         b1=b2;
         b2=b3;
         b3=b4;
         b4=matris[++x][y];
         b4.setBackground(Color.red);
                
}

else { b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
      
       
       x++;
      
       b4=matris[x][y];
       b3=matris[x][y-1];
       b2=matris[x][y-2];
       b1=matris[x][y-3];
       b1.setBackground(Color.red);
       b2.setBackground(Color.red);
       b3.setBackground(Color.red);
       b4.setBackground(Color.red);
    
}





}
public void izq(){
if (detenida) return; 
if (x-1<0) return;
if (!horizontal&&
         
           !matris[x-1][y].getBackground().equals(new Color(240,240,240))||
           !matris[x-1][y-1].getBackground().equals(new Color(240,240,240))||
           !matris[x-1][y-2].getBackground().equals(new Color(240,240,240))||
           !matris[x-1][y-3].getBackground().equals(new Color(240,240,240))
          ) return;
else if (horizontal&&
        (x-1<=1)
        ) return;      
if (horizontal) {
         b4.setBackground(new Color(240,240,240));
         b4=b3;
         b3=b2;
         b2=b1;
         x--;
         b1=matris[x][y];
         b1.setBackground(Color.red);
                }
else { b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
       
       
       
       
       x--;   
       b4=matris[x][y];
       b3=matris[x][y-1];
       b2=matris[x][y-2];
       b1=matris[x][y-3];
       b1.setBackground(Color.red);
       b2.setBackground(Color.red);
       b3.setBackground(Color.red);
       b4.setBackground(Color.red);
    

}

}

public void gira(){
if (x+1>dimx-1||x-2<0) return ;

if (!horizontal&&!matris[x-1][y].getBackground().equals(new Color(240,240,240))||
           !matris[x-1][y-1].getBackground().equals(new Color(240,240,240))||
           !matris[x-1][y-2].getBackground().equals(new Color(240,240,240))||
           !matris[x-1][y-3].getBackground().equals(new Color(240,240,240))
          ) return;
else if (horizontal&&
        (x-1<=1)
        ) return;     
if (horizontal){
       b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
        
       b4=matris[x][y];
       b3=matris[x][y-1];
       b2=matris[x][y-2];
       b1=matris[x][y-3];
       b1.setBackground(Color.red);
       b2.setBackground(Color.red);
       b3.setBackground(Color.red);
       b4.setBackground(Color.red);
    
        }
else  {b1.setBackground(new Color(240,240,240));
       b2.setBackground(new Color(240,240,240));
       b3.setBackground(new Color(240,240,240));
       b4.setBackground(new Color(240,240,240));
       
      b1=matris[x-2][y];
      b2=matris[x-1][y];
      b3=matris[x][y];
      b4=matris[x+1][y];
       
      b1.setBackground(Color.red);
      b2.setBackground(Color.red);
      b3.setBackground(Color.red);
      b4.setBackground(Color.red);
    
     }

horizontal=!horizontal;
}


}
