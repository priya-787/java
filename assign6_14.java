// applet program with fill arc
import java.applet.*;
import java.awt.*;
public class assign6_14 extends Applet
{
  public void paint(Graphics g)
  {
    g.drawArc(10,40,70,70,0,75);
    g.fillArc(100,40,70,70,0,75);
g.drawArc(10,100,70,80,0,175);
g.fillArc(100,100,70,90,0,270); 
g.drawArc(200,80,80,80,0,180); 


  }
}

/*<applet code="assign6_14.class" width="300" height="300">
</applet code>*/