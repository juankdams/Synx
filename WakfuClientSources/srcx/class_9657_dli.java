import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class dli extends aBq
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final azb liC = new Rc(this);
  protected transient short[] aHP;

  public dli()
  {
  }

  public dli(int paramInt)
  {
    super(paramInt);
  }

  public dli(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public dli(dCx paramdCx)
  {
    super(paramdCx);
  }

  public dli(int paramInt, dCx paramdCx)
  {
    super(paramInt, paramdCx);
  }

  public dli(int paramInt, float paramFloat, dCx paramdCx)
  {
    super(paramInt, paramFloat, paramdCx);
  }

  public Object clone()
  {
    dli localdli = (dli)super.clone();
    localdli.aHP = ((short[])this.aHP.clone());
    return localdli;
  }

  public bnP cTd()
  {
    return new bnP(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.aHP = new short[i];
    return i;
  }

  public short r(long paramLong, short paramShort)
  {
    int i = dL(paramLong);
    return a(paramLong, paramShort, i);
  }

  public short s(long paramLong, short paramShort)
  {
    int i = dL(paramLong);
    if (i < 0)
      return this.aHP[(-i - 1)];
    return a(paramLong, paramShort, i);
  }

  private short a(long paramLong, short paramShort, int paramInt)
  {
    short s = 0;
    int j = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      s = this.aHP[paramInt];
      j = 0;
    }
    int i = this.lpp[paramInt];
    this.dVd[paramInt] = paramLong;
    this.lpp[paramInt] = 1;
    this.aHP[paramInt] = paramShort;
    if (j != 0) {
      fZ(i == 0);
    }

    return s;
  }

  public void a(dli paramdli)
  {
    paramdli.a(this.liC);
  }

  protected void rehash(int paramInt)
  {
    int i = this.dVd.length;
    long[] arrayOfLong = this.dVd;
    short[] arrayOfShort = this.aHP;
    byte[] arrayOfByte = this.lpp;

    this.dVd = new long[paramInt];
    this.aHP = new short[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        long l = arrayOfLong[j];
        int k = dL(l);
        this.dVd[k] = l;
        this.aHP[k] = arrayOfShort[j];
        this.lpp[k] = 1;
      }
  }

  public short jK(long paramLong)
  {
    int i = L(paramLong);
    return i < 0 ? 0 : this.aHP[i];
  }

  public void clear()
  {
    super.clear();
    long[] arrayOfLong = this.dVd;
    short[] arrayOfShort = this.aHP;
    byte[] arrayOfByte = this.lpp;

    Arrays.fill(this.dVd, 0, this.dVd.length, 0L);
    Arrays.fill(this.aHP, 0, this.aHP.length, (short)0);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public short jL(long paramLong)
  {
    short s = 0;
    int i = L(paramLong);
    if (i >= 0) {
      s = this.aHP[i];
      aQ(i);
    }
    return s;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof dli)) {
      return false;
    }
    dli localdli = (dli)paramObject;
    if (localdli.size() != size()) {
      return false;
    }
    return a(new cgC(localdli));
  }

  public int hashCode() {
    cKI localcKI = new cKI(this, null);
    a(localcKI);
    return localcKI.akt();
  }

  protected void aQ(int paramInt)
  {
    this.aHP[paramInt] = 0;
    super.aQ(paramInt);
  }

  public short[] getValues()
  {
    short[] arrayOfShort1 = new short[size()];
    short[] arrayOfShort2 = this.aHP;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfShort2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfShort1[(j++)] = arrayOfShort2[i];
      }
    }
    return arrayOfShort1;
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

  public boolean n(short paramShort)
  {
    byte[] arrayOfByte = this.lpp;
    short[] arrayOfShort = this.aHP;

    for (int i = arrayOfShort.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (paramShort == arrayOfShort[i])) {
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

  public boolean a(dfG paramdfG)
  {
    byte[] arrayOfByte = this.lpp;
    short[] arrayOfShort = this.aHP;
    for (int i = arrayOfShort.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramdfG.bb(arrayOfShort[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean a(azb paramazb)
  {
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong = this.dVd;
    short[] arrayOfShort = this.aHP;
    for (int i = arrayOfLong.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramazb.b(arrayOfLong[i], arrayOfShort[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(azb paramazb)
  {
    boolean bool = false;
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong = this.dVd;
    short[] arrayOfShort = this.aHP;

    bOl();
    try {
      for (i = arrayOfLong.length; i-- > 0; )
        if ((arrayOfByte[i] == 1) && (!paramazb.b(arrayOfLong[i], arrayOfShort[i]))) {
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

  public void a(dGq paramdGq)
  {
    byte[] arrayOfByte = this.lpp;
    short[] arrayOfShort = this.aHP;
    for (int i = arrayOfShort.length; i-- > 0; )
      if (arrayOfByte[i] == 1)
        arrayOfShort[i] = paramdGq.eF(arrayOfShort[i]);
  }

  public boolean et(long paramLong)
  {
    return t(paramLong, (short)1);
  }

  public boolean t(long paramLong, short paramShort)
  {
    int i = L(paramLong);
    if (i < 0)
      return false;
    int tmp20_18 = i;
    short[] tmp20_15 = this.aHP; tmp20_15[tmp20_18] = ((short)(tmp20_15[tmp20_18] + paramShort));
    return true;
  }

  public short b(long paramLong, short paramShort1, short paramShort2)
  {
    int i = dL(paramLong);
    short s;
    int j;
    if (i < 0) {
      i = -i - 1;
      int tmp25_23 = i;
      short[] tmp25_20 = this.aHP; s = tmp25_20[tmp25_23] = (short)(tmp25_20[tmp25_23] + paramShort1);
      j = 0;
    } else {
      s = this.aHP[i] = paramShort2;
      j = 1;
    }

    int k = this.lpp[i];
    this.dVd[i] = paramLong;
    this.lpp[i] = 1;

    if (j != 0) {
      fZ(k == 0);
    }

    return s;
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
      short s = paramObjectInput.readShort();
      r(l, s);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new QD(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}