public class amL extends dte
{
  private final byte doI;
  private final String dpu;
  private final int cxl;

  public amL(byte paramByte, String paramString)
  {
    this.doI = paramByte;
    this.dpu = paramString;
    this.cxl = -1;
  }

  public amL(byte paramByte, String paramString, int paramInt) {
    this.doI = paramByte;
    this.dpu = paramString;
    this.cxl = paramInt;
  }

  public amL(byte paramByte, int paramInt) {
    this.doI = paramByte;
    this.dpu = null;
    this.cxl = paramInt;
  }

  public amL(byte paramByte) {
    this.doI = paramByte;
    this.dpu = null;
    this.cxl = -1;
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

    switch (this.doI) {
    case 2:
      localaIG.gC(this.dpu);
      localaIG.mH(this.cxl);
      break;
    case 1:
      localaIG.gC(this.dpu);
      break;
    case 3:
      localaIG.mH(this.cxl);
      break;
    case 4:
      localaIG.mH(this.cxl);
      break;
    case 5:
      localaIG.mH(this.cxl);
      break;
    case 7:
      break;
    case 6:
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