import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class dUy extends aBq
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final dsq msj = new cli(this);
  protected transient int[] bXB;

  public dUy()
  {
  }

  public dUy(int paramInt)
  {
    super(paramInt);
  }

  public dUy(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public dUy(dCx paramdCx)
  {
    super(paramdCx);
  }

  public dUy(int paramInt, dCx paramdCx)
  {
    super(paramInt, paramdCx);
  }

  public dUy(int paramInt, float paramFloat, dCx paramdCx)
  {
    super(paramInt, paramFloat, paramdCx);
  }

  public Object clone()
  {
    dUy localdUy = (dUy)super.clone();
    localdUy.bXB = ((int[])this.bXB.clone());
    return localdUy;
  }

  public bWe duF()
  {
    return new bWe(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.bXB = new int[i];
    return i;
  }

  public int G(long paramLong, int paramInt)
  {
    int i = dL(paramLong);
    return c(paramLong, paramInt, i);
  }

  public int H(long paramLong, int paramInt)
  {
    int i = dL(paramLong);
    if (i < 0)
      return this.bXB[(-i - 1)];
    return c(paramLong, paramInt, i);
  }

  private int c(long paramLong, int paramInt1, int paramInt2)
  {
    int j = 0;
    int k = 1;
    if (paramInt2 < 0) {
      paramInt2 = -paramInt2 - 1;
      j = this.bXB[paramInt2];
      k = 0;
    }
    int i = this.lpp[paramInt2];
    this.dVd[paramInt2] = paramLong;
    this.lpp[paramInt2] = 1;
    this.bXB[paramInt2] = paramInt1;
    if (k != 0) {
      fZ(i == 0);
    }

    return j;
  }

  public void b(dUy paramdUy)
  {
    paramdUy.a(this.msj);
  }

  protected void rehash(int paramInt)
  {
    int i = this.dVd.length;
    long[] arrayOfLong = this.dVd;
    int[] arrayOfInt = this.bXB;
    byte[] arrayOfByte = this.lpp;

    this.dVd = new long[paramInt];
    this.bXB = new int[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        long l = arrayOfLong[j];
        int k = dL(l);
        this.dVd[k] = l;
        this.bXB[k] = arrayOfInt[j];
        this.lpp[k] = 1;
      }
  }

  public int kZ(long paramLong)
  {
    int i = L(paramLong);
    return i < 0 ? 0 : this.bXB[i];
  }

  public void clear()
  {
    super.clear();
    long[] arrayOfLong = this.dVd;
    int[] arrayOfInt = this.bXB;
    byte[] arrayOfByte = this.lpp;

    Arrays.fill(this.dVd, 0, this.dVd.length, 0L);
    Arrays.fill(this.bXB, 0, this.bXB.length, 0);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public int la(long paramLong)
  {
    int i = 0;
    int j = L(paramLong);
    if (j >= 0) {
      i = this.bXB[j];
      aQ(j);
    }
    return i;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof dUy)) {
      return false;
    }
    dUy localdUy = (dUy)paramObject;
    if (localdUy.size() != size()) {
      return false;
    }
    return a(new bku(localdUy));
  }

  public int hashCode() {
    ckP localckP = new ckP(this, null);
    a(localckP);
    return localckP.akt();
  }

  protected void aQ(int paramInt)
  {
    this.bXB[paramInt] = 0;
    super.aQ(paramInt);
  }

  public int[] Vp()
  {
    int[] arrayOfInt1 = new int[size()];
    int[] arrayOfInt2 = this.bXB;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfInt2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfInt1[(j++)] = arrayOfInt2[i];
      }
    }
    return arrayOfInt1;
  }

  public long[] aBb()
  {
    long[] arrayOfLong1 = new long[size()];
    long[] arrayOfLong2 = this.dVd;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfLong2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfLong1[(j++)] = arrayOfLong2[i];
      }
    }
    return arrayOfLong1;
  }

  public long[] c(long[] paramArrayOfLong)
  {
    int i = size();
    if (paramArrayOfLong.length < i) {
      paramArrayOfLong = (long[])Array.newInstance(paramArrayOfLong.getClass().getComponentType(), i);
    }

    long[] arrayOfLong = (long[])this.dVd;
    byte[] arrayOfByte = this.lpp;

    int j = arrayOfLong.length; for (int k = 0; j-- > 0; ) {
      if (arrayOfByte[j] == 1) {
        paramArrayOfLong[(k++)] = arrayOfLong[j];
      }
    }
    return paramArrayOfLong;
  }

  public boolean fG(int paramInt)
  {
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.bXB;

    for (int i = arrayOfInt.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (paramInt == arrayOfInt[i])) {
        return true;
      }
    }
    return false;
  }

  public boolean containsKey(long paramLong)
  {
    return N(paramLong);
  }

  public boolean a(CE paramCE)
  {
    return b(paramCE);
  }

  public boolean d(cIw paramcIw)
  {
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.bXB;
    for (int i = arrayOfInt.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramcIw.R(arrayOfInt[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean a(dsq paramdsq)
  {
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong = this.dVd;
    int[] arrayOfInt = this.bXB;
    for (int i = arrayOfLong.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramdsq.r(arrayOfLong[i], arrayOfInt[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(dsq paramdsq)
  {
    boolean bool = false;
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong = this.dVd;
    int[] arrayOfInt = this.bXB;

    bOl();
    try {
      for (i = arrayOfLong.length; i-- > 0; )
        if ((arrayOfByte[i] == 1) && (!paramdsq.r(arrayOfLong[i], arrayOfInt[i]))) {
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

  public void a(bwW parambwW)
  {
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.bXB;
    for (int i = arrayOfInt.length; i-- > 0; )
      if (arrayOfByte[i] == 1)
        arrayOfInt[i] = parambwW.rt(arrayOfInt[i]);
  }

  public boolean et(long paramLong)
  {
    return I(paramLong, 1);
  }

  public boolean I(long paramLong, int paramInt)
  {
    int i = L(paramLong);
    if (i < 0) {
      return false;
    }
    this.bXB[i] += paramInt;
    return true;
  }

  public int d(long paramLong, int paramInt1, int paramInt2)
  {
    int i = dL(paramLong);
    int k;
    int j;
    if (i < 0) {
      i = -i - 1;
      k = this.bXB[i] += paramInt1;
      j = 0;
    } else {
      k = this.bXB[i] = paramInt2;
      j = 1;
    }

    int m = this.lpp[i];
    this.dVd[i] = paramLong;
    this.lpp[i] = 1;

    if (j != 0) {
      fZ(m == 0);
    }

    return k;
  }

  public void writeExternal(ObjectOutput paramObjectOutput)
  {
    paramObjectOutput.writeByte(0);

    paramObjectOutput.writeInt(this._size);

    cvF localcvF = new cvF(paramObjectOutput);
    if (!a(localcvF))
      throw localcvF.ihg;
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    int i = paramObjectInput.readInt();
    aO(i);

    while (i-- > 0) {
      long l = paramObjectInput.readLong();
      int j = paramObjectInput.readInt();
      G(l, j);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new clj(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}