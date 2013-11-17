import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Ec extends MouseAdapter
{
  Ec(aJM paramaJM)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.getClickCount() == 2)
      aJM.a(this.bIH).alx();
  }
}