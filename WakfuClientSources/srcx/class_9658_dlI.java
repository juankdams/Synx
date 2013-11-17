import java.awt.event.KeyEvent;
import java.util.ArrayList;

class dlI
  implements apZ
{
  dlI(aeb paramaeb)
  {
  }

  public boolean d(KeyEvent paramKeyEvent)
  {
    return false;
  }

  public boolean c(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() != 27) {
      if ((aeb.b(this.ljh)) && (aeb.a(this.ljh).drt()))
        nv.selectChoice(null, (bVz)aeb.a(this.ljh).drq().get(0));
      else {
        aeb.c(this.ljh);
      }
    }
    return false;
  }

  public boolean b(KeyEvent paramKeyEvent) {
    return false;
  }
}