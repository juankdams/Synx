import java.util.BitSet;
import org.apache.log4j.Logger;

public class aYO extends tY
{
  private static final aee bx = new bOO(new dpT());

  public aYO()
  {
  }

  public aYO(dSc paramdSc)
  {
    super(paramdSc);
  }

  public aYO(dSc paramdSc, boolean paramBoolean) {
    super(paramdSc, paramBoolean);
  }

  public aYO su()
  {
    aYO localaYO;
    try
    {
      localaYO = (aYO)bx.Mm();
      localaYO.aOr = bx;
    } catch (Exception localException) {
      localaYO = new aYO();
      localaYO.aOr = null;
      localaYO.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacLoss : " + localException.getMessage());
    }
    localaYO.aOF = this.aOF;
    localaYO.bgy = this.bgy;
    return localaYO;
  }

  public void aH()
  {
    super.aH();
    if (this.aOF == null)
      return;
    if (this.aOF.ln() == 0) {
      eu localeu = (eu)this.aOF;
      if (localeu.lz())
        this.eWR.set(localeu.lv());
      if (localeu == eu.azE)
        this.eWR.set(2140);
    }
  }

  boolean Cv()
  {
    if (super.Cv())
      return true;
    if ((this.aOF == eu.ayO) && (sx().c(cfY.hBe)))
      return true;
    return false;
  }

  void e(cqm paramcqm)
  {
    this.cxl = paramcqm.gw(this.cxl);
    if (this.cxl == 0)
      cVD();
  }

  public boolean Cu()
  {
    if (bkt()) {
      int i = st();
      if (i < 100) {
        int j = dpe.AX(100);
        if (i < j) {
          this.cxl = 0;
          return false;
        }
      }
    }

    return super.Cu();
  }

  protected int st()
  {
    int i;
    if ((this.eWL != null) && (((dpI)this.eWL).bep() >= 4))
      i = ((dpI)this.eWL).a(3, cVC(), dNF.mei);
    else {
      i = -1;
    }

    if (i < 0) {
      return 100;
    }

    if (!ays.q(this)) {
      return i;
    }

    int j = i + ays.r(this);
    return bCO.J(j, 0, 100);
  }

  void Cy()
  {
    sx().a(this.aOF).gv(this.cxl);
  }
}