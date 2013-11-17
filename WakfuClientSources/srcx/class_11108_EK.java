import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class EK
{
  private static EK bKz = new EK();

  private cSR bKA = new cSR();
  private ArrayList bKB = new ArrayList();

  public static EK NJ()
  {
    return bKz;
  }

  public KeyEvent[] NK()
  {
    return (KeyEvent[])this.bKA.d(new KeyEvent[this.bKA.size()]);
  }

  public boolean containsKey(int paramInt)
  {
    return this.bKA.containsKey(paramInt);
  }

  public boolean c(KeyEvent paramKeyEvent)
  {
    this.bKA.put(paramKeyEvent.getKeyCode(), paramKeyEvent);
    this.bKA.remove(paramKeyEvent.getKeyCode());
    boolean bool = false;
    for (bNL localbNL : this.bKB) {
      bool |= localbNL.c(paramKeyEvent);
    }
    return bool;
  }

  public boolean b(KeyEvent paramKeyEvent)
  {
    this.bKA.remove(paramKeyEvent.getKeyCode());
    boolean bool = false;
    for (bNL localbNL : this.bKB) {
      bool |= localbNL.b(paramKeyEvent);
    }
    return bool;
  }

  public void a(bNL parambNL) {
    if (!this.bKB.contains(parambNL))
      this.bKB.add(parambNL);
  }

  public void b(bNL parambNL)
  {
    if (this.bKB.contains(parambNL))
      this.bKB.remove(parambNL);
  }
}