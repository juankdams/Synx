import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class djJ extends MouseMotionAdapter
{
  djJ(aNd paramaNd)
  {
  }

  public void mouseMoved(MouseEvent paramMouseEvent)
  {
    aNd.c(this.lgP, paramMouseEvent);
  }
}