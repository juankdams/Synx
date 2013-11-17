import org.apache.log4j.Logger;

public class bOJ
{
  private static final Logger K = Logger.getLogger(bOJ.class);
  public static final int gTR = 0;

  public static int a(cew paramcew, cWV paramcWV)
  {
    paramcWV.g(paramcew);
    return paramcWV.u(paramcew);
  }

  public static int b(cew paramcew, cWV paramcWV) {
    paramcWV.f(paramcew);
    return paramcWV.t(paramcew);
  }

  public static void a(cew paramcew, int paramInt1, int paramInt2) {
    if (paramInt2 == paramInt1) {
      return;
    }

    if (paramInt2 != -1) {
      paramcew.cg((short)azO.dRM.hV);
      paramcew.a(paramInt2, (short)azO.dRM.hV, paramInt2 != 2192145);
    }
  }

  public static int c(cew paramcew, cWV paramcWV) {
    cWV localcWV = paramcew.cgZ();
    int i = localcWV.t(paramcew);

    if (i == 0) {
      localcWV.f(paramcew);
      paramcew.b(paramcWV);
      paramcWV.g(paramcew);
    } else {
      paramcew.a(new dTo(paramcew, paramcWV));

      localcWV.f(paramcew);
    }

    return i + paramcWV.u(paramcew);
  }

  public static void b(int paramInt1, int paramInt2, int paramInt3, Su paramSu) {
    bgY localbgY = new bgY(paramSu);
    a(paramInt1, paramInt2, paramInt3, paramSu.getId(), localbgY);
  }

  public static void a(int paramInt1, int paramInt2, int paramInt3, Su paramSu, ge paramge, int paramInt4) {
    ccj localccj = new ccj(paramge, paramInt4);
    a(paramInt1, paramInt2, paramInt3, paramSu.getId(), localccj);
  }

  private static void a(int paramInt1, int paramInt2, int paramInt3, long paramLong, cWV paramcWV) {
    dNL localdNL = new dNL(paramInt1, dPD.mhA.bJ(), paramInt2, paramInt3, paramLong, paramcWV);
    bnc.bxw().a(paramInt3, localdNL);
  }

  public static void aE(Su paramSu)
  {
    Object localObject1;
    if ((paramSu instanceof bKm)) {
      localObject2 = paramSu.aeu();

      int i = localObject2 != null ? ((PX)localObject2).ap(azO.dRM.hV) : 0;
      if (i <= 0) {
        i = 2145;
      }

      bBn localbBn = Hh.QM().dh(i);
      ge localge = localbBn.bKn();
      int j = ccj.k(localge);
      if (j == 237) {
        localObject1 = new bgY(paramSu);
      } else {
        int k = localbBn.oc();
        localObject1 = new ccj(localge, k);
        a(paramSu.aeL(), -1, k);
      }
    } else {
      localObject1 = new bgY(paramSu);
    }

    Object localObject2 = paramSu.aeL();
    ((cew)localObject2).b((cWV)localObject1);
  }

  public static int aF(Su paramSu) {
    aE(paramSu);
    cew localcew = paramSu.aeL();
    if (localcew.aty() == null) {
      localcew.cgZ().g(localcew);
      return 0;
    }
    int i;
    if (localcew.aty().gI()) {
      cWV localcWV = localcew.cgZ();
      i = localcWV.u(localcew);
      localcWV.g(localcew);
    } else {
      localcew.c(new dTq(localcew));

      i = 0;
    }
    return i;
  }
}