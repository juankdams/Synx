import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class cLO extends aBN
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final cSv iLg = new bDB(this);
  protected transient float[] gBL;

  public cLO()
  {
  }

  public cLO(int paramInt)
  {
    super(paramInt);
  }

  public cLO(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public cLO(bvE parambvE)
  {
    super(parambvE);
  }

  public cLO(int paramInt, bvE parambvE)
  {
    super(paramInt, parambvE);
  }

  public cLO(int paramInt, float paramFloat, bvE parambvE)
  {
    super(paramInt, paramFloat, parambvE);
  }

  public Object clone()
  {
    cLO localcLO = (cLO)super.clone();
    localcLO.gBL = ((float[])this.gBL.clone());
    return localcLO;
  }

  public dtp cEN()
  {
    return new dtp(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.gBL = new float[i];
    return i;
  }

  public float b(byte paramByte, float paramFloat)
  {
    int i = bw(paramByte);
    return a(paramByte, paramFloat, i);
  }

  public float c(byte paramByte, float paramFloat)
  {
    int i = bw(paramByte);
    if (i < 0)
      return this.gBL[(-i - 1)];
    return a(paramByte, paramFloat, i);
  }

  private float a(byte paramByte, float paramFloat, int paramInt)
  {
    float f = 0.0F;
    int j = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      f = this.gBL[paramInt];
      j = 0;
    }
    int i = this.lpp[paramInt];
    this.dVU[paramInt] = paramByte;
    this.lpp[paramInt] = 1;
    this.gBL[paramInt] = paramFloat;
    if (j != 0) {
      fZ(i == 0);
    }

    return f;
  }

  public void b(cLO paramcLO)
  {
    paramcLO.a(this.iLg);
  }

  protected void rehash(int paramInt)
  {
    int i = this.dVU.length;
    byte[] arrayOfByte1 = this.dVU;
    float[] arrayOfFloat = this.gBL;
    byte[] arrayOfByte2 = this.lpp;

    this.dVU = new byte[paramInt];
    this.gBL = new float[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte2[j] == 1) {
        byte b = arrayOfByte1[j];
        int k = bw(b);
        this.dVU[k] = b;
        this.gBL[k] = arrayOfFloat[j];
        this.lpp[k] = 1;
      }
  }

  public float ew(byte paramByte)
  {
    int i = j(paramByte);
    return i < 0 ? 0.0F : this.gBL[i];
  }

  public void clear()
  {
    super.clear();
    byte[] arrayOfByte1 = this.dVU;
    float[] arrayOfFloat = this.gBL;
    byte[] arrayOfByte2 = this.lpp;

    Arrays.fill(this.dVU, 0, this.dVU.length, (byte)0);
    Arrays.fill(this.gBL, 0, this.gBL.length, 0.0F);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public float ex(byte paramByte)
  {
    float f = 0.0F;
    int i = j(paramByte);
    if (i >= 0) {
      f = this.gBL[i];
      aQ(i);
    }
    return f;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof cLO)) {
      return false;
    }
    cLO localcLO = (cLO)paramObject;
    if (localcLO.size() != size()) {
      return false;
    }
    return a(new dMw(localcLO));
  }

  public int hashCode() {
    cgx localcgx = new cgx(this, null);
    a(localcgx);
    return localcgx.akt();
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

  public boolean D(byte paramByte)
  {
    return contains(paramByte);
  }

  public boolean a(Tp paramTp)
  {
    return c(paramTp);
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

  public boolean a(cSv paramcSv)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    float[] arrayOfFloat = this.gBL;
    for (int i = arrayOfByte2.length; i-- > 0; ) {
      if ((arrayOfByte1[i] == 1) && (!paramcSv.a(arrayOfByte2[i], arrayOfFloat[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(cSv paramcSv)
  {
    boolean bool = false;
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    float[] arrayOfFloat = this.gBL;

    bOl();
    try {
      for (i = arrayOfByte2.length; i-- > 0; )
        if ((arrayOfByte1[i] == 1) && (!paramcSv.a(arrayOfByte2[i], arrayOfFloat[i]))) {
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

  public boolean E(byte paramByte)
  {
    return d(paramByte, 1.0F);
  }

  public boolean d(byte paramByte, float paramFloat)
  {
    int i = j(paramByte);
    if (i < 0) {
      return false;
    }
    this.gBL[i] += paramFloat;
    return true;
  }

  public float a(byte paramByte, float paramFloat1, float paramFloat2)
  {
    int i = bw(paramByte);
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
    this.dVU[i] = paramByte;
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
      byte b = paramObjectInput.readByte();
      float f = paramObjectInput.readFloat();
      b(b, f);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new bDw(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}