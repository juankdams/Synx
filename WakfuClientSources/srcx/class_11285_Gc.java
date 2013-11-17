import org.apache.log4j.Logger;

public class Gc
  implements bye
{
  protected static final Logger K = Logger.getLogger(Gc.class);
  protected static final boolean aRN = false;
  protected Su Rl;
  protected int aRQ;
  protected int bOr;
  protected int bOs;

  public Gc(Su paramSu, int paramInt1, int paramInt2, int paramInt3)
  {
    this.Rl = paramSu;
    this.aRQ = paramInt1;
    this.bOr = paramInt2;
    this.bOs = paramInt3;
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    cYk localcYk = this.Rl.aKb();
    int i = this.bOr - localcYk.getX();
    int j = this.bOs - localcYk.getY();
    if ((i != 0) || (j != 0)) {
      paramdMM.c(La.m(i, j));
    }

    if (this.aRQ < 0) {
      paramdMM.eq("AnimStatique");
    }
    else {
      aCH localaCH = clR.cni().vL(this.aRQ);
      if (localaCH != null)
      {
        azX localazX = acL.apd().aP(this.bOr, this.bOs);
        this.Rl.b(localazX);
        dgM.a(paramdMM, localaCH);
      }

    }

    paramdMM.c(this);
  }
}