import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;

class cjp extends MouseAdapter
{
  cjp(ib paramib)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    ib.a(this.aKH).show(paramMouseEvent.getComponent(), paramMouseEvent.getX(), paramMouseEvent.getY());
  }
}