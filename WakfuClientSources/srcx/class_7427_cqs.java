import org.apache.log4j.Logger;

public class cqs extends brP
{
  private static final Logger K = Logger.getLogger(cqs.class);
  private final aLI iaa;

  public cqs(BX paramBX, aLI paramaLI)
  {
    super(paramBX);
    this.iaa = paramaLI;
  }

  public boolean d(short paramShort, int paramInt1, int paramInt2) {
    if (!((BX)this.fNP).Q(paramInt1, paramInt2)) {
      e(paramShort, paramInt1, paramInt2);
      return false;
    }

    BX localBX = ((BX)this.fNP).KZ();
    localBX.j(paramInt1, paramInt2, paramShort);

    if (!a(localBX, paramInt1, paramInt2)) {
      e(paramShort, paramInt1, paramInt2);
      return false;
    }

    b(localBX, paramInt1, paramInt2);
    return bzZ();
  }

  private void e(short paramShort, int paramInt1, int paramInt2) {
    cDs localcDs = ars.dzL.aP(paramShort);
    j(new bcQ(localcDs, paramInt1, paramInt2));
  }

  private boolean a(BX paramBX, int paramInt1, int paramInt2) {
    return (bnp.bS(paramBX.R(paramInt1 - 1, paramInt2))) || (bnp.bS(paramBX.R(paramInt1 + 1, paramInt2))) || (bnp.bS(paramBX.R(paramInt1, paramInt2 - 1))) || (bnp.bS(paramBX.R(paramInt1, paramInt2 + 1)));
  }

  private void b(BX paramBX, int paramInt1, int paramInt2)
  {
    int i = BX.eh(paramInt1);
    int j = BX.ei(paramInt2);
    for (aXL localaXL : paramBX.g((short)i, (short)j))
      if (!a(paramBX, localaXL))
        j(new cbR(localaXL));
  }

  public boolean a(BX paramBX, aXL paramaXL)
  {
    dQx localdQx = paramaXL.bmX();

    int i = localdQx.hqu;
    int j = localdQx.hqw;
    int k = localdQx.hqv;
    int m = localdQx.hqx;

    for (int n = j; n < m; n++) {
      for (int i1 = i; i1 < k; i1++) {
        if (c(paramBX, i1, n)) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean c(BX paramBX, int paramInt1, int paramInt2) {
    return a(this.iaa, paramBX, paramInt1, paramInt2);
  }

  static boolean a(aLI paramaLI, BX paramBX, int paramInt1, int paramInt2) {
    int i = bnp.qo(paramInt1);
    int j = bnp.qp(paramInt2);
    int k = paramBX.R(i, j);
    bnp localbnp = paramaLI.ee(k);

    int m = i * 9;
    int n = j * 9;
    int i1 = paramInt1 - m;
    int i2 = paramInt2 - n;
    return (localbnp == null) || (localbnp.ay(i1, i2)) || (localbnp.ct(i1, i2) != 0);
  }
}