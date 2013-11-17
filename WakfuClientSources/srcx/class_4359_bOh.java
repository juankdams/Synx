import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bOh
{
  private static final Logger K;
  private static cSi gTi;
  private static cSi gTj;
  private static cSi gTk;
  private static int gTl;
  private static int gTm;
  private static int gTn;
  private static short az;
  private static boolean gTo;
  private static final cPV gTp;
  private static final btb gTq;
  private static final bMp gTr;
  private static final ArrayList gTs;
  private static ccc gTt = cDD.czz();

  public static void a(cXf paramcXf, int paramInt1, int paramInt2, short paramShort)
  {
    aWe localaWe = paramcXf.cKV();
    bSl localbSl = localaWe.xZ();

    N(paramInt1, paramInt2, 2);

    localbSl.k(paramInt1, paramInt2, paramShort);
    localaWe.xT();
    paramcXf.cLb();
    gTq.a(localaWe.csU());
  }

  public static void N(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((!bB) && (az == -32768)) throw new AssertionError("Il faut d'abord appeler setWorldId");

    int i = asc.jT(paramInt1);
    int j = asc.jU(paramInt2);
    int k = paramInt3 * 2 + 1;

    if ((i == gTl) && (j == gTm) && (gTn >= k)) {
      return;
    }
    gTl = i;
    gTm = j;
    gTn = k;

    i -= paramInt3;
    j -= paramInt3;

    cSi localcSi = gTi;
    gTi = gTk;
    gTj = localcSi;
    gTj.clear();
    int n;
    short s1;
    short s2;
    for (int m = 0; m < k; m++) {
      for (n = 0; n < k; n++) {
        s1 = (short)(i + m);
        s2 = (short)(j + n);
        int i1 = bCO.G(s1, s2);

        if (gTt.Q(s1, s2))
        {
          gTj.add(i1);
          if (!gTi.contains(i1))
          {
            gTt.P(s1, s2);
          }
        }
      }
    }

    for (m = 0; m < gTi.size(); m++) {
      n = gTi.wm(m);
      if (!gTj.contains(n))
      {
        s1 = bCO.sg(n);
        s2 = bCO.sh(n);
        M(s1, s2);
      }
    }

    localcSi = gTk;
    gTk = gTj;
    gTj = localcSi;
  }

  private static void M(short paramShort1, short paramShort2) {
    gTp.T(paramShort1, paramShort2);
    gTr.K(paramShort1, paramShort2);
    cwO.S(paramShort1, paramShort2);
  }

  public static void N(short paramShort1, short paramShort2) {
    int i = bCO.G(paramShort1, paramShort2);
    Cu.b(gTk, i);
    M(paramShort1, paramShort2);
    gTl = -2147483648;
    gTm = -2147483648;
    gTn = -2147483648;
  }

  public static void h(short paramShort) {
    a(paramShort, cDD.czz());
  }

  public static void a(short paramShort, ccc paramccc) {
    if (az == paramShort) {
      return;
    }

    clear();
    gTt = paramccc;
    paramccc.a(gTp, gTq, gTr);

    az = paramShort;
    int i = 0; for (int j = gTs.size(); i < j; i++) {
      ((Runnable)gTs.get(i)).run();
    }
    gTs.clear();

    gTt.cX(paramShort);

    cwO.sH(paramShort);
    gTp.sH(paramShort);
    gTq.qL(paramShort);
    gTr.sH(paramShort);

    if (gTo)
      gTt.cY(paramShort);
  }

  public static short D()
  {
    return az;
  }

  public static void clear() {
    gTl = -2147483648;
    gTm = -2147483648;
    gTn = -2147483648;
    az = -32768;
    gTi.clear();
    gTj.clear();
    gTk.clear();
    gTp.cHa();
    gTp.reset();
    gTr.clean();

    cwO.reset();
    gTp.reset();
    gTr.clean();
    gTq.clear();

    gTt.clear();
  }

  public static dDL cN(short paramShort) {
    return cDD.czz().xx(paramShort);
  }

  public static void ao(String paramString1, String paramString2) {
    cDD.czz().ao(paramString1, paramString2);
  }

  public static boolean O(short paramShort1, short paramShort2) {
    return gTt.Q(paramShort1, paramShort2);
  }

  static
  {
    K = Logger.getLogger(bOh.class);

    gTi = new cSi(25);
    gTj = new cSi(25);
    gTk = new cSi(25);
    gTl = -2147483648;
    gTm = -2147483648;
    gTn = -2147483648;
    az = -32768;

    gTo = true;

    gTp = cPV.cGZ();
    gTq = btb.bBd();
    gTr = bMp.bTJ();

    gTs = new ArrayList();

    cDD.czz().a(gTp, gTq, gTr);
  }
}