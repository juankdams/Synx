import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class aoL extends aBq
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final bhG due = new dmm(this);
  protected transient Object[] dlG;

  public aoL()
  {
  }

  public aoL(int paramInt)
  {
    super(paramInt);
  }

  public aoL(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public aoL(dCx paramdCx)
  {
    super(paramdCx);
  }

  public aoL(int paramInt, dCx paramdCx)
  {
    super(paramInt, paramdCx);
  }

  public aoL(int paramInt, float paramFloat, dCx paramdCx)
  {
    super(paramInt, paramFloat, paramdCx);
  }

  public aoL aAZ()
  {
    aoL localaoL = (aoL)super.clone();
    localaoL.dlG = ((Object[])this.dlG.clone());
    return localaoL;
  }

  public cHu aBa()
  {
    return new cHu(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.dlG = ((Object[])new Object[i]);
    return i;
  }

  public Object put(long paramLong, Object paramObject)
  {
    int i = dL(paramLong);
    return a(paramLong, paramObject, i);
  }

  public Object b(long paramLong, Object paramObject)
  {
    int i = dL(paramLong);
    if (i < 0)
      return this.dlG[(-i - 1)];
    return a(paramLong, paramObject, i);
  }

  private Object a(long paramLong, Object paramObject, int paramInt)
  {
    Object localObject = null;
    int j = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      localObject = this.dlG[paramInt];
      j = 0;
    }
    int i = this.lpp[paramInt];
    this.dVd[paramInt] = paramLong;
    this.lpp[paramInt] = 1;
    this.dlG[paramInt] = paramObject;
    if (j != 0) {
      fZ(i == 0);
    }

    return localObject;
  }

  public void e(aoL paramaoL)
  {
    paramaoL.b(this.due);
  }

  protected void rehash(int paramInt)
  {
    int i = this.dVd.length;
    long[] arrayOfLong = this.dVd;
    Object[] arrayOfObject = this.dlG;
    byte[] arrayOfByte = this.lpp;

    this.dVd = new long[paramInt];
    this.dlG = ((Object[])new Object[paramInt]);
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        long l = arrayOfLong[j];
        int k = dL(l);
        this.dVd[k] = l;
        this.dlG[k] = arrayOfObject[j];
        this.lpp[k] = 1;
      }
  }

  public Object get(long paramLong)
  {
    int i = L(paramLong);
    return i < 0 ? null : this.dlG[i];
  }

  public void clear()
  {
    super.clear();
    long[] arrayOfLong = this.dVd;
    Object[] arrayOfObject = this.dlG;
    byte[] arrayOfByte = this.lpp;

    Arrays.fill(this.dVd, 0, this.dVd.length, 0L);
    Arrays.fill(this.dlG, 0, this.dlG.length, null);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public Object remove(long paramLong)
  {
    Object localObject = null;
    int i = L(paramLong);
    if (i >= 0) {
      localObject = this.dlG[i];
      aQ(i);
    }
    return localObject;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof aoL)) {
      return false;
    }
    aoL localaoL = (aoL)paramObject;
    if (localaoL.size() != size()) {
      return false;
    }
    return b(new uF(localaoL));
  }

  public int hashCode() {
    cmS localcmS = new cmS(this, null);
    b(localcmS);
    return localcmS.akt();
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

  public long[] aBb()
  {
    long[] arrayOfLong1 = new long[size()];
    long[] arrayOfLong2 = this.dVd;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfLong2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfLong1[(j++)] = arrayOfLong2[i];
      }
    }
    return arrayOfLong1;
  }

  public long[] c(long[] paramArrayOfLong)
  {
    int i = size();
    if (paramArrayOfLong.length < i) {
      paramArrayOfLong = (long[])Array.newInstance(paramArrayOfLong.getClass().getComponentType(), i);
    }

    long[] arrayOfLong = (long[])this.dVd;
    byte[] arrayOfByte = this.lpp;

    int j = arrayOfLong.length; for (int k = 0; j-- > 0; ) {
      if (arrayOfByte[j] == 1) {
        paramArrayOfLong[(k++)] = arrayOfLong[j];
      }
    }
    return paramArrayOfLong;
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

  public boolean containsKey(long paramLong)
  {
    return N(paramLong);
  }

  public boolean a(CE paramCE)
  {
    return b(paramCE);
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

  public boolean b(bhG parambhG)
  {
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong = this.dVd;
    Object[] arrayOfObject = this.dlG;
    for (int i = arrayOfLong.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!parambhG.a(arrayOfLong[i], arrayOfObject[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean c(bhG parambhG)
  {
    boolean bool = false;
    byte[] arrayOfByte = this.lpp;
    long[] arrayOfLong = this.dVd;
    Object[] arrayOfObject = this.dlG;

    bOl();
    try {
      for (i = arrayOfLong.length; i-- > 0; )
        if ((arrayOfByte[i] == 1) && (!parambhG.a(arrayOfLong[i], arrayOfObject[i]))) {
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
      long l = paramObjectInput.readLong();
      Object localObject = paramObjectInput.readObject();
      put(l, localObject);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    b(new dml(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}