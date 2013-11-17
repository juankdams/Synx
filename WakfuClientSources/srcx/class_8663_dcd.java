import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import org.apache.log4j.Logger;

class dcd extends crO
{
  private static final Logger K = Logger.getLogger(dcd.class);
  static final int kUI = 1;
  private final Ye kUJ = new bI(this);

  private final Xg kUK = new Xg();
  private int kUL;
  private int kUM = -1;
  private int aVg;

  dcd()
  {
    this.ibx.Q(false);
  }

  protected gn h(String paramString, int paramInt1, int paramInt2)
  {
    if ((!bB) && (this.kUK.size() == 0)) throw new AssertionError();
    return (gn)this.kUK.get(bCO.cN(paramInt1, paramInt2));
  }

  public void a(int paramInt1, int paramInt2, dgg paramdgg) {
    a(paramInt1, paramInt2, paramdgg.cPK(), this.kUJ);
  }

  private void a(int paramInt1, int paramInt2, aN[] paramArrayOfaN, Ye paramYe)
  {
    dQx localdQx = new dQx();

    float f1 = 1024.0F;
    float f2 = 576.0F;
    for (aN localaN : paramArrayOfaN) {
      ScreenElement localScreenElement = a(paramInt1, paramInt2, localaN);
      paramYe.a(localScreenElement);
      if (localScreenElement.ddL() != null)
      {
        localScreenElement.ddS();
        localScreenElement.ddR();

        localScreenElement.d(localdQx);

        int k = bCO.bD(localdQx.hqu / 1024.0F);
        int m = bCO.bD(localdQx.hqw / 576.0F);
        int n = bCO.bD(localdQx.hqv / 1024.0F);
        int i1 = bCO.bD(localdQx.hqx / 576.0F);

        if ((!bB) && (k > n)) throw new AssertionError();
        if ((!bB) && (m > i1)) throw new AssertionError();

        for (int i2 = k; i2 <= n; i2++) {
          for (int i3 = m; i3 <= i1; i3++) {
            a(this.kUK, (short)i2, (short)i3, localScreenElement);
            localScreenElement.gQ();
          }
        }
      }
      localScreenElement.axl();
    }
  }

  private static ScreenElement a(int paramInt1, int paramInt2, aN paramaN) {
    byte[] arrayOfByte = paramaN.bW();
    int i = 0;
    if (arrayOfByte != null) {
      i |= 1;
    }

    ScreenElement localScreenElement = new ScreenElement((byte)i);
    if (arrayOfByte != null) {
      a(localScreenElement, arrayOfByte);
    }

    int j = paramaN.bT() + paramInt1;
    int k = paramaN.bU() + paramInt2;
    short s = (short)paramaN.bV();

    localScreenElement.ai(j, k, s);
    localScreenElement.b(paramaN.bS());

    localScreenElement.Cf(paramaN.bX());
    localScreenElement.setHeight(paramaN.bY());
    localScreenElement.J(paramaN.bZ());

    localScreenElement.fk(paramaN.ca());
    localScreenElement.Cg(paramaN.cb());
    localScreenElement.eA((short)paramaN.cb());
    return localScreenElement;
  }

  private static void a(ScreenElement paramScreenElement, byte[] paramArrayOfByte) {
    paramScreenElement.C(eR(paramArrayOfByte[0]), eR(paramArrayOfByte[1]), eR(paramArrayOfByte[2]));
  }

  private static float eR(byte paramByte) {
    return ScreenElement.fG(paramByte);
  }

  public void cNP() {
    int i = 0; for (int j = this.kUK.size(); i < j; i++) {
      gn localgn = (gn)this.kUK.hc(i);
      localgn.nz();
      localgn.nB();
    }
  }

  public dDL cNQ() {
    dDL localdDL = new dDL();
    int i = 0; for (int j = this.kUK.size(); i < j; i++) {
      gn localgn = (gn)this.kUK.hc(i);
      localdDL.Z(localgn.nx(), localgn.ny());
    }
    return localdDL;
  }

  public void clear()
  {
    int i = 0; for (int j = this.kUK.size(); i < j; i++) {
      ((gn)this.kUK.hc(i)).clear();
    }
    this.kUK.clear();
    super.clear();

    this.aVg = 0;
    this.kUL = 0;
    this.kUM = 0;
  }

  public void b(bFA parambFA) {
    dOW localdOW = (dOW)parambFA.bmZ();
    if (localdOW == null) {
      K.error("pas de model associé à l'instance de batiement " + parambFA);
      return;
    }
    int i = this.kUM + 1;
    pk localpk = new pk(this.kUL + 1, i, this.aVg + 1, parambFA.bcY());

    a(parambFA.bmV(), parambFA.bmW(), localdOW.cPK(), localpk);
    parambFA.setLayer(i);

    int j = localdOW.Wf();
    this.kUM += j;
    this.aVg += j;
    this.kUL += localpk.wu();
  }
}