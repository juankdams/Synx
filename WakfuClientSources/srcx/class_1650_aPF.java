import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class aPF extends aBq
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final dIy eMu = new cBh(this);
  protected transient byte[] aZY;

  public aPF()
  {
  }

  public aPF(int paramInt)
  {
    super(paramInt);
  }

  public aPF(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public aPF(dCx paramdCx)
  {
    super(paramdCx);
  }

  public aPF(int paramInt, dCx paramdCx)
  {
    super(paramInt, paramdCx);
  }

  public aPF(int paramInt, float paramFloat, dCx paramdCx)
  {
    super(paramInt, paramFloat, paramdCx);
  }

  public Object clone()
  {
    aPF localaPF = (aPF)super.clone();
    localaPF.aZY = ((byte[])this.aZY.clone());
    return localaPF;
  }

  public cqI bgx()
  {
    return new cqI(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.aZY = new byte[i];
    return i;
  }

  public byte c(long paramLong, byte paramByte)
  {
    int i = dL(paramLong);
    return a(paramLong, paramByte, i);
  }

  public byte d(long paramLong, byte paramByte)
  {
    int i = dL(paramLong);
    if (i < 0)
      return this.aZY[(-i - 1)];
    return a(paramLong, paramByte, i);
  }

  private byte a(long paramLong, byte paramByte, int paramInt)
  {
    byte b = 0;
    int j = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      b = this.aZY[paramInt];
      j = 0;
    }
    int i = this.lpp[paramInt];
    this.dVd[paramInt] = paramLong;
    this.lpp[paramInt] = 1;
    this.aZY[paramInt] = paramByte;
    if (j != 0) {
      fZ(i == 0);
    }

    return b;
  }

  public void a(aPF paramaPF)
  {
    paramaPF.a(this.eMu);
  }

  protected void rehash(int paramInt)
  {
    int i = this.dVd.length;
    long[] arrayOfLong = this.dVd;
    byte[] arrayOfByte1 = this.aZY;
    byte[] arrayOfByte2 = this.lpp;

    this.dVd = new long[paramInt];
    this.aZY = new byte[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte2[j] == 1) {
        long l = arrayOfLong[j];
        int k = dL(l);
        this.dVd[k] = l;
        this.aZY[k] = arrayOfByte1[j];
        this.lpp[k] = 1;
      }
  }

  public byte er(long paramLong)
  {
    int i = L(paramLong);
    return i < 0 ? 0 : this.aZY[i];
  }

  public void clear()
  {
    super.clear();
    long[] arrayOfLong = this.dVd;
    byte[] arrayOfByte1 = this.aZY;
    byte[] arrayOfByte2 = this.lpp;

    Arrays.fill(this.dVd, 0, this.dVd.length, 0L);
    Arrays.fill(this.aZY, 0, this.aZY.length, (byte)0);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public byte es(long paramLong)
  {
    byte b = 0;
    int i = L(paramLong);
    if (i >= 0) {
      b = this.aZY[i];
      aQ(i);
    }
    return b;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof aPF)) {
      return false;
    }
    aPF localaPF = (aPF)paramObject;
    if (localaPF.size() != size()) {
      return false;
    }
    return a(new dJw(localaPF));
  }

  public int hashCode() {
    bgZ localbgZ = new bgZ(this, null);
    a(localbgZ);
    return localbgZ.akt();
  }

  protected void aQ(int paramInt)
  {
    this.aZY[paramInt] = 0;
    super.aQ(paramInt);
  }

  public byte[] yu()
  {
    byte[] arrayOfByte1 = new byte[size()];
    byte[] arrayOfByte2 = this.aZY;
    byte[] arrayOfByte3 = this.lpp;

    int i = arrayOfByte2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte3[i] == 1) {
        arrayOfByte1[(j++)] = arrayOfByte2[i];
      }
    }
    return arrayOfByte1;
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

  public boolean C(byte paramByte)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.aZY;

    for (int i = arrayOfByte2.length; i-- > 0; ) {
      if ((arrayOfByte1[i] == 1) && (paramByte == arrayOfByte2[i])) {
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

  public boolean b(Tp paramTp)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.aZY;
    for (int i = arrayOfByte2.length; i-- > 0; ) {
      if ((arrayOfByte1[i] == 1) && (!paramTp.t(arrayOfByte2[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean a(dIy paramdIy)
  {
    byte[] arrayOfByte1 = this.lpp;
    long[] arrayOfLong = this.dVd;
    byte[] arrayOfByte2 = this.aZY;
    for (int i = arrayOfLong.length; i-- > 0; ) {
      if ((arrayOfByte1[i] == 1) && (!paramdIy.f(arrayOfLong[i], arrayOfByte2[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(dIy paramdIy)
  {
    boolean bool = false;
    byte[] arrayOfByte1 = this.lpp;
    long[] arrayOfLong = this.dVd;
    byte[] arrayOfByte2 = this.aZY;

    bOl();
    try {
      for (i = arrayOfLong.length; i-- > 0; )
        if ((arrayOfByte1[i] == 1) && (!paramdIy.f(arrayOfLong[i], arrayOfByte2[i]))) {
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

  public void a(ctI paramctI)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.aZY;
    for (int i = arrayOfByte2.length; i-- > 0; )
      if (arrayOfByte1[i] == 1)
        arrayOfByte2[i] = paramctI.dW(arrayOfByte2[i]);
  }

  public boolean et(long paramLong)
  {
    return e(paramLong, (byte)1);
  }

  public boolean e(long paramLong, byte paramByte)
  {
    int i = L(paramLong);
    if (i < 0)
      return false;
    int tmp20_18 = i;
    byte[] tmp20_15 = this.aZY; tmp20_15[tmp20_18] = ((byte)(tmp20_15[tmp20_18] + paramByte));
    return true;
  }

  public byte a(long paramLong, byte paramByte1, byte paramByte2)
  {
    int i = dL(paramLong);
    byte b;
    int j;
    if (i < 0) {
      i = -i - 1;
      int tmp25_23 = i;
      byte[] tmp25_20 = this.aZY; b = tmp25_20[tmp25_23] = (byte)(tmp25_20[tmp25_23] + paramByte1);
      j = 0;
    } else {
      b = this.aZY[i] = paramByte2;
      j = 1;
    }

    int k = this.lpp[i];
    this.dVd[i] = paramLong;
    this.lpp[i] = 1;

    if (j != 0) {
      fZ(k == 0);
    }

    return b;
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
      byte b = paramObjectInput.readByte();
      c(l, b);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new cBj(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}