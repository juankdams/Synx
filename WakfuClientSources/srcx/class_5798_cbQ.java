import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.Random;

public class cbQ
  implements Externalizable, Cloneable
{
  static final long serialVersionUID = 1L;
  protected long[] htk;
  protected int aMP;
  protected static final int DEFAULT_CAPACITY = 10;

  public cbQ()
  {
    this(10);
  }

  public cbQ(int paramInt)
  {
    this.htk = new long[paramInt];
    this.aMP = 0;
  }

  public cbQ(long[] paramArrayOfLong)
  {
    this(Math.max(paramArrayOfLong.length, 10));
    o(paramArrayOfLong);
  }

  public void ensureCapacity(int paramInt)
  {
    if (paramInt > this.htk.length) {
      int i = Math.max(this.htk.length << 1, paramInt);
      long[] arrayOfLong = new long[i];
      System.arraycopy(this.htk, 0, arrayOfLong, 0, this.htk.length);
      this.htk = arrayOfLong;
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
    if (this.htk.length > size()) {
      long[] arrayOfLong = new long[size()];
      e(arrayOfLong, 0, arrayOfLong.length);
      this.htk = arrayOfLong;
    }
  }

  public void add(long paramLong)
  {
    ensureCapacity(this.aMP + 1);
    this.htk[(this.aMP++)] = paramLong;
  }

  public void o(long[] paramArrayOfLong)
  {
    d(paramArrayOfLong, 0, paramArrayOfLong.length);
  }

  public void d(long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    ensureCapacity(this.aMP + paramInt2);
    System.arraycopy(paramArrayOfLong, paramInt1, this.htk, this.aMP, paramInt2);
    this.aMP += paramInt2;
  }

  public void r(int paramInt, long paramLong)
  {
    if (paramInt == this.aMP) {
      add(paramLong);
      return;
    }
    ensureCapacity(this.aMP + 1);

    System.arraycopy(this.htk, paramInt, this.htk, paramInt + 1, this.aMP - paramInt);

    this.htk[paramInt] = paramLong;
    this.aMP += 1;
  }

  public void a(int paramInt, long[] paramArrayOfLong)
  {
    a(paramInt, paramArrayOfLong, 0, paramArrayOfLong.length);
  }

  public void a(int paramInt1, long[] paramArrayOfLong, int paramInt2, int paramInt3)
  {
    if (paramInt1 == this.aMP) {
      d(paramArrayOfLong, paramInt2, paramInt3);
      return;
    }

    ensureCapacity(this.aMP + paramInt3);

    System.arraycopy(this.htk, paramInt1, this.htk, paramInt1 + paramInt3, this.aMP - paramInt1);

    System.arraycopy(paramArrayOfLong, paramInt2, this.htk, paramInt1, paramInt3);
    this.aMP += paramInt3;
  }

  public long get(int paramInt)
  {
    if (paramInt >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    return this.htk[paramInt];
  }

  public long uD(int paramInt)
  {
    return this.htk[paramInt];
  }

  public void set(int paramInt, long paramLong)
  {
    if (paramInt >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    this.htk[paramInt] = paramLong;
  }

  public long s(int paramInt, long paramLong)
  {
    if (paramInt >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    long l = this.htk[paramInt];
    this.htk[paramInt] = paramLong;
    return l;
  }

  public void b(int paramInt, long[] paramArrayOfLong)
  {
    b(paramInt, paramArrayOfLong, 0, paramArrayOfLong.length);
  }

  public void b(int paramInt1, long[] paramArrayOfLong, int paramInt2, int paramInt3)
  {
    if ((paramInt1 < 0) || (paramInt1 + paramInt3 > this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }
    System.arraycopy(paramArrayOfLong, paramInt2, this.htk, paramInt1, paramInt3);
  }

  public void t(int paramInt, long paramLong)
  {
    this.htk[paramInt] = paramLong;
  }

  public void clear()
  {
    clear(10);
  }

  public void clear(int paramInt)
  {
    this.htk = new long[paramInt];
    this.aMP = 0;
  }

  public void reset()
  {
    this.aMP = 0;
    hj(0L);
  }

  public void rH()
  {
    this.aMP = 0;
  }

  public long remove(int paramInt)
  {
    long l = get(paramInt);
    remove(paramInt, 1);
    return l;
  }

  public void remove(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }

    if (paramInt1 == 0)
    {
      System.arraycopy(this.htk, paramInt2, this.htk, 0, this.aMP - paramInt2);
    } else if (this.aMP - paramInt2 != paramInt1)
    {
      System.arraycopy(this.htk, paramInt1 + paramInt2, this.htk, paramInt1, this.aMP - (paramInt1 + paramInt2));
    }

    this.aMP -= paramInt2;
  }

  public void a(cAm paramcAm)
  {
    for (int i = this.aMP; i-- > 0; )
      this.htk[i] = paramcAm.e(this.htk[i]);
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
    long l = this.htk[paramInt1];
    this.htk[paramInt1] = this.htk[paramInt2];
    this.htk[paramInt2] = l;
  }

  public Object clone()
  {
    cbQ localcbQ = null;
    try {
      localcbQ = (cbQ)super.clone();
      localcbQ.htk = cfv();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {
    }
    return localcbQ;
  }

  public cbQ dr(int paramInt1, int paramInt2)
  {
    if (paramInt2 < paramInt1) throw new IllegalArgumentException("end index " + paramInt2 + " greater than begin index " + paramInt1);
    if (paramInt1 < 0) throw new IndexOutOfBoundsException("begin index can not be < 0");
    if (paramInt2 > this.htk.length) throw new IndexOutOfBoundsException("end index < " + this.htk.length);
    cbQ localcbQ = new cbQ(paramInt2 - paramInt1);
    for (int i = paramInt1; i < paramInt2; i++) {
      localcbQ.add(this.htk[i]);
    }
    return localcbQ;
  }

  public long[] cfv()
  {
    return ds(0, this.aMP);
  }

  public long[] ds(int paramInt1, int paramInt2)
  {
    long[] arrayOfLong = new long[paramInt2];
    e(arrayOfLong, paramInt1, paramInt2);
    return arrayOfLong;
  }

  public void e(long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return;
    }
    if ((paramInt1 < 0) || (paramInt1 >= this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }
    System.arraycopy(this.htk, paramInt1, paramArrayOfLong, 0, paramInt2);
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if ((paramObject instanceof cbQ)) {
      cbQ localcbQ = (cbQ)paramObject;
      if (localcbQ.size() != size()) {
        return false;
      }
      for (int i = this.aMP; i-- > 0; ) {
        if (this.htk[i] != localcbQ.htk[i]) {
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
      i = 37 * i + asd.dm(this.htk[j]);
    }
    return i;
  }

  public boolean b(CE paramCE)
  {
    for (int i = 0; i < this.aMP; i++) {
      if (!paramCE.Q(this.htk[i])) {
        return false;
      }
    }
    return true;
  }

  public boolean d(CE paramCE)
  {
    for (int i = this.aMP; i-- > 0; ) {
      if (!paramCE.Q(this.htk[i])) {
        return false;
      }
    }
    return true;
  }

  public void sort()
  {
    Arrays.sort(this.htk, 0, this.aMP);
  }

  public void A(int paramInt1, int paramInt2)
  {
    Arrays.sort(this.htk, paramInt1, paramInt2);
  }

  public void hj(long paramLong)
  {
    Arrays.fill(this.htk, 0, this.aMP, paramLong);
  }

  public void b(int paramInt1, int paramInt2, long paramLong)
  {
    if (paramInt2 > this.aMP) {
      ensureCapacity(paramInt2);
      this.aMP = paramInt2;
    }
    Arrays.fill(this.htk, paramInt1, paramInt2, paramLong);
  }

  public int hk(long paramLong)
  {
    return b(paramLong, 0, this.aMP);
  }

  public int b(long paramLong, int paramInt1, int paramInt2)
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
      long l = this.htk[k];

      if (l < paramLong)
        i = k + 1;
      else if (l > paramLong)
        j = k - 1;
      else {
        return k;
      }
    }
    return -(i + 1);
  }

  public int hl(long paramLong)
  {
    return u(0, paramLong);
  }

  public int u(int paramInt, long paramLong)
  {
    for (int i = paramInt; i < this.aMP; i++) {
      if (this.htk[i] == paramLong) {
        return i;
      }
    }
    return -1;
  }

  public int hm(long paramLong)
  {
    return v(this.aMP, paramLong);
  }

  public int v(int paramInt, long paramLong)
  {
    for (int i = paramInt; i-- > 0; ) {
      if (this.htk[i] == paramLong) {
        return i;
      }
    }
    return -1;
  }

  public boolean N(long paramLong)
  {
    return hm(paramLong) >= 0;
  }

  public cbQ e(CE paramCE)
  {
    cbQ localcbQ = new cbQ();
    for (int i = 0; i < this.aMP; i++) {
      if (paramCE.Q(this.htk[i])) {
        localcbQ.add(this.htk[i]);
      }
    }
    return localcbQ;
  }

  public cbQ f(CE paramCE)
  {
    cbQ localcbQ = new cbQ();
    for (int i = 0; i < this.aMP; i++) {
      if (!paramCE.Q(this.htk[i])) {
        localcbQ.add(this.htk[i]);
      }
    }
    return localcbQ;
  }

  public long cfw()
  {
    if (size() == 0) {
      throw new IllegalStateException("cannot find maximum of an empty list");
    }
    long l = -9223372036854775808L;
    for (int i = 0; i < this.aMP; i++) {
      if (this.htk[i] > l) {
        l = this.htk[i];
      }
    }
    return l;
  }

  public long cfx()
  {
    if (size() == 0) {
      throw new IllegalStateException("cannot find minimum of an empty list");
    }
    long l = 9223372036854775807L;
    for (int i = 0; i < this.aMP; i++) {
      if (this.htk[i] < l) {
        l = this.htk[i];
      }
    }
    return l;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{");
    int i = 0; for (int j = this.aMP - 1; i < j; i++) {
      localStringBuilder.append(this.htk[i]);
      localStringBuilder.append(", ");
    }
    if (size() > 0) {
      localStringBuilder.append(this.htk[(this.aMP - 1)]);
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
      paramObjectOutput.writeLong(this.htk[j]);
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    this.aMP = paramObjectInput.readInt();

    int i = paramObjectInput.readInt();
    this.htk = new long[i];
    for (int j = 0; j < i; j++)
      this.htk[j] = paramObjectInput.readLong();
  }
}