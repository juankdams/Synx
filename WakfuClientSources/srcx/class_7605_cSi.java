import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.Random;

public class cSi
  implements Externalizable, Cloneable
{
  static final long serialVersionUID = 1L;
  protected int[] kEq;
  protected int aMP;
  protected static final int DEFAULT_CAPACITY = 10;

  public cSi()
  {
    this(10);
  }

  public cSi(int paramInt)
  {
    this.kEq = new int[paramInt];
    this.aMP = 0;
  }

  public cSi(int[] paramArrayOfInt)
  {
    this(Math.max(paramArrayOfInt.length, 10));
    add(paramArrayOfInt);
  }

  public void ensureCapacity(int paramInt)
  {
    if (paramInt > this.kEq.length) {
      int i = Math.max(this.kEq.length << 1, paramInt);
      int[] arrayOfInt = new int[i];
      System.arraycopy(this.kEq, 0, arrayOfInt, 0, this.kEq.length);
      this.kEq = arrayOfInt;
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
    if (this.kEq.length > size()) {
      int[] arrayOfInt = new int[size()];
      h(arrayOfInt, 0, arrayOfInt.length);
      this.kEq = arrayOfInt;
    }
  }

  public void add(int paramInt)
  {
    ensureCapacity(this.aMP + 1);
    this.kEq[(this.aMP++)] = paramInt;
  }

  public void add(int[] paramArrayOfInt)
  {
    g(paramArrayOfInt, 0, paramArrayOfInt.length);
  }

  public void g(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    ensureCapacity(this.aMP + paramInt2);
    System.arraycopy(paramArrayOfInt, paramInt1, this.kEq, this.aMP, paramInt2);
    this.aMP += paramInt2;
  }

  public void et(int paramInt1, int paramInt2)
  {
    if (paramInt1 == this.aMP) {
      add(paramInt2);
      return;
    }
    ensureCapacity(this.aMP + 1);

    System.arraycopy(this.kEq, paramInt1, this.kEq, paramInt1 + 1, this.aMP - paramInt1);

    this.kEq[paramInt1] = paramInt2;
    this.aMP += 1;
  }

  public void j(int paramInt, int[] paramArrayOfInt)
  {
    a(paramInt, paramArrayOfInt, 0, paramArrayOfInt.length);
  }

  public void a(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3)
  {
    if (paramInt1 == this.aMP) {
      g(paramArrayOfInt, paramInt2, paramInt3);
      return;
    }

    ensureCapacity(this.aMP + paramInt3);

    System.arraycopy(this.kEq, paramInt1, this.kEq, paramInt1 + paramInt3, this.aMP - paramInt1);

    System.arraycopy(paramArrayOfInt, paramInt2, this.kEq, paramInt1, paramInt3);
    this.aMP += paramInt3;
  }

  public int get(int paramInt)
  {
    if (paramInt >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    return this.kEq[paramInt];
  }

  public int wm(int paramInt)
  {
    return this.kEq[paramInt];
  }

  public void set(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }
    this.kEq[paramInt1] = paramInt2;
  }

  public int eu(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }
    int i = this.kEq[paramInt1];
    this.kEq[paramInt1] = paramInt2;
    return i;
  }

  public void k(int paramInt, int[] paramArrayOfInt)
  {
    b(paramInt, paramArrayOfInt, 0, paramArrayOfInt.length);
  }

  public void b(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3)
  {
    if ((paramInt1 < 0) || (paramInt1 + paramInt3 > this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }
    System.arraycopy(paramArrayOfInt, paramInt2, this.kEq, paramInt1, paramInt3);
  }

  public void ev(int paramInt1, int paramInt2)
  {
    this.kEq[paramInt1] = paramInt2;
  }

  public void clear()
  {
    clear(10);
  }

  public void clear(int paramInt)
  {
    this.kEq = new int[paramInt];
    this.aMP = 0;
  }

  public void reset()
  {
    this.aMP = 0;
    fill(0);
  }

  public void rH()
  {
    this.aMP = 0;
  }

  public int wH(int paramInt)
  {
    int i = get(paramInt);
    remove(paramInt, 1);
    return i;
  }

  public void remove(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }

    if (paramInt1 == 0)
    {
      System.arraycopy(this.kEq, paramInt2, this.kEq, 0, this.aMP - paramInt2);
    } else if (this.aMP - paramInt2 != paramInt1)
    {
      System.arraycopy(this.kEq, paramInt1 + paramInt2, this.kEq, paramInt1, this.aMP - (paramInt1 + paramInt2));
    }

    this.aMP -= paramInt2;
  }

  public void a(bwW parambwW)
  {
    for (int i = this.aMP; i-- > 0; )
      this.kEq[i] = parambwW.rt(this.kEq[i]);
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
    int i = this.kEq[paramInt1];
    this.kEq[paramInt1] = this.kEq[paramInt2];
    this.kEq[paramInt2] = i;
  }

  public Object clone()
  {
    cSi localcSi = null;
    try {
      localcSi = (cSi)super.clone();
      localcSi.kEq = cIf();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {
    }
    return localcSi;
  }

  public cSi ew(int paramInt1, int paramInt2)
  {
    if (paramInt2 < paramInt1) throw new IllegalArgumentException("end index " + paramInt2 + " greater than begin index " + paramInt1);
    if (paramInt1 < 0) throw new IndexOutOfBoundsException("begin index can not be < 0");
    if (paramInt2 > this.kEq.length) throw new IndexOutOfBoundsException("end index < " + this.kEq.length);
    cSi localcSi = new cSi(paramInt2 - paramInt1);
    for (int i = paramInt1; i < paramInt2; i++) {
      localcSi.add(this.kEq[i]);
    }
    return localcSi;
  }

  public int[] cIf()
  {
    return ex(0, this.aMP);
  }

  public int[] ex(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = new int[paramInt2];
    h(arrayOfInt, paramInt1, paramInt2);
    return arrayOfInt;
  }

  public void h(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return;
    }
    if ((paramInt1 < 0) || (paramInt1 >= this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }
    System.arraycopy(this.kEq, paramInt1, paramArrayOfInt, 0, paramInt2);
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if ((paramObject instanceof cSi)) {
      cSi localcSi = (cSi)paramObject;
      if (localcSi.size() != size()) {
        return false;
      }
      for (int i = this.aMP; i-- > 0; ) {
        if (this.kEq[i] != localcSi.kEq[i]) {
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
      i = 37 * i + asd.jV(this.kEq[j]);
    }
    return i;
  }

  public boolean g(cIw paramcIw)
  {
    for (int i = 0; i < this.aMP; i++) {
      if (!paramcIw.R(this.kEq[i])) {
        return false;
      }
    }
    return true;
  }

  public boolean h(cIw paramcIw)
  {
    for (int i = this.aMP; i-- > 0; ) {
      if (!paramcIw.R(this.kEq[i])) {
        return false;
      }
    }
    return true;
  }

  public void sort()
  {
    Arrays.sort(this.kEq, 0, this.aMP);
  }

  public void A(int paramInt1, int paramInt2)
  {
    Arrays.sort(this.kEq, paramInt1, paramInt2);
  }

  public void fill(int paramInt)
  {
    Arrays.fill(this.kEq, 0, this.aMP, paramInt);
  }

  public void W(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 > this.aMP) {
      ensureCapacity(paramInt2);
      this.aMP = paramInt2;
    }
    Arrays.fill(this.kEq, paramInt1, paramInt2, paramInt3);
  }

  public int yX(int paramInt)
  {
    return X(paramInt, 0, this.aMP);
  }

  public int X(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 < 0) {
      throw new ArrayIndexOutOfBoundsException(paramInt2);
    }
    if (paramInt3 > this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt3);
    }

    int i = paramInt2;
    int j = paramInt3 - 1;

    while (i <= j) {
      int k = i + j >>> 1;
      int m = this.kEq[k];

      if (m < paramInt1)
        i = k + 1;
      else if (m > paramInt1)
        j = k - 1;
      else {
        return k;
      }
    }
    return -(i + 1);
  }

  public int indexOf(int paramInt)
  {
    return indexOf(0, paramInt);
  }

  public int indexOf(int paramInt1, int paramInt2)
  {
    for (int i = paramInt1; i < this.aMP; i++) {
      if (this.kEq[i] == paramInt2) {
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(int paramInt)
  {
    return lastIndexOf(this.aMP, paramInt);
  }

  public int lastIndexOf(int paramInt1, int paramInt2)
  {
    for (int i = paramInt1; i-- > 0; ) {
      if (this.kEq[i] == paramInt2) {
        return i;
      }
    }
    return -1;
  }

  public boolean contains(int paramInt)
  {
    return lastIndexOf(paramInt) >= 0;
  }

  public cSi i(cIw paramcIw)
  {
    cSi localcSi = new cSi();
    for (int i = 0; i < this.aMP; i++) {
      if (paramcIw.R(this.kEq[i])) {
        localcSi.add(this.kEq[i]);
      }
    }
    return localcSi;
  }

  public cSi j(cIw paramcIw)
  {
    cSi localcSi = new cSi();
    for (int i = 0; i < this.aMP; i++) {
      if (!paramcIw.R(this.kEq[i])) {
        localcSi.add(this.kEq[i]);
      }
    }
    return localcSi;
  }

  public int max()
  {
    if (size() == 0) {
      throw new IllegalStateException("cannot find maximum of an empty list");
    }
    int i = -2147483648;
    for (int j = 0; j < this.aMP; j++) {
      if (this.kEq[j] > i) {
        i = this.kEq[j];
      }
    }
    return i;
  }

  public int min()
  {
    if (size() == 0) {
      throw new IllegalStateException("cannot find minimum of an empty list");
    }
    int i = 2147483647;
    for (int j = 0; j < this.aMP; j++) {
      if (this.kEq[j] < i) {
        i = this.kEq[j];
      }
    }
    return i;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{");
    int i = 0; for (int j = this.aMP - 1; i < j; i++) {
      localStringBuilder.append(this.kEq[i]);
      localStringBuilder.append(", ");
    }
    if (size() > 0) {
      localStringBuilder.append(this.kEq[(this.aMP - 1)]);
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
      paramObjectOutput.writeInt(this.kEq[j]);
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    this.aMP = paramObjectInput.readInt();

    int i = paramObjectInput.readInt();
    this.kEq = new int[i];
    for (int j = 0; j < i; j++)
      this.kEq[j] = paramObjectInput.readInt();
  }
}