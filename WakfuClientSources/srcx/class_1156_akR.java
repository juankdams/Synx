import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class akR extends cCi
  implements Externalizable, Map
{
  static final long serialVersionUID = 1L;
  protected transient Object[] dlG;

  public akR()
  {
  }

  public akR(cBv paramcBv)
  {
    super(paramcBv);
  }

  public akR(int paramInt)
  {
    super(paramInt);
  }

  public akR(int paramInt, cBv paramcBv)
  {
    super(paramInt, paramcBv);
  }

  public akR(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public akR(int paramInt, float paramFloat, cBv paramcBv)
  {
    super(paramInt, paramFloat, paramcBv);
  }

  public akR(Map paramMap)
  {
    this(paramMap.size());
    putAll(paramMap);
  }

  public akR(Map paramMap, cBv paramcBv)
  {
    this(paramMap.size(), paramcBv);
    putAll(paramMap);
  }

  public akR axE()
  {
    akR localakR = (akR)super.axF();
    localakR.dlG = ((Object[])this.dlG.clone());
    return localakR;
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);

    this.dlG = ((Object[])new Object[i]);
    return i;
  }

  public Object put(Object paramObject1, Object paramObject2)
  {
    int i = bb(paramObject1);
    return a(paramObject1, paramObject2, i);
  }

  public Object putIfAbsent(Object paramObject1, Object paramObject2)
  {
    int i = bb(paramObject1);
    if (i < 0)
      return this.dlG[(-i - 1)];
    return a(paramObject1, paramObject2, i);
  }

  private Object a(Object paramObject1, Object paramObject2, int paramInt) {
    Object localObject1 = null;

    int i = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      localObject1 = this.dlG[paramInt];
      i = 0;
    }
    Object localObject2 = this.iuG[paramInt];
    this.iuG[paramInt] = paramObject1;
    this.dlG[paramInt] = paramObject2;
    if (i != 0) {
      fZ(localObject2 == iuJ);
    }

    return localObject1;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Map)) {
      return false;
    }
    Map localMap = (Map)paramObject;
    if (localMap.size() != size()) {
      return false;
    }
    return b(new cRN(localMap));
  }

  public int hashCode() {
    aeA localaeA = new aeA(this, null);
    b(localaeA);
    return localaeA.akt();
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    b(new bxf(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public boolean r(dGy paramdGy)
  {
    return d(paramdGy);
  }

  public boolean s(dGy paramdGy)
  {
    Object[] arrayOfObject1 = this.dlG;
    Object[] arrayOfObject2 = this.iuG;
    for (int i = arrayOfObject1.length; i-- > 0; ) {
      if ((arrayOfObject2[i] != iuJ) && (arrayOfObject2[i] != iuI) && (!paramdGy.d(arrayOfObject1[i])))
      {
        return false;
      }
    }
    return true;
  }

  public boolean b(bZs parambZs)
  {
    Object[] arrayOfObject1 = this.iuG;
    Object[] arrayOfObject2 = this.dlG;
    for (int i = arrayOfObject1.length; i-- > 0; ) {
      if ((arrayOfObject1[i] != iuJ) && (arrayOfObject1[i] != iuI) && (!parambZs.f(arrayOfObject1[i], arrayOfObject2[i])))
      {
        return false;
      }
    }
    return true;
  }

  public boolean c(bZs parambZs)
  {
    boolean bool = false;
    Object[] arrayOfObject1 = this.iuG;
    Object[] arrayOfObject2 = this.dlG;

    bOl();
    try {
      for (i = arrayOfObject1.length; i-- > 0; )
        if ((arrayOfObject1[i] != iuJ) && (arrayOfObject1[i] != iuI) && (!parambZs.f(arrayOfObject1[i], arrayOfObject2[i])))
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

  public void a(cnb paramcnb)
  {
    Object[] arrayOfObject1 = this.dlG;
    Object[] arrayOfObject2 = this.iuG;
    for (int i = arrayOfObject1.length; i-- > 0; )
      if ((arrayOfObject2[i] != iuJ) && (arrayOfObject2[i] != iuI))
        arrayOfObject1[i] = paramcnb.execute(arrayOfObject1[i]);
  }

  protected void rehash(int paramInt)
  {
    int i = this.iuG.length;
    Object[] arrayOfObject1 = this.iuG;
    Object[] arrayOfObject2 = this.dlG;

    this.iuG = new Object[paramInt];
    Arrays.fill(this.iuG, iuJ);
    this.dlG = ((Object[])new Object[paramInt]);

    for (int j = i; j-- > 0; )
      if ((arrayOfObject1[j] != iuJ) && (arrayOfObject1[j] != iuI)) {
        Object localObject = arrayOfObject1[j];
        int k = bb(localObject);
        if (k < 0) {
          q(this.iuG[(-k - 1)], localObject);
        }
        this.iuG[k] = localObject;
        this.dlG[k] = arrayOfObject2[j];
      }
  }

  public Object get(Object paramObject)
  {
    int i = index(paramObject);
    return i < 0 ? null : this.dlG[i];
  }

  public void clear()
  {
    if (size() == 0) return;

    super.clear();

    Arrays.fill(this.iuG, 0, this.iuG.length, iuJ);
    Arrays.fill(this.dlG, 0, this.dlG.length, null);
  }

  public Object remove(Object paramObject)
  {
    Object localObject = null;
    int i = index(paramObject);
    if (i >= 0) {
      localObject = this.dlG[i];
      aQ(i);
    }
    return localObject;
  }

  protected void aQ(int paramInt)
  {
    this.dlG[paramInt] = null;
    super.aQ(paramInt);
  }

  public Collection values()
  {
    return new bag(this);
  }

  public Set keySet()
  {
    return new aVU(this);
  }

  public Set entrySet()
  {
    return new ceE(this);
  }

  public boolean containsValue(Object paramObject)
  {
    Object[] arrayOfObject1 = this.iuG;
    Object[] arrayOfObject2 = this.dlG;
    int i;
    if (null == paramObject) {
      for (i = arrayOfObject2.length; i-- > 0; )
        if ((arrayOfObject1[i] != iuJ) && (arrayOfObject1[i] != iuI) && (paramObject == arrayOfObject2[i]))
        {
          return true;
        }
    }
    else {
      for (i = arrayOfObject2.length; i-- > 0; ) {
        if ((arrayOfObject1[i] != iuJ) && (arrayOfObject1[i] != iuI) && ((paramObject == arrayOfObject2[i]) || (paramObject.equals(arrayOfObject2[i]))))
        {
          return true;
        }
      }
    }
    return false;
  }

  public boolean containsKey(Object paramObject)
  {
    return contains(paramObject);
  }

  public void putAll(Map paramMap)
  {
    ensureCapacity(paramMap.size());

    for (Iterator localIterator = paramMap.entrySet().iterator(); localIterator.hasNext(); ) {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }

  public void writeExternal(ObjectOutput paramObjectOutput)
  {
    paramObjectOutput.writeByte(1);

    super.writeExternal(paramObjectOutput);

    paramObjectOutput.writeInt(this._size);

    cvF localcvF = new cvF(paramObjectOutput);
    if (!b(localcvF))
      throw localcvF.ihg;
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    int i = paramObjectInput.readByte();

    if (i != 0) super.readExternal(paramObjectInput);

    int j = paramObjectInput.readInt();
    aO(j);

    while (j-- > 0)
    {
      Object localObject1 = paramObjectInput.readObject();

      Object localObject2 = paramObjectInput.readObject();
      put(localObject1, localObject2);
    }
  }
}