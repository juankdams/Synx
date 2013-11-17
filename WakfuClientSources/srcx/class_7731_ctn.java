import org.apache.log4j.Logger;

public class ctn extends doA
{
  private static final aee bx = new bOO(new k());

  private static final qM by = new dzQ(new ec[] { new dLx("boost le skill donné avec le sort lié", new dmb[] { new dmb("id de la skill", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public ctn cqY()
  {
    ctn localctn;
    try
    {
      localctn = (ctn)bx.Mm();
      localctn.aOr = bx;
    } catch (Exception localException) {
      localctn = new ctn();
      localctn.aOr = null;
      K.error("Erreur lors d'un checkOut sur un BoostSkillWithSpell : " + localException.getMessage());
    }
    return localctn;
  }

  public void aH()
  {
    super.aH();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp != null) && (this.evp.aLY() == 20) && (wa() != null) && ((((bqk)wa()).nS() == 11) || (((bqk)wa()).nS() == 25)))
    {
      cyv localcyv = (cyv)((dhJ)this.evp).bGn().hh(this.cxl);
      if (localcyv != null)
        localcyv.a((bfE)wa());
    }
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if (this.eWL != null)
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
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

  public void aK()
  {
    if ((this.evp != null) && (this.evp.aLY() == 20) && (wa() != null) && ((((bqk)wa()).nS() == 11) || (((bqk)wa()).nS() == 25)))
    {
      cvq localcvq = ((dhJ)this.evp).bGn();
      if (localcvq != null) {
        cyv localcyv = (cyv)localcvq.hh(this.cxl);
        if (localcyv != null) {
          localcyv.a(null);
        }
      }
    }
    super.aK();
  }
}