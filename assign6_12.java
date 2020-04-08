// applet program with fill rectangle
import java.applet.*;
import java.awt.*;
public class assign6_12 extends Applet
{
  public void paint(Graphics g)
  {
    g.drawRect(10,10,60,50);
    g.fillRect(100,10,60,50);
g.drawRoundRect(190,10,60,50,15,15);
g.fillRoundRect(70,90,140,100,30,40); 


  }
}

/*<applet code="assign6_12.class" width="300" height="300">
</applet code>*/