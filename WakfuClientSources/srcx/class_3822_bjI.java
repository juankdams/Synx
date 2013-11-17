import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class bjI extends dVg
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final dgE fAg = new aGz(this);
  protected transient byte[] aZY;

  public bjI()
  {
  }

  public bjI(int paramInt)
  {
    super(paramInt);
  }

  public bjI(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public bjI(aSO paramaSO)
  {
    super(paramaSO);
  }

  public bjI(int paramInt, aSO paramaSO)
  {
    super(paramInt, paramaSO);
  }

  public bjI(int paramInt, float paramFloat, aSO paramaSO)
  {
    super(paramInt, paramFloat, paramaSO);
  }

  public Object clone()
  {
    bjI localbjI = (bjI)super.clone();
    localbjI.aZY = ((byte[])this.aZY.clone());
    return localbjI;
  }

  public bjJ buW()
  {
    return new bjJ(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.aZY = new byte[i];
    return i;
  }

  public byte o(int paramInt, byte paramByte)
  {
    int i = Ej(paramInt);
    return a(paramInt, paramByte, i);
  }

  public byte p(int paramInt, byte paramByte)
  {
    int i = Ej(paramInt);
    if (i < 0)
      return this.aZY[(-i - 1)];
    return a(paramInt, paramByte, i);
  }

  private byte a(int paramInt1, byte paramByte, int paramInt2)
  {
    byte b = 0;
    int j = 1;
    if (paramInt2 < 0) {
      paramInt2 = -paramInt2 - 1;
      b = this.aZY[paramInt2];
      j = 0;
    }
    int i = this.lpp[paramInt2];
    this.mtW[paramInt2] = paramInt1;
    this.lpp[paramInt2] = 1;
    this.aZY[paramInt2] = paramByte;
    if (j != 0) {
      fZ(i == 0);
    }

    return b;
  }

  public void a(bjI parambjI)
  {
    parambjI.a(this.fAg);
  }

  protected void rehash(int paramInt)
  {
    int i = this.mtW.length;
    int[] arrayOfInt = this.mtW;
    byte[] arrayOfByte1 = this.aZY;
    byte[] arrayOfByte2 = this.lpp;

    this.mtW = new int[paramInt];
    this.aZY = new byte[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte2[j] == 1) {
        int k = arrayOfInt[j];
        int m = Ej(k);
        this.mtW[m] = k;
        this.aZY[m] = arrayOfByte1[j];
        this.lpp[m] = 1;
      }
  }

  public byte get(int paramInt)
  {
    int i = uK(paramInt);
    return i < 0 ? 0 : this.aZY[i];
  }

  public void clear()
  {
    super.clear();
    int[] arrayOfInt = this.mtW;
    byte[] arrayOfByte1 = this.aZY;
    byte[] arrayOfByte2 = this.lpp;

    Arrays.fill(this.mtW, 0, this.mtW.length, 0);
    Arrays.fill(this.aZY, 0, this.aZY.length, (byte)0);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public byte pV(int paramInt)
  {
    byte b = 0;
    int i = uK(paramInt);
    if (i >= 0) {
      b = this.aZY[i];
      aQ(i);
    }
    return b;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof bjI)) {
      return false;
    }
    bjI localbjI = (bjI)paramObject;
    if (localbjI.size() != size()) {
      return false;
    }
    return a(new alB(localbjI));
  }

  public int hashCode() {
    bVT localbVT = new bVT(this, null);
    a(localbVT);
    return localbVT.akt();
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

  public boolean containsKey(int paramInt)
  {
    return contains(paramInt);
  }

  public boolean a(cIw paramcIw)
  {
    return g(paramcIw);
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

  public boolean a(dgE paramdgE)
  {
    byte[] arrayOfByte1 = this.lpp;
    int[] arrayOfInt = this.mtW;
    byte[] arrayOfByte2 = this.aZY;
    for (int i = arrayOfInt.length; i-- > 0; ) {
      if ((arrayOfByte1[i] == 1) && (!paramdgE.k(arrayOfInt[i], arrayOfByte2[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(dgE paramdgE)
  {
    boolean bool = false;
    byte[] arrayOfByte1 = this.lpp;
    int[] arrayOfInt = this.mtW;
    byte[] arrayOfByte2 = this.aZY;

    bOl();
    try {
      for (i = arrayOfInt.length; i-- > 0; )
        if ((arrayOfByte1[i] == 1) && (!paramdgE.k(arrayOfInt[i], arrayOfByte2[i]))) {
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

  public boolean aR(int paramInt)
  {
    return q(paramInt, (byte)1);
  }

  public boolean q(int paramInt, byte paramByte)
  {
    int i = uK(paramInt);
    if (i < 0)
      return false;
    int tmp17_16 = i;
    byte[] tmp17_13 = this.aZY; tmp17_13[tmp17_16] = ((byte)(tmp17_13[tmp17_16] + paramByte));
    return true;
  }

  public byte c(int paramInt, byte paramByte1, byte paramByte2)
  {
    int i = Ej(paramInt);
    byte b;
    int j;
    if (i < 0) {
      i = -i - 1;
      int tmp25_23 = i;
      byte[] tmp25_20 = this.aZY; b = tmp25_20[tmp25_23] = (byte)(tmp25_20[tmp25_23] + paramByte1);
      j = 0;
    } else {
      b = this.aZY[i] = paramByte2;
      j = 1;
    }

    int k = this.lpp[i];
    this.mtW[i] = paramInt;
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
      int j = paramObjectInput.readInt();
      byte b = paramObjectInput.readByte();
      o(j, b);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new aGw(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}