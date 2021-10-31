package Turtle;


import turtlePck.TurtleGraphicsWindow;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZTILabPI
 */
public class TurtleAlgorithms extends TurtleGraphicsWindow{
    
    public void positioningTurtle(int angle){
        right(angle);
    }

     
    public void sierpinski(int bok, int minBok ){
         if (bok<minBok) {
            return;
        }
          for(int i=1;i<4;i++){
              sierpinski(bok/2, minBok);
              forward(bok);
              right(120);
          }
      }

    
  
public void snowFlake(int n, int bok){
    if (n==0){
        forward(bok);
        return;
    }
    snowFlake(n-1, bok/3);
    right(60);
    snowFlake(n-1, bok/3);
    left(120);
    snowFlake(n-1, bok/3);
    right(60);
    snowFlake(n-1, bok/3);

}


public void callSnowFlake(int n, int bok){
    for(int i=1; i<4; i++){
      snowFlake(n, bok);
      left(120);
    }
}

public void A1(int n, int min){
    if(n>min){
        for(int i=0; i<4;i++){
            forward(n);
            A1(n/2, min);
            right(90);
        }
    }
}

public void A2(int n, int min){
    if(n>min){
        for(int i=0; i<3;i++){
            forward(n);
            A2(n/2, min);
            right(120);
        }
    }
}

public void A3(int n, int min){
    if(n>min){
        for(int i=0; i<4;i++){
            forward(n);
            right(90);
            A3(n/2, min);
            left(180);
        }
    }
}

public void A4(int n, int min){
    if(n>min){
        for(int i=0; i<3;i++){
            forward(n);
            right(60);
            A4(n/2, min);
            right(180);
            
        }
    }
}

public void A5(int n, int min){
    if(n>min){
        right(60);
        for(int i=0; i<3;i++){
            forward(n);
            A5(n/2, min);
            right(120);
        }
        left(60);
    }
}
public void A6(int n, int min){
    if(n>min){
        for(int i=0; i<4;i++){
            forward(n/4);
            left(90);
            A6(n/2, min);
            right(90);
            forward((3*n)/4);
            right(90);
        }
    }
}
public void A7(int n, int min){
    if(n>min){
        right(60);
        for(int i=0; i<3;i++){
            forward(n/4);
            left(120);
            A7(n/2, min);
            right(120);
            forward((3*n)/4);
            right(120);
        }
        left(60);
    }
}
public void A8(int n, int min){
    if(n>min){
        left(60);
        for(int i=0; i<6;i++){
            forward(n/4);
            left(60);
            A8(n/2, min);
            right(60);
            forward((3*n)/4);
            right(60);
        }
        right(60);
    }
}
public void A9(int n, int max){
    if(n<max){
       forward(n);
       right(90);
       A9(n+10, max);
    }
}

public void A10(int n, int max){
    if(n<max){
       forward(n);
       right(120);
       A10(n+10, max);
    }
}
public void A11(int n, int max){
    if(n<max){
       forward(n);
       right(60);
       A11(n+10, max);
    }
}
public void A12(int n, int min){
    if(n>min){
        for(int i=0; i<3;i++){
            forward((n)/3);
            left(120);
            A12(n/3, min);
            right(120);
            forward(n/3);
            left(120);
            A12(n/3, min);
            right(120);
            forward(n/3);
            left(120);
        }
    }
}

public void A13(int n, int min){
    if(n>min){
        left(45);
        forward(n);
        A13(n/2, min);
        left(180);
        forward(n);
        left(90);
        forward(n);
        A13(n/2, min);
        left(180);
        forward(n);
        left(225);
    }
}

public void B1(int n, int min){
    if(n>min){
        for(int i=0; i<2;i++){
            B1(n/2, min);
            forward(n);
            left(90);
            forward(n);
            left(90);
        }
    }
}
public void B2(int n, int min){
    if(n>min){
        left(60);
        for(int i=0; i<3;i++){
            forward(n/4);
            left(60);
            B2(n/2, min);
            right(60);
            forward((3*n)/4);
            right(60);
            forward(n);
            right(60);
        }
        right(60);
    }
}

public void B3(int n, int min){
    if(n>min){
        for(int i=0; i<2;i++){
            forward(n);
            left(90);
            forward(n/4);
            right(90);
            B3(n/2, min);
            left(90);
            forward((3*n)/4);
            left(90);
        }
    }
}
public void B4(int n, int min){
    if(n>min){
        for(int i=0; i<2;i++){
            forward(n);
            right(90);
            B4(n/2, min);
            left(180);
            forward(n);
            left(90);
        }
    }
}
public void B5(int n, int min){
    if(n>min){
        for(int i=0; i<4;i++){
            B5(n/3, min);
            left(90);
            forward(n);
        }
    }
}

public void B6(int n, int min){
    if(n>min){
        for(int i=0; i<3;i++){
            B6(n/3, min);
            forward(n);
            left(120);
        }
    }
}
public void B7(int n, int min){
    if(n>min){
        for(int i=0; i<6;i++){
            B7(n/2, min);
            forward(n);
            left(60);
            forward(n);
            left(60);
        }
    }
}
public void B8(int n, int min){
    if(n>min){
        forward(n);
        B8(n/2, min);
        left(180);
        forward(n);
        left(225);
        forward(n);
        B8(n/2, min);
        left(180);
        forward(n);
        left(90);
        forward(n);
        B8(n/2, min);
        left(180);
        forward(n);
        left(225);
    }
}
public void C1(int n, int max){
    if(n<max){
       forward(n);
       right(125);
       C1(n+3, max);
    }
}
public void C2(int n, int max){
    if(n<max){
       forward(n);
       right(144);
       C2(n+10, max);
    }
}
public void C3(int n, int max){
    if(n<max){
       forward(n);
       right(100);
       C3(n+5, max);
    }
}
public int C4(int length, int n) {
if (n <= 1) {
return C4Basic(length);
}


int lengthToPass = 3 * length/4;

forward(length);
left(45);
int l = C4(lengthToPass, n-1);
C4(lengthToPass, n-1);
right(45);
forward(length);
right(90);
forward((int)(Math.sqrt(2) * l));
back((int)(Math.sqrt(2) * l));
right(180);

return (int)(Math.sqrt(2) * l);
}

public int C4Basic(int length){
forward(length);
right(45);
forward(3 * length/4);
right(90);
forward(3 * length/4);
right(45);
forward(length);
right(90);
forward((int)(Math.sqrt(2) * (3 * length/4)));

back((int)(Math.sqrt(2) * (3 * length/4)));
right(180);

return((int)(Math.sqrt(2) * (3 * length/4)));
}
public void C5(int n, int min){
    if(n>min){
        for(int i=0; i<4;i++){
            forward((n)/3);
            left(90);
            C5(n/3, min);
            right(90);
            forward(n/3);
            left(90);
            C5(n/3, min);
            right(90);
            forward(n/3);
            left(90);
        }
    }
}
public void C6(int n, int min){
    if(n>min){
      forward(n);
      C6(n/2, min);
      back(n/2);
      C6(n/4, min);
      back(n/2);
      left(120);
      forward(n);
      C6(n/2, min);
      back(n/2);
      C6(n/4, min);
      back(n/2);
      left(120);
      forward(n);
      C6(n/2, min);
      back(n/2);
      C6(n/4, min);
      back(n/2);
      left(120);
    }
}

public void C7(int n, int min) {
if (n > min){
for (int i = 0; i < 4; i++) {
C7(n/3, min);
forward(2*n/3);
C7(n/3, min);
back(2*n/3);

right(90);
}
}
}
}
