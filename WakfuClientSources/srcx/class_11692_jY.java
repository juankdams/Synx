import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.Random;

public class jY
  implements Externalizable, Cloneable
{
  static final long serialVersionUID = 1L;
  protected float[] aMO;
  protected int aMP;
  protected static final int DEFAULT_CAPACITY = 10;

  public jY()
  {
    this(10);
  }

  public jY(int paramInt)
  {
    this.aMO = new float[paramInt];
    this.aMP = 0;
  }

  public jY(float[] paramArrayOfFloat)
  {
    this(Math.max(paramArrayOfFloat.length, 10));
    a(paramArrayOfFloat);
  }

  public void ensureCapacity(int paramInt)
  {
    if (paramInt > this.aMO.length) {
      int i = Math.max(this.aMO.length << 1, paramInt);
      float[] arrayOfFloat = new float[i];
      System.arraycopy(this.aMO, 0, arrayOfFloat, 0, this.aMO.length);
      this.aMO = arrayOfFloat;
    }
  }

  public int size()
  {
    return this.aMP;
  }

  public boolean isEmpty()
  {
    return this.aMP == 0;
  }

  public void trimToSize()
  {
    if (this.aMO.length > size()) {
      float[] arrayOfFloat = new float[size()];
      b(arrayOfFloat, 0, arrayOfFloat.length);
      this.aMO = arrayOfFloat;
    }
  }

  public void add(float paramFloat)
  {
    ensureCapacity(this.aMP + 1);
    this.aMO[(this.aMP++)] = paramFloat;
  }

  public void a(float[] paramArrayOfFloat)
  {
    a(paramArrayOfFloat, 0, paramArrayOfFloat.length);
  }

  public void a(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    ensureCapacity(this.aMP + paramInt2);
    System.arraycopy(paramArrayOfFloat, paramInt1, this.aMO, this.aMP, paramInt2);
    this.aMP += paramInt2;
  }

  public void b(int paramInt, float paramFloat)
  {
    if (paramInt == this.aMP) {
      add(paramFloat);
      return;
    }
    ensureCapacity(this.aMP + 1);

    System.arraycopy(this.aMO, paramInt, this.aMO, paramInt + 1, this.aMP - paramInt);

    this.aMO[paramInt] = paramFloat;
    this.aMP += 1;
  }

  public void c(int paramInt, float[] paramArrayOfFloat)
  {
    a(paramInt, paramArrayOfFloat, 0, paramArrayOfFloat.length);
  }

  public void a(int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3)
  {
    if (paramInt1 == this.aMP) {
      a(paramArrayOfFloat, paramInt2, paramInt3);
      return;
    }

    ensureCapacity(this.aMP + paramInt3);

    System.arraycopy(this.aMO, paramInt1, this.aMO, paramInt1 + paramInt3, this.aMP - paramInt1);

    System.arraycopy(paramArrayOfFloat, paramInt2, this.aMO, paramInt1, paramInt3);
    this.aMP += paramInt3;
  }

  public float get(int paramInt)
  {
    if (paramInt >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    return this.aMO[paramInt];
  }

  public float bg(int paramInt)
  {
    return this.aMO[paramInt];
  }

  public void c(int paramInt, float paramFloat)
  {
    if (paramInt >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    this.aMO[paramInt] = paramFloat;
  }

  public float d(int paramInt, float paramFloat)
  {
    if (paramInt >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    float f = this.aMO[paramInt];
    this.aMO[paramInt] = paramFloat;
    return f;
  }

  public void d(int paramInt, float[] paramArrayOfFloat)
  {
    b(paramInt, paramArrayOfFloat, 0, paramArrayOfFloat.length);
  }

  public void b(int paramInt1, float[] paramArrayOfFloat, int paramInt2, int paramInt3)
  {
    if ((paramInt1 < 0) || (paramInt1 + paramInt3 > this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }
    System.arraycopy(paramArrayOfFloat, paramInt2, this.aMO, paramInt1, paramInt3);
  }

  public void e(int paramInt, float paramFloat)
  {
    this.aMO[paramInt] = paramFloat;
  }

  public void clear()
  {
    clear(10);
  }

  public void clear(int paramInt)
  {
    this.aMO = new float[paramInt];
    this.aMP = 0;
  }

  public void reset()
  {
    this.aMP = 0;
    q(0.0F);
  }

  public void rH()
  {
    this.aMP = 0;
  }

  public float bh(int paramInt)
  {
    float f = get(paramInt);
    remove(paramInt, 1);
    return f;
  }

  public void remove(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }

    if (paramInt1 == 0)
    {
      System.arraycopy(this.aMO, paramInt2, this.aMO, 0, this.aMP - paramInt2);
    } else if (this.aMP - paramInt2 != paramInt1)
    {
      System.arraycopy(this.aMO, paramInt1 + paramInt2, this.aMO, paramInt1, this.aMP - (paramInt1 + paramInt2));
    }

    this.aMP -= paramInt2;
  }

  public void a(cbE paramcbE)
  {
    for (int i = this.aMP; i-- > 0; )
      this.aMO[i] = paramcbE.bW(this.aMO[i]);
  }

  public void reverse()
  {
    w(0, this.aMP);
  }

  public void w(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return;
    }
    if (paramInt1 > paramInt2) {
      throw new IllegalArgumentException("from cannot be greater than to");
    }
    int i = paramInt1; for (int j = paramInt2 - 1; i < j; j--) {
      x(i, j);

      i++;
    }
  }

  public void a(Random paramRandom)
  {
    for (int i = this.aMP; i-- > 1; )
      x(i, paramRandom.nextInt(i));
  }

  private final void x(int paramInt1, int paramInt2)
  {
    float f = this.aMO[paramInt1];
    this.aMO[paramInt1] = this.aMO[paramInt2];
    this.aMO[paramInt2] = f;
  }

  public Object clone()
  {
    jY localjY = null;
    try {
      localjY = (jY)super.clone();
      localjY.aMO = rI();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {
    }
    return localjY;
  }

  public jY y(int paramInt1, int paramInt2)
  {
    if (paramInt2 < paramInt1) throw new IllegalArgumentException("end index " + paramInt2 + " greater than begin index " + paramInt1);
    if (paramInt1 < 0) throw new IndexOutOfBoundsException("begin index can not be < 0");
    if (paramInt2 > this.aMO.length) throw new IndexOutOfBoundsException("end index < " + this.aMO.length);
    jY localjY = new jY(paramInt2 - paramInt1);
    for (int i = paramInt1; i < paramInt2; i++) {
      localjY.add(this.aMO[i]);
    }
    return localjY;
  }

  public float[] rI()
  {
    return z(0, this.aMP);
  }

  public float[] z(int paramInt1, int paramInt2)
  {
    float[] arrayOfFloat = new float[paramInt2];
    b(arrayOfFloat, paramInt1, paramInt2);
    return arrayOfFloat;
  }

  public void b(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return;
    }
    if ((paramInt1 < 0) || (paramInt1 >= this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }
    System.arraycopy(this.aMO, paramInt1, paramArrayOfFloat, 0, paramInt2);
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if ((paramObject instanceof jY)) {
      jY localjY = (jY)paramObject;
      if (localjY.size() != size()) {
        return false;
      }
      for (int i = this.aMP; i-- > 0; ) {
        if (this.aMO[i] != localjY.aMO[i]) {
          return false;
        }
      }
      return true;
    }

    return false;
  }

  public int hashCode()
  {
    int i = 0;
    for (int j = this.aMP; j-- > 0; ) {
      i = 37 * i + asd.aA(this.aMO[j]);
    }
    return i;
  }

  public boolean a(bYD parambYD)
  {
    for (int i = 0; i < this.aMP; i++) {
      if (!parambYD.bV(this.aMO[i])) {
        return false;
      }
    }
    return true;
  }

  public boolean b(bYD parambYD)
  {
    for (int i = this.aMP; i-- > 0; ) {
      if (!parambYD.bV(this.aMO[i])) {
        return false;
      }
    }
    return true;
  }

  public void sort()
  {
    Arrays.sort(this.aMO, 0, this.aMP);
  }

  public void A(int paramInt1, int paramInt2)
  {
    Arrays.sort(this.aMO, paramInt1, paramInt2);
  }

  public void q(float paramFloat)
  {
    Arrays.fill(this.aMO, 0, this.aMP, paramFloat);
  }

  public void b(int paramInt1, int paramInt2, float paramFloat)
  {
    if (paramInt2 > this.aMP) {
      ensureCapacity(paramInt2);
      this.aMP = paramInt2;
    }
    Arrays.fill(this.aMO, paramInt1, paramInt2, paramFloat);
  }

  public int r(float paramFloat)
  {
    return a(paramFloat, 0, this.aMP);
  }

  public int a(float paramFloat, int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }
    if (paramInt2 > this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt2);
    }

    int i = paramInt1;
    int j = paramInt2 - 1;

    while (i <= j) {
      int k = i + j >>> 1;
      float f = this.aMO[k];

      if (f < paramFloat)
        i = k + 1;
      else if (f > paramFloat)
        j = k - 1;
      else {
        return k;
      }
    }
    return -(i + 1);
  }

  public int s(float paramFloat)
  {
    return f(0, paramFloat);
  }

  public int f(int paramInt, float paramFloat)
  {
    for (int i = paramInt; i < this.aMP; i++) {
      if (this.aMO[i] == paramFloat) {
        return i;
      }
    }
    return -1;
  }

  public int t(float paramFloat)
  {
    return g(this.aMP, paramFloat);
  }

  public int g(int paramInt, float paramFloat)
  {
    for (int i = paramInt; i-- > 0; ) {
      if (this.aMO[i] == paramFloat) {
        return i;
      }
    }
    return -1;
  }

  public boolean u(float paramFloat)
  {
    return t(paramFloat) >= 0;
  }

  public jY c(bYD parambYD)
  {
    jY localjY = new jY();
    for (int i = 0; i < this.aMP; i++) {
      if (parambYD.bV(this.aMO[i])) {
        localjY.add(this.aMO[i]);
      }
    }
    return localjY;
  }

  public jY d(bYD parambYD)
  {
    jY localjY = new jY();
    for (int i = 0; i < this.aMP; i++) {
      if (!parambYD.bV(this.aMO[i])) {
        localjY.add(this.aMO[i]);
      }
    }
    return localjY;
  }

  public float rJ()
  {
    if (size() == 0) {
      throw new IllegalStateException("cannot find maximum of an empty list");
    }
    float f = (1.0F / -1.0F);
    for (int i = 0; i < this.aMP; i++) {
      if (this.aMO[i] > f) {
        f = this.aMO[i];
      }
    }
    return f;
  }

  public float rK()
  {
    if (size() == 0) {
      throw new IllegalStateException("cannot find minimum of an empty list");
    }
    float f = (1.0F / 1.0F);
    for (int i = 0; i < this.aMP; i++) {
      if (this.aMO[i] < f) {
        f = this.aMO[i];
      }
    }
    return f;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{");
    int i = 0; for (int j = this.aMP - 1; i < j; i++) {
      localStringBuilder.append(this.aMO[i]);
      localStringBuilder.append(", ");
    }
    if (size() > 0) {
      localStringBuilder.append(this.aMO[(this.aMP - 1)]);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public void writeExternal(ObjectOutput paramObjectOutput)
  {
    paramObjectOutput.writeByte(1);

    paramObjectOutput.writeInt(this.aMP);

    int i = this.aMP;
    paramObjectOutput.writeInt(this.aMP);

    for (int j = 0; j < i; j++)
      paramObjectOutput.writeFloat(this.aMO[j]);
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    this.aMP = paramObjectInput.readInt();

    int i = paramObjectInput.readInt();
    this.aMO = new float[i];
    for (int j = 0; j < i; j++)
      this.aMO[j] = paramObjectInput.readFloat();
  }
}