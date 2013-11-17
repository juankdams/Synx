import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.Random;

public class bHu
  implements Externalizable, Cloneable
{
  static final long serialVersionUID = 1L;
  protected short[] gFW;
  protected int aMP;
  protected static final int DEFAULT_CAPACITY = 10;

  public bHu()
  {
    this(10);
  }

  public bHu(int paramInt)
  {
    this.gFW = new short[paramInt];
    this.aMP = 0;
  }

  public bHu(short[] paramArrayOfShort)
  {
    this(Math.max(paramArrayOfShort.length, 10));
    o(paramArrayOfShort);
  }

  public void ensureCapacity(int paramInt)
  {
    if (paramInt > this.gFW.length) {
      int i = Math.max(this.gFW.length << 1, paramInt);
      short[] arrayOfShort = new short[i];
      System.arraycopy(this.gFW, 0, arrayOfShort, 0, this.gFW.length);
      this.gFW = arrayOfShort;
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
    if (this.gFW.length > size()) {
      short[] arrayOfShort = new short[size()];
      c(arrayOfShort, 0, arrayOfShort.length);
      this.gFW = arrayOfShort;
    }
  }

  public void add(short paramShort)
  {
    ensureCapacity(this.aMP + 1);
    this.gFW[(this.aMP++)] = paramShort;
  }

  public void o(short[] paramArrayOfShort)
  {
    b(paramArrayOfShort, 0, paramArrayOfShort.length);
  }

  public void b(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    ensureCapacity(this.aMP + paramInt2);
    System.arraycopy(paramArrayOfShort, paramInt1, this.gFW, this.aMP, paramInt2);
    this.aMP += paramInt2;
  }

  public void u(int paramInt, short paramShort)
  {
    if (paramInt == this.aMP) {
      add(paramShort);
      return;
    }
    ensureCapacity(this.aMP + 1);

    System.arraycopy(this.gFW, paramInt, this.gFW, paramInt + 1, this.aMP - paramInt);

    this.gFW[paramInt] = paramShort;
    this.aMP += 1;
  }

  public void a(int paramInt, short[] paramArrayOfShort)
  {
    a(paramInt, paramArrayOfShort, 0, paramArrayOfShort.length);
  }

  public void a(int paramInt1, short[] paramArrayOfShort, int paramInt2, int paramInt3)
  {
    if (paramInt1 == this.aMP) {
      b(paramArrayOfShort, paramInt2, paramInt3);
      return;
    }

    ensureCapacity(this.aMP + paramInt3);

    System.arraycopy(this.gFW, paramInt1, this.gFW, paramInt1 + paramInt3, this.aMP - paramInt1);

    System.arraycopy(paramArrayOfShort, paramInt2, this.gFW, paramInt1, paramInt3);
    this.aMP += paramInt3;
  }

  public short get(int paramInt)
  {
    if (paramInt >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    return this.gFW[paramInt];
  }

  public short sV(int paramInt)
  {
    return this.gFW[paramInt];
  }

  public void v(int paramInt, short paramShort)
  {
    if (paramInt >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    this.gFW[paramInt] = paramShort;
  }

  public short w(int paramInt, short paramShort)
  {
    if (paramInt >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    short s = this.gFW[paramInt];
    this.gFW[paramInt] = paramShort;
    return s;
  }

  public void b(int paramInt, short[] paramArrayOfShort)
  {
    b(paramInt, paramArrayOfShort, 0, paramArrayOfShort.length);
  }

  public void b(int paramInt1, short[] paramArrayOfShort, int paramInt2, int paramInt3)
  {
    if ((paramInt1 < 0) || (paramInt1 + paramInt3 > this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }
    System.arraycopy(paramArrayOfShort, paramInt2, this.gFW, paramInt1, paramInt3);
  }

  public void x(int paramInt, short paramShort)
  {
    this.gFW[paramInt] = paramShort;
  }

  public void clear()
  {
    clear(10);
  }

  public void clear(int paramInt)
  {
    this.gFW = new short[paramInt];
    this.aMP = 0;
  }

  public void reset()
  {
    this.aMP = 0;
    B((short)0);
  }

  public void rH()
  {
    this.aMP = 0;
  }

  public short aP(int paramInt)
  {
    short s = get(paramInt);
    remove(paramInt, 1);
    return s;
  }

  public void remove(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }

    if (paramInt1 == 0)
    {
      System.arraycopy(this.gFW, paramInt2, this.gFW, 0, this.aMP - paramInt2);
    } else if (this.aMP - paramInt2 != paramInt1)
    {
      System.arraycopy(this.gFW, paramInt1 + paramInt2, this.gFW, paramInt1, this.aMP - (paramInt1 + paramInt2));
    }

    this.aMP -= paramInt2;
  }

  public void a(dGq paramdGq)
  {
    for (int i = this.aMP; i-- > 0; )
      this.gFW[i] = paramdGq.eF(this.gFW[i]);
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
    int i = this.gFW[paramInt1];
    this.gFW[paramInt1] = this.gFW[paramInt2];
    this.gFW[paramInt2] = i;
  }

  public Object clone()
  {
    bHu localbHu = null;
    try {
      localbHu = (bHu)super.clone();
      localbHu.gFW = bOU();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {
    }
    return localbHu;
  }

  public bHu cV(int paramInt1, int paramInt2)
  {
    if (paramInt2 < paramInt1) throw new IllegalArgumentException("end index " + paramInt2 + " greater than begin index " + paramInt1);
    if (paramInt1 < 0) throw new IndexOutOfBoundsException("begin index can not be < 0");
    if (paramInt2 > this.gFW.length) throw new IndexOutOfBoundsException("end index < " + this.gFW.length);
    bHu localbHu = new bHu(paramInt2 - paramInt1);
    for (int i = paramInt1; i < paramInt2; i++) {
      localbHu.add(this.gFW[i]);
    }
    return localbHu;
  }

  public short[] bOU()
  {
    return cW(0, this.aMP);
  }

  public short[] cW(int paramInt1, int paramInt2)
  {
    short[] arrayOfShort = new short[paramInt2];
    c(arrayOfShort, paramInt1, paramInt2);
    return arrayOfShort;
  }

  public void c(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return;
    }
    if ((paramInt1 < 0) || (paramInt1 >= this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }
    System.arraycopy(this.gFW, paramInt1, paramArrayOfShort, 0, paramInt2);
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if ((paramObject instanceof bHu)) {
      bHu localbHu = (bHu)paramObject;
      if (localbHu.size() != size()) {
        return false;
      }
      for (int i = this.aMP; i-- > 0; ) {
        if (this.gFW[i] != localbHu.gFW[i]) {
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
      i = 37 * i + asd.jV(this.gFW[j]);
    }
    return i;
  }

  public boolean c(dfG paramdfG)
  {
    for (int i = 0; i < this.aMP; i++) {
      if (!paramdfG.bb(this.gFW[i])) {
        return false;
      }
    }
    return true;
  }

  public boolean d(dfG paramdfG)
  {
    for (int i = this.aMP; i-- > 0; ) {
      if (!paramdfG.bb(this.gFW[i])) {
        return false;
      }
    }
    return true;
  }

  public void sort()
  {
    Arrays.sort(this.gFW, 0, this.aMP);
  }

  public void A(int paramInt1, int paramInt2)
  {
    Arrays.sort(this.gFW, paramInt1, paramInt2);
  }

  public void B(short paramShort)
  {
    Arrays.fill(this.gFW, 0, this.aMP, paramShort);
  }

  public void M(int paramInt1, int paramInt2, short paramShort)
  {
    if (paramInt2 > this.aMP) {
      ensureCapacity(paramInt2);
      this.aMP = paramInt2;
    }
    Arrays.fill(this.gFW, paramInt1, paramInt2, paramShort);
  }

  public int cz(short paramShort)
  {
    return c(paramShort, 0, this.aMP);
  }

  public int c(short paramShort, int paramInt1, int paramInt2)
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
      short s = this.gFW[k];

      if (s < paramShort)
        i = k + 1;
      else if (s > paramShort)
        j = k - 1;
      else {
        return k;
      }
    }
    return -(i + 1);
  }

  public int cA(short paramShort)
  {
    return y(0, paramShort);
  }

  public int y(int paramInt, short paramShort)
  {
    for (int i = paramInt; i < this.aMP; i++) {
      if (this.gFW[i] == paramShort) {
        return i;
      }
    }
    return -1;
  }

  public int cB(short paramShort)
  {
    return z(this.aMP, paramShort);
  }

  public int z(int paramInt, short paramShort)
  {
    for (int i = paramInt; i-- > 0; ) {
      if (this.gFW[i] == paramShort) {
        return i;
      }
    }
    return -1;
  }

  public boolean contains(short paramShort)
  {
    return cB(paramShort) >= 0;
  }

  public bHu e(dfG paramdfG)
  {
    bHu localbHu = new bHu();
    for (int i = 0; i < this.aMP; i++) {
      if (paramdfG.bb(this.gFW[i])) {
        localbHu.add(this.gFW[i]);
      }
    }
    return localbHu;
  }

  public bHu f(dfG paramdfG)
  {
    bHu localbHu = new bHu();
    for (int i = 0; i < this.aMP; i++) {
      if (!paramdfG.bb(this.gFW[i])) {
        localbHu.add(this.gFW[i]);
      }
    }
    return localbHu;
  }

  public short bOV()
  {
    if (size() == 0) {
      throw new IllegalStateException("cannot find maximum of an empty list");
    }
    short s = -32768;
    for (int i = 0; i < this.aMP; i++) {
      if (this.gFW[i] > s) {
        s = this.gFW[i];
      }
    }
    return s;
  }

  public short bOW()
  {
    if (size() == 0) {
      throw new IllegalStateException("cannot find minimum of an empty list");
    }
    short s = 32767;
    for (int i = 0; i < this.aMP; i++) {
      if (this.gFW[i] < s) {
        s = this.gFW[i];
      }
    }
    return s;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{");
    int i = 0; for (int j = this.aMP - 1; i < j; i++) {
      localStringBuilder.append(this.gFW[i]);
      localStringBuilder.append(", ");
    }
    if (size() > 0) {
      localStringBuilder.append(this.gFW[(this.aMP - 1)]);
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
      paramObjectOutput.writeShort(this.gFW[j]);
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    this.aMP = paramObjectInput.readInt();

    int i = paramObjectInput.readInt();
    this.gFW = new short[i];
    for (int j = 0; j < i; j++)
      this.gFW[j] = paramObjectInput.readShort();
  }
}