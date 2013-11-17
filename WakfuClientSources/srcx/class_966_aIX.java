import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class aIX extends aBN
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final aXb eiN = new cXY(this);
  protected transient long[] eiO;

  public aIX()
  {
  }

  public aIX(int paramInt)
  {
    super(paramInt);
  }

  public aIX(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public aIX(bvE parambvE)
  {
    super(parambvE);
  }

  public aIX(int paramInt, bvE parambvE)
  {
    super(paramInt, parambvE);
  }

  public aIX(int paramInt, float paramFloat, bvE parambvE)
  {
    super(paramInt, paramFloat, parambvE);
  }

  public Object clone()
  {
    aIX localaIX = (aIX)super.clone();
    localaIX.eiO = ((long[])this.eiO.clone());
    return localaIX;
  }

  public cHL aVh()
  {
    return new cHL(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.eiO = new long[i];
    return i;
  }

  public long c(byte paramByte, long paramLong)
  {
    int i = bw(paramByte);
    return b(paramByte, paramLong, i);
  }

  public long d(byte paramByte, long paramLong)
  {
    int i = bw(paramByte);
    if (i < 0)
      return this.eiO[(-i - 1)];
    return b(paramByte, paramLong, i);
  }

  private long b(byte paramByte, long paramLong, int paramInt)
  {
    long l = 0L;
    int j = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      l = this.eiO[paramInt];
      j = 0;
    }
    int i = this.lpp[paramInt];
    this.dVU[paramInt] = paramByte;
    this.lpp[paramInt] = 1;
    this.eiO[paramInt] = paramLong;
    if (j != 0) {
      fZ(i == 0);
    }

    return l;
  }

  public void a(aIX paramaIX)
  {
    paramaIX.a(this.eiN);
  }

  protected void rehash(int paramInt)
  {
    int i = this.dVU.length;
    byte[] arrayOfByte1 = this.dVU;
    long[] arrayOfLong = this.eiO;
    byte[] arrayOfByte2 = this.lpp;

    this.dVU = new byte[paramInt];
    this.eiO = new long[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte2[j] == 1) {
        byte b = arrayOfByte1[j];
        int k = bw(b);
        this.dVU[k] = b;
        this.eiO[k] = arrayOfLong[j];
        this.lpp[k] = 1;
      }
  }

  public long bO(byte paramByte)
  {
    int i = j(paramByte);
    return i < 0 ? 0L : this.eiO[i];
  }

  public void clear()
  {
    super.clear();
    byte[] arrayOfByte1 = this.dVU;
    long[] arrayOfLong = this.eiO;
    byte[] arrayOfByte2 = this.lpp;

    Arrays.fill(this.dVU, 0, this.dVU.length, (byte)0);
    Arrays.fill(this.eiO, 0, this.eiO.length, 0L);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public long bP(byte paramByte)
  {
    long l = 0L;
    int i = j(paramByte);
    if (i >= 0) {
      l = this.eiO[i];
      aQ(i);
    }
    return l;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof aIX)) {
      return false;
    }
    aIX localaIX = (aIX)paramObject;
    if (localaIX.size() != size()) {
      return false;
    }
    return a(new bJp(localaIX));
  }

  public int hashCode() {
    aVf localaVf = new aVf(this, null);
    a(localaVf);
    return localaVf.akt();
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

  public byte[] yv()
  {
    byte[] arrayOfByte1 = new byte[size()];
    byte[] arrayOfByte2 = this.dVU;
    byte[] arrayOfByte3 = this.lpp;

    int i = arrayOfByte2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte3[i] == 1) {
        arrayOfByte1[(j++)] = arrayOfByte2[i];
      }
    }
    return arrayOfByte1;
  }

  public byte[] i(byte[] paramArrayOfByte)
  {
    int i = size();
    if (paramArrayOfByte.length < i) {
      paramArrayOfByte = (byte[])Array.newInstance(paramArrayOfByte.getClass().getComponentType(), i);
    }

    byte[] arrayOfByte1 = (byte[])this.dVU;
    byte[] arrayOfByte2 = this.lpp;

    int j = arrayOfByte1.length; for (int k = 0; j-- > 0; ) {
      if (arrayOfByte2[j] == 1) {
        paramArrayOfByte[(k++)] = arrayOfByte1[j];
      }
    }
    return paramArrayOfByte;
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

  public boolean D(byte paramByte)
  {
    return contains(paramByte);
  }

  public boolean a(Tp paramTp)
  {
    return c(paramTp);
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

  public boolean a(aXb paramaXb)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    long[] arrayOfLong = this.eiO;
    for (int i = arrayOfByte2.length; i-- > 0; ) {
      if ((arrayOfByte1[i] == 1) && (!paramaXb.f(arrayOfByte2[i], arrayOfLong[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(aXb paramaXb)
  {
    boolean bool = false;
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    long[] arrayOfLong = this.eiO;

    bOl();
    try {
      for (i = arrayOfByte2.length; i-- > 0; )
        if ((arrayOfByte1[i] == 1) && (!paramaXb.f(arrayOfByte2[i], arrayOfLong[i]))) {
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

  public boolean E(byte paramByte)
  {
    return e(paramByte, 1L);
  }

  public boolean e(byte paramByte, long paramLong)
  {
    int i = j(paramByte);
    if (i < 0) {
      return false;
    }
    this.eiO[i] += paramLong;
    return true;
  }

  public long a(byte paramByte, long paramLong1, long paramLong2)
  {
    int i = bw(paramByte);
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
    this.dVU[i] = paramByte;
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
      byte b = paramObjectInput.readByte();
      long l = paramObjectInput.readLong();
      c(b, l);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new cXV(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}