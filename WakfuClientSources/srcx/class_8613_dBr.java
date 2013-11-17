import org.apache.log4j.Logger;

public class dBr extends doA
{
  private static final aee bx = new bOO(new bms());

  private static final qM by = new dzQ(new ec[] { new dLx("Param standard (le level de l'aura = level du sort)", new dmb[] { new dmb("id de l'aura", dnN.lnQ) }) });
  private cjK lJa;
  private long aDR;
  public cCH gJe = new bmq(this, 8);

  public qM aF()
  {
    return by;
  }

  public dBr deH()
  {
    dBr localdBr;
    try
    {
      localdBr = (dBr)bx.Mm();
      localdBr.aOr = bx;
    } catch (Exception localException) {
      localdBr = new dBr();
      localdBr.aOr = null;
      localdBr.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ArenaRunningEffect : " + localException.getMessage());
    }
    localdBr.aDR = this.aDR;
    localdBr.lJa = this.lJa;
    return localdBr;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    fk localfk = bMF.bUo().fj(this.cxl);
    if ((localfk != null) && (this.evp != null) && (this.eUw != null)) {
      short s = cVC();

      this.lJa = localfk.a(new agg(this.aDR, this.eUw.getX(), this.eUw.getY(), this.eUw.IB(), this.ejP, this.evp, s, this.evp.E()));

      b(paramaVc, paramBoolean);
      if (this.ejP.LC() != null)
        this.ejP.LC().g(this.lJa);
    } else {
      jJ(true);
    }
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if (this.eWL != null) {
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
    }
    this.aDR = this.ejP.LD().P((byte)2);
  }

  public void aK()
  {
    if (this.lJa != null)
      this.ejP.LC().h(this.lJa);
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
    return true;
  }

  public cCH lJ()
  {
    return this.gJe;
  }
}