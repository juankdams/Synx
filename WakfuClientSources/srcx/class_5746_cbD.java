import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class cbD extends WindowAdapter
{
  cbD(alQ paramalQ)
  {
  }

  public void windowClosing(WindowEvent paramWindowEvent)
  {
    alQ.a(this.esr);
  }
}