import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public class adz extends dVg
  implements Externalizable
{
  static final long serialVersionUID = 1L;

  public adz()
  {
  }

  public adz(int paramInt)
  {
    super(paramInt);
  }

  public adz(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public adz(int[] paramArrayOfInt)
  {
    this(paramArrayOfInt.length);
    n(paramArrayOfInt);
  }

  public adz(aSO paramaSO)
  {
    super(paramaSO);
  }

  public adz(int paramInt, aSO paramaSO)
  {
    super(paramInt, paramaSO);
  }

  public adz(int paramInt, float paramFloat, aSO paramaSO)
  {
    super(paramInt, paramFloat, paramaSO);
  }

  public adz(int[] paramArrayOfInt, aSO paramaSO)
  {
    this(paramArrayOfInt.length, paramaSO);
    n(paramArrayOfInt);
  }

  public kr apz()
  {
    return new kr(this);
  }

  public boolean hL(int paramInt)
  {
    int i = Ej(paramInt);

    if (i < 0) {
      return false;
    }

    int j = this.lpp[i];
    this.mtW[i] = paramInt;
    this.lpp[i] = 1;
    fZ(j == 0);

    return true;
  }

  protected void rehash(int paramInt)
  {
    int i = this.mtW.length;
    int[] arrayOfInt = this.mtW;
    byte[] arrayOfByte = this.lpp;

    this.mtW = new int[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        int k = arrayOfInt[j];
        int m = Ej(k);
        this.mtW[m] = k;
        this.lpp[m] = 1;
      }
  }

  public int[] toArray()
  {
    int[] arrayOfInt1 = new int[size()];
    int[] arrayOfInt2 = this.mtW;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfByte.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfInt1[(j++)] = arrayOfInt2[i];
      }
    }
    return arrayOfInt1;
  }

  public void clear()
  {
    super.clear();
    int[] arrayOfInt = this.mtW;
    byte[] arrayOfByte = this.lpp;

    for (int i = arrayOfInt.length; i-- > 0; ) {
      arrayOfInt[i] = 0;
      arrayOfByte[i] = 0;
    }
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof adz)) {
      return false;
    }
    adz localadz = (adz)paramObject;
    if (localadz.size() != size()) {
      return false;
    }
    return g(new bQq(this, localadz));
  }

  public int hashCode()
  {
    cyr localcyr = new cyr(this, null);
    g(localcyr);
    return localcyr.akt();
  }

  public boolean remove(int paramInt)
  {
    int i = uK(paramInt);
    if (i >= 0) {
      aQ(i);
      return true;
    }
    return false;
  }

  public boolean m(int[] paramArrayOfInt)
  {
    for (int i = paramArrayOfInt.length; i-- > 0; ) {
      if (!contains(paramArrayOfInt[i])) {
        return false;
      }
    }
    return true;
  }

  public boolean n(int[] paramArrayOfInt)
  {
    boolean bool = false;
    for (int i = paramArrayOfInt.length; i-- > 0; ) {
      if (hL(paramArrayOfInt[i])) {
        bool = true;
      }
    }
    return bool;
  }

  public boolean o(int[] paramArrayOfInt)
  {
    boolean bool = false;
    for (int i = paramArrayOfInt.length; i-- > 0; ) {
      if (remove(paramArrayOfInt[i])) {
        bool = true;
      }
    }
    return bool;
  }

  public boolean p(int[] paramArrayOfInt)
  {
    boolean bool = false;
    Arrays.sort(paramArrayOfInt);
    int[] arrayOfInt = this.mtW;
    byte[] arrayOfByte = this.lpp;

    for (int i = arrayOfInt.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (Arrays.binarySearch(paramArrayOfInt, arrayOfInt[i]) < 0)) {
        remove(arrayOfInt[i]);
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
    if (!g(localcvF))
      throw localcvF.ihg;
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    int i = paramObjectInput.readInt();

    aO(i);
    while (i-- > 0) {
      int j = paramObjectInput.readInt();
      hL(j);
    }
  }
}