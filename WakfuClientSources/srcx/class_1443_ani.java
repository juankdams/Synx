import java.awt.event.KeyEvent;

public class ani extends bzu
{
  private static bpt dqO = new aBZ(8);

  boolean dqP = true;
  private KeyEvent dqQ;

  public static void f(KeyEvent paramKeyEvent)
  {
    a((short)19990, paramKeyEvent);
  }

  public static void g(KeyEvent paramKeyEvent) {
    a((short)19991, paramKeyEvent);
  }

  private static void a(short paramShort, KeyEvent paramKeyEvent) {
    ani localani = a(paramShort, paramKeyEvent);
    if ((!bB) && (localani.getId() != paramShort)) throw new AssertionError();
    cjO.clE().j(localani);
  }

  private static ani a(int paramInt, KeyEvent paramKeyEvent) {
    ani localani = (ani)dqO.byL();
    localani.a(bpt.fJT);
    localani.d(paramInt);
    localani.aJ();
    localani.dqQ = paramKeyEvent;
    return localani;
  }

  public KeyEvent azT() {
    return this.dqQ;
  }

  public void release()
  {
    bc();
  }

  public void bc()
  {
    if ((!bB) && (this.dqP)) throw new AssertionError();
    super.bc();
    this.dqP = true;
  }

  public void aJ()
  {
    if ((!bB) && (!this.dqP)) throw new AssertionError();
    super.aJ();
    this.dqP = false;
  }
}