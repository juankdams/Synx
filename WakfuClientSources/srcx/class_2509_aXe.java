import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class aXe extends WindowAdapter
{
  aXe(dgd paramdgd)
  {
  }

  public void windowClosed(WindowEvent paramWindowEvent)
  {
    cNm.a(this.fcr.lbb, false);
  }
}