import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class KR extends dai
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final aAI bXA = new dKX(this);
  protected transient int[] bXB;

  public KR()
  {
  }

  public KR(int paramInt)
  {
    super(paramInt);
  }

  public KR(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public KR(dnH paramdnH)
  {
    super(paramdnH);
  }

  public KR(int paramInt, dnH paramdnH)
  {
    super(paramInt, paramdnH);
  }

  public KR(int paramInt, float paramFloat, dnH paramdnH)
  {
    super(paramInt, paramFloat, paramdnH);
  }

  public Object clone()
  {
    KR localKR = (KR)super.clone();
    localKR.bXB = ((int[])this.bXB.clone());
    return localKR;
  }

  public dyO Vo()
  {
    return new dyO(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.bXB = new int[i];
    return i;
  }

  public int a(short paramShort, int paramInt)
  {
    int i = dV(paramShort);
    return a(paramShort, paramInt, i);
  }

  public int b(short paramShort, int paramInt)
  {
    int i = dV(paramShort);
    if (i < 0)
      return this.bXB[(-i - 1)];
    return a(paramShort, paramInt, i);
  }

  private int a(short paramShort, int paramInt1, int paramInt2)
  {
    int j = 0;
    int k = 1;
    if (paramInt2 < 0) {
      paramInt2 = -paramInt2 - 1;
      j = this.bXB[paramInt2];
      k = 0;
    }
    int i = this.lpp[paramInt2];
    this.kOY[paramInt2] = paramShort;
    this.lpp[paramInt2] = 1;
    this.bXB[paramInt2] = paramInt1;
    if (k != 0) {
      fZ(i == 0);
    }

    return j;
  }

  public void a(KR paramKR)
  {
    paramKR.a(this.bXA);
  }

  protected void rehash(int paramInt)
  {
    int i = this.kOY.length;
    short[] arrayOfShort = this.kOY;
    int[] arrayOfInt = this.bXB;
    byte[] arrayOfByte = this.lpp;

    this.kOY = new short[paramInt];
    this.bXB = new int[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        short s = arrayOfShort[j];
        int k = dV(s);
        this.kOY[k] = s;
        this.bXB[k] = arrayOfInt[j];
        this.lpp[k] = 1;
      }
  }

  public int L(short paramShort)
  {
    int i = dU(paramShort);
    return i < 0 ? 0 : this.bXB[i];
  }

  public void clear()
  {
    super.clear();
    short[] arrayOfShort = this.kOY;
    int[] arrayOfInt = this.bXB;
    byte[] arrayOfByte = this.lpp;

    Arrays.fill(this.kOY, 0, this.kOY.length, (short)0);
    Arrays.fill(this.bXB, 0, this.bXB.length, 0);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public int M(short paramShort)
  {
    int i = 0;
    int j = dU(paramShort);
    if (j >= 0) {
      i = this.bXB[j];
      aQ(j);
    }
    return i;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof KR)) {
      return false;
    }
    KR localKR = (KR)paramObject;
    if (localKR.size() != size()) {
      return false;
    }
    return a(new aQz(localKR));
  }

  public int hashCode() {
    cLF localcLF = new cLF(this, null);
    a(localcLF);
    return localcLF.akt();
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

  public boolean N(short paramShort)
  {
    return contains(paramShort);
  }

  public boolean b(dfG paramdfG)
  {
    return c(paramdfG);
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

  public boolean a(aAI paramaAI)
  {
    byte[] arrayOfByte = this.lpp;
    short[] arrayOfShort = this.kOY;
    int[] arrayOfInt = this.bXB;
    for (int i = arrayOfShort.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramaAI.f(arrayOfShort[i], arrayOfInt[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(aAI paramaAI)
  {
    boolean bool = false;
    byte[] arrayOfByte = this.lpp;
    short[] arrayOfShort = this.kOY;
    int[] arrayOfInt = this.bXB;

    bOl();
    try {
      for (i = arrayOfShort.length; i-- > 0; )
        if ((arrayOfByte[i] == 1) && (!paramaAI.f(arrayOfShort[i], arrayOfInt[i]))) {
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

  public boolean O(short paramShort)
  {
    return c(paramShort, 1);
  }

  public boolean c(short paramShort, int paramInt)
  {
    int i = dU(paramShort);
    if (i < 0) {
      return false;
    }
    this.bXB[i] += paramInt;
    return true;
  }

  public int b(short paramShort, int paramInt1, int paramInt2)
  {
    int i = dV(paramShort);
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
    this.kOY[i] = paramShort;
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
      short s = paramObjectInput.readShort();
      int j = paramObjectInput.readInt();
      a(s, j);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new dKZ(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}