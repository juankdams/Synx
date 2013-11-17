import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class cSR extends dVg
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final bPA kFB = new cHB(this);
  protected transient Object[] dlG;

  public cSR()
  {
  }

  public cSR(int paramInt)
  {
    super(paramInt);
  }

  public cSR(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public cSR(aSO paramaSO)
  {
    super(paramaSO);
  }

  public cSR(int paramInt, aSO paramaSO)
  {
    super(paramInt, paramaSO);
  }

  public cSR(int paramInt, float paramFloat, aSO paramaSO)
  {
    super(paramInt, paramFloat, paramaSO);
  }

  public cSR cIK()
  {
    cSR localcSR = (cSR)super.clone();
    localcSR.dlG = ((Object[])this.dlG.clone());
    return localcSR;
  }

  public dmn yF()
  {
    return new dmn(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.dlG = ((Object[])new Object[i]);
    return i;
  }

  public Object put(int paramInt, Object paramObject)
  {
    int i = Ej(paramInt);
    return a(paramInt, paramObject, i);
  }

  public Object g(int paramInt, Object paramObject)
  {
    int i = Ej(paramInt);
    if (i < 0)
      return this.dlG[(-i - 1)];
    return a(paramInt, paramObject, i);
  }

  private Object a(int paramInt1, Object paramObject, int paramInt2)
  {
    Object localObject = null;
    int j = 1;
    if (paramInt2 < 0) {
      paramInt2 = -paramInt2 - 1;
      localObject = this.dlG[paramInt2];
      j = 0;
    }
    int i = this.lpp[paramInt2];
    this.mtW[paramInt2] = paramInt1;
    this.lpp[paramInt2] = 1;
    this.dlG[paramInt2] = paramObject;
    if (j != 0) {
      fZ(i == 0);
    }

    return localObject;
  }

  public void f(cSR paramcSR)
  {
    paramcSR.a(this.kFB);
  }

  protected void rehash(int paramInt)
  {
    int i = this.mtW.length;
    int[] arrayOfInt = this.mtW;
    Object[] arrayOfObject = this.dlG;
    byte[] arrayOfByte = this.lpp;

    this.mtW = new int[paramInt];
    this.dlG = ((Object[])new Object[paramInt]);
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        int k = arrayOfInt[j];
        int m = Ej(k);
        this.mtW[m] = k;
        this.dlG[m] = arrayOfObject[j];
        this.lpp[m] = 1;
      }
  }

  public Object get(int paramInt)
  {
    int i = uK(paramInt);
    return i < 0 ? null : this.dlG[i];
  }

  public void clear()
  {
    super.clear();
    int[] arrayOfInt = this.mtW;
    Object[] arrayOfObject = this.dlG;
    byte[] arrayOfByte = this.lpp;

    Arrays.fill(this.mtW, 0, this.mtW.length, 0);
    Arrays.fill(this.dlG, 0, this.dlG.length, null);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public Object remove(int paramInt)
  {
    Object localObject = null;
    int i = uK(paramInt);
    if (i >= 0) {
      localObject = this.dlG[i];
      aQ(i);
    }
    return localObject;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof cSR)) {
      return false;
    }
    cSR localcSR = (cSR)paramObject;
    if (localcSR.size() != size()) {
      return false;
    }
    return a(new ait(localcSR));
  }

  public int hashCode() {
    cjc localcjc = new cjc(this, null);
    a(localcjc);
    return localcjc.akt();
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

  public boolean containsKey(int paramInt)
  {
    return contains(paramInt);
  }

  public boolean a(cIw paramcIw)
  {
    return g(paramcIw);
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

  public boolean a(bPA parambPA)
  {
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.mtW;
    Object[] arrayOfObject = this.dlG;
    for (int i = arrayOfInt.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!parambPA.c(arrayOfInt[i], arrayOfObject[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(bPA parambPA)
  {
    boolean bool = false;
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.mtW;
    Object[] arrayOfObject = this.dlG;

    bOl();
    try {
      for (i = arrayOfInt.length; i-- > 0; )
        if ((arrayOfByte[i] == 1) && (!parambPA.c(arrayOfInt[i], arrayOfObject[i]))) {
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
      int j = paramObjectInput.readInt();
      Object localObject = paramObjectInput.readObject();
      put(j, localObject);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new cHD(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}