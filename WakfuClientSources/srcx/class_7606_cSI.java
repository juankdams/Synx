import org.apache.log4j.Logger;

public class cSI extends brP
{
  private static final Logger K = Logger.getLogger(cSI.class);

  public cSI(BX paramBX) {
    super(paramBX);
  }

  public boolean dx(int paramInt1, int paramInt2) {
    short s1 = BX.eh(paramInt1);
    short s2 = BX.ei(paramInt2);
    for (aXL localaXL : ((BX)this.fNP).g(s1, s2)) {
      j(new cbR(localaXL));
    }

    ey(paramInt1, paramInt2);
    ey(paramInt1 + 1, paramInt2);
    ey(paramInt1, paramInt2 + 1);
    ey(paramInt1 + 1, paramInt2 + 1);

    return !bzZ();
  }

  private void ey(int paramInt1, int paramInt2) {
    short s = ((BX)this.fNP).R(paramInt1, paramInt2);
    if (s != 0) {
      cDs localcDs = ars.dzL.aP(s);
      j(new bcQ(localcDs, paramInt1, paramInt2));
    }
  }
}