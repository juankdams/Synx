import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class Xm
  implements cFh
{
  public static final Xm cHv = new Xm();

  private static final Logger K = Logger.getLogger(Xm.class);
  private static final float bpE = 0.01F;
  private static final float bpF = 2.1F;
  private static final byte cHw = 0;
  private static final byte cHx = 1;
  private Xg cHy = new Xg();
  private final Xg cHz = new Xg();

  private int cHA = -2147483648;
  private int cHB = -2147483648;
  private rp cHC;
  private static final cEi cHD = new cEi();

  private Xm()
  {
    for (bkA localbkA : bkA.values())
      this.cHz.put(localbkA.bJ(), new aVH(this, localbkA, null));
  }

  public void j(short paramShort1, short paramShort2)
  {
    if (this.cHC == null) {
      this.cHC = WakfuClientInstance.awy().Dg().cKV();
    }
    if ((this.cHA == paramShort1) && (this.cHB == paramShort2)) {
      return;
    }

    this.cHA = paramShort1;
    this.cHB = paramShort2;

    Xg localXg = new Xg();
    short s1 = (short)(paramShort1 - 1); for (short s2 = (short)(paramShort1 + 1); s1 <= s2; s1 = (short)(s1 + 1)) {
      short s3 = (short)(paramShort2 - 1); for (short s4 = (short)(paramShort2 + 1); s3 <= s4; s3 = (short)(s3 + 1))
      {
        int j = k(s1, s3);
        bfn localbfn = (bfn)this.cHy.get(j);
        if (localbfn == null) {
          try {
            localbfn = new bfn(s1, s3);
          } catch (Exception localException) {
            continue;
          }
        }
        localXg.put(j, localbfn);
      }

    }

    this.cHy = localXg;

    for (int i = this.cHz.size() - 1; i >= 0; i--)
      ((aVH)this.cHz.hc(i)).a(this.cHy);
  }

  public void aI(int paramInt1, int paramInt2)
  {
    for (int i = this.cHz.size() - 1; i >= 0; i--) {
      aVH localaVH = (aVH)this.cHz.hc(i);

      if (aVH.a(localaVH)) {
        if (a(localaVH, paramInt1, paramInt2) == 0)
        {
          b(localaVH, paramInt1, paramInt2);
        }
        else
          c(localaVH, paramInt1, paramInt2);
      }
      else if (aVH.b(localaVH) != 0) {
        aVH.a(localaVH, (byte)0);
        aWc.blo().b(new td(aVH.c(localaVH).yn(), aVH.c(localaVH).bvv(), 0));
        K.debug("Aucune " + aVH.c(localaVH) + " alentour");
      }
    }
  }

  private byte a(aVH paramaVH, int paramInt1, int paramInt2) {
    int i = k((short)oU.bV(paramInt1), (short)oU.bW(paramInt2));
    bfn localbfn = (bfn)this.cHy.get(i);

    if (localbfn == null) {
      return 0;
    }

    int j = (paramInt1 % 18 + 18) % 18;
    int k = (paramInt2 % 18 + 18) % 18;

    return localbfn.e(aVH.c(paramaVH).bJ(), j, k);
  }

  private void b(aVH paramaVH, int paramInt1, int paramInt2)
  {
    int i = bfn.pl(paramInt1);
    int j = bfn.pl(paramInt2);

    int k = 0;
    int m = 0;
    int n = 0;

    for (int i1 = -1; i1 < 2; i1++) {
      for (i2 = -1; i2 < 2; i2++) {
        int i3 = i + i1;
        int i4 = j + i2;
        int i5 = k(bfn.pp(i3), bfn.pp(i4));
        bfn localbfn = (bfn)this.cHy.get(i5);
        if (localbfn != null) {
          int i6 = localbfn.d(aVH.c(paramaVH).bJ(), i3, i4);
          if (i6 > 0) {
            k += i1;
            m += i2;
            n += i6;
          }
        }
      }
    }

    cHD.m(k, m, 0.0F);
    cHD.czT();

    i1 = bfn.pn(i);
    int i2 = bfn.pn(j);
    K.debug("[weight]OrigPos= " + paramInt1 + ", " + paramInt2);
    K.debug("[weight]CenterPos= " + i1 + ", " + i2);

    if (aVH.b(paramaVH) == 0) {
      aVH.d(paramaVH).set(i1 + cHD.getX() * 10.0F);
      aVH.e(paramaVH).set(i2 + cHD.getY() * 10.0F);
    } else {
      aVH.d(paramaVH).cu(i1 + cHD.getX() * 10.0F);
      aVH.e(paramaVH).cu(i2 + cHD.getY() * 10.0F);
    }

    K.debug("[weight]Pos= " + aVH.d(paramaVH).cvi() + ", " + aVH.e(paramaVH).cvi());

    if (n == 0) {
      if (aVH.b(paramaVH) != 0) {
        aVH.a(paramaVH, (byte)0);
        aWc.blo().b(new td(aVH.c(paramaVH).yn(), aVH.c(paramaVH).bvv(), 0));
        K.debug("Aucune " + aVH.c(paramaVH) + " alentour");
      }
    }
    else if (aVH.b(paramaVH) != 1) {
      aVH.a(paramaVH, (byte)1);
      aWc.blo().b(new td(aVH.c(paramaVH).yn(), aVH.c(paramaVH).bvv(), 75));
      K.debug("Détection d'une " + aVH.c(paramaVH) + "éloignée - Force=" + n);
    }
  }

  private void c(aVH paramaVH, int paramInt1, int paramInt2)
  {
    int i = bfn.pk(paramInt1);
    int j = bfn.pk(paramInt2);

    int k = 0;
    int m = 0;
    int n = 0;

    for (int i1 = -1; i1 < 2; i1++) {
      for (i2 = -1; i2 < 2; i2++) {
        int i3 = i + i1;
        int i4 = j + i2;
        int i5 = k(bfn.po(i3), bfn.po(i4));
        bfn localbfn = (bfn)this.cHy.get(i5);
        if ((localbfn != null) && 
          (localbfn.f(aVH.c(paramaVH).bJ(), i3, i4))) {
          k += i1;
          m += i2;
          n++;
        }
      }

    }

    cHD.m(k, m, 0.0F);
    cHD.czT();

    i1 = bfn.pm(i);
    int i2 = bfn.pm(j);
    K.debug("[pos]OrigPos= " + paramInt1 + ", " + paramInt2);
    K.debug("[pos]CenterPos= " + i1 + ", " + i2);

    if (aVH.b(paramaVH) == 0) {
      aVH.d(paramaVH).set(i1 + cHD.getX() * (10 - n));
      aVH.e(paramaVH).set(i2 + cHD.getY() * (10 - n));
    } else {
      aVH.d(paramaVH).cu(i1 + cHD.getX() * (10 - n));
      aVH.e(paramaVH).cu(i2 + cHD.getY() * (10 - n));
    }

    K.debug("[pos]Pos= " + aVH.d(paramaVH).cvi() + ", " + aVH.e(paramaVH).cvi());

    if (aVH.b(paramaVH) != 1) {
      aVH.a(paramaVH, (byte)1);
      aWc.blo().b(new td(aVH.c(paramaVH).yn(), aVH.c(paramaVH).bvv(), 75));
      K.debug("Détection d'un " + aVH.c(paramaVH) + " proche - Force=" + n);
    }
  }

  public void clear() {
    this.cHy.clear();
    for (int i = this.cHz.size() - 1; i >= 0; i--) {
      aVH localaVH = (aVH)this.cHz.hc(i);
      if (aVH.b(localaVH) != 0) {
        aVH.a(localaVH, (byte)0);
        aWc.blo().b(new td(aVH.c(localaVH).yn(), aVH.c(localaVH).bvv(), 0));
      }
    }

    this.cHA = -2147483648;
    this.cHB = -2147483648;
  }

  private int k(short paramShort1, short paramShort2) {
    return bCO.G(paramShort1, paramShort2);
  }

  public void a(adG paramadG, int paramInt)
  {
    for (int i = this.cHz.size() - 1; i >= 0; i--) {
      aVH localaVH = (aVH)this.cHz.hc(i);
      aVH.d(localaVH).xd(paramInt);
      aVH.e(localaVH).xd(paramInt);
    }
  }

  public void b(adG paramadG, float paramFloat1, float paramFloat2) {
  }

  final float a(bkA parambkA) {
    aVH localaVH = (aVH)this.cHz.get(parambkA.bJ());
    if (localaVH == null) {
      return 0.0F;
    }
    return aVH.d(localaVH).getValue();
  }

  final float b(bkA parambkA) {
    aVH localaVH = (aVH)this.cHz.get(parambkA.bJ());
    if (localaVH == null) {
      return 0.0F;
    }
    return aVH.e(localaVH).getValue();
  }

  final float c(bkA parambkA) {
    return this.cHC.yc().aCv();
  }
}