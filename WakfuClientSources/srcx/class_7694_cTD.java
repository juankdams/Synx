import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class cTD extends dVg
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final dVV kGd = new cgo(this);
  protected transient float[] gBL;

  public cTD()
  {
  }

  public cTD(int paramInt)
  {
    super(paramInt);
  }

  public cTD(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public cTD(aSO paramaSO)
  {
    super(paramaSO);
  }

  public cTD(int paramInt, aSO paramaSO)
  {
    super(paramInt, paramaSO);
  }

  public cTD(int paramInt, float paramFloat, aSO paramaSO)
  {
    super(paramInt, paramFloat, paramaSO);
  }

  public Object clone()
  {
    cTD localcTD = (cTD)super.clone();
    localcTD.gBL = ((float[])this.gBL.clone());
    return localcTD;
  }

  public sM cJd()
  {
    return new sM(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.gBL = new float[i];
    return i;
  }

  public float m(int paramInt, float paramFloat)
  {
    int i = Ej(paramInt);
    return b(paramInt, paramFloat, i);
  }

  public float n(int paramInt, float paramFloat)
  {
    int i = Ej(paramInt);
    if (i < 0)
      return this.gBL[(-i - 1)];
    return b(paramInt, paramFloat, i);
  }

  private float b(int paramInt1, float paramFloat, int paramInt2)
  {
    float f = 0.0F;
    int j = 1;
    if (paramInt2 < 0) {
      paramInt2 = -paramInt2 - 1;
      f = this.gBL[paramInt2];
      j = 0;
    }
    int i = this.lpp[paramInt2];
    this.mtW[paramInt2] = paramInt1;
    this.lpp[paramInt2] = 1;
    this.gBL[paramInt2] = paramFloat;
    if (j != 0) {
      fZ(i == 0);
    }

    return f;
  }

  public void a(cTD paramcTD)
  {
    paramcTD.a(this.kGd);
  }

  protected void rehash(int paramInt)
  {
    int i = this.mtW.length;
    int[] arrayOfInt = this.mtW;
    float[] arrayOfFloat = this.gBL;
    byte[] arrayOfByte = this.lpp;

    this.mtW = new int[paramInt];
    this.gBL = new float[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        int k = arrayOfInt[j];
        int m = Ej(k);
        this.mtW[m] = k;
        this.gBL[m] = arrayOfFloat[j];
        this.lpp[m] = 1;
      }
  }

  public float get(int paramInt)
  {
    int i = uK(paramInt);
    return i < 0 ? 0.0F : this.gBL[i];
  }

  public void clear()
  {
    super.clear();
    int[] arrayOfInt = this.mtW;
    float[] arrayOfFloat = this.gBL;
    byte[] arrayOfByte = this.lpp;

    Arrays.fill(this.mtW, 0, this.mtW.length, 0);
    Arrays.fill(this.gBL, 0, this.gBL.length, 0.0F);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public float bh(int paramInt)
  {
    float f = 0.0F;
    int i = uK(paramInt);
    if (i >= 0) {
      f = this.gBL[i];
      aQ(i);
    }
    return f;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof cTD)) {
      return false;
    }
    cTD localcTD = (cTD)paramObject;
    if (localcTD.size() != size()) {
      return false;
    }
    return a(new bef(localcTD));
  }

  public int hashCode() {
    cfU localcfU = new cfU(this, null);
    a(localcfU);
    return localcfU.akt();
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

  public boolean containsKey(int paramInt)
  {
    return contains(paramInt);
  }

  public boolean a(cIw paramcIw)
  {
    return g(paramcIw);
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

  public boolean a(dVV paramdVV)
  {
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.mtW;
    float[] arrayOfFloat = this.gBL;
    for (int i = arrayOfInt.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramdVV.h(arrayOfInt[i], arrayOfFloat[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(dVV paramdVV)
  {
    boolean bool = false;
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.mtW;
    float[] arrayOfFloat = this.gBL;

    bOl();
    try {
      for (i = arrayOfInt.length; i-- > 0; )
        if ((arrayOfByte[i] == 1) && (!paramdVV.h(arrayOfInt[i], arrayOfFloat[i]))) {
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

  public boolean aR(int paramInt)
  {
    return o(paramInt, 1.0F);
  }

  public boolean o(int paramInt, float paramFloat)
  {
    int i = uK(paramInt);
    if (i < 0) {
      return false;
    }
    this.gBL[i] += paramFloat;
    return true;
  }

  public float e(int paramInt, float paramFloat1, float paramFloat2)
  {
    int i = Ej(paramInt);
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
    this.mtW[i] = paramInt;
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
      int j = paramObjectInput.readInt();
      float f = paramObjectInput.readFloat();
      m(j, f);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new cgn(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}