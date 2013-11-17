import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class bKB extends cCi
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final sQ gNw = new dAd(this);
  protected transient float[] gBL;

  public bKB()
  {
  }

  public bKB(int paramInt)
  {
    super(paramInt);
  }

  public bKB(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public bKB(cBv paramcBv)
  {
    super(paramcBv);
  }

  public bKB(int paramInt, cBv paramcBv)
  {
    super(paramInt, paramcBv);
  }

  public bKB(int paramInt, float paramFloat, cBv paramcBv)
  {
    super(paramInt, paramFloat, paramcBv);
  }

  public cmp bSJ()
  {
    return new cmp(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.gBL = new float[i];
    return i;
  }

  public float b(Object paramObject, float paramFloat)
  {
    int i = bb(paramObject);
    return a(paramObject, paramFloat, i);
  }

  public float c(Object paramObject, float paramFloat)
  {
    int i = bb(paramObject);
    if (i < 0)
      return this.gBL[(-i - 1)];
    return a(paramObject, paramFloat, i);
  }

  private float a(Object paramObject, float paramFloat, int paramInt) {
    float f = 0.0F;
    int i = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      f = this.gBL[paramInt];
      i = 0;
    }
    Object localObject = this.iuG[paramInt];
    this.iuG[paramInt] = paramObject;
    this.gBL[paramInt] = paramFloat;

    if (i != 0) {
      fZ(localObject == iuJ);
    }
    return f;
  }

  public void a(bKB parambKB)
  {
    parambKB.a(this.gNw);
  }

  protected void rehash(int paramInt)
  {
    int i = this.iuG.length;
    Object[] arrayOfObject = (Object[])this.iuG;
    float[] arrayOfFloat = this.gBL;

    this.iuG = new Object[paramInt];
    Arrays.fill(this.iuG, iuJ);
    this.gBL = new float[paramInt];

    for (int j = i; j-- > 0; )
      if ((arrayOfObject[j] != iuJ) && (arrayOfObject[j] != iuI)) {
        Object localObject = arrayOfObject[j];
        int k = bb(localObject);
        if (k < 0) {
          q(this.iuG[(-k - 1)], localObject);
        }
        this.iuG[k] = localObject;
        this.gBL[k] = arrayOfFloat[j];
      }
  }

  public float aM(Object paramObject)
  {
    int i = index(paramObject);
    return i < 0 ? 0.0F : this.gBL[i];
  }

  public void clear()
  {
    super.clear();
    Object[] arrayOfObject = this.iuG;
    float[] arrayOfFloat = this.gBL;

    Arrays.fill(this.iuG, 0, this.iuG.length, iuJ);
    Arrays.fill(this.gBL, 0, this.gBL.length, 0.0F);
  }

  public float aN(Object paramObject)
  {
    float f = 0.0F;
    int i = index(paramObject);
    if (i >= 0) {
      f = this.gBL[i];
      aQ(i);
    }
    return f;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof bKB)) {
      return false;
    }
    bKB localbKB = (bKB)paramObject;
    if (localbKB.size() != size()) {
      return false;
    }
    return a(new buw(localbKB));
  }

  public bKB bSK()
  {
    bKB localbKB = (bKB)super.axF();
    localbKB.gBL = new float[this.gBL.length];
    System.arraycopy(this.gBL, 0, localbKB.gBL, 0, localbKB.gBL.length);

    return localbKB;
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
    Object[] arrayOfObject = this.iuG;

    int i = arrayOfFloat2.length; for (int j = 0; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI)) {
        arrayOfFloat1[(j++)] = arrayOfFloat2[i];
      }
    }
    return arrayOfFloat1;
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

  public boolean bO(float paramFloat)
  {
    Object[] arrayOfObject = this.iuG;
    float[] arrayOfFloat = this.gBL;

    for (int i = arrayOfFloat.length; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (paramFloat == arrayOfFloat[i])) {
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

  public boolean e(bYD parambYD)
  {
    Object[] arrayOfObject = this.iuG;
    float[] arrayOfFloat = this.gBL;
    for (int i = arrayOfFloat.length; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (!parambYD.bV(arrayOfFloat[i])))
      {
        return false;
      }
    }
    return true;
  }

  public boolean a(sQ paramsQ)
  {
    Object[] arrayOfObject = (Object[])this.iuG;
    float[] arrayOfFloat = this.gBL;
    for (int i = arrayOfObject.length; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (!paramsQ.a(arrayOfObject[i], arrayOfFloat[i])))
      {
        return false;
      }
    }
    return true;
  }

  public boolean b(sQ paramsQ)
  {
    boolean bool = false;
    Object[] arrayOfObject = (Object[])this.iuG;
    float[] arrayOfFloat = this.gBL;

    bOl();
    try {
      for (i = arrayOfObject.length; i-- > 0; )
        if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (!paramsQ.a(arrayOfObject[i], arrayOfFloat[i])))
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

  public void a(cbE paramcbE)
  {
    Object[] arrayOfObject = this.iuG;
    float[] arrayOfFloat = this.gBL;
    for (int i = arrayOfFloat.length; i-- > 0; )
      if ((arrayOfObject[i] != null) && (arrayOfObject[i] != iuI))
        arrayOfFloat[i] = paramcbE.bW(arrayOfFloat[i]);
  }

  public boolean aJ(Object paramObject)
  {
    return d(paramObject, 1.0F);
  }

  public boolean d(Object paramObject, float paramFloat)
  {
    int i = index(paramObject);
    if (i < 0) {
      return false;
    }
    this.gBL[i] += paramFloat;
    return true;
  }

  public float a(Object paramObject, float paramFloat1, float paramFloat2)
  {
    int i = bb(paramObject);
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

    Object localObject = this.iuG[i];
    this.iuG[i] = paramObject;

    if (j != 0) {
      fZ(localObject == iuJ);
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
      Object localObject = paramObjectInput.readObject();
      float f = paramObjectInput.readFloat();
      b(localObject, f);
    }
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new dAc(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}