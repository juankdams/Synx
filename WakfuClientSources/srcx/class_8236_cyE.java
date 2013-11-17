import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class cyE extends aBN
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final diA inb = new aas(this);
  protected transient short[] aHP;

  public cyE()
  {
  }

  public cyE(int paramInt)
  {
    super(paramInt);
  }

  public cyE(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public cyE(bvE parambvE)
  {
    super(parambvE);
  }

  public cyE(int paramInt, bvE parambvE)
  {
    super(paramInt, parambvE);
  }

  public cyE(int paramInt, float paramFloat, bvE parambvE)
  {
    super(paramInt, paramFloat, parambvE);
  }

  public Object clone()
  {
    cyE localcyE = (cyE)super.clone();
    localcyE.aHP = ((short[])this.aHP.clone());
    return localcyE;
  }

  public aNm cvC()
  {
    return new aNm(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.aHP = new short[i];
    return i;
  }

  public short c(byte paramByte, short paramShort)
  {
    int i = bw(paramByte);
    return a(paramByte, paramShort, i);
  }

  public short d(byte paramByte, short paramShort)
  {
    int i = bw(paramByte);
    if (i < 0)
      return this.aHP[(-i - 1)];
    return a(paramByte, paramShort, i);
  }

  private short a(byte paramByte, short paramShort, int paramInt)
  {
    short s = 0;
    int j = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      s = this.aHP[paramInt];
      j = 0;
    }
    int i = this.lpp[paramInt];
    this.dVU[paramInt] = paramByte;
    this.lpp[paramInt] = 1;
    this.aHP[paramInt] = paramShort;
    if (j != 0) {
      fZ(i == 0);
    }

    return s;
  }

  public void a(cyE paramcyE)
  {
    paramcyE.a(this.inb);
  }

  protected void rehash(int paramInt)
  {
    int i = this.dVU.length;
    byte[] arrayOfByte1 = this.dVU;
    short[] arrayOfShort = this.aHP;
    byte[] arrayOfByte2 = this.lpp;

    this.dVU = new byte[paramInt];
    this.aHP = new short[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte2[j] == 1) {
        byte b = arrayOfByte1[j];
        int k = bw(b);
        this.dVU[k] = b;
        this.aHP[k] = arrayOfShort[j];
        this.lpp[k] = 1;
      }
  }

  public short ea(byte paramByte)
  {
    int i = j(paramByte);
    return i < 0 ? 0 : this.aHP[i];
  }

  public void clear()
  {
    super.clear();
    byte[] arrayOfByte1 = this.dVU;
    short[] arrayOfShort = this.aHP;
    byte[] arrayOfByte2 = this.lpp;

    Arrays.fill(this.dVU, 0, this.dVU.length, (byte)0);
    Arrays.fill(this.aHP, 0, this.aHP.length, (short)0);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public short eb(byte paramByte)
  {
    short s = 0;
    int i = j(paramByte);
    if (i >= 0) {
      s = this.aHP[i];
      aQ(i);
    }
    return s;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof cyE)) {
      return false;
    }
    cyE localcyE = (cyE)paramObject;
    if (localcyE.size() != size()) {
      return false;
    }
    return a(new Il(localcyE));
  }

  public int hashCode() {
    cON localcON = new cON(this, null);
    a(localcON);
    return localcON.akt();
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

  public boolean D(byte paramByte)
  {
    return contains(paramByte);
  }

  public boolean a(Tp paramTp)
  {
    return c(paramTp);
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

  public boolean a(diA paramdiA)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    short[] arrayOfShort = this.aHP;
    for (int i = arrayOfByte2.length; i-- > 0; ) {
      if ((arrayOfByte1[i] == 1) && (!paramdiA.a(arrayOfByte2[i], arrayOfShort[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(diA paramdiA)
  {
    boolean bool = false;
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    short[] arrayOfShort = this.aHP;

    bOl();
    try {
      for (i = arrayOfByte2.length; i-- > 0; )
        if ((arrayOfByte1[i] == 1) && (!paramdiA.a(arrayOfByte2[i], arrayOfShort[i]))) {
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

  public boolean E(byte paramByte)
  {
    return e(paramByte, (short)1);
  }

  public boolean e(byte paramByte, short paramShort)
  {
    int i = j(paramByte);
    if (i < 0)
      return false;
    int tmp17_16 = i;
    short[] tmp17_13 = this.aHP; tmp17_13[tmp17_16] = ((short)(tmp17_13[tmp17_16] + paramShort));
    return true;
  }

  public short a(byte paramByte, short paramShort1, short paramShort2)
  {
    int i = bw(paramByte);
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
    this.dVU[i] = paramByte;
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
      byte b = paramObjectInput.readByte();
      short s = paramObjectInput.readShort();
      c(b, s);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new aau(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}