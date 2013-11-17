import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.Random;

public class bvv
  implements Externalizable, Cloneable
{
  static final long serialVersionUID = 1L;
  protected byte[] aVp;
  protected int aMP;
  protected static final int DEFAULT_CAPACITY = 10;

  public bvv()
  {
    this(10);
  }

  public bvv(int paramInt)
  {
    this.aVp = new byte[paramInt];
    this.aMP = 0;
  }

  public bvv(byte[] paramArrayOfByte)
  {
    this(Math.max(paramArrayOfByte.length, 10));
    ae(paramArrayOfByte);
  }

  public void ensureCapacity(int paramInt)
  {
    if (paramInt > this.aVp.length) {
      int i = Math.max(this.aVp.length << 1, paramInt);
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.aVp, 0, arrayOfByte, 0, this.aVp.length);
      this.aVp = arrayOfByte;
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
    if (this.aVp.length > size()) {
      byte[] arrayOfByte = new byte[size()];
      k(arrayOfByte, 0, arrayOfByte.length);
      this.aVp = arrayOfByte;
    }
  }

  public void add(byte paramByte)
  {
    ensureCapacity(this.aMP + 1);
    this.aVp[(this.aMP++)] = paramByte;
  }

  public void ae(byte[] paramArrayOfByte)
  {
    j(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public void j(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    ensureCapacity(this.aMP + paramInt2);
    System.arraycopy(paramArrayOfByte, paramInt1, this.aVp, this.aMP, paramInt2);
    this.aMP += paramInt2;
  }

  public void r(int paramInt, byte paramByte)
  {
    if (paramInt == this.aMP) {
      add(paramByte);
      return;
    }
    ensureCapacity(this.aMP + 1);

    System.arraycopy(this.aVp, paramInt, this.aVp, paramInt + 1, this.aMP - paramInt);

    this.aVp[paramInt] = paramByte;
    this.aMP += 1;
  }

  public void a(int paramInt, byte[] paramArrayOfByte)
  {
    a(paramInt, paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public void a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if (paramInt1 == this.aMP) {
      j(paramArrayOfByte, paramInt2, paramInt3);
      return;
    }

    ensureCapacity(this.aMP + paramInt3);

    System.arraycopy(this.aVp, paramInt1, this.aVp, paramInt1 + paramInt3, this.aMP - paramInt1);

    System.arraycopy(paramArrayOfByte, paramInt2, this.aVp, paramInt1, paramInt3);
    this.aMP += paramInt3;
  }

  public byte get(int paramInt)
  {
    if (paramInt >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    return this.aVp[paramInt];
  }

  public byte rk(int paramInt)
  {
    return this.aVp[paramInt];
  }

  public void s(int paramInt, byte paramByte)
  {
    if (paramInt >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    this.aVp[paramInt] = paramByte;
  }

  public byte t(int paramInt, byte paramByte)
  {
    if (paramInt >= this.aMP) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    byte b = this.aVp[paramInt];
    this.aVp[paramInt] = paramByte;
    return b;
  }

  public void b(int paramInt, byte[] paramArrayOfByte)
  {
    b(paramInt, paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public void b(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if ((paramInt1 < 0) || (paramInt1 + paramInt3 > this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }
    System.arraycopy(paramArrayOfByte, paramInt2, this.aVp, paramInt1, paramInt3);
  }

  public void u(int paramInt, byte paramByte)
  {
    this.aVp[paramInt] = paramByte;
  }

  public void clear()
  {
    clear(10);
  }

  public void clear(int paramInt)
  {
    this.aVp = new byte[paramInt];
    this.aMP = 0;
  }

  public void reset()
  {
    this.aMP = 0;
    o((byte)0);
  }

  public void rH()
  {
    this.aMP = 0;
  }

  public byte pV(int paramInt)
  {
    byte b = get(paramInt);
    remove(paramInt, 1);
    return b;
  }

  public void remove(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }

    if (paramInt1 == 0)
    {
      System.arraycopy(this.aVp, paramInt2, this.aVp, 0, this.aMP - paramInt2);
    } else if (this.aMP - paramInt2 != paramInt1)
    {
      System.arraycopy(this.aVp, paramInt1 + paramInt2, this.aVp, paramInt1, this.aMP - (paramInt1 + paramInt2));
    }

    this.aMP -= paramInt2;
  }

  public void a(ctI paramctI)
  {
    for (int i = this.aMP; i-- > 0; )
      this.aVp[i] = paramctI.dW(this.aVp[i]);
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
    int i = this.aVp[paramInt1];
    this.aVp[paramInt1] = this.aVp[paramInt2];
    this.aVp[paramInt2] = i;
  }

  public Object clone()
  {
    bvv localbvv = null;
    try {
      localbvv = (bvv)super.clone();
      localbvv.aVp = bDf();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {
    }
    return localbvv;
  }

  public bvv cC(int paramInt1, int paramInt2)
  {
    if (paramInt2 < paramInt1) throw new IllegalArgumentException("end index " + paramInt2 + " greater than begin index " + paramInt1);
    if (paramInt1 < 0) throw new IndexOutOfBoundsException("begin index can not be < 0");
    if (paramInt2 > this.aVp.length) throw new IndexOutOfBoundsException("end index < " + this.aVp.length);
    bvv localbvv = new bvv(paramInt2 - paramInt1);
    for (int i = paramInt1; i < paramInt2; i++) {
      localbvv.add(this.aVp[i]);
    }
    return localbvv;
  }

  public byte[] bDf()
  {
    return cD(0, this.aMP);
  }

  public byte[] cD(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    k(arrayOfByte, paramInt1, paramInt2);
    return arrayOfByte;
  }

  public void k(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return;
    }
    if ((paramInt1 < 0) || (paramInt1 >= this.aMP)) {
      throw new ArrayIndexOutOfBoundsException(paramInt1);
    }
    System.arraycopy(this.aVp, paramInt1, paramArrayOfByte, 0, paramInt2);
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if ((paramObject instanceof bvv)) {
      bvv localbvv = (bvv)paramObject;
      if (localbvv.size() != size()) {
        return false;
      }
      for (int i = this.aMP; i-- > 0; ) {
        if (this.aVp[i] != localbvv.aVp[i]) {
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
      i = 37 * i + asd.jV(this.aVp[j]);
    }
    return i;
  }

  public boolean c(Tp paramTp)
  {
    for (int i = 0; i < this.aMP; i++) {
      if (!paramTp.t(this.aVp[i])) {
        return false;
      }
    }
    return true;
  }

  public boolean d(Tp paramTp)
  {
    for (int i = this.aMP; i-- > 0; ) {
      if (!paramTp.t(this.aVp[i])) {
        return false;
      }
    }
    return true;
  }

  public void sort()
  {
    Arrays.sort(this.aVp, 0, this.aMP);
  }

  public void A(int paramInt1, int paramInt2)
  {
    Arrays.sort(this.aVp, paramInt1, paramInt2);
  }

  public void o(byte paramByte)
  {
    Arrays.fill(this.aVp, 0, this.aMP, paramByte);
  }

  public void b(int paramInt1, int paramInt2, byte paramByte)
  {
    if (paramInt2 > this.aMP) {
      ensureCapacity(paramInt2);
      this.aMP = paramInt2;
    }
    Arrays.fill(this.aVp, paramInt1, paramInt2, paramByte);
  }

  public int de(byte paramByte)
  {
    return g(paramByte, 0, this.aMP);
  }

  public int g(byte paramByte, int paramInt1, int paramInt2)
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
      byte b = this.aVp[k];

      if (b < paramByte)
        i = k + 1;
      else if (b > paramByte)
        j = k - 1;
      else {
        return k;
      }
    }
    return -(i + 1);
  }

  public int indexOf(byte paramByte)
  {
    return v(0, paramByte);
  }

  public int v(int paramInt, byte paramByte)
  {
    for (int i = paramInt; i < this.aMP; i++) {
      if (this.aVp[i] == paramByte) {
        return i;
      }
    }
    return -1;
  }

  public int df(byte paramByte)
  {
    return w(this.aMP, paramByte);
  }

  public int w(int paramInt, byte paramByte)
  {
    for (int i = paramInt; i-- > 0; ) {
      if (this.aVp[i] == paramByte) {
        return i;
      }
    }
    return -1;
  }

  public boolean contains(byte paramByte)
  {
    return df(paramByte) >= 0;
  }

  public bvv e(Tp paramTp)
  {
    bvv localbvv = new bvv();
    for (int i = 0; i < this.aMP; i++) {
      if (paramTp.t(this.aVp[i])) {
        localbvv.add(this.aVp[i]);
      }
    }
    return localbvv;
  }

  public bvv f(Tp paramTp)
  {
    bvv localbvv = new bvv();
    for (int i = 0; i < this.aMP; i++) {
      if (!paramTp.t(this.aVp[i])) {
        localbvv.add(this.aVp[i]);
      }
    }
    return localbvv;
  }

  public byte bDg()
  {
    if (size() == 0) {
      throw new IllegalStateException("cannot find maximum of an empty list");
    }
    byte b = -128;
    for (int i = 0; i < this.aMP; i++) {
      if (this.aVp[i] > b) {
        b = this.aVp[i];
      }
    }
    return b;
  }

  public byte bDh()
  {
    if (size() == 0) {
      throw new IllegalStateException("cannot find minimum of an empty list");
    }
    byte b = 127;
    for (int i = 0; i < this.aMP; i++) {
      if (this.aVp[i] < b) {
        b = this.aVp[i];
      }
    }
    return b;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{");
    int i = 0; for (int j = this.aMP - 1; i < j; i++) {
      localStringBuilder.append(this.aVp[i]);
      localStringBuilder.append(", ");
    }
    if (size() > 0) {
      localStringBuilder.append(this.aVp[(this.aMP - 1)]);
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
      paramObjectOutput.writeByte(this.aVp[j]);
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    this.aMP = paramObjectInput.readInt();

    int i = paramObjectInput.readInt();
    this.aVp = new byte[i];
    for (int j = 0; j < i; j++)
      this.aVp[j] = paramObjectInput.readByte();
  }
}