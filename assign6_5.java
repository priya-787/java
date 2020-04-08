// applet ass 6-5
import java.applet.Applet;
import java.awt.*;
public class assign6_5 extends Applet
{ 
  public void paint(Graphics g)
  {
    g.setColor(Color.white);
    g.drawRect(70,30,200,30);
     g.setColor(Color.orange);
    g.fillRect(70,30,200,30);
     g.setColor(Color.white);
    g.drawRect(70,60,200,30);
     g.setColor(Color.white);
    g.drawRect(70,90,200,30);
     g.setColor(Color.green);
    g.fillRect(70,90,200,30);
  }
}

/*<applet code="assign6_5.class" width="300" height="300">
</applet code>*/