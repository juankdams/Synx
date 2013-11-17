import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class dxa extends aBq
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final mJ lDk = new dBC(this);
  protected transient long[] eiO;

  public dxa()
  {
  }

  public dxa(int paramInt)
  {
    super(paramInt);
  }

  public dxa(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public dxa(dCx paramdCx)
  {
    super(paramdCx);
  }

  public dxa(int paramInt, dCx paramdCx)
  {
    super(paramInt, paramdCx);
  }

  public dxa(int paramInt, float paramFloat, dCx paramdCx)
  {
    super(paramInt, paramFloat, paramdCx);
  }

  public Object clone()
  {
    dxa localdxa = (dxa)super.clone();
    localdxa.eiO = ((long[])this.eiO.clone());
    return localdxa;
  }

  public aSp dco()
  {
    return new aSp(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.eiO = new long[i];
    return i;
  }

  public long J(long paramLong1, long paramLong2)
  {
    int i = dL(paramLong1);
    return b(paramLong1, paramLong2, i);
  }

  public long K(long paramLong1, long paramLong2)
  {
    int i = dL(paramLong1);
    if (i < 0)
      return this.eiO[(-i - 1)];
    return b(paramLong1, paramLong2, i);
  }

  private long b(long paramLong1, long paramLong2, int paramInt)
  {
    long l = 0L;
    int j = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      l = this.eiO[paramInt];
      j = 0;
    }
    int i = this.lpp[paramInt];
    this.dVd[paramInt] = paramLong1;
    this.lpp[paramInt] = 1;
    this.eiO[paramInt] = paramLong2;
    if (j != 0) {
      fZ(i == 0);
    }

    return l;
  }

  public void a(dxa paramdxa)
  {
    paramdxa.a(this.lDk);
  }

  protected void rehash(int paramInt)
  {
    int i = this.dVd.length;
    long[] arrayOfLong1 = this.dVd;
    long[] arrayOfLong2 = this.eiO;
    byte[] arrayOfByte = this.lpp;

    this.dVd = new long[paramInt];
    this.eiO = new long[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        long l = arrayOfLong1[j];
        int k = dL(l);
        this.dVd[k] = l;
        this.eiO[k] = arrayOfLong2[j];
        this.lpp[k] = 1;
      }
  }

  public long gd(long paramLong)
  {
    int i = L(paramLong);
    return i < 0 ? 0L : this.eiO[i];
  }

  public void clear()
  {
    super.clear();
    long[] arrayOfLong1 = this.dVd;
    long[] arrayOfLong2 = this.eiO;
    byte[] arrayOfByte = this.lpp;

    Arrays.fill(this.dVd, 0, this.dVd.length, 0L);
    Arrays.fill(this.eiO, 0, this.eiO.length, 0L);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public long gc(long paramLong)
  {
    long l = 0L;
    int i = L(paramLong);
    if (i >= 0) {
      l = this.eiO[i];
      aQ(i);
    }
    return l;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof dxa)) {
      return false;
    }
    dxa localdxa = (dxa)paramObject;
    if (localdxa.size() != size()) {
      return false;
    }
    return a(new bSu(localdxa));
  }

  public int hashCode() {
    biE localbiE = new biE(this, null);
    a(localbiE);
    return localbiE.akt();
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

  public boolean containsKey(long paramLong)
  {
    return N(paramLong);
  }

  public boolean a(CE paramCE)
  {
    return b(paramCE);
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

  public boolean a(mJ parammJ)
  {
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong1 = this.dVd;
    long[] arrayOfLong2 = this.eiO;
    for (int i = arrayOfLong1.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!parammJ.a(arrayOfLong1[i], arrayOfLong2[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(mJ parammJ)
  {
    boolean bool = false;
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong1 = this.dVd;
    long[] arrayOfLong2 = this.eiO;

    bOl();
    try {
      for (i = arrayOfLong1.length; i-- > 0; )
        if ((arrayOfByte[i] == 1) && (!parammJ.a(arrayOfLong1[i], arrayOfLong2[i]))) {
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

  public boolean et(long paramLong)
  {
    return L(paramLong, 1L);
  }

  public boolean L(long paramLong1, long paramLong2)
  {
    int i = L(paramLong1);
    if (i < 0) {
      return false;
    }
    this.eiO[i] += paramLong2;
    return true;
  }

  public long g(long paramLong1, long paramLong2, long paramLong3)
  {
    int i = dL(paramLong1);
    long l;
    int j;
    if (i < 0) {
      i = -i - 1;
      l = this.eiO[i] += paramLong2;
      j = 0;
    } else {
      l = this.eiO[i] = paramLong3;
      j = 1;
    }

    int k = this.lpp[i];
    this.dVd[i] = paramLong1;
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
    if (!a(localcvF))
      throw localcvF.ihg;
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    int i = paramObjectInput.readInt();
    aO(i);

    while (i-- > 0) {
      long l1 = paramObjectInput.readLong();
      long l2 = paramObjectInput.readLong();
      J(l1, l2);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new dBh(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}