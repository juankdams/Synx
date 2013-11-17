import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class dPx extends aBN
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final bhn mhc = new dTL(this);
  protected transient Object[] dlG;

  public dPx()
  {
  }

  public dPx(int paramInt)
  {
    super(paramInt);
  }

  public dPx(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public dPx(bvE parambvE)
  {
    super(parambvE);
  }

  public dPx(int paramInt, bvE parambvE)
  {
    super(paramInt, parambvE);
  }

  public dPx(int paramInt, float paramFloat, bvE parambvE)
  {
    super(paramInt, paramFloat, parambvE);
  }

  public dPx dqE()
  {
    dPx localdPx = (dPx)super.clone();
    localdPx.dlG = ((Object[])this.dlG.clone());
    return localdPx;
  }

  public aJp dqF()
  {
    return new aJp(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.dlG = ((Object[])new Object[i]);
    return i;
  }

  public Object c(byte paramByte, Object paramObject)
  {
    int i = bw(paramByte);
    return a(paramByte, paramObject, i);
  }

  public Object d(byte paramByte, Object paramObject)
  {
    int i = bw(paramByte);
    if (i < 0)
      return this.dlG[(-i - 1)];
    return a(paramByte, paramObject, i);
  }

  private Object a(byte paramByte, Object paramObject, int paramInt)
  {
    Object localObject = null;
    int j = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      localObject = this.dlG[paramInt];
      j = 0;
    }
    int i = this.lpp[paramInt];
    this.dVU[paramInt] = paramByte;
    this.lpp[paramInt] = 1;
    this.dlG[paramInt] = paramObject;
    if (j != 0) {
      fZ(i == 0);
    }

    return localObject;
  }

  public void b(dPx paramdPx)
  {
    paramdPx.b(this.mhc);
  }

  protected void rehash(int paramInt)
  {
    int i = this.dVU.length;
    byte[] arrayOfByte1 = this.dVU;
    Object[] arrayOfObject = this.dlG;
    byte[] arrayOfByte2 = this.lpp;

    this.dVU = new byte[paramInt];
    this.dlG = ((Object[])new Object[paramInt]);
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte2[j] == 1) {
        byte b = arrayOfByte1[j];
        int k = bw(b);
        this.dVU[k] = b;
        this.dlG[k] = arrayOfObject[j];
        this.lpp[k] = 1;
      }
  }

  public Object bf(byte paramByte)
  {
    int i = j(paramByte);
    return i < 0 ? null : this.dlG[i];
  }

  public void clear()
  {
    super.clear();
    byte[] arrayOfByte1 = this.dVU;
    Object[] arrayOfObject = this.dlG;
    byte[] arrayOfByte2 = this.lpp;

    Arrays.fill(this.dVU, 0, this.dVU.length, (byte)0);
    Arrays.fill(this.dlG, 0, this.dlG.length, null);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public Object be(byte paramByte)
  {
    Object localObject = null;
    int i = j(paramByte);
    if (i >= 0) {
      localObject = this.dlG[i];
      aQ(i);
    }
    return localObject;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof dPx)) {
      return false;
    }
    dPx localdPx = (dPx)paramObject;
    if (localdPx.size() != size()) {
      return false;
    }
    return b(new cwK(localdPx));
  }

  public int hashCode() {
    dBy localdBy = new dBy(this, null);
    b(localdBy);
    return localdBy.akt();
  }

  protected void aQ(int paramInt)
  {
    this.dlG[paramInt] = null;
    super.aQ(paramInt);
  }

  public Object[] getValues()
  {
    Object[] arrayOfObject1 = new Object[size()];
    Object[] arrayOfObject2 = this.dlG;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfObject2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfObject1[(j++)] = arrayOfObject2[i];
      }
    }
    return arrayOfObject1;
  }

  public Object[] d(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length < this._size) {
      paramArrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), this._size);
    }

    Object[] arrayOfObject = this.dlG;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfObject.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        paramArrayOfObject[(j++)] = arrayOfObject[i];
      }
    }
    return paramArrayOfObject;
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

  public boolean containsValue(Object paramObject)
  {
    byte[] arrayOfByte = this.lpp;
    Object[] arrayOfObject = this.dlG;
    int i;
    if (null == paramObject) {
      for (i = arrayOfObject.length; i-- > 0; )
        if ((arrayOfByte[i] == 1) && (paramObject == arrayOfObject[i]))
        {
          return true;
        }
    }
    else {
      for (i = arrayOfObject.length; i-- > 0; ) {
        if ((arrayOfByte[i] == 1) && ((paramObject == arrayOfObject[i]) || (paramObject.equals(arrayOfObject[i]))))
        {
          return true;
        }
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

  public boolean s(dGy paramdGy)
  {
    byte[] arrayOfByte = this.lpp;
    Object[] arrayOfObject = this.dlG;
    for (int i = arrayOfObject.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramdGy.d(arrayOfObject[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(bhn parambhn)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    Object[] arrayOfObject = this.dlG;
    for (int i = arrayOfByte2.length; i-- > 0; ) {
      if ((arrayOfByte1[i] == 1) && (!parambhn.b(arrayOfByte2[i], arrayOfObject[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean c(bhn parambhn)
  {
    boolean bool = false;
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.dVU;
    Object[] arrayOfObject = this.dlG;

    bOl();
    try {
      for (i = arrayOfByte2.length; i-- > 0; )
        if ((arrayOfByte1[i] == 1) && (!parambhn.b(arrayOfByte2[i], arrayOfObject[i]))) {
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

  public void a(cnb paramcnb)
  {
    byte[] arrayOfByte = this.lpp;
    Object[] arrayOfObject = this.dlG;
    for (int i = arrayOfObject.length; i-- > 0; )
      if (arrayOfByte[i] == 1)
        arrayOfObject[i] = paramcnb.execute(arrayOfObject[i]);
  }

  public void writeExternal(ObjectOutput paramObjectOutput)
  {
    paramObjectOutput.writeByte(0);

    paramObjectOutput.writeInt(this._size);

    cvF localcvF = new cvF(paramObjectOutput);
    if (!b(localcvF))
      throw localcvF.ihg;
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    int i = paramObjectInput.readInt();
    aO(i);

    while (i-- > 0) {
      byte b = paramObjectInput.readByte();
      Object localObject = paramObjectInput.readObject();
      c(b, localObject);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    b(new dTM(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}