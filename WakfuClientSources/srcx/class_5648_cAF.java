import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import javax.media.opengl.GL;

public class cAF extends P
{
  private cdM iqz;
  private static VertexBufferPCT aVY = VertexBufferPCT.gNI.zM(4096);

  private static float[] dMd = new float[4];
  private float aZs = 0.0F;
  private float aZt = 0.0F;
  private float dka = 1.0F;

  public void b(cdM paramcdM)
  {
    this.iqz = paramcdM;
  }

  public String getFontName()
  {
    return this.iqz == null ? null : this.iqz.getName();
  }

  public int aq()
  {
    if (this.iqz == null)
      return 0;
    return this.iqz.getStyle();
  }

  public hf getFont()
  {
    return this.iqz;
  }

  public hf a(int paramInt, float paramFloat)
  {
    return null;
  }

  public int a(char paramChar)
  {
    bJu localbJu = this.iqz.M(paramChar);
    if (localbJu == null)
      return 4;
    return localbJu.gKw;
  }

  public int b(char paramChar)
  {
    bJu localbJu = this.iqz.M(paramChar);
    if (localbJu == null)
      return 4;
    return localbJu.gKt;
  }

  public int c(char paramChar)
  {
    bJu localbJu = this.iqz.M(paramChar);
    if (localbJu == null)
      return 4;
    return localbJu.bdV;
  }

  public int ar()
  {
    if (this.iqz == null) {
      return 8;
    }

    return this.iqz.aQr() + this.iqz.ph() * 2;
  }

  public int as()
  {
    if (this.iqz == null) {
      return 12;
    }

    return this.iqz.aQs() + this.iqz.ph() * 2;
  }

  public int b(String paramString, int paramInt1, int paramInt2)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return 0;
    }

    if (this.iqz == null) {
      return paramString.length();
    }

    float f = this.iqz.ph();
    char[] arrayOfChar = paramString.toCharArray();

    for (int i = 0; i < arrayOfChar.length; i++) {
      if (i == paramInt1) {
        return paramInt1;
      }

      bJu localbJu = this.iqz.M(arrayOfChar[i]);
      if (localbJu != null)
      {
        f += localbJu.gKw;

        if ((localbJu.gKx != null) && (i < arrayOfChar.length - 1)) {
          f += localbJu.gKx.get(arrayOfChar[(i + 1)]);
        }

        if (f > paramInt2) {
          return i;
        }
      }
    }
    return paramString.length();
  }

  public int f(String paramString)
  {
    if (this.iqz == null) {
      return 4 * paramString.length();
    }
    float f = 0.0F;
    char[] arrayOfChar = paramString.toCharArray();

    for (int i = 0; i < arrayOfChar.length; i++) {
      bJu localbJu = this.iqz.M(arrayOfChar[i]);
      if (localbJu != null)
      {
        if ((localbJu.gKx != null) && (i < arrayOfChar.length - 1)) {
          f += localbJu.gKx.get(arrayOfChar[(i + 1)]);
        }

        f += localbJu.gKw;
      }
    }
    f += this.iqz.ph();
    return (int)f;
  }

  public int g(String paramString)
  {
    if (this.iqz == null) {
      return 12;
    }

    return this.iqz.getCellHeight();
  }

  public int h(String paramString)
  {
    return this.iqz.cgC();
  }

  public boolean at()
  {
    return false;
  }

  public void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    dMd[0] = (paramFloat1 * paramFloat4);
    dMd[1] = (paramFloat2 * paramFloat4);
    dMd[2] = (paramFloat3 * paramFloat4);
    dMd[3] = paramFloat4;
  }

  public final void a(char[] paramArrayOfChar, float paramFloat1, float paramFloat2)
  {
    a(paramArrayOfChar, paramFloat1, paramArrayOfChar.length, paramFloat2, 1.0F);
  }

  public final void a(char[] paramArrayOfChar, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    a(paramArrayOfChar, paramFloat1, paramArrayOfChar.length, paramFloat2, paramFloat3);
  }

  public final void a(char[] paramArrayOfChar, float paramFloat1, int paramInt, float paramFloat2, float paramFloat3)
  {
    a(paramArrayOfChar, paramFloat1, paramInt, paramFloat2, paramFloat3, 0.0F);
  }

  public void a(char[] paramArrayOfChar, float paramFloat1, int paramInt, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if (this.iqz == null) {
      return;
    }
    float f1 = paramFloat1;

    this.dka = paramFloat3;

    int i = this.iqz.ph();
    f1 += this.aZs - i;
    paramFloat2 += this.aZt - i + this.iqz.cgB();

    ayc localayc = dHL.lSB.dhZ();

    uz localuz = this.iqz.hN();
    dsZ.cZe().a(localayc, (cdg)localuz);
    dsZ.cZe().x(localayc);

    MD localMD = localuz.wo(0);
    float f2 = localMD.getX();
    float f3 = localMD.getY();

    aVY.begin();

    int j = Math.min(paramArrayOfChar.length, paramInt);
    for (int k = 0; k < j; k++) {
      char c = paramArrayOfChar[k];
      bJu localbJu = this.iqz.M(c);
      if (localbJu != null)
      {
        if (c == ' ') {
          f1 += localbJu.gKw + paramFloat4;
        }
        else
        {
          float f4 = (localbJu.gKv + localbJu.bdV) / 2.0F;

          float f5 = bCO.bC(f1) + localbJu.gKu * this.dka;
          float f6 = paramFloat2 - f4 * this.dka - f4;

          float f7 = f5 + localbJu.gKt * this.dka;
          float f8 = f6 + localbJu.bdV * this.dka;

          float f9 = localbJu.aEd / f2;
          float f10 = localbJu.aEe / f3;
          float f11 = (localbJu.aEd + localbJu.gKt) / f2;
          float f12 = (localbJu.aEe + localbJu.bdV) / f3;

          aVY.a(f5, f6, f9, f12, dMd);
          aVY.a(f5, f8, f9, f10, dMd);
          aVY.a(f7, f8, f11, f10, dMd);
          aVY.a(f7, f6, f11, f12, dMd);

          if ((localbJu.gKx != null) && (k < j - 1)) {
            f1 += localbJu.gKx.get(paramArrayOfChar[(k + 1)]) * this.dka;
          }

          f1 += localbJu.gKw * this.dka;
        }
      }
    }
    aVY.end();
    k = aVY.bSV();

    GL localGL = (GL)localayc.bZk();

    localGL.glVertexPointer(2, 5126, 0, aVY.bSP());
    localGL.glColorPointer(4, 5126, 0, aVY.bSQ());
    localGL.glTexCoordPointer(2, 5126, 0, aVY.bSR());

    localGL.glDrawArrays(7, 0, k);
  }

  public void beginRendering(int paramInt1, int paramInt2)
  {
    this.aZs = (-paramInt1 / 2);
    this.aZt = (-paramInt2 / 2);

    ayc localayc = dHL.lSB.dhZ();
    localayc.dNI.qH(13);
    dsZ.cZe().a(cnQ.hUX, cnQ.hUY);
  }

  public void endRendering()
  {
  }

  public void begin3DRendering()
  {
    this.aZs = 0.0F;
    this.aZt = 0.0F;

    ayc localayc = dHL.lSB.dhZ();
    localayc.dNI.qH(13);
    dsZ.cZe().a(cnQ.hUX, cnQ.hUY);
  }

  public void end3DRendering()
  {
  }

  static
  {
    int i = 4096;
  }
}