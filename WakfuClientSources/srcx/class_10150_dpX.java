import org.apache.log4j.Logger;

public final class dpX extends doA
{
  private static final qM by = new dzQ(new ec[] { new dLx("Pas de param", new dmb[0]) });
  private boolean aHd;
  private static final aee aER = new bOO(new bnE());

  public static dpX cXo()
  {
    dpX localdpX;
    try
    {
      localdpX = (dpX)aER.Mm();
      localdpX.aHd = true;
    } catch (Exception localException) {
      localdpX = new dpX();
      K.error("Erreur lors d'un checkOut sur un objet de type MakeFlee : " + localException.getMessage());
    }
    return localdpX;
  }

  public void release() {
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

  public void aJ()
  {
  }

  public void bc() {
  }

  public qM aF() {
    return by;
  }

  public aVc aO() {
    dpX localdpX;
    try {
      localdpX = (dpX)aER.Mm();
      localdpX.aOr = aER;
    } catch (Exception localException) {
      K.error("Erreur lors d'un checkOut sur un RE:Raise : " + localException.getMessage());
      localdpX = new dpX();
      localdpX.eXg = false;
      localdpX.aOr = null;
    }
    return localdpX;
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    if (this.evp == null)
      return;
    b(paramaVc, paramBoolean);
    if ((this.evp instanceof dhJ))
      ((dhJ)this.evp).cRo();
  }

  public boolean aL() {
    return false;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }

  public void a(aVc paramaVc)
  {
  }
}