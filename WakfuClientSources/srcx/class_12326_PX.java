import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class PX extends aBN
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final aZf cov = new aqo(this);
  protected transient int[] bXB;

  public PX()
  {
  }

  public PX(int paramInt)
  {
    super(paramInt);
  }

  public PX(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public PX(bvE parambvE)
  {
    super(parambvE);
  }

  public PX(int paramInt, bvE parambvE)
  {
    super(paramInt, parambvE);
  }

  public PX(int paramInt, float paramFloat, bvE parambvE)
  {
    super(paramInt, paramFloat, parambvE);
  }

  public Object clone()
  {
    PX localPX = (PX)super.clone();
    localPX.bXB = ((int[])this.bXB.clone());
    return localPX;
  }

  public jR abM()
  {
    return new jR(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.bXB = new int[i];
    return i;
  }

  public int c(byte paramByte, int paramInt)
  {
    int i = bw(paramByte);
    return a(paramByte, paramInt, i);
  }

  public int d(byte paramByte, int paramInt)
  {
    int i = bw(paramByte);
    if (i < 0)
      return this.bXB[(-i - 1)];
    return a(paramByte, paramInt, i);
  }

  private int a(byte paramByte, int paramInt1, int paramInt2)
  {
    int j = 0;
    int k = 1;
    if (paramInt2 < 0) {
      paramInt2 = -paramInt2 - 1;
      j = this.bXB[paramInt2];
      k = 0;
    }
    int i = this.lpp[paramInt2];
    this.dVU[paramInt2] = paramByte;
    this.lpp[paramInt2] = 1;
    this.bXB[paramInt2] = paramInt1;
    if (k != 0) {
      fZ(i == 0);
    }

    return j;
  }

  public void a(PX paramPX)
  {
    paramPX.a(this.cov);
  }

  protected void rehash(int paramInt)
  {
    int i = this.dVU.length;
    byte[] arrayOfByte1 = this.dVU;
    int[] arrayOfInt = this.bXB;
    byte[] arrayOfByte2 = this.lpp;

    this.dVU = new byte[paramInt];
    this.bXB = new int[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte2[j] == 1) {
        byte b = arrayOfByte1[j];
        int k = bw(b);
        this.dVU[k] = b;
        this.bXB[k] = arrayOfInt[j];
        this.lpp[k] = 1;
      }
  }

  public int ap(byte paramByte)
  {
    int i = j(paramByte);
    return i < 0 ? 0 : this.bXB[i];
  }

  public void clear()
  {
    super.clear();
    byte[] arrayOfByte1 = this.dVU;
    int[] arrayOfInt = this.bXB;
    byte[] arrayOfByte2 = this.lpp;

    Arrays.fill(this.dVU, 0, this.dVU.length, (byte)0);
    Arrays.fill(this.bXB, 0, this.bXB.length, 0);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public int aq(byte paramByte)
  {
    int i = 0;
    int j = j(paramByte);
    if (j >= 0) {
      i = this.bXB[j];
      aQ(j);
    }
    return i;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof PX)) {
      return false;
    }
    PX localPX = (PX)paramObject;
    if (localPX.size() != size()) {
      return false;
    }
    return a(new amU(localPX));
  }

  public int hashCode() {
    clk localclk = new clk(this, null);
    a(localclk);
    return localclk.akt();
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

  public boolean D(byte paramByte)
  {
    return contains(paramByte);
  }

  public boolean a(Tp paramTp)
  {
    return c(paramTp);
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

  public boolean a(aZf paramaZf)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    int[] arrayOfInt = this.bXB;
    for (int i = arrayOfByte2.length; i-- > 0; ) {
      if ((arrayOfByte1[i] == 1) && (!paramaZf.g(arrayOfByte2[i], arrayOfInt[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(aZf paramaZf)
  {
    boolean bool = false;
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    int[] arrayOfInt = this.bXB;

    bOl();
    try {
      for (i = arrayOfByte2.length; i-- > 0; )
        if ((arrayOfByte1[i] == 1) && (!paramaZf.g(arrayOfByte2[i], arrayOfInt[i]))) {
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

  public boolean E(byte paramByte)
  {
    return e(paramByte, 1);
  }

  public boolean e(byte paramByte, int paramInt)
  {
    int i = j(paramByte);
    if (i < 0) {
      return false;
    }
    this.bXB[i] += paramInt;
    return true;
  }

  public int b(byte paramByte, int paramInt1, int paramInt2)
  {
    int i = bw(paramByte);
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
    this.dVU[i] = paramByte;
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
      byte b = paramObjectInput.readByte();
      int j = paramObjectInput.readInt();
      c(b, j);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new aqq(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}