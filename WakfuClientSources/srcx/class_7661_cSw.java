import org.apache.log4j.Logger;

public class cSw extends doA
{
  private static final aee bx = new bOO(new bbm());

  private static final qM by = new dzQ(new ec[] { new dLx("modifie la valeur courante de l'effet déclencheur", new dmb[] { new dmb("0:HP %/1:HP... (RunningEffectUpdateType)", dnN.lnS), new dmb("Valeur", dnN.lnR), new dmb("incremental(0) or set(1)", dnN.lnS) }) });

  private int kEO = -1;
  private boolean kEP = false;

  public qM aF()
  {
    return by;
  }

  public cSw cIg()
  {
    cSw localcSw;
    try
    {
      localcSw = (cSw)bx.Mm();
      localcSw.aOr = bx;
    } catch (Exception localException) {
      localcSw = new cSw();
      localcSw.eXg = false;
      localcSw.aOr = null;
      K.error("Erreur lors d'un checkOut sur un UpdateValue : " + localException.getMessage());
    }
    return localcSw;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((paramaVc != null) && 
      (this.kEO >= 0)) {
      paramaVc.b(this.kEO, this.cxl, this.kEP);
    }

    jJ(true);
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL != null) {
      short s = cVC();
      this.kEO = ((dpI)this.eWL).a(0, s, dNF.meh);
      this.cxl = ((dpI)this.eWL).a(1, s, dNF.meh);
      this.kEP = (((dpI)this.eWL).a(2, s, dNF.meh) != 0);
    }
  }

  public void aK()
  {
    super.aK();
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
}