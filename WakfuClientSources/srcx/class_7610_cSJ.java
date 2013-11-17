import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public final class cSJ extends bbg
{
  private static final Logger K = Logger.getLogger(cSJ.class);
  public static final byte kFe = 1;
  public static final byte kFf = 2;
  public static final byte kFg = 17;
  public static final byte kFh = 18;
  private int ia;
  private int ib;
  private short hDI;
  private short hDJ;
  private MD ibN;
  private final int kFi;
  private uJ kFj;
  private byte[] bFC;
  private byte kFk = 17;
  private dKq kFl;

  public cSJ(int paramInt1, int paramInt2, short paramShort, uJ paramuJ, byte[] paramArrayOfByte)
  {
    this.ia = paramInt1;
    this.ib = paramInt2;
    this.ibN = new MD(this.ia, this.ib);
    this.kFi = paramShort;
    this.kFj = paramuJ;
    this.bFC = paramArrayOfByte;
  }

  public cSJ(short paramShort1, short paramShort2, short paramShort3, short paramShort4, byte paramByte, uJ paramuJ, byte[] paramArrayOfByte)
  {
    this(paramShort1, paramShort2, (short)paramByte, paramuJ, paramArrayOfByte);
    this.hDI = paramShort3;
    this.hDJ = paramShort4;
  }

  public cSJ(int paramInt1, int paramInt2, short paramShort, uJ paramuJ, byte[] paramArrayOfByte, int paramInt3, int paramInt4)
  {
    this.ia = paramInt1;
    this.ib = paramInt2;
    this.ibN = new MD(this.ia, this.ib);
    this.kFi = paramShort;
    this.kFj = paramuJ;
    this.bFC = new byte[paramInt4];
    System.arraycopy(paramArrayOfByte, paramInt3, this.bFC, 0, paramInt4);
  }

  public cSJ(cSJ paramcSJ)
  {
    this.ia = paramcSJ.ia;
    this.ib = paramcSJ.ib;
    this.hDI = paramcSJ.hDI;
    this.hDJ = paramcSJ.hDJ;
    this.kFk = paramcSJ.kFk;
    this.ibN = new MD(this.ia, this.ib);
    this.kFi = paramcSJ.kFi;
    if (paramcSJ.kFj != null)
      this.kFj = new uJ(paramcSJ.kFj);
    else {
      this.kFj = null;
    }

    if (paramcSJ.bFC != null) {
      this.bFC = new byte[paramcSJ.bFC.length];
      System.arraycopy(paramcSJ.bFC, 0, this.bFC, 0, this.bFC.length);
    } else {
      this.bFC = null;
    }
    if (paramcSJ.kFl != null)
      this.kFl = new dKq(paramcSJ.kFl);
  }

  public int getWidth()
  {
    return this.ia;
  }

  public int getHeight() {
    return this.ib;
  }

  public MD cqv() {
    return this.ibN;
  }

  public short cIu() {
    return this.hDI;
  }

  public short cIv() {
    return this.hDJ;
  }

  public void W(short paramShort1, short paramShort2)
  {
    this.hDI = paramShort1;
    this.hDJ = paramShort2;
  }

  public int getAlpha(int paramInt1, int paramInt2) {
    if ((!bB) && (paramInt1 >= this.ia)) throw new AssertionError();
    if ((!bB) && (paramInt2 >= this.ib)) throw new AssertionError();

    if (this.kFi == 32) {
      int i = (paramInt2 * this.ia + paramInt1) * 4;
      return this.bFC[(i + 3)] & 0xFF;
    }
    return 255;
  }

  public bNa ez(int paramInt1, int paramInt2) {
    bNa localbNa = eA(paramInt1, paramInt2);
    if ((cIB() == 18) || (cIB() == 2)) {
      localbNa.tu(localbNa.bUH());
    }
    return localbNa;
  }

  private bNa eA(int paramInt1, int paramInt2) {
    if ((!bB) && (paramInt1 >= this.ia)) throw new AssertionError();
    if ((!bB) && (paramInt2 >= this.ib)) throw new AssertionError();

    int i = (paramInt2 * this.ia + paramInt1) * ((this.kFi + 7) / 8);
    if (this.kFi == 32) {
      return new bNa(this.bFC[i], this.bFC[(i + 1)], this.bFC[(i + 2)], this.bFC[(i + 3)]);
    }
    if (this.kFi == 24) {
      return new bNa(this.bFC[i], this.bFC[(i + 1)], this.bFC[(i + 2)], (byte)-1);
    }
    if (this.kFi == 8) {
      if (cIw()) {
        return this.kFj.db(clH.dM(this.bFC[i]));
      }
      return new bNa(this.bFC[i], this.bFC[i], this.bFC[i], (byte)-1);
    }
    if (this.kFi == 4) {
      if (i % 2 == 0) {
        return this.kFj.db((byte)(this.bFC[(i / 2)] & 0xF0) >> 4);
      }
      return this.kFj.db((byte)(this.bFC[(i / 2)] & 0xF));
    }
    return null;
  }

  public void a(int paramInt1, int paramInt2, bNa parambNa) {
    if ((!bB) && (paramInt1 >= this.ia)) throw new AssertionError();
    if ((!bB) && (paramInt2 >= this.ib)) throw new AssertionError();

    int i = (paramInt2 * this.ia + paramInt1) * ((this.kFi + 7) / 8);

    if (this.kFi == 32) {
      this.bFC[i] = parambNa.bUL();
      this.bFC[(i + 1)] = parambNa.bUM();
      this.bFC[(i + 2)] = parambNa.bUN();
      this.bFC[(i + 3)] = parambNa.bUK();
    } else if (this.kFi == 24) {
      this.bFC[i] = parambNa.bUL();
      this.bFC[(i + 1)] = parambNa.bUM();
      this.bFC[(i + 2)] = parambNa.bUN();
    }
    else if (!bB) { throw new AssertionError("Unsupported color format"); }
  }

  public int getBitDepth()
  {
    return this.kFi;
  }

  public byte[] getData() {
    return this.bFC;
  }

  public boolean cIw() {
    return this.kFj != null;
  }

  public cSJ cIx() {
    if (this.kFi == 32) {
      return new cSJ(this);
    }
    if (this.kFi != 24) {
      if (!bB) throw new AssertionError("Unable to convert" + this.kFi + " bits to RGBA32");
      return null;
    }

    byte[] arrayOfByte = new byte[this.ia * this.ib * 4];
    int i = 0;
    for (int j = 0; j < this.bFC.length; ) {
      arrayOfByte[(i++)] = this.bFC[(j++)];
      arrayOfByte[(i++)] = this.bFC[(j++)];
      arrayOfByte[(i++)] = this.bFC[(j++)];
      arrayOfByte[(i++)] = -1;
    }

    cSJ localcSJ = new cSJ(this.ia, this.ib, (short)32, null, arrayOfByte);
    localcSJ.eF(cIB());
    return localcSJ;
  }

  public void a(float paramFloat1, float paramFloat2, vY paramvY) {
    int i = Math.round(getWidth() * paramFloat1);
    int j = Math.round(getHeight() * paramFloat2);
    if ((!bB) && ((i <= 0) || (j <= 0))) throw new AssertionError();

    int k = getBitDepth() >> 3;
    byte[] arrayOfByte = new byte[i * j * k];
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    if (paramvY == null) {
      m = (int)Math.ceil(1.0F / paramFloat1);
      n = (int)Math.ceil(1.0F / paramFloat2);
      for (i1 = 0; i1 < j; i1++) {
        i2 = (int)(i1 / paramFloat2);
        for (i3 = 0; i3 < i; i3++) {
          i4 = (int)(i3 / paramFloat1);
          for (int i5 = 0; i5 < k; i5++) {
            int i6 = e(m, n, i4, i2, i5);
            arrayOfByte[((i1 * i + i3) * k + i5)] = i6;
          }
        }
      }
    } else {
      for (m = 0; m < j; m++) {
        n = (int)(m / paramFloat2);
        for (i1 = 0; i1 < i; i1++) {
          i2 = (int)(i1 / paramFloat1);
          for (i3 = 0; i3 < k; i3++) {
            i4 = a(paramvY, i2, n, i3);
            arrayOfByte[((m * i + i1) * k + i3)] = i4;
          }
        }
      }
    }

    this.ia = i;
    this.ib = j;
    this.ibN = new MD(this.ia, this.ib);
    this.bFC = arrayOfByte;
  }

  public void cIy() {
    this.bFC = null;
  }

  public void za(int paramInt) {
    this.kFl = new dKq(this, paramInt);
  }

  public dKq cIz() {
    return this.kFl;
  }

  public void f(byte[] paramArrayOfByte, byte paramByte) {
    this.kFl = new dKq(paramArrayOfByte, this.ia, paramByte);
  }

  public void d(cSJ paramcSJ) {
    if ((!bB) && ((paramcSJ.ia > this.ia) || (paramcSJ.ib > this.ib))) throw new AssertionError("layer trop grand");
    if ((!bB) && (paramcSJ.kFi != this.kFi)) throw new AssertionError("Impossible de merger des layers de profondeur différente");

    if ((this.kFi != 32) || (paramcSJ.kFi != 32)) {
      return;
    }

    for (int i = 0; i < paramcSJ.ia; i++)
      for (int j = 0; j < paramcSJ.ib; j++) {
        int k = (j * this.ia + i) * ((this.kFi + 7) / 8);
        float f = clH.dM(paramcSJ.bFC[(k + 3)]) / 255.0F;
        if (f != 0.0F)
        {
          this.bFC[k] = ((byte)(int)Math.min(255.0F, clH.dM(this.bFC[k]) * (1.0F - f) + clH.dM(paramcSJ.bFC[k]) * f));

          this.bFC[(k + 1)] = ((byte)(int)Math.min(255.0F, clH.dM(this.bFC[(k + 1)]) * (1.0F - f) + clH.dM(paramcSJ.bFC[(k + 1)]) * f));

          this.bFC[(k + 2)] = ((byte)(int)Math.min(255.0F, clH.dM(this.bFC[(k + 2)]) * (1.0F - f) + clH.dM(paramcSJ.bFC[(k + 2)]) * f));

          this.bFC[(k + 3)] = ((byte)(int)Math.min(255.0F, clH.dM(this.bFC[(k + 3)]) * (1.0F - f) + clH.dM(paramcSJ.bFC[(k + 3)])));
        }
      }
  }

  public void a(aWD paramaWD)
  {
    if ((!bB) && (this.kFi != 32) && (this.kFi != 24)) throw new AssertionError("Unsupported color format for this operation");
    byte b1 = cIB();

    for (int i = 0; i < this.ia; i++)
      for (int j = 0; j < this.ib; j++) {
        int k = (j * this.ia + i) * ((this.kFi + 7) / 8);

        byte b2 = this.bFC[k];
        byte b3 = this.bFC[(k + 1)];
        byte b4 = this.bFC[(k + 2)];
        byte b5 = this.kFi == 32 ? this.bFC[(k + 3)] : -1;

        if (paramaWD.a(b2, b3, b4, b5, b1))
        {
          paramaWD.a(this.bFC, k, b1);
        }
      }
  }

  public void cIA()
  {
    bNa[][] arrayOfbNa = new bNa[this.ia][this.ib];
    int j;
    for (int i = 0; i < this.ia; i++) {
      for (j = 0; j < this.ib; j++) {
        arrayOfbNa[i][j] = eA(this.ia - i - 1, j);
      }
    }

    for (i = 0; i < this.ia; i++)
      for (j = 0; j < this.ib; j++)
        a(i, j, arrayOfbNa[i][j]);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
  {
    int i = bCO.sj(paramInt1);
    int j = bCO.sj(paramInt2);

    int k = this.kFi / 8;
    if ((this.bFC == null) || (this.bFC.length != i * j * k))
      this.bFC = new byte[i * j * k];
    int m = paramInt1 * k;
    int n = i * k;
    int i1 = paramByteBuffer.capacity() / m;

    int i2 = 0;

    paramByteBuffer.rewind();
    byte[] arrayOfByte = new byte[m];
    for (int i3 = 0; i3 < i1; i3++) {
      paramByteBuffer.get(arrayOfByte, 0, m);
      System.arraycopy(arrayOfByte, 0, this.bFC, i2, m);
      i2 += n;
    }

    this.ia = paramInt1;
    this.ib = paramInt2;
    this.ibN = new MD(i, j);
  }

  protected void DL()
  {
    this.bFC = null;
    this.kFk = 0;
    this.kFl = null;
    if (this.kFj != null) {
      this.kFj.axl();
      this.kFj = null;
    }
  }

  private byte a(vY paramvY, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getBitDepth() >> 3;

    int j = paramvY.getSize() / 2;
    float[] arrayOfFloat = paramvY.Fj();
    float f1 = 0.0F;
    int k = -1;
    for (int m = 0; m < paramvY.getSize(); m++) {
      int n = paramInt2 + m - j;
      if ((n >= 0) && (n <= getHeight())) {
        int i1 = n * getWidth();
        for (int i2 = 0; i2 < paramvY.getSize(); i2++) {
          int i3 = paramInt1 + i2 - j;
          k++;
          if ((i3 >= 0) && (i3 <= getWidth())) {
            float f2 = this.bFC[((i1 + i3) * i + paramInt3)] & 0xFF;
            f1 += arrayOfFloat[k] * f2;
          }
        }
      } else {
        k += paramvY.getSize();
      }
    }
    if (f1 < 0.0F)
      f1 = 0.0F;
    else if (f1 > 255.0F)
      f1 = 255.0F;
    if (f1 > 127.0F)
      f1 -= 256.0F;
    return (byte)(int)f1;
  }

  private byte e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = getBitDepth() >> 3;

    float f1 = 1.0F / (paramInt1 * paramInt2);
    float f2 = 0.0F;
    for (int j = 0; j < paramInt2; j++) {
      int k = paramInt4 + j;
      if ((k >= 0) && (k < getHeight())) {
        int m = k * getWidth();
        for (int n = 0; n < paramInt1; n++) {
          int i1 = paramInt3 + n;
          if ((i1 >= 0) && (i1 < getWidth())) {
            float f3 = this.bFC[((m + i1) * i + paramInt5)] & 0xFF;
            f2 += f1 * f3;
          }
        }
      }
    }
    if (f2 < 0.0F)
      f2 = 0.0F;
    else if (f2 > 255.0F)
      f2 = 255.0F;
    if (f2 > 127.0F)
      f2 -= 256.0F;
    return (byte)(int)f2;
  }

  private void a(byte[] paramArrayOfByte, bVk parambVk, byte paramByte) {
    int i = ((Integer)parambVk.get()).intValue();
    bNa localbNa = this.kFj.db(clH.dM(paramByte));
    paramArrayOfByte[(i++)] = localbNa.bUL();
    paramArrayOfByte[(i++)] = localbNa.bUM();
    paramArrayOfByte[(i++)] = localbNa.bUN();
    parambVk.set(Integer.valueOf(i));
  }

  public byte cIB()
  {
    return this.kFk;
  }

  public void eF(byte paramByte) {
    this.kFk = paramByte;
  }
}