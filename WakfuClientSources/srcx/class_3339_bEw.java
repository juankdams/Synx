import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class bEw extends cCi
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final eH gzF = new dbf(this);
  protected transient byte[] aZY;

  public bEw()
  {
  }

  public bEw(int paramInt)
  {
    super(paramInt);
  }

  public bEw(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public bEw(cBv paramcBv)
  {
    super(paramcBv);
  }

  public bEw(int paramInt, cBv paramcBv)
  {
    super(paramInt, paramcBv);
  }

  public bEw(int paramInt, float paramFloat, cBv paramcBv)
  {
    super(paramInt, paramFloat, paramcBv);
  }

  public Cj bMM()
  {
    return new Cj(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.aZY = new byte[i];
    return i;
  }

  public byte b(Object paramObject, byte paramByte)
  {
    int i = bb(paramObject);
    return a(paramObject, paramByte, i);
  }

  public byte c(Object paramObject, byte paramByte)
  {
    int i = bb(paramObject);
    if (i < 0)
      return this.aZY[(-i - 1)];
    return a(paramObject, paramByte, i);
  }

  private byte a(Object paramObject, byte paramByte, int paramInt) {
    byte b = 0;
    int i = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      b = this.aZY[paramInt];
      i = 0;
    }
    Object localObject = this.iuG[paramInt];
    this.iuG[paramInt] = paramObject;
    this.aZY[paramInt] = paramByte;

    if (i != 0) {
      fZ(localObject == iuJ);
    }
    return b;
  }

  public void b(bEw parambEw)
  {
    parambEw.a(this.gzF);
  }

  protected void rehash(int paramInt)
  {
    int i = this.iuG.length;
    Object[] arrayOfObject = (Object[])this.iuG;
    byte[] arrayOfByte = this.aZY;

    this.iuG = new Object[paramInt];
    Arrays.fill(this.iuG, iuJ);
    this.aZY = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if ((arrayOfObject[j] != iuJ) && (arrayOfObject[j] != iuI)) {
        Object localObject = arrayOfObject[j];
        int k = bb(localObject);
        if (k < 0) {
          q(this.iuG[(-k - 1)], localObject);
        }
        this.iuG[k] = localObject;
        this.aZY[k] = arrayOfByte[j];
      }
  }

  public byte aH(Object paramObject)
  {
    int i = index(paramObject);
    return i < 0 ? 0 : this.aZY[i];
  }

  public void clear()
  {
    super.clear();
    Object[] arrayOfObject = this.iuG;
    byte[] arrayOfByte = this.aZY;

    Arrays.fill(this.iuG, 0, this.iuG.length, iuJ);
    Arrays.fill(this.aZY, 0, this.aZY.length, (byte)0);
  }

  public byte aI(Object paramObject)
  {
    byte b = 0;
    int i = index(paramObject);
    if (i >= 0) {
      b = this.aZY[i];
      aQ(i);
    }
    return b;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof bEw)) {
      return false;
    }
    bEw localbEw = (bEw)paramObject;
    if (localbEw.size() != size()) {
      return false;
    }
    return a(new yI(localbEw));
  }

  public bEw bMN()
  {
    bEw localbEw = (bEw)super.axF();
    localbEw.aZY = new byte[this.aZY.length];
    System.arraycopy(this.aZY, 0, localbEw.aZY, 0, localbEw.aZY.length);

    return localbEw;
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
    Object[] arrayOfObject = this.iuG;

    int i = arrayOfByte2.length; for (int j = 0; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI)) {
        arrayOfByte1[(j++)] = arrayOfByte2[i];
      }
    }
    return arrayOfByte1;
  }

  public Object[] keys()
  {
    Object[] arrayOfObject1 = new Object[size()];
    Object[] arrayOfObject2 = (Object[])this.iuG;

    int i = arrayOfObject2.length; for (int j = 0; i-- > 0; ) {
      if ((arrayOfObject2[i] != iuJ) && (arrayOfObject2[i] != iuI)) {
        arrayOfObject1[(j++)] = arrayOfObject2[i];
      }
    }
    return arrayOfObject1;
  }

  public Object[] p(Object[] paramArrayOfObject)
  {
    int i = size();
    if (paramArrayOfObject.length < i) {
      paramArrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
    }

    Object[] arrayOfObject = (Object[])this.iuG;

    int j = arrayOfObject.length; for (int k = 0; j-- > 0; ) {
      if ((arrayOfObject[j] != iuJ) && (arrayOfObject[j] != iuI)) {
        paramArrayOfObject[(k++)] = arrayOfObject[j];
      }
    }
    return paramArrayOfObject;
  }

  public boolean C(byte paramByte)
  {
    Object[] arrayOfObject = this.iuG;
    byte[] arrayOfByte = this.aZY;

    for (int i = arrayOfByte.length; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (paramByte == arrayOfByte[i])) {
        return true;
      }
    }
    return false;
  }

  public boolean containsKey(Object paramObject)
  {
    return contains(paramObject);
  }

  public boolean r(dGy paramdGy)
  {
    return d(paramdGy);
  }

  public boolean b(Tp paramTp)
  {
    Object[] arrayOfObject = this.iuG;
    byte[] arrayOfByte = this.aZY;
    for (int i = arrayOfByte.length; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (!paramTp.t(arrayOfByte[i])))
      {
        return false;
      }
    }
    return true;
  }

  public boolean a(eH parameH)
  {
    Object[] arrayOfObject = (Object[])this.iuG;
    byte[] arrayOfByte = this.aZY;
    for (int i = arrayOfObject.length; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (!parameH.a(arrayOfObject[i], arrayOfByte[i])))
      {
        return false;
      }
    }
    return true;
  }

  public boolean b(eH parameH)
  {
    boolean bool = false;
    Object[] arrayOfObject = (Object[])this.iuG;
    byte[] arrayOfByte = this.aZY;

    bOl();
    try {
      for (i = arrayOfObject.length; i-- > 0; )
        if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (!parameH.a(arrayOfObject[i], arrayOfByte[i])))
        {
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
    Object[] arrayOfObject = this.iuG;
    byte[] arrayOfByte = this.aZY;
    for (int i = arrayOfByte.length; i-- > 0; )
      if ((arrayOfObject[i] != null) && (arrayOfObject[i] != iuI))
        arrayOfByte[i] = paramctI.dW(arrayOfByte[i]);
  }

  public boolean aJ(Object paramObject)
  {
    return d(paramObject, (byte)1);
  }

  public boolean d(Object paramObject, byte paramByte)
  {
    int i = index(paramObject);
    if (i < 0)
      return false;
    int tmp17_16 = i;
    byte[] tmp17_13 = this.aZY; tmp17_13[tmp17_16] = ((byte)(tmp17_13[tmp17_16] + paramByte));
    return true;
  }

  public byte a(Object paramObject, byte paramByte1, byte paramByte2)
  {
    int i = bb(paramObject);
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

    Object localObject = this.iuG[i];
    this.iuG[i] = paramObject;

    if (j != 0) {
      fZ(localObject == iuJ);
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
      Object localObject = paramObjectInput.readObject();
      byte b = paramObjectInput.readByte();
      b(localObject, b);
    }
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new dbe(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}