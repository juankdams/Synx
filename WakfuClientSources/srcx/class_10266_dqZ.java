import java.util.BitSet;
import org.apache.log4j.Logger;

public class dqZ extends tY
{
  private static final aee bx = new bOO(new cRo());

  public dqZ()
  {
  }

  public dqZ(dSc paramdSc)
  {
    super(paramdSc);
  }

  public dqZ(dSc paramdSc, boolean paramBoolean) {
    super(paramdSc, paramBoolean);
  }

  public dqZ Fl()
  {
    dqZ localdqZ;
    try {
      localdqZ = (dqZ)bx.Mm();
      localdqZ.aOr = bx;
    } catch (Exception localException) {
      localdqZ = new dqZ();
      localdqZ.aOr = null;
      K.error("Erreur lors d'un checkOut sur un CharacGain : " + localException.getMessage());
    }
    localdqZ.aOF = this.aOF;
    localdqZ.bgy = this.bgy;
    return localdqZ;
  }

  public void aH()
  {
    super.aH();
    if (this.aOF == null)
      return;
    if (this.aOF.ln() == 0) {
      eu localeu = (eu)this.aOF;
      if (localeu.ly()) {
        this.eWR.set(localeu.lu());
      }
      if (this.aOF == eu.azE)
        this.eWR.set(2140);
    }
  }

  protected void e(cqm paramcqm)
  {
    this.cxl = paramcqm.gv(this.cxl);
  }

  void Cy()
  {
    sx().a(this.aOF).gw(this.cxl);
  }
}