import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

final class ann extends WindowAdapter
{
  private ann(cHK paramcHK)
  {
  }

  public void windowIconified(WindowEvent paramWindowEvent)
  {
    aHA.trace("windowIconified(e={})", new Object[] { paramWindowEvent });
  }

  public void windowDeiconified(WindowEvent paramWindowEvent)
  {
    aHA.trace("windowDeiconified(e={})", new Object[] { paramWindowEvent });
    cHK.c(this.dqX);
  }

  public void windowDeactivated(WindowEvent paramWindowEvent)
  {
    aHA.trace("windowDeactivated(e={})", new Object[] { paramWindowEvent });
    cHK.d(this.dqX);
  }

  public void windowActivated(WindowEvent paramWindowEvent)
  {
    aHA.trace("windowActivated(e={})", new Object[] { paramWindowEvent });
    cHK.c(this.dqX);
  }
}