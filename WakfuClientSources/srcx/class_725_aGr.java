import com.sun.opengl.util.FPSAnimator;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class aGr extends WindowAdapter
{
  aGr(cLb paramcLb, FPSAnimator paramFPSAnimator)
  {
  }

  public void windowClosing(WindowEvent paramWindowEvent)
  {
    new Thread(new ZO(this)).start();
  }
}