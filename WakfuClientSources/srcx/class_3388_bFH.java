import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class bFH extends aBq
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final aGD gBK = new bHN(this);
  protected transient float[] gBL;

  public bFH()
  {
  }

  public bFH(int paramInt)
  {
    super(paramInt);
  }

  public bFH(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public bFH(dCx paramdCx)
  {
    super(paramdCx);
  }

  public bFH(int paramInt, dCx paramdCx)
  {
    super(paramInt, paramdCx);
  }

  public bFH(int paramInt, float paramFloat, dCx paramdCx)
  {
    super(paramInt, paramFloat, paramdCx);
  }

  public Object clone()
  {
    bFH localbFH = (bFH)super.clone();
    localbFH.gBL = ((float[])this.gBL.clone());
    return localbFH;
  }

  public cik bNX()
  {
    return new cik(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.gBL = new float[i];
    return i;
  }

  public float d(long paramLong, float paramFloat)
  {
    int i = dL(paramLong);
    return a(paramLong, paramFloat, i);
  }

  public float e(long paramLong, float paramFloat)
  {
    int i = dL(paramLong);
    if (i < 0)
      return this.gBL[(-i - 1)];
    return a(paramLong, paramFloat, i);
  }

  private float a(long paramLong, float paramFloat, int paramInt)
  {
    float f = 0.0F;
    int j = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      f = this.gBL[paramInt];
      j = 0;
    }
    int i = this.lpp[paramInt];
    this.dVd[paramInt] = paramLong;
    this.lpp[paramInt] = 1;
    this.gBL[paramInt] = paramFloat;
    if (j != 0) {
      fZ(i == 0);
    }

    return f;
  }

  public void a(bFH parambFH)
  {
    parambFH.a(this.gBK);
  }

  protected void rehash(int paramInt)
  {
    int i = this.dVd.length;
    long[] arrayOfLong = this.dVd;
    float[] arrayOfFloat = this.gBL;
    byte[] arrayOfByte = this.lpp;

    this.dVd = new long[paramInt];
    this.gBL = new float[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        long l = arrayOfLong[j];
        int k = dL(l);
        this.dVd[k] = l;
        this.gBL[k] = arrayOfFloat[j];
        this.lpp[k] = 1;
      }
  }

  public float gA(long paramLong)
  {
    int i = L(paramLong);
    return i < 0 ? 0.0F : this.gBL[i];
  }

  public void clear()
  {
    super.clear();
    long[] arrayOfLong = this.dVd;
    float[] arrayOfFloat = this.gBL;
    byte[] arrayOfByte = this.lpp;

    Arrays.fill(this.dVd, 0, this.dVd.length, 0L);
    Arrays.fill(this.gBL, 0, this.gBL.length, 0.0F);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public float gB(long paramLong)
  {
    float f = 0.0F;
    int i = L(paramLong);
    if (i >= 0) {
      f = this.gBL[i];
      aQ(i);
    }
    return f;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof bFH)) {
      return false;
    }
    bFH localbFH = (bFH)paramObject;
    if (localbFH.size() != size()) {
      return false;
    }
    return a(new agV(localbFH));
  }

  public int hashCode() {
    cwn localcwn = new cwn(this, null);
    a(localcwn);
    return localcwn.akt();
  }

  protected void aQ(int paramInt)
  {
    this.gBL[paramInt] = 0.0F;
    super.aQ(paramInt);
  }

  public float[] bsk()
  {
    float[] arrayOfFloat1 = new float[size()];
    float[] arrayOfFloat2 = this.gBL;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfFloat2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfFloat1[(j++)] = arrayOfFloat2[i];
      }
    }
    return arrayOfFloat1;
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

  public boolean bO(float paramFloat)
  {
    byte[] arrayOfByte = this.lpp;
    float[] arrayOfFloat = this.gBL;

    for (int i = arrayOfFloat.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (paramFloat == arrayOfFloat[i])) {
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

  public boolean e(bYD parambYD)
  {
    byte[] arrayOfByte = this.lpp;
    float[] arrayOfFloat = this.gBL;
    for (int i = arrayOfFloat.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!parambYD.bV(arrayOfFloat[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean a(aGD paramaGD)
  {
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong = this.dVd;
    float[] arrayOfFloat = this.gBL;
    for (int i = arrayOfLong.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramaGD.a(arrayOfLong[i], arrayOfFloat[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(aGD paramaGD)
  {
    boolean bool = false;
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong = this.dVd;
    float[] arrayOfFloat = this.gBL;

    bOl();
    try {
      for (i = arrayOfLong.length; i-- > 0; )
        if ((arrayOfByte[i] == 1) && (!paramaGD.a(arrayOfLong[i], arrayOfFloat[i]))) {
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

  public void a(cbE paramcbE)
  {
    byte[] arrayOfByte = this.lpp;
    float[] arrayOfFloat = this.gBL;
    for (int i = arrayOfFloat.length; i-- > 0; )
      if (arrayOfByte[i] == 1)
        arrayOfFloat[i] = paramcbE.bW(arrayOfFloat[i]);
  }

  public boolean et(long paramLong)
  {
    return f(paramLong, 1.0F);
  }

  public boolean f(long paramLong, float paramFloat)
  {
    int i = L(paramLong);
    if (i < 0) {
      return false;
    }
    this.gBL[i] += paramFloat;
    return true;
  }

  public float a(long paramLong, float paramFloat1, float paramFloat2)
  {
    int i = dL(paramLong);
    float f;
    int j;
    if (i < 0) {
      i = -i - 1;
      f = this.gBL[i] += paramFloat1;
      j = 0;
    } else {
      f = this.gBL[i] = paramFloat2;
      j = 1;
    }

    int k = this.lpp[i];
    this.dVd[i] = paramLong;
    this.lpp[i] = 1;

    if (j != 0) {
      fZ(k == 0);
    }

    return f;
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
      float f = paramObjectInput.readFloat();
      d(l, f);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new bHi(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}