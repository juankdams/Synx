import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class rU extends aBN
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final nf aZX = new dyD(this);
  protected transient byte[] aZY;

  public rU()
  {
  }

  public rU(int paramInt)
  {
    super(paramInt);
  }

  public rU(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public rU(bvE parambvE)
  {
    super(parambvE);
  }

  public rU(int paramInt, bvE parambvE)
  {
    super(paramInt, parambvE);
  }

  public rU(int paramInt, float paramFloat, bvE parambvE)
  {
    super(paramInt, paramFloat, parambvE);
  }

  public Object clone()
  {
    rU localrU = (rU)super.clone();
    localrU.aZY = ((byte[])this.aZY.clone());
    return localrU;
  }

  public cQB yt()
  {
    return new cQB(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.aZY = new byte[i];
    return i;
  }

  public byte d(byte paramByte1, byte paramByte2)
  {
    int i = bw(paramByte1);
    return a(paramByte1, paramByte2, i);
  }

  public byte e(byte paramByte1, byte paramByte2)
  {
    int i = bw(paramByte1);
    if (i < 0)
      return this.aZY[(-i - 1)];
    return a(paramByte1, paramByte2, i);
  }

  private byte a(byte paramByte1, byte paramByte2, int paramInt)
  {
    byte b = 0;
    int j = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      b = this.aZY[paramInt];
      j = 0;
    }
    int i = this.lpp[paramInt];
    this.dVU[paramInt] = paramByte1;
    this.lpp[paramInt] = 1;
    this.aZY[paramInt] = paramByte2;
    if (j != 0) {
      fZ(i == 0);
    }

    return b;
  }

  public void a(rU paramrU)
  {
    paramrU.a(this.aZX);
  }

  protected void rehash(int paramInt)
  {
    int i = this.dVU.length;
    byte[] arrayOfByte1 = this.dVU;
    byte[] arrayOfByte2 = this.aZY;
    byte[] arrayOfByte3 = this.lpp;

    this.dVU = new byte[paramInt];
    this.aZY = new byte[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte3[j] == 1) {
        byte b = arrayOfByte1[j];
        int k = bw(b);
        this.dVU[k] = b;
        this.aZY[k] = arrayOfByte2[j];
        this.lpp[k] = 1;
      }
  }

  public byte A(byte paramByte)
  {
    int i = j(paramByte);
    return i < 0 ? 0 : this.aZY[i];
  }

  public void clear()
  {
    super.clear();
    byte[] arrayOfByte1 = this.dVU;
    byte[] arrayOfByte2 = this.aZY;
    byte[] arrayOfByte3 = this.lpp;

    Arrays.fill(this.dVU, 0, this.dVU.length, (byte)0);
    Arrays.fill(this.aZY, 0, this.aZY.length, (byte)0);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public byte B(byte paramByte)
  {
    byte b = 0;
    int i = j(paramByte);
    if (i >= 0) {
      b = this.aZY[i];
      aQ(i);
    }
    return b;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof rU)) {
      return false;
    }
    rU localrU = (rU)paramObject;
    if (localrU.size() != size()) {
      return false;
    }
    return a(new ddY(localrU));
  }

  public int hashCode() {
    aKg localaKg = new aKg(this, null);
    a(localaKg);
    return localaKg.akt();
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

  public boolean D(byte paramByte)
  {
    return contains(paramByte);
  }

  public boolean a(Tp paramTp)
  {
    return c(paramTp);
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

  public boolean a(nf paramnf)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    byte[] arrayOfByte3 = this.aZY;
    for (int i = arrayOfByte2.length; i-- > 0; ) {
      if ((arrayOfByte1[i] == 1) && (!paramnf.c(arrayOfByte2[i], arrayOfByte3[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(nf paramnf)
  {
    boolean bool = false;
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    byte[] arrayOfByte3 = this.aZY;

    bOl();
    try {
      for (i = arrayOfByte2.length; i-- > 0; )
        if ((arrayOfByte1[i] == 1) && (!paramnf.c(arrayOfByte2[i], arrayOfByte3[i]))) {
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

  public boolean E(byte paramByte)
  {
    return f(paramByte, (byte)1);
  }

  public boolean f(byte paramByte1, byte paramByte2)
  {
    int i = j(paramByte1);
    if (i < 0)
      return false;
    int tmp17_16 = i;
    byte[] tmp17_13 = this.aZY; tmp17_13[tmp17_16] = ((byte)(tmp17_13[tmp17_16] + paramByte2));
    return true;
  }

  public byte b(byte paramByte1, byte paramByte2, byte paramByte3)
  {
    int i = bw(paramByte1);
    byte b;
    int j;
    if (i < 0) {
      i = -i - 1;
      int tmp25_23 = i;
      byte[] tmp25_20 = this.aZY; b = tmp25_20[tmp25_23] = (byte)(tmp25_20[tmp25_23] + paramByte2);
      j = 0;
    } else {
      b = this.aZY[i] = paramByte3;
      j = 1;
    }

    int k = this.lpp[i];
    this.dVU[i] = paramByte1;
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
      byte b1 = paramObjectInput.readByte();
      byte b2 = paramObjectInput.readByte();
      d(b1, b2);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new dyA(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}