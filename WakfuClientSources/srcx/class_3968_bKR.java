import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public class bKR extends aBq
  implements Externalizable
{
  static final long serialVersionUID = 1L;

  public bKR()
  {
  }

  public bKR(int paramInt)
  {
    super(paramInt);
  }

  public bKR(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public bKR(long[] paramArrayOfLong)
  {
    this(paramArrayOfLong.length);
    l(paramArrayOfLong);
  }

  public bKR(dCx paramdCx)
  {
    super(paramdCx);
  }

  public bKR(int paramInt, dCx paramdCx)
  {
    super(paramInt, paramdCx);
  }

  public bKR(int paramInt, float paramFloat, dCx paramdCx)
  {
    super(paramInt, paramFloat, paramdCx);
  }

  public bKR(long[] paramArrayOfLong, dCx paramdCx)
  {
    this(paramArrayOfLong.length, paramdCx);
    l(paramArrayOfLong);
  }

  public bKT bTc()
  {
    return new bKT(this);
  }

  public boolean add(long paramLong)
  {
    int i = dL(paramLong);

    if (i < 0) {
      return false;
    }

    int j = this.lpp[i];
    this.dVd[i] = paramLong;
    this.lpp[i] = 1;
    fZ(j == 0);

    return true;
  }

  protected void rehash(int paramInt)
  {
    int i = this.dVd.length;
    long[] arrayOfLong = this.dVd;
    byte[] arrayOfByte = this.lpp;

    this.dVd = new long[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        long l = arrayOfLong[j];
        int k = dL(l);
        this.dVd[k] = l;
        this.lpp[k] = 1;
      }
  }

  public long[] toArray()
  {
    long[] arrayOfLong1 = new long[size()];
    long[] arrayOfLong2 = this.dVd;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfByte.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfLong1[(j++)] = arrayOfLong2[i];
      }
    }
    return arrayOfLong1;
  }

  public void clear()
  {
    super.clear();
    long[] arrayOfLong = this.dVd;
    byte[] arrayOfByte = this.lpp;

    for (int i = arrayOfLong.length; i-- > 0; ) {
      arrayOfLong[i] = 0L;
      arrayOfByte[i] = 0;
    }
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof bKR)) {
      return false;
    }
    bKR localbKR = (bKR)paramObject;
    if (localbKR.size() != size()) {
      return false;
    }
    return b(new cZU(this, localbKR));
  }

  public int hashCode()
  {
    ctj localctj = new ctj(this, null);
    b(localctj);
    return localctj.akt();
  }

  public boolean bB(long paramLong)
  {
    int i = L(paramLong);
    if (i >= 0) {
      aQ(i);
      return true;
    }
    return false;
  }

  public boolean k(long[] paramArrayOfLong)
  {
    for (int i = paramArrayOfLong.length; i-- > 0; ) {
      if (!N(paramArrayOfLong[i])) {
        return false;
      }
    }
    return true;
  }

  public boolean l(long[] paramArrayOfLong)
  {
    boolean bool = false;
    for (int i = paramArrayOfLong.length; i-- > 0; ) {
      if (add(paramArrayOfLong[i])) {
        bool = true;
      }
    }
    return bool;
  }

  public boolean m(long[] paramArrayOfLong)
  {
    boolean bool = false;
    for (int i = paramArrayOfLong.length; i-- > 0; ) {
      if (bB(paramArrayOfLong[i])) {
        bool = true;
      }
    }
    return bool;
  }

  public boolean n(long[] paramArrayOfLong)
  {
    boolean bool = false;
    Arrays.sort(paramArrayOfLong);
    long[] arrayOfLong = this.dVd;
    byte[] arrayOfByte = this.lpp;

    for (int i = arrayOfLong.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (Arrays.binarySearch(paramArrayOfLong, arrayOfLong[i]) < 0)) {
        bB(arrayOfLong[i]);
        bool = true;
      }
    }
    return bool;
  }

  public void writeExternal(ObjectOutput paramObjectOutput)
  {
    paramObjectOutput.writeByte(0);

    paramObjectOutput.writeInt(this._size);

    cvF localcvF = new cvF(paramObjectOutput);
    if (!b(localcvF))
      throw localcvF.ihg;
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    int i = paramObjectInput.readInt();

    aO(i);
    while (i-- > 0) {
      long l = paramObjectInput.readLong();
      add(l);
    }
  }
}