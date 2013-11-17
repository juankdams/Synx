import org.apache.log4j.Logger;

public final class Au extends ad
{
  private boolean aHd;
  private static final aee aER = new bOO(new aTH());

  public static Au Jx()
  {
    Au localAu;
    try
    {
      localAu = (Au)aER.Mm();
      localAu.aHd = true;
    } catch (Exception localException) {
      localAu = new Au();
      K.error("Erreur lors d'un checkOut sur un objet de type StateDecurseForHyperaction : " + localException.getMessage());
    }
    return localAu;
  }

  public void release()
  {
    if (this.aHd)
      try {
        aER.y(this);
        this.aHd = false;
      } catch (Exception localException) {
        K.error("Exception lors du retour au pool", localException);
      }
    else
      bc();
  }

  public Au Jy()
  {
    Au localAu;
    try
    {
      localAu = (Au)aER.Mm();
      localAu.aOr = aER;
    } catch (Exception localException) {
      localAu = new Au();
      localAu.aOr = null;
      localAu.eXg = false;
      K.error("Erreur lors d'un checkOut sur un StateDecurse : " + localException.getMessage());
    }
    return localAu;
  }

  public void a(aVc paramaVc)
  {
    super.a(paramaVc);

    if (this.evp == null) {
      return;
    }
    this.bz *= this.evp.e(eu.ayN);
  }
}