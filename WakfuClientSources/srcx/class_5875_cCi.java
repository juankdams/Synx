import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public abstract class cCi extends bGb
  implements cBv
{
  static final long serialVersionUID = -3461112548087185871L;
  protected transient Object[] iuG;
  protected cBv iuH;
  protected static final Object iuI = new Object(); protected static final Object iuJ = new Object();

  public cCi()
  {
    this.iuH = this;
  }

  public cCi(cBv paramcBv)
  {
    this.iuH = paramcBv;
  }

  public cCi(int paramInt)
  {
    super(paramInt);
    this.iuH = this;
  }

  public cCi(int paramInt, cBv paramcBv)
  {
    super(paramInt);
    this.iuH = paramcBv;
  }

  public cCi(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
    this.iuH = this;
  }

  public cCi(int paramInt, float paramFloat, cBv paramcBv)
  {
    super(paramInt, paramFloat);
    this.iuH = paramcBv;
  }

  public cCi axF()
  {
    cCi localcCi = (cCi)super.clone();
    localcCi.iuG = ((Object[])this.iuG.clone());
    return localcCi;
  }

  protected int capacity() {
    return this.iuG.length;
  }

  protected void aQ(int paramInt) {
    this.iuG[paramInt] = iuI;
    super.aQ(paramInt);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.iuG = new Object[i];
    Arrays.fill(this.iuG, iuJ);
    return i;
  }

  public boolean d(dGy paramdGy)
  {
    Object[] arrayOfObject = this.iuG;
    for (int i = arrayOfObject.length; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (!paramdGy.d(arrayOfObject[i])))
      {
        return false;
      }
    }
    return true;
  }

  public boolean contains(Object paramObject)
  {
    return index(paramObject) >= 0;
  }

  protected int index(Object paramObject)
  {
    cBv localcBv = this.iuH;

    Object[] arrayOfObject = this.iuG;
    int i = arrayOfObject.length;
    int j = localcBv.ba(paramObject) & 0x7FFFFFFF;
    int k = j % i;
    Object localObject = arrayOfObject[k];

    if (localObject == iuJ) return -1;

    if ((localObject == iuI) || (!localcBv.equals(localObject, paramObject)))
    {
      int m = 1 + j % (i - 2);
      do
      {
        k -= m;
        if (k < 0) {
          k += i;
        }
        localObject = arrayOfObject[k];
      }
      while ((localObject != iuJ) && ((localObject == iuI) || (!this.iuH.equals(localObject, paramObject))));
    }

    return localObject == iuJ ? -1 : k;
  }

  protected int bb(Object paramObject)
  {
    cBv localcBv = this.iuH;

    Object[] arrayOfObject = this.iuG;
    int i = arrayOfObject.length;
    int j = localcBv.ba(paramObject) & 0x7FFFFFFF;
    int k = j % i;
    Object localObject = arrayOfObject[k];

    if (localObject == iuJ)
      return k;
    if ((localObject != iuI) && (localcBv.equals(localObject, paramObject))) {
      return -k - 1;
    }

    int m = 1 + j % (i - 2);

    if (localObject != iuI)
    {
      do
      {
        k -= m;
        if (k < 0) {
          k += i;
        }
        localObject = arrayOfObject[k];
      }

      while ((localObject != iuJ) && (localObject != iuI) && (!localcBv.equals(localObject, paramObject)));
    }

    if (localObject == iuI) {
      int n = k;

      while ((localObject != iuJ) && ((localObject == iuI) || (!localcBv.equals(localObject, paramObject)))) {
        k -= m;
        if (k < 0) {
          k += i;
        }
        localObject = arrayOfObject[k];
      }

      return localObject != iuJ ? -k - 1 : n;
    }

    return localObject != iuJ ? -k - 1 : k;
  }

  public final int ba(Object paramObject)
  {
    return paramObject == null ? 0 : paramObject.hashCode();
  }

  public final boolean equals(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == null ? false : paramObject2 == null ? true : paramObject1.equals(paramObject2);
  }

  protected final void q(Object paramObject1, Object paramObject2)
  {
    throw new IllegalArgumentException("Equal objects must have equal hashcodes. During rehashing, Trove discovered that the following two objects claim to be equal (as in java.lang.Object.equals()) but their hashCodes (or those calculated by your TObjectHashingStrategy) are not equal.This violates the general contract of java.lang.Object.hashCode().  See bullet point two in that method's documentation. object #1 =" + paramObject1 + "; object #2 =" + paramObject2);
  }

  public void writeExternal(ObjectOutput paramObjectOutput)
  {
    super.writeExternal(paramObjectOutput);

    paramObjectOutput.writeByte(0);

    if (this.iuH == this) paramObjectOutput.writeObject(null); else
      paramObjectOutput.writeObject(this.iuH);
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    super.readExternal(paramObjectInput);

    paramObjectInput.readByte();

    this.iuH = ((cBv)paramObjectInput.readObject());
    if (this.iuH == null) this.iuH = this;
  }
}