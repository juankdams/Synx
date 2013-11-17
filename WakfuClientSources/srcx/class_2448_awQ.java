import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import javax.media.opengl.GL;

public class awQ extends P
{
  private aEj dMb;
  private static VertexBufferPCT aVY = VertexBufferPCT.gNI.zM(4096);

  private static float[] dMc = new float[8];
  private static float[] dMd = new float[16];
  private static float[] dMe = new float[16];
  private static float[] dMf = new float[8];
  private float aZs = 0.0F;
  private float aZt = 0.0F;
  private int dMg = 1;
  private float dka = 1.0F;

  public awQ()
  {
    dMd[3] = 1.0F;
    dMd[7] = 1.0F;
    dMd[11] = 1.0F;
    dMd[15] = 1.0F;

    dMe[3] = 1.0F;
    dMe[7] = 1.0F;
    dMe[11] = 1.0F;
    dMe[15] = 1.0F;
  }

  public void a(aEj paramaEj)
  {
    this.dMb = paramaEj;
  }

  public String getFontName() {
    if (this.dMb == null)
      return null;
    return this.dMb.getName();
  }

  public int aq() {
    if (this.dMb == null)
      return 0;
    return this.dMb.getStyle();
  }

  public hf getFont() {
    return this.dMb;
  }

  public hf a(int paramInt, float paramFloat) {
    return null;
  }

  public int a(char paramChar) {
    daa localdaa = this.dMb.bc((short)paramChar);
    if (localdaa == null)
      return 4;
    if (paramChar == ' ')
      return localdaa.kNT;
    return localdaa.kNT + localdaa.kNS;
  }

  public int b(char paramChar) {
    daa localdaa = this.dMb.bc((short)paramChar);
    if (localdaa == null)
      return 4;
    return localdaa.gKt;
  }

  public int c(char paramChar) {
    daa localdaa = this.dMb.bc((short)paramChar);
    if (localdaa == null)
      return 4;
    return localdaa.bdV;
  }

  public int ar() {
    if (this.dMb == null) {
      return 8;
    }

    return this.dMb.aQr() + this.dMb.ph() * 2;
  }

  public int as() {
    if (this.dMb == null) {
      return 12;
    }

    return this.dMb.aQs() + this.dMb.ph() * 2;
  }

  public int b(String paramString, int paramInt1, int paramInt2) {
    if ((paramString == null) || (paramString.length() == 0)) {
      return 0;
    }

    if (this.dMb == null) {
      return paramString.length();
    }

    int i = this.dMb.ph();
    char[] arrayOfChar = paramString.toCharArray();

    int j = 1;
    for (int k = 0; k < arrayOfChar.length; k++) {
      if (k == paramInt1) {
        return paramInt1;
      }

      int m = arrayOfChar[k];
      daa localdaa = this.dMb.bc((short)m);
      if (localdaa != null)
      {
        if (j != 0) {
          i += localdaa.kNS;
          j = 0;
        }

        if (m == 32)
          i += localdaa.kNT;
        else {
          i += localdaa.kNT;
        }

        if (i > paramInt2) {
          return k;
        }
      }
    }
    return paramString.length();
  }

  public int f(String paramString) {
    if (this.dMb == null) {
      return 4 * paramString.length();
    }
    int i = 0;
    char[] arrayOfChar = paramString.toCharArray();

    int j = 1;
    for (int k = 0; k < arrayOfChar.length; k++) {
      int m = arrayOfChar[k];
      daa localdaa = this.dMb.bc((short)m);
      if (localdaa != null)
      {
        if (j != 0)
        {
          i += localdaa.kNS;
          j = 0;
        }

        if (m == 32) {
          i += localdaa.kNT;
        }
        else
        {
          i += localdaa.kNT;
        }
      }
    }
    i += this.dMb.ph();
    return i;
  }

  public int g(String paramString) {
    if (this.dMb == null) {
      return 12;
    }

    return this.dMb.getCellHeight();
  }

  public int h(String paramString) {
    return 0;
  }

  public boolean at() {
    return false;
  }

  public void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    dMd[0] = (paramFloat1 * paramFloat4);
    dMd[1] = (paramFloat2 * paramFloat4);
    dMd[2] = (paramFloat3 * paramFloat4);
    dMd[3] = paramFloat4;
    dMd[4] = (paramFloat1 * paramFloat4);
    dMd[5] = (paramFloat2 * paramFloat4);
    dMd[6] = (paramFloat3 * paramFloat4);
    dMd[7] = paramFloat4;
    dMd[8] = (paramFloat1 * paramFloat4);
    dMd[9] = (paramFloat2 * paramFloat4);
    dMd[10] = (paramFloat3 * paramFloat4);
    dMd[11] = paramFloat4;
    dMd[12] = (paramFloat1 * paramFloat4);
    dMd[13] = (paramFloat2 * paramFloat4);
    dMd[14] = (paramFloat3 * paramFloat4);
    dMd[15] = paramFloat4;

    dMe[3] = paramFloat4;
    dMe[7] = paramFloat4;
    dMe[11] = paramFloat4;
    dMe[15] = paramFloat4;
  }

  public void a(char[] paramArrayOfChar, float paramFloat1, int paramInt, float paramFloat2) {
    a(paramArrayOfChar, paramFloat1, paramInt, paramFloat2, 1.0F);
  }

  public void a(char[] paramArrayOfChar, float paramFloat1, float paramFloat2) {
    a(paramArrayOfChar, paramFloat1, paramArrayOfChar.length, paramFloat2, 1.0F);
  }

  public void a(char[] paramArrayOfChar, float paramFloat1, float paramFloat2, float paramFloat3) {
    a(paramArrayOfChar, paramFloat1, paramArrayOfChar.length, paramFloat2, paramFloat3);
  }

  public void a(char[] paramArrayOfChar, float paramFloat1, int paramInt, float paramFloat2, float paramFloat3, float paramFloat4) {
    a(paramArrayOfChar, paramFloat1, paramArrayOfChar.length, paramFloat2, paramFloat3);
  }

  public void a(char[] paramArrayOfChar, float paramFloat1, int paramInt, float paramFloat2, float paramFloat3) {
    if (this.dMb == null) {
      return;
    }
    this.dka = paramFloat3;
    uz localuz = this.dMb.hN();

    int i = this.dMb.ph();
    paramFloat1 += this.aZs - i;
    paramFloat2 += this.aZt - i;

    ayc localayc = dHL.lSB.dhZ();

    aVY.rewind();

    localuz.d(localayc);

    MD localMD = localuz.wo(0);
    float f1 = localMD.getX();
    float f2 = localMD.getY();

    int j = 1;
    for (int k = 0; k < Math.min(paramArrayOfChar.length, paramInt); k++) {
      int m = paramArrayOfChar[k];
      daa localdaa = this.dMb.bc((short)m);
      if (localdaa != null)
      {
        if (j != 0)
        {
          paramFloat1 += localdaa.kNS * this.dka;
          j = 0;
        }

        paramFloat1 -= localdaa.kNS * this.dka;

        if (m == 32) {
          paramFloat1 += localdaa.kNT * this.dka;
        }
        else
        {
          a(paramFloat1, paramFloat2, f1, f2, localdaa, dMd);

          paramFloat1 += (localdaa.kNT + localdaa.kNS) * this.dka;
        }
      }
    }
    k = aVY.bSV();

    GL localGL = (GL)localayc.bZk();

    localGL.glVertexPointer(2, 5126, 0, aVY.bSP());
    localGL.glColorPointer(4, 5126, 0, aVY.bSQ());
    localGL.glTexCoordPointer(2, 5126, 0, aVY.bSR());
    localGL.glDrawArrays(7, 0, k);
  }

  private void e(String paramString, int paramInt1, int paramInt2) {
    uz localuz = this.dMb.hN();

    MD localMD = localuz.wo(0);
    float f1 = localMD.getX();
    float f2 = localMD.getY();

    char[] arrayOfChar = paramString.toCharArray();
    for (int i = 0; i < arrayOfChar.length; i++) {
      int j = arrayOfChar[i];
      daa localdaa = this.dMb.bc((short)j);
      if (localdaa != null)
      {
        if (j == 32) {
          paramInt1 += localdaa.kNT;
        }
        else
        {
          int k = this.dMg;
          for (int m = -k; m <= k; m++) {
            for (int n = -k; n <= k; n++) {
              if ((m != 0) || (n != 0))
              {
                a(paramInt1 + m, paramInt2 + n, f1, f2, localdaa, dMe);
              }
            }
          }
          paramInt1 += localdaa.kNT; } 
      }
    }
  }

  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, daa paramdaa, float[] paramArrayOfFloat) { dMc[0] = paramFloat1;
    dMc[1] = paramFloat2;
    dMf[0] = (paramdaa.aEd / paramFloat3);
    dMf[1] = ((paramdaa.aEe + paramdaa.bdV) / paramFloat4);

    dMc[2] = paramFloat1;
    dMc[3] = (paramFloat2 + paramdaa.bdV * this.dka);
    dMf[2] = (paramdaa.aEd / paramFloat3);
    dMf[3] = (paramdaa.aEe / paramFloat4);

    dMc[4] = (paramFloat1 + paramdaa.gKt * this.dka);
    dMc[5] = (paramFloat2 + paramdaa.bdV * this.dka);
    dMf[4] = ((paramdaa.aEd + paramdaa.gKt) / paramFloat3);
    dMf[5] = (paramdaa.aEe / paramFloat4);

    dMc[6] = (paramFloat1 + paramdaa.gKt * this.dka);
    dMc[7] = paramFloat2;
    dMf[6] = ((paramdaa.aEd + paramdaa.gKt) / paramFloat3);
    dMf[7] = ((paramdaa.aEe + paramdaa.bdV) / paramFloat4);

    aVY.z(dMc);
    aVY.I(dMf);
    aVY.D(paramArrayOfFloat);
    aVY.tg(aVY.bSV() + 4); }

  public void beginRendering(int paramInt1, int paramInt2)
  {
    this.aZs = (-paramInt1 / 2);
    this.aZt = (-paramInt2 / 2);

    ayc localayc = dHL.lSB.dhZ();
    localayc.dNI.qH(13);
    dsZ.cZe().a(cnQ.hUU, cnQ.hUY);
  }

  public void endRendering() {
    ayc localayc = dHL.lSB.dhZ();
    dsZ.cZe().a(cnQ.hUX, cnQ.hUY);
  }

  public void begin3DRendering() {
    this.aZs = 0.0F;
    this.aZt = 0.0F;

    ayc localayc = dHL.lSB.dhZ();
    localayc.dNI.qH(13);
    dsZ.cZe().a(cnQ.hUU, cnQ.hUY);
  }

  public void end3DRendering() {
    ayc localayc = dHL.lSB.dhZ();
    dsZ.cZe().a(cnQ.hUX, cnQ.hUY);
  }

  static
  {
    int i = 4096;
  }
}