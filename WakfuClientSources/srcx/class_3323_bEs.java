import java.awt.event.KeyEvent;

public final class bEs extends EE
{
  private static final bEs gzE = new bEs();

  public static bEs bMK() {
    return gzE;
  }

  public boolean a(ckW paramckW, KeyEvent paramKeyEvent)
  {
    if (paramckW.cmI() != null) {
      String str = paramckW.cmI();
      str = cOg.replace(str, "${keyCode}", Integer.toString(paramKeyEvent.getKeyCode()));
      str = cOg.replace(str, "${keyChar}", Character.toString(paramKeyEvent.getKeyChar()));

      if (paramckW.cmP() != null)
        str = str + paramckW.cmP();
      cth.cqP().J(str, false);
      return true;
    }
    if (paramckW.cmN() != null) {
      paramckW.cmN().run();
      return true;
    }
    return false;
  }
}