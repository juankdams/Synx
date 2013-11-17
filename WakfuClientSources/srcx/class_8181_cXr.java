import java.util.Arrays;

public class cXr
{
  private static final int ibC = 10;
  protected byte[] kKA;
  protected int ibE;
  protected int m_size;
  protected int ibF;

  public cXr()
  {
    this.kKA = new byte[10];
    this.ibE = 10;
    this.m_size = 0;
    this.ibF = 10;
  }

  public cXr(cXr paramcXr) {
    this.ibE = (this.m_size = paramcXr.m_size);
    this.kKA = new byte[paramcXr.m_size];
    this.ibF = paramcXr.ibF;
  }

  public cXr(int paramInt) {
    if (paramInt < 0) {
      throw new IllegalArgumentException("La taille du tableau doit être >= 0");
    }
    this.kKA = new byte[paramInt];
    this.ibE = paramInt;
    this.m_size = 0;
    this.ibF = 10;
  }

  public cXr(int paramInt1, int paramInt2) {
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("La taille du tableau doit être >= 0");
    }
    if (paramInt2 < 1) {
      throw new IllegalArgumentException("L'incrément de taille growth doit être >= 1");
    }

    this.kKA = new byte[paramInt1];
    this.ibE = paramInt1;
    this.m_size = 0;
    this.ibF = paramInt2;
  }

  public static cXr aC(byte[] paramArrayOfByte) {
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("Le tableau ne peut être nul");
    }
    cXr localcXr = new cXr();
    localcXr.kKA = paramArrayOfByte;
    localcXr.ibE = paramArrayOfByte.length;
    localcXr.ibF = 10;
    localcXr.m_size = localcXr.ibE;
    return localcXr;
  }

  public final void eL(byte paramByte) {
    ensureCapacity(this.m_size + 1);
    this.kKA[this.m_size] = paramByte;
    this.m_size += 1;
  }

  public final void aD(byte[] paramArrayOfByte) {
    int i = paramArrayOfByte.length;
    ensureCapacity(this.m_size + i);
    System.arraycopy(paramArrayOfByte, 0, this.kKA, this.m_size, i);
    this.m_size += i;
  }

  public final void r(byte[] paramArrayOfByte, int paramInt) {
    ensureCapacity(this.m_size + paramInt);
    System.arraycopy(paramArrayOfByte, 0, this.kKA, this.m_size, paramInt);
    this.m_size += paramInt;
  }

  public final void l(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    ensureCapacity(this.m_size + paramInt2);
    System.arraycopy(paramArrayOfByte, paramInt1, this.kKA, this.m_size, paramInt2);
    this.m_size += paramInt2;
  }

  public final void e(cXr paramcXr) {
    l(paramcXr.kKA, 0, paramcXr.m_size);
  }

  public final void putBoolean(boolean paramBoolean) {
    eL((byte)(paramBoolean ? 1 : 0));
  }

  public final void U(char paramChar)
  {
    ensureCapacity(this.m_size + 2);
    this.kKA[this.m_size] = ((byte)(0xFF & paramChar >> '\b'));
    this.m_size += 1;
    this.kKA[this.m_size] = ((byte)(0xFF & paramChar));
    this.m_size += 1;
  }

  public final void dT(short paramShort)
  {
    ensureCapacity(this.m_size + 2);
    this.kKA[this.m_size] = ((byte)(0xFF & paramShort >> 8));
    this.m_size += 1;
    this.kKA[this.m_size] = ((byte)(0xFF & paramShort));
    this.m_size += 1;
  }

  public final void putInt(int paramInt) {
    ensureCapacity(this.m_size + 4);
    this.kKA[this.m_size] = ((byte)(0xFF & paramInt >> 24));
    this.m_size += 1;
    this.kKA[this.m_size] = ((byte)(0xFF & paramInt >> 16));
    this.m_size += 1;
    this.kKA[this.m_size] = ((byte)(0xFF & paramInt >> 8));
    this.m_size += 1;
    this.kKA[this.m_size] = ((byte)(0xFF & paramInt));
    this.m_size += 1;
  }

  public final void jn(long paramLong) {
    ensureCapacity(this.m_size + 8);
    this.kKA[this.m_size] = ((byte)(int)(0xFF & paramLong >> 56));
    this.m_size += 1;
    this.kKA[this.m_size] = ((byte)(int)(0xFF & paramLong >> 48));
    this.m_size += 1;
    this.kKA[this.m_size] = ((byte)(int)(0xFF & paramLong >> 40));
    this.m_size += 1;
    this.kKA[this.m_size] = ((byte)(int)(0xFF & paramLong >> 32));
    this.m_size += 1;
    this.kKA[this.m_size] = ((byte)(int)(0xFF & paramLong >> 24));
    this.m_size += 1;
    this.kKA[this.m_size] = ((byte)(int)(0xFF & paramLong >> 16));
    this.m_size += 1;
    this.kKA[this.m_size] = ((byte)(int)(0xFF & paramLong >> 8));
    this.m_size += 1;
    this.kKA[this.m_size] = ((byte)(int)(0xFF & paramLong));
    this.m_size += 1;
  }

  public final boolean contains(byte paramByte)
  {
    for (int i = 0; i < this.m_size; i++) {
      if (this.kKA[i] == paramByte) {
        return true;
      }
    }
    return false;
  }

  public final void cY(float paramFloat) {
    putInt(Float.floatToIntBits(paramFloat));
  }

  public final void T(double paramDouble) {
    jn(Double.doubleToLongBits(paramDouble));
  }

  public final byte get(int paramInt) {
    if (paramInt >= this.m_size) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return this.kKA[paramInt];
  }

  public final int size() {
    return this.m_size;
  }

  public final byte[] cLg()
  {
    return this.kKA;
  }

  public final byte[] toArray()
  {
    byte[] arrayOfByte = new byte[this.m_size];
    System.arraycopy(this.kKA, 0, arrayOfByte, 0, this.m_size);
    return arrayOfByte;
  }

  private void ensureCapacity(int paramInt) {
    if (paramInt > this.ibE)
    {
      this.ibE = (paramInt + this.ibF);
      byte[] arrayOfByte = new byte[this.ibE];
      System.arraycopy(this.kKA, 0, arrayOfByte, 0, this.m_size);
      this.kKA = arrayOfByte;
    }
  }

  public final void clear()
  {
    Arrays.fill(this.kKA, (byte)0);
    this.m_size = 0;
  }
}