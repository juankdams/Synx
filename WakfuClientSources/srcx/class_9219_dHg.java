import java.awt.Canvas;
import java.awt.Window;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

final class dHg extends ComponentAdapter
{
  private dHg(cHK paramcHK)
  {
  }

  public void componentResized(ComponentEvent paramComponentEvent)
  {
    aHA.trace("componentResized(e={})", new Object[] { paramComponentEvent });
    cHK.b(this.dqX).setSize(cHK.a(this.dqX).cot().getSize());
  }

  public void componentMoved(ComponentEvent paramComponentEvent)
  {
    aHA.trace("componentMoved(e={})", new Object[] { paramComponentEvent });
    cHK.b(this.dqX).setLocation(cHK.a(this.dqX).cot().getLocationOnScreen());
  }

  public void componentShown(ComponentEvent paramComponentEvent)
  {
    aHA.trace("componentShown(e={})", new Object[] { paramComponentEvent });
    cHK.c(this.dqX);
  }

  public void componentHidden(ComponentEvent paramComponentEvent)
  {
    aHA.trace("componentHidden(e={})", new Object[] { paramComponentEvent });
    cHK.d(this.dqX);
  }
}