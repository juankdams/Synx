import org.apache.log4j.Logger;

public final class Tw extends doA
{
  private static final aee bx = new bOO(new cnT());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public Tw()
  {
    aH();
  }

  public Tw agA()
  {
    Tw localTw;
    try {
      localTw = (Tw)bx.Mm();
      localTw.aOr = bx;
    } catch (Exception localException) {
      localTw = new Tw();
      localTw.aOr = null;
      localTw.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RemoveFromFightMap : " + localException.getMessage());
    }
    return localTw;
  }

  public void a(aVc paramaVc)
  {
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (agB()) {
      cVD();
      return;
    }

    this.ejP.LB().h((cdO)this.evp);
  }

  private boolean agB() {
    return (this.evp == null) || (this.ejP == null) || (this.ejP.LB() == null) || (!(this.evp instanceof cdO));
  }

  public void aK()
  {
    if (agB()) {
      return;
    }
    this.ejP.LB().g((cdO)this.evp);
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public void bc()
  {
    super.bc();
  }
}