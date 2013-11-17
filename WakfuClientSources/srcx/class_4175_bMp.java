import java.io.IOException;
import java.net.URL;
import org.apache.log4j.Logger;

public class bMp
  implements agk
{
  private static final Logger K = Logger.getLogger(bMp.class);

  private final ckD gPK = new ckD("LightMap loader");
  private final Xg gPL = new Xg();

  private final Object aNy = new Object();
  private int bQo;
  private String gPM;
  private boolean gPN;
  private static final bMp gPO = new bMp();

  public static bMp bTJ() {
    return gPO;
  }

  private bMp() {
    this.gPN = true;
  }

  public void setPath(String paramString)
  {
    try {
      this.gPM = dtb.getURL(paramString).toString();
      if (!this.gPM.endsWith("/"))
        this.gPM += "/";
    } catch (IOException localIOException) {
      K.error("Invalid path : " + paramString, localIOException);
    }
  }

  public void sH(int paramInt) {
    this.bQo = paramInt;
  }

  public int anM() {
    return this.bQo;
  }

  public cCf M(int paramInt1, int paramInt2, int paramInt3) {
    dxN localdxN = cY(paramInt1, paramInt2);
    return localdxN == null ? null : localdxN.M(paramInt1, paramInt2, paramInt3);
  }

  private dxN cY(int paramInt1, int paramInt2) {
    int i = bCO.bD(paramInt1 / 18.0F);
    int j = bCO.bD(paramInt2 / 18.0F);
    return (dxN)this.gPL.get(bCO.cN(i, j));
  }

  public final void J(short paramShort1, short paramShort2)
  {
    dxN localdxN = new dxN();
    String str = a(this.gPM, this.bQo, paramShort1, paramShort2);
    aYQ localaYQ = aYQ.V(dtb.readFile(str));
    localdxN.d(localaYQ);
    if ((!bB) && ((asc.jT(localdxN.hY) != paramShort1) || (asc.jU(localdxN.hZ) != paramShort2))) throw new AssertionError();
    synchronized (this.aNy) {
      this.gPL.put(bCO.G(paramShort1, paramShort2), localdxN);
    }
    this.gPN = true;
  }

  public void clean()
  {
    synchronized (this.aNy) {
      this.gPL.clear();
    }
    this.gPK.clear();
  }

  public final void bS(float paramFloat) {
    synchronized (this.aNy) {
      for (int i = this.gPL.size() - 1; i >= 0; i--)
        ((dxN)this.gPL.hc(i)).bS(paramFloat);
    }
  }

  public final void bT(float paramFloat)
  {
    synchronized (this.aNy) {
      for (int i = this.gPL.size() - 1; i >= 0; i--)
        ((dxN)this.gPL.hc(i)).bT(paramFloat);
    }
  }

  public void K(short paramShort1, short paramShort2)
  {
    int i = bCO.G(paramShort1, paramShort2);
    synchronized (this.aNy) {
      this.gPL.remove(i);
    }
    this.gPK.fD(i);
  }

  public boolean bTK() {
    return this.gPN;
  }

  public void gl(boolean paramBoolean) {
    this.gPN = paramBoolean;
  }

  private static String a(String paramString, int paramInt, short paramShort1, short paramShort2) {
    if ((!bB) && ((paramString == null) || (!paramString.contains("%d")) || (!paramString.endsWith("/")))) throw new AssertionError();
    return String.format(paramString, new Object[] { Integer.valueOf(paramInt) }) + paramShort1 + '_' + paramShort2;
  }

  public final int getPriority() {
    return 400;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat) {
    cCf localcCf = M(paramInt1, paramInt2, paramInt4);
    if (localcCf != null) {
      float[] arrayOfFloat1 = localcCf.ckE();
      paramArrayOfFloat[0] *= arrayOfFloat1[0];
      paramArrayOfFloat[1] *= arrayOfFloat1[1];
      paramArrayOfFloat[2] *= arrayOfFloat1[2];
      float[] arrayOfFloat2 = localcCf.cyo();

      if (arrayOfFloat2 != null) {
        paramArrayOfFloat[0] += arrayOfFloat2[0];
        paramArrayOfFloat[1] += arrayOfFloat2[1];
        paramArrayOfFloat[2] += arrayOfFloat2[2];
      }
    }
  }

  public void update(int paramInt) {
  }

  public boolean wS() {
    return false;
  }

  public void L(short paramShort1, short paramShort2)
  {
    int i = bCO.G(paramShort1, paramShort2);
    this.gPK.a(i, new aCG(this, paramShort1, paramShort2));
  }

  public void a(short paramShort1, short paramShort2, dxN paramdxN)
  {
    int i = bCO.G(paramShort1, paramShort2);
    synchronized (this.aNy) {
      this.gPL.put(i, paramdxN);
    }
    gl(true);
  }
}