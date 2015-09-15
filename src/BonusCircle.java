import TurtleGraphics.*;
public class BonusCircle {

    
    public static void main(String[] args) {
        SketchPadWindow s = new SketchPadWindow(600,600);
        StandardPen p = new StandardPen(s);
        int c;
        c=3;
        for(int i = 1; i<=100; i++)
        {
            p.up();
            p.move(c);
            p.down(); 
            p.move(c);
            p.turn(3.6);
        }
    }
    }
    

