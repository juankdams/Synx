import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class bPu extends dai
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final eA gWb = new aTN(this);
  protected transient Object[] dlG;

  public bPu()
  {
  }

  public bPu(int paramInt)
  {
    super(paramInt);
  }

  public bPu(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public bPu(dnH paramdnH)
  {
    super(paramdnH);
  }

  public bPu(int paramInt, dnH paramdnH)
  {
    super(paramInt, paramdnH);
  }

  public bPu(int paramInt, float paramFloat, dnH paramdnH)
  {
    super(paramInt, paramFloat, paramdnH);
  }

  public bPu bVV()
  {
    bPu localbPu = (bPu)super.clone();
    localbPu.dlG = ((Object[])this.dlG.clone());
    return localbPu;
  }

  public bM bVW()
  {
    return new bM(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.dlG = ((Object[])new Object[i]);
    return i;
  }

  public Object c(short paramShort, Object paramObject)
  {
    int i = dV(paramShort);
    return a(paramShort, paramObject, i);
  }

  public Object d(short paramShort, Object paramObject)
  {
    int i = dV(paramShort);
    if (i < 0)
      return this.dlG[(-i - 1)];
    return a(paramShort, paramObject, i);
  }

  private Object a(short paramShort, Object paramObject, int paramInt)
  {
    Object localObject = null;
    int j = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      localObject = this.dlG[paramInt];
      j = 0;
    }
    int i = this.lpp[paramInt];
    this.kOY[paramInt] = paramShort;
    this.lpp[paramInt] = 1;
    this.dlG[paramInt] = paramObject;
    if (j != 0) {
      fZ(i == 0);
    }

    return localObject;
  }

  public void a(bPu parambPu)
  {
    parambPu.a(this.gWb);
  }

  protected void rehash(int paramInt)
  {
    int i = this.kOY.length;
    short[] arrayOfShort = this.kOY;
    Object[] arrayOfObject = this.dlG;
    byte[] arrayOfByte = this.lpp;

    this.kOY = new short[paramInt];
    this.dlG = ((Object[])new Object[paramInt]);
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        short s = arrayOfShort[j];
        int k = dV(s);
        this.kOY[k] = s;
        this.dlG[k] = arrayOfObject[j];
        this.lpp[k] = 1;
      }
  }

  public Object cx(short paramShort)
  {
    int i = dU(paramShort);
    return i < 0 ? null : this.dlG[i];
  }

  public void clear()
  {
    super.clear();
    short[] arrayOfShort = this.kOY;
    Object[] arrayOfObject = this.dlG;
    byte[] arrayOfByte = this.lpp;

    Arrays.fill(this.kOY, 0, this.kOY.length, (short)0);
    Arrays.fill(this.dlG, 0, this.dlG.length, null);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public Object cw(short paramShort)
  {
    Object localObject = null;
    int i = dU(paramShort);
    if (i >= 0) {
      localObject = this.dlG[i];
      aQ(i);
    }
    return localObject;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof bPu)) {
      return false;
    }
    bPu localbPu = (bPu)paramObject;
    if (localbPu.size() != size()) {
      return false;
    }
    return a(new bVW(localbPu));
  }

  public int hashCode() {
    ayv localayv = new ayv(this, null);
    a(localayv);
    return localayv.akt();
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

  public boolean N(short paramShort)
  {
    return contains(paramShort);
  }

  public boolean b(dfG paramdfG)
  {
    return c(paramdfG);
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

  public boolean a(eA parameA)
  {
    byte[] arrayOfByte = this.lpp;
    short[] arrayOfShort = this.kOY;
    Object[] arrayOfObject = this.dlG;
    for (int i = arrayOfShort.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!parameA.a(arrayOfShort[i], arrayOfObject[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(eA parameA)
  {
    boolean bool = false;
    byte[] arrayOfByte = this.lpp;
    short[] arrayOfShort = this.kOY;
    Object[] arrayOfObject = this.dlG;

    bOl();
    try {
      for (i = arrayOfShort.length; i-- > 0; )
        if ((arrayOfByte[i] == 1) && (!parameA.a(arrayOfShort[i], arrayOfObject[i]))) {
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
      Object localObject = paramObjectInput.readObject();
      c(s, localObject);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new aTO(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}