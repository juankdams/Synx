import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class il extends dVg
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final aGQ aHO = new aBF(this);
  protected transient short[] aHP;

  public il()
  {
  }

  public il(int paramInt)
  {
    super(paramInt);
  }

  public il(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public il(aSO paramaSO)
  {
    super(paramaSO);
  }

  public il(int paramInt, aSO paramaSO)
  {
    super(paramInt, paramaSO);
  }

  public il(int paramInt, float paramFloat, aSO paramaSO)
  {
    super(paramInt, paramFloat, paramaSO);
  }

  public Object clone()
  {
    il localil = (il)super.clone();
    localil.aHP = ((short[])this.aHP.clone());
    return localil;
  }

  public BZ qd()
  {
    return new BZ(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.aHP = new short[i];
    return i;
  }

  public short a(int paramInt, short paramShort)
  {
    int i = Ej(paramInt);
    return a(paramInt, paramShort, i);
  }

  public short b(int paramInt, short paramShort)
  {
    int i = Ej(paramInt);
    if (i < 0)
      return this.aHP[(-i - 1)];
    return a(paramInt, paramShort, i);
  }

  private short a(int paramInt1, short paramShort, int paramInt2)
  {
    short s = 0;
    int j = 1;
    if (paramInt2 < 0) {
      paramInt2 = -paramInt2 - 1;
      s = this.aHP[paramInt2];
      j = 0;
    }
    int i = this.lpp[paramInt2];
    this.mtW[paramInt2] = paramInt1;
    this.lpp[paramInt2] = 1;
    this.aHP[paramInt2] = paramShort;
    if (j != 0) {
      fZ(i == 0);
    }

    return s;
  }

  public void a(il paramil)
  {
    paramil.a(this.aHO);
  }

  protected void rehash(int paramInt)
  {
    int i = this.mtW.length;
    int[] arrayOfInt = this.mtW;
    short[] arrayOfShort = this.aHP;
    byte[] arrayOfByte = this.lpp;

    this.mtW = new int[paramInt];
    this.aHP = new short[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        int k = arrayOfInt[j];
        int m = Ej(k);
        this.mtW[m] = k;
        this.aHP[m] = arrayOfShort[j];
        this.lpp[m] = 1;
      }
  }

  public short get(int paramInt)
  {
    int i = uK(paramInt);
    return i < 0 ? 0 : this.aHP[i];
  }

  public void clear()
  {
    super.clear();
    int[] arrayOfInt = this.mtW;
    short[] arrayOfShort = this.aHP;
    byte[] arrayOfByte = this.lpp;

    Arrays.fill(this.mtW, 0, this.mtW.length, 0);
    Arrays.fill(this.aHP, 0, this.aHP.length, (short)0);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public short aP(int paramInt)
  {
    short s = 0;
    int i = uK(paramInt);
    if (i >= 0) {
      s = this.aHP[i];
      aQ(i);
    }
    return s;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof il)) {
      return false;
    }
    il localil = (il)paramObject;
    if (localil.size() != size()) {
      return false;
    }
    return a(new Jn(localil));
  }

  public int hashCode() {
    cfO localcfO = new cfO(this, null);
    a(localcfO);
    return localcfO.akt();
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

  public boolean containsKey(int paramInt)
  {
    return contains(paramInt);
  }

  public boolean a(cIw paramcIw)
  {
    return g(paramcIw);
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

  public boolean a(aGQ paramaGQ)
  {
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.mtW;
    short[] arrayOfShort = this.aHP;
    for (int i = arrayOfInt.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramaGQ.k(arrayOfInt[i], arrayOfShort[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(aGQ paramaGQ)
  {
    boolean bool = false;
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.mtW;
    short[] arrayOfShort = this.aHP;

    bOl();
    try {
      for (i = arrayOfInt.length; i-- > 0; )
        if ((arrayOfByte[i] == 1) && (!paramaGQ.k(arrayOfInt[i], arrayOfShort[i]))) {
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

  public boolean aR(int paramInt)
  {
    return c(paramInt, (short)1);
  }

  public boolean c(int paramInt, short paramShort)
  {
    int i = uK(paramInt);
    if (i < 0)
      return false;
    int tmp17_16 = i;
    short[] tmp17_13 = this.aHP; tmp17_13[tmp17_16] = ((short)(tmp17_13[tmp17_16] + paramShort));
    return true;
  }

  public short a(int paramInt, short paramShort1, short paramShort2)
  {
    int i = Ej(paramInt);
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
    this.mtW[i] = paramInt;
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
      int j = paramObjectInput.readInt();
      short s = paramObjectInput.readShort();
      a(j, s);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new aBE(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}