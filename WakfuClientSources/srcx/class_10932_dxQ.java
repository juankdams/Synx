import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class dxQ extends cCi
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final dyg lEJ = new ckK(this);
  protected transient long[] eiO;

  public dxQ()
  {
  }

  public dxQ(int paramInt)
  {
    super(paramInt);
  }

  public dxQ(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public dxQ(cBv paramcBv)
  {
    super(paramcBv);
  }

  public dxQ(int paramInt, cBv paramcBv)
  {
    super(paramInt, paramcBv);
  }

  public dxQ(int paramInt, float paramFloat, cBv paramcBv)
  {
    super(paramInt, paramFloat, paramcBv);
  }

  public bkc dcF()
  {
    return new bkc(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.eiO = new long[i];
    return i;
  }

  public long c(Object paramObject, long paramLong)
  {
    int i = bb(paramObject);
    return a(paramObject, paramLong, i);
  }

  public long d(Object paramObject, long paramLong)
  {
    int i = bb(paramObject);
    if (i < 0)
      return this.eiO[(-i - 1)];
    return a(paramObject, paramLong, i);
  }

  private long a(Object paramObject, long paramLong, int paramInt) {
    long l = 0L;
    int i = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      l = this.eiO[paramInt];
      i = 0;
    }
    Object localObject = this.iuG[paramInt];
    this.iuG[paramInt] = paramObject;
    this.eiO[paramInt] = paramLong;

    if (i != 0) {
      fZ(localObject == iuJ);
    }
    return l;
  }

  public void a(dxQ paramdxQ)
  {
    paramdxQ.a(this.lEJ);
  }

  protected void rehash(int paramInt)
  {
    int i = this.iuG.length;
    Object[] arrayOfObject = (Object[])this.iuG;
    long[] arrayOfLong = this.eiO;

    this.iuG = new Object[paramInt];
    Arrays.fill(this.iuG, iuJ);
    this.eiO = new long[paramInt];

    for (int j = i; j-- > 0; )
      if ((arrayOfObject[j] != iuJ) && (arrayOfObject[j] != iuI)) {
        Object localObject = arrayOfObject[j];
        int k = bb(localObject);
        if (k < 0) {
          q(this.iuG[(-k - 1)], localObject);
        }
        this.iuG[k] = localObject;
        this.eiO[k] = arrayOfLong[j];
      }
  }

  public long get(Object paramObject)
  {
    int i = index(paramObject);
    return i < 0 ? 0L : this.eiO[i];
  }

  public void clear()
  {
    super.clear();
    Object[] arrayOfObject = this.iuG;
    long[] arrayOfLong = this.eiO;

    Arrays.fill(this.iuG, 0, this.iuG.length, iuJ);
    Arrays.fill(this.eiO, 0, this.eiO.length, 0L);
  }

  public long by(Object paramObject)
  {
    long l = 0L;
    int i = index(paramObject);
    if (i >= 0) {
      l = this.eiO[i];
      aQ(i);
    }
    return l;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof dxQ)) {
      return false;
    }
    dxQ localdxQ = (dxQ)paramObject;
    if (localdxQ.size() != size()) {
      return false;
    }
    return a(new aja(localdxQ));
  }

  public dxQ dcG()
  {
    dxQ localdxQ = (dxQ)super.axF();
    localdxQ.eiO = new long[this.eiO.length];
    System.arraycopy(this.eiO, 0, localdxQ.eiO, 0, localdxQ.eiO.length);

    return localdxQ;
  }

  protected void aQ(int paramInt)
  {
    this.eiO[paramInt] = 0L;
    super.aQ(paramInt);
  }

  public long[] aVi()
  {
    long[] arrayOfLong1 = new long[size()];
    long[] arrayOfLong2 = this.eiO;
    Object[] arrayOfObject = this.iuG;

    int i = arrayOfLong2.length; for (int j = 0; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI)) {
        arrayOfLong1[(j++)] = arrayOfLong2[i];
      }
    }
    return arrayOfLong1;
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

  public boolean dZ(long paramLong)
  {
    Object[] arrayOfObject = this.iuG;
    long[] arrayOfLong = this.eiO;

    for (int i = arrayOfLong.length; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (paramLong == arrayOfLong[i])) {
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

  public boolean c(CE paramCE)
  {
    Object[] arrayOfObject = this.iuG;
    long[] arrayOfLong = this.eiO;
    for (int i = arrayOfLong.length; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (!paramCE.Q(arrayOfLong[i])))
      {
        return false;
      }
    }
    return true;
  }

  public boolean a(dyg paramdyg)
  {
    Object[] arrayOfObject = (Object[])this.iuG;
    long[] arrayOfLong = this.eiO;
    for (int i = arrayOfObject.length; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (!paramdyg.a(arrayOfObject[i], arrayOfLong[i])))
      {
        return false;
      }
    }
    return true;
  }

  public boolean b(dyg paramdyg)
  {
    boolean bool = false;
    Object[] arrayOfObject = (Object[])this.iuG;
    long[] arrayOfLong = this.eiO;

    bOl();
    try {
      for (i = arrayOfObject.length; i-- > 0; )
        if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (!paramdyg.a(arrayOfObject[i], arrayOfLong[i])))
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

  public void a(cAm paramcAm)
  {
    Object[] arrayOfObject = this.iuG;
    long[] arrayOfLong = this.eiO;
    for (int i = arrayOfLong.length; i-- > 0; )
      if ((arrayOfObject[i] != null) && (arrayOfObject[i] != iuI))
        arrayOfLong[i] = paramcAm.e(arrayOfLong[i]);
  }

  public boolean aJ(Object paramObject)
  {
    return e(paramObject, 1L);
  }

  public boolean e(Object paramObject, long paramLong)
  {
    int i = index(paramObject);
    if (i < 0) {
      return false;
    }
    this.eiO[i] += paramLong;
    return true;
  }

  public long a(Object paramObject, long paramLong1, long paramLong2)
  {
    int i = bb(paramObject);
    long l;
    int j;
    if (i < 0) {
      i = -i - 1;
      l = this.eiO[i] += paramLong1;
      j = 0;
    } else {
      l = this.eiO[i] = paramLong2;
      j = 1;
    }

    Object localObject = this.iuG[i];
    this.iuG[i] = paramObject;

    if (j != 0) {
      fZ(localObject == iuJ);
    }

    return l;
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
      long l = paramObjectInput.readLong();
      c(localObject, l);
    }
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new ckL(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}