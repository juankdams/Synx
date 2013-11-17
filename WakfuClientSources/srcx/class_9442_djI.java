import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class djI extends MouseAdapter
{
  djI(aNd paramaNd)
  {
  }

  public void mouseEntered(MouseEvent paramMouseEvent)
  {
    aNd.a(this.lgP, paramMouseEvent);
  }

  public void mouseExited(MouseEvent paramMouseEvent)
  {
    aNd.b(this.lgP, paramMouseEvent);
  }
}