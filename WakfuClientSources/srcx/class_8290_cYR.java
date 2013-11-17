import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class cYR extends cCi
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final dOg kMN = new aDm(this);
  protected transient int[] bXB;

  public cYR()
  {
  }

  public cYR(int paramInt)
  {
    super(paramInt);
  }

  public cYR(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public cYR(cBv paramcBv)
  {
    super(paramcBv);
  }

  public cYR(int paramInt, cBv paramcBv)
  {
    super(paramInt, paramcBv);
  }

  public cYR(int paramInt, float paramFloat, cBv paramcBv)
  {
    super(paramInt, paramFloat, paramcBv);
  }

  public dIZ cMc()
  {
    return new dIZ(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.bXB = new int[i];
    return i;
  }

  public int i(Object paramObject, int paramInt)
  {
    int i = bb(paramObject);
    return a(paramObject, paramInt, i);
  }

  public int j(Object paramObject, int paramInt)
  {
    int i = bb(paramObject);
    if (i < 0)
      return this.bXB[(-i - 1)];
    return a(paramObject, paramInt, i);
  }

  private int a(Object paramObject, int paramInt1, int paramInt2) {
    int i = 0;
    int j = 1;
    if (paramInt2 < 0) {
      paramInt2 = -paramInt2 - 1;
      i = this.bXB[paramInt2];
      j = 0;
    }
    Object localObject = this.iuG[paramInt2];
    this.iuG[paramInt2] = paramObject;
    this.bXB[paramInt2] = paramInt1;

    if (j != 0) {
      fZ(localObject == iuJ);
    }
    return i;
  }

  public void a(cYR paramcYR)
  {
    paramcYR.a(this.kMN);
  }

  protected void rehash(int paramInt)
  {
    int i = this.iuG.length;
    Object[] arrayOfObject = (Object[])this.iuG;
    int[] arrayOfInt = this.bXB;

    this.iuG = new Object[paramInt];
    Arrays.fill(this.iuG, iuJ);
    this.bXB = new int[paramInt];

    for (int j = i; j-- > 0; )
      if ((arrayOfObject[j] != iuJ) && (arrayOfObject[j] != iuI)) {
        Object localObject = arrayOfObject[j];
        int k = bb(localObject);
        if (k < 0) {
          q(this.iuG[(-k - 1)], localObject);
        }
        this.iuG[k] = localObject;
        this.bXB[k] = arrayOfInt[j];
      }
  }

  public int get(Object paramObject)
  {
    int i = index(paramObject);
    return i < 0 ? 0 : this.bXB[i];
  }

  public void clear()
  {
    super.clear();
    Object[] arrayOfObject = this.iuG;
    int[] arrayOfInt = this.bXB;

    Arrays.fill(this.iuG, 0, this.iuG.length, iuJ);
    Arrays.fill(this.bXB, 0, this.bXB.length, 0);
  }

  public int bh(Object paramObject)
  {
    int i = 0;
    int j = index(paramObject);
    if (j >= 0) {
      i = this.bXB[j];
      aQ(j);
    }
    return i;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof cYR)) {
      return false;
    }
    cYR localcYR = (cYR)paramObject;
    if (localcYR.size() != size()) {
      return false;
    }
    return a(new iZ(localcYR));
  }

  public cYR cMd()
  {
    cYR localcYR = (cYR)super.axF();
    localcYR.bXB = new int[this.bXB.length];
    System.arraycopy(this.bXB, 0, localcYR.bXB, 0, localcYR.bXB.length);

    return localcYR;
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
    Object[] arrayOfObject = this.iuG;

    int i = arrayOfInt2.length; for (int j = 0; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI)) {
        arrayOfInt1[(j++)] = arrayOfInt2[i];
      }
    }
    return arrayOfInt1;
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

  public boolean fG(int paramInt)
  {
    Object[] arrayOfObject = this.iuG;
    int[] arrayOfInt = this.bXB;

    for (int i = arrayOfInt.length; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (paramInt == arrayOfInt[i])) {
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

  public boolean d(cIw paramcIw)
  {
    Object[] arrayOfObject = this.iuG;
    int[] arrayOfInt = this.bXB;
    for (int i = arrayOfInt.length; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (!paramcIw.R(arrayOfInt[i])))
      {
        return false;
      }
    }
    return true;
  }

  public boolean a(dOg paramdOg)
  {
    Object[] arrayOfObject = (Object[])this.iuG;
    int[] arrayOfInt = this.bXB;
    for (int i = arrayOfObject.length; i-- > 0; ) {
      if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (!paramdOg.a(arrayOfObject[i], arrayOfInt[i])))
      {
        return false;
      }
    }
    return true;
  }

  public boolean b(dOg paramdOg)
  {
    boolean bool = false;
    Object[] arrayOfObject = (Object[])this.iuG;
    int[] arrayOfInt = this.bXB;

    bOl();
    try {
      for (i = arrayOfObject.length; i-- > 0; )
        if ((arrayOfObject[i] != iuJ) && (arrayOfObject[i] != iuI) && (!paramdOg.a(arrayOfObject[i], arrayOfInt[i])))
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

  public void a(bwW parambwW)
  {
    Object[] arrayOfObject = this.iuG;
    int[] arrayOfInt = this.bXB;
    for (int i = arrayOfInt.length; i-- > 0; )
      if ((arrayOfObject[i] != null) && (arrayOfObject[i] != iuI))
        arrayOfInt[i] = parambwW.rt(arrayOfInt[i]);
  }

  public boolean aJ(Object paramObject)
  {
    return k(paramObject, 1);
  }

  public boolean k(Object paramObject, int paramInt)
  {
    int i = index(paramObject);
    if (i < 0) {
      return false;
    }
    this.bXB[i] += paramInt;
    return true;
  }

  public int b(Object paramObject, int paramInt1, int paramInt2)
  {
    int i = bb(paramObject);
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

    Object localObject = this.iuG[i];
    this.iuG[i] = paramObject;

    if (j != 0) {
      fZ(localObject == iuJ);
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
      Object localObject = paramObjectInput.readObject();
      int j = paramObjectInput.readInt();
      i(localObject, j);
    }
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new aDh(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}