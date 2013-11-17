import org.apache.log4j.Logger;

public class wc extends dqZ
{
  private static final aee bx = new bOO(new bcu());

  private static final qM by = new dzQ(new ec[0]);

  public qM aF()
  {
    return by;
  }

  private wc()
  {
  }

  public wc(dSc paramdSc) {
    this.aOF = paramdSc;
    this.bgy = false;
    aH();
  }

  public wc Fk()
  {
    wc localwc;
    try {
      localwc = (wc)bx.Mm();
      localwc.aOr = bx;
    } catch (Exception localException) {
      localwc = new wc();
      localwc.aOr = null;
      localwc.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SetCharacToMax : " + localException.getMessage());
    }
    localwc.aOF = this.aOF;
    localwc.bgy = false;
    return localwc;
  }

  public void a(aVc paramaVc)
  {
    dle localdle = sx();

    if (!localdle.b(this.aOF)) {
      this.cxl = 0;
      return;
    }

    cqm localcqm = localdle.a(this.aOF);
    this.cxl = (localcqm.max() - localcqm.value());
  }
}