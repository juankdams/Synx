import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class dmH extends WindowAdapter
{
  dmH(cRd paramcRd)
  {
  }

  public void windowIconified(WindowEvent paramWindowEvent)
  {
    if (cRd.b(this.lkG) != null)
      cRd.b(this.lkG).jD(true);
  }

  public void windowDeiconified(WindowEvent paramWindowEvent)
  {
    if (cRd.b(this.lkG) != null)
      cRd.b(this.lkG).jD(false);
  }

  public void windowClosed(WindowEvent paramWindowEvent)
  {
    if (cRd.b(this.lkG) != null) {
      cRd.b(this.lkG).awV();
    }
    System.exit(0);
  }

  public void windowDeactivated(WindowEvent paramWindowEvent) {
    if (cRd.b(this.lkG) != null)
      cRd.b(this.lkG).jE(false);
  }

  public void windowActivated(WindowEvent paramWindowEvent)
  {
    if (cRd.b(this.lkG) != null)
      cRd.b(this.lkG).jE(true);
  }
}