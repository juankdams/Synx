public class dfC extends dte
{
  private final byte doI;
  private final int cxl;
  private final int aMQ;
  private final int aMR;
  private final int aMS;
  private final int kLV;
  private final int kLD;
  private final int gJV;

  public dfC(byte paramByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    this.doI = paramByte;
    this.cxl = paramInt1;
    this.aMQ = paramInt2;
    this.aMR = paramInt3;
    this.aMS = paramInt4;
    this.kLV = paramInt5;
    this.kLD = paramInt6;
    this.gJV = paramInt7;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    aIG localaIG = new aIG();
    localaIG.bf((short)75);
    localaIG.bM((byte)3);
    localaIG.bN(this.doI);

    cYq localcYq = new cYq(this.aMQ, this.aMR, this.aMS, this.kLV, this.kLD, this.gJV);

    switch (this.doI) {
    case 6:
      localaIG.mH(this.cxl);
      localaIG.dU(localcYq.rP());
      break;
    default:
      throw new UnsupportedOperationException("La commande " + this.doI + " n'est pas supportée");
    }

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}