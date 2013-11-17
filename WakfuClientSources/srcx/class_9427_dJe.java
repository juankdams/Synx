import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class dJe extends dVg
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final aCq lUF = new cEQ(this);
  protected transient long[] eiO;

  public dJe()
  {
  }

  public dJe(int paramInt)
  {
    super(paramInt);
  }

  public dJe(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public dJe(aSO paramaSO)
  {
    super(paramaSO);
  }

  public dJe(int paramInt, aSO paramaSO)
  {
    super(paramInt, paramaSO);
  }

  public dJe(int paramInt, float paramFloat, aSO paramaSO)
  {
    super(paramInt, paramFloat, paramaSO);
  }

  public Object clone()
  {
    dJe localdJe = (dJe)super.clone();
    localdJe.eiO = ((long[])this.eiO.clone());
    return localdJe;
  }

  public buz diD()
  {
    return new buz(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.eiO = new long[i];
    return i;
  }

  public long C(int paramInt, long paramLong)
  {
    int i = Ej(paramInt);
    return d(paramInt, paramLong, i);
  }

  public long D(int paramInt, long paramLong)
  {
    int i = Ej(paramInt);
    if (i < 0)
      return this.eiO[(-i - 1)];
    return d(paramInt, paramLong, i);
  }

  private long d(int paramInt1, long paramLong, int paramInt2)
  {
    long l = 0L;
    int j = 1;
    if (paramInt2 < 0) {
      paramInt2 = -paramInt2 - 1;
      l = this.eiO[paramInt2];
      j = 0;
    }
    int i = this.lpp[paramInt2];
    this.mtW[paramInt2] = paramInt1;
    this.lpp[paramInt2] = 1;
    this.eiO[paramInt2] = paramLong;
    if (j != 0) {
      fZ(i == 0);
    }

    return l;
  }

  public void a(dJe paramdJe)
  {
    paramdJe.b(this.lUF);
  }

  protected void rehash(int paramInt)
  {
    int i = this.mtW.length;
    int[] arrayOfInt = this.mtW;
    long[] arrayOfLong = this.eiO;
    byte[] arrayOfByte = this.lpp;

    this.mtW = new int[paramInt];
    this.eiO = new long[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        int k = arrayOfInt[j];
        int m = Ej(k);
        this.mtW[m] = k;
        this.eiO[m] = arrayOfLong[j];
        this.lpp[m] = 1;
      }
  }

  public long get(int paramInt)
  {
    int i = uK(paramInt);
    return i < 0 ? 0L : this.eiO[i];
  }

  public void clear()
  {
    super.clear();
    int[] arrayOfInt = this.mtW;
    long[] arrayOfLong = this.eiO;
    byte[] arrayOfByte = this.lpp;

    Arrays.fill(this.mtW, 0, this.mtW.length, 0);
    Arrays.fill(this.eiO, 0, this.eiO.length, 0L);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public long remove(int paramInt)
  {
    long l = 0L;
    int i = uK(paramInt);
    if (i >= 0) {
      l = this.eiO[i];
      aQ(i);
    }
    return l;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof dJe)) {
      return false;
    }
    dJe localdJe = (dJe)paramObject;
    if (localdJe.size() != size()) {
      return false;
    }
    return b(new bFQ(localdJe));
  }

  public int hashCode() {
    aRe localaRe = new aRe(this, null);
    b(localaRe);
    return localaRe.akt();
  }

  protected void aQ(int paramInt)
  {
    this.eiO[paramInt] = 0L;
    super.aQ(paramInt);
  }

  public long[] aVi()
  {
    long[] arrayOfLong1 = new long[size()];
    long[] arrayOfLong2 = this.eiO;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfLong2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfLong1[(j++)] = arrayOfLong2[i];
      }
    }
    return arrayOfLong1;
  }

  public int[] qe()
  {
    int[] arrayOfInt1 = new int[size()];
    int[] arrayOfInt2 = this.mtW;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfInt2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfInt1[(j++)] = arrayOfInt2[i];
      }
    }
    return arrayOfInt1;
  }

  public int[] d(int[] paramArrayOfInt)
  {
    int i = size();
    if (paramArrayOfInt.length < i) {
      paramArrayOfInt = (int[])Array.newInstance(paramArrayOfInt.getClass().getComponentType(), i);
    }

    int[] arrayOfInt = (int[])this.mtW;
    byte[] arrayOfByte = this.lpp;

    int j = arrayOfInt.length; for (int k = 0; j-- > 0; ) {
      if (arrayOfByte[j] == 1) {
        paramArrayOfInt[(k++)] = arrayOfInt[j];
      }
    }
    return paramArrayOfInt;
  }

  public boolean dZ(long paramLong)
  {
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong = this.eiO;

    for (int i = arrayOfLong.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (paramLong == arrayOfLong[i])) {
        return true;
      }
    }
    return false;
  }

  public boolean containsKey(int paramInt)
  {
    return contains(paramInt);
  }

  public boolean a(cIw paramcIw)
  {
    return g(paramcIw);
  }

  public boolean c(CE paramCE)
  {
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong = this.eiO;
    for (int i = arrayOfLong.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramCE.Q(arrayOfLong[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(aCq paramaCq)
  {
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.mtW;
    long[] arrayOfLong = this.eiO;
    for (int i = arrayOfInt.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramaCq.f(arrayOfInt[i], arrayOfLong[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean c(aCq paramaCq)
  {
    boolean bool = false;
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.mtW;
    long[] arrayOfLong = this.eiO;

    bOl();
    try {
      for (i = arrayOfInt.length; i-- > 0; )
        if ((arrayOfByte[i] == 1) && (!paramaCq.f(arrayOfInt[i], arrayOfLong[i]))) {
          aQ(i);
          bool = true;
        }
    }
    finally
    {
      int i;
      fY(true);
    }

    return bool;
  }

  public void a(cAm paramcAm)
  {
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong = this.eiO;
    for (int i = arrayOfLong.length; i-- > 0; )
      if (arrayOfByte[i] == 1)
        arrayOfLong[i] = paramcAm.e(arrayOfLong[i]);
  }

  public boolean aR(int paramInt)
  {
    return E(paramInt, 1L);
  }

  public boolean E(int paramInt, long paramLong)
  {
    int i = uK(paramInt);
    if (i < 0) {
      return false;
    }
    this.eiO[i] += paramLong;
    return true;
  }

  public long d(int paramInt, long paramLong1, long paramLong2)
  {
    int i = Ej(paramInt);
    long l;
    int j;
    if (i < 0) {
      i = -i - 1;
      l = this.eiO[i] += paramLong1;
      j = 0;
    } else {
      l = this.eiO[i] = paramLong2;
      j = 1;
    }

    int k = this.lpp[i];
    this.mtW[i] = paramInt;
    this.lpp[i] = 1;

    if (j != 0) {
      fZ(k == 0);
    }

    return l;
  }

  public void writeExternal(ObjectOutput paramObjectOutput)
  {
    paramObjectOutput.writeByte(0);

    paramObjectOutput.writeInt(this._size);

    cvF localcvF = new cvF(paramObjectOutput);
    if (!b(localcvF))
      throw localcvF.ihg;
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    int i = paramObjectInput.readInt();
    aO(i);

    while (i-- > 0) {
      int j = paramObjectInput.readInt();
      long l = paramObjectInput.readLong();
      C(j, l);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    b(new cEO(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}