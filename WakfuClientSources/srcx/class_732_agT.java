import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class agT extends dai
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final ok daQ = new eT(this);
  protected transient short[] aHP;

  public agT()
  {
  }

  public agT(int paramInt)
  {
    super(paramInt);
  }

  public agT(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public agT(dnH paramdnH)
  {
    super(paramdnH);
  }

  public agT(int paramInt, dnH paramdnH)
  {
    super(paramInt, paramdnH);
  }

  public agT(int paramInt, float paramFloat, dnH paramdnH)
  {
    super(paramInt, paramFloat, paramdnH);
  }

  public Object clone()
  {
    agT localagT = (agT)super.clone();
    localagT.aHP = ((short[])this.aHP.clone());
    return localagT;
  }

  public auO ast()
  {
    return new auO(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.aHP = new short[i];
    return i;
  }

  public short m(short paramShort1, short paramShort2)
  {
    int i = dV(paramShort1);
    return a(paramShort1, paramShort2, i);
  }

  public short n(short paramShort1, short paramShort2)
  {
    int i = dV(paramShort1);
    if (i < 0)
      return this.aHP[(-i - 1)];
    return a(paramShort1, paramShort2, i);
  }

  private short a(short paramShort1, short paramShort2, int paramInt)
  {
    short s = 0;
    int j = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      s = this.aHP[paramInt];
      j = 0;
    }
    int i = this.lpp[paramInt];
    this.kOY[paramInt] = paramShort1;
    this.lpp[paramInt] = 1;
    this.aHP[paramInt] = paramShort2;
    if (j != 0) {
      fZ(i == 0);
    }

    return s;
  }

  public void a(agT paramagT)
  {
    paramagT.a(this.daQ);
  }

  protected void rehash(int paramInt)
  {
    int i = this.kOY.length;
    short[] arrayOfShort1 = this.kOY;
    short[] arrayOfShort2 = this.aHP;
    byte[] arrayOfByte = this.lpp;

    this.kOY = new short[paramInt];
    this.aHP = new short[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        short s = arrayOfShort1[j];
        int k = dV(s);
        this.kOY[k] = s;
        this.aHP[k] = arrayOfShort2[j];
        this.lpp[k] = 1;
      }
  }

  public short au(short paramShort)
  {
    int i = dU(paramShort);
    return i < 0 ? 0 : this.aHP[i];
  }

  public void clear()
  {
    super.clear();
    short[] arrayOfShort1 = this.kOY;
    short[] arrayOfShort2 = this.aHP;
    byte[] arrayOfByte = this.lpp;

    Arrays.fill(this.kOY, 0, this.kOY.length, (short)0);
    Arrays.fill(this.aHP, 0, this.aHP.length, (short)0);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public short av(short paramShort)
  {
    short s = 0;
    int i = dU(paramShort);
    if (i >= 0) {
      s = this.aHP[i];
      aQ(i);
    }
    return s;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof agT)) {
      return false;
    }
    agT localagT = (agT)paramObject;
    if (localagT.size() != size()) {
      return false;
    }
    return a(new mL(localagT));
  }

  public int hashCode() {
    bEn localbEn = new bEn(this, null);
    a(localbEn);
    return localbEn.akt();
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

  public short[] Vq()
  {
    short[] arrayOfShort1 = new short[size()];
    short[] arrayOfShort2 = this.kOY;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfShort2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfShort1[(j++)] = arrayOfShort2[i];
      }
    }
    return arrayOfShort1;
  }

  public short[] b(short[] paramArrayOfShort)
  {
    int i = size();
    if (paramArrayOfShort.length < i) {
      paramArrayOfShort = (short[])Array.newInstance(paramArrayOfShort.getClass().getComponentType(), i);
    }

    short[] arrayOfShort = (short[])this.kOY;
    byte[] arrayOfByte = this.lpp;

    int j = arrayOfShort.length; for (int k = 0; j-- > 0; ) {
      if (arrayOfByte[j] == 1) {
        paramArrayOfShort[(k++)] = arrayOfShort[j];
      }
    }
    return paramArrayOfShort;
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

  public boolean N(short paramShort)
  {
    return contains(paramShort);
  }

  public boolean b(dfG paramdfG)
  {
    return c(paramdfG);
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

  public boolean a(ok paramok)
  {
    byte[] arrayOfByte = this.lpp;
    short[] arrayOfShort1 = this.kOY;
    short[] arrayOfShort2 = this.aHP;
    for (int i = arrayOfShort1.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramok.c(arrayOfShort1[i], arrayOfShort2[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(ok paramok)
  {
    boolean bool = false;
    byte[] arrayOfByte = this.lpp;
    short[] arrayOfShort1 = this.kOY;
    short[] arrayOfShort2 = this.aHP;

    bOl();
    try {
      for (i = arrayOfShort1.length; i-- > 0; )
        if ((arrayOfByte[i] == 1) && (!paramok.c(arrayOfShort1[i], arrayOfShort2[i]))) {
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

  public boolean O(short paramShort)
  {
    return o(paramShort, (short)1);
  }

  public boolean o(short paramShort1, short paramShort2)
  {
    int i = dU(paramShort1);
    if (i < 0)
      return false;
    int tmp17_16 = i;
    short[] tmp17_13 = this.aHP; tmp17_13[tmp17_16] = ((short)(tmp17_13[tmp17_16] + paramShort2));
    return true;
  }

  public short c(short paramShort1, short paramShort2, short paramShort3)
  {
    int i = dV(paramShort1);
    short s;
    int j;
    if (i < 0) {
      i = -i - 1;
      int tmp25_23 = i;
      short[] tmp25_20 = this.aHP; s = tmp25_20[tmp25_23] = (short)(tmp25_20[tmp25_23] + paramShort2);
      j = 0;
    } else {
      s = this.aHP[i] = paramShort3;
      j = 1;
    }

    int k = this.lpp[i];
    this.kOY[i] = paramShort1;
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
      short s1 = paramObjectInput.readShort();
      short s2 = paramObjectInput.readShort();
      m(s1, s2);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new eW(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}