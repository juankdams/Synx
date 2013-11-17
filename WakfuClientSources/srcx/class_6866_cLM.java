import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public class cLM extends dai
  implements Externalizable
{
  static final long serialVersionUID = 1L;

  public cLM()
  {
  }

  public cLM(int paramInt)
  {
    super(paramInt);
  }

  public cLM(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public cLM(short[] paramArrayOfShort)
  {
    this(paramArrayOfShort.length);
    q(paramArrayOfShort);
  }

  public cLM(dnH paramdnH)
  {
    super(paramdnH);
  }

  public cLM(int paramInt, dnH paramdnH)
  {
    super(paramInt, paramdnH);
  }

  public cLM(int paramInt, float paramFloat, dnH paramdnH)
  {
    super(paramInt, paramFloat, paramdnH);
  }

  public cLM(short[] paramArrayOfShort, dnH paramdnH)
  {
    this(paramArrayOfShort.length, paramdnH);
    q(paramArrayOfShort);
  }

  public arE cEL()
  {
    return new arE(this);
  }

  public boolean dK(short paramShort)
  {
    int i = dV(paramShort);

    if (i < 0) {
      return false;
    }

    int j = this.lpp[i];
    this.kOY[i] = paramShort;
    this.lpp[i] = 1;
    fZ(j == 0);

    return true;
  }

  protected void rehash(int paramInt)
  {
    int i = this.kOY.length;
    short[] arrayOfShort = this.kOY;
    byte[] arrayOfByte = this.lpp;

    this.kOY = new short[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        short s = arrayOfShort[j];
        int k = dV(s);
        this.kOY[k] = s;
        this.lpp[k] = 1;
      }
  }

  public short[] cEM()
  {
    short[] arrayOfShort1 = new short[size()];
    short[] arrayOfShort2 = this.kOY;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfByte.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfShort1[(j++)] = arrayOfShort2[i];
      }
    }
    return arrayOfShort1;
  }

  public void clear()
  {
    super.clear();
    short[] arrayOfShort = this.kOY;
    byte[] arrayOfByte = this.lpp;

    for (int i = arrayOfShort.length; i-- > 0; ) {
      arrayOfShort[i] = 0;
      arrayOfByte[i] = 0;
    }
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof cLM)) {
      return false;
    }
    cLM localcLM = (cLM)paramObject;
    if (localcLM.size() != size()) {
      return false;
    }
    return c(new aEc(this, localcLM));
  }

  public int hashCode()
  {
    duH localduH = new duH(this, null);
    c(localduH);
    return localduH.akt();
  }

  public boolean dL(short paramShort)
  {
    int i = dU(paramShort);
    if (i >= 0) {
      aQ(i);
      return true;
    }
    return false;
  }

  public boolean p(short[] paramArrayOfShort)
  {
    for (int i = paramArrayOfShort.length; i-- > 0; ) {
      if (!contains(paramArrayOfShort[i])) {
        return false;
      }
    }
    return true;
  }

  public boolean q(short[] paramArrayOfShort)
  {
    boolean bool = false;
    for (int i = paramArrayOfShort.length; i-- > 0; ) {
      if (dK(paramArrayOfShort[i])) {
        bool = true;
      }
    }
    return bool;
  }

  public boolean r(short[] paramArrayOfShort)
  {
    boolean bool = false;
    for (int i = paramArrayOfShort.length; i-- > 0; ) {
      if (dL(paramArrayOfShort[i])) {
        bool = true;
      }
    }
    return bool;
  }

  public boolean s(short[] paramArrayOfShort)
  {
    boolean bool = false;
    Arrays.sort(paramArrayOfShort);
    short[] arrayOfShort = this.kOY;
    byte[] arrayOfByte = this.lpp;

    for (int i = arrayOfShort.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (Arrays.binarySearch(paramArrayOfShort, arrayOfShort[i]) < 0)) {
        dL(arrayOfShort[i]);
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
    if (!c(localcvF))
      throw localcvF.ihg;
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    int i = paramObjectInput.readInt();

    aO(i);
    while (i-- > 0) {
      short s = paramObjectInput.readShort();
      dK(s);
    }
  }
}