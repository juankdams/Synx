import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public class cpy extends aBN
  implements Externalizable
{
  static final long serialVersionUID = 1L;

  public cpy()
  {
  }

  public cpy(int paramInt)
  {
    super(paramInt);
  }

  public cpy(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public cpy(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte.length);
    aw(paramArrayOfByte);
  }

  public cpy(bvE parambvE)
  {
    super(parambvE);
  }

  public cpy(int paramInt, bvE parambvE)
  {
    super(paramInt, parambvE);
  }

  public cpy(int paramInt, float paramFloat, bvE parambvE)
  {
    super(paramInt, paramFloat, parambvE);
  }

  public cpy(byte[] paramArrayOfByte, bvE parambvE)
  {
    this(paramArrayOfByte.length, parambvE);
    aw(paramArrayOfByte);
  }

  public cQE cpa()
  {
    return new cQE(this);
  }

  public boolean dP(byte paramByte)
  {
    int i = bw(paramByte);

    if (i < 0) {
      return false;
    }

    int j = this.lpp[i];
    this.dVU[i] = paramByte;
    this.lpp[i] = 1;
    fZ(j == 0);

    return true;
  }

  protected void rehash(int paramInt)
  {
    int i = this.dVU.length;
    byte[] arrayOfByte1 = this.dVU;
    byte[] arrayOfByte2 = this.lpp;

    this.dVU = new byte[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte2[j] == 1) {
        byte b = arrayOfByte1[j];
        int k = bw(b);
        this.dVU[k] = b;
        this.lpp[k] = 1;
      }
  }

  public byte[] toArray()
  {
    byte[] arrayOfByte1 = new byte[size()];
    byte[] arrayOfByte2 = this.dVU;
    byte[] arrayOfByte3 = this.lpp;

    int i = arrayOfByte3.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte3[i] == 1) {
        arrayOfByte1[(j++)] = arrayOfByte2[i];
      }
    }
    return arrayOfByte1;
  }

  public void clear()
  {
    super.clear();
    byte[] arrayOfByte1 = this.dVU;
    byte[] arrayOfByte2 = this.lpp;

    for (int i = arrayOfByte1.length; i-- > 0; ) {
      arrayOfByte1[i] = 0;
      arrayOfByte2[i] = 0;
    }
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof cpy)) {
      return false;
    }
    cpy localcpy = (cpy)paramObject;
    if (localcpy.size() != size()) {
      return false;
    }
    return c(new aSa(this, localcpy));
  }

  public int hashCode()
  {
    cqx localcqx = new cqx(this, null);
    c(localcqx);
    return localcqx.akt();
  }

  public boolean dQ(byte paramByte)
  {
    int i = j(paramByte);
    if (i >= 0) {
      aQ(i);
      return true;
    }
    return false;
  }

  public boolean av(byte[] paramArrayOfByte)
  {
    for (int i = paramArrayOfByte.length; i-- > 0; ) {
      if (!contains(paramArrayOfByte[i])) {
        return false;
      }
    }
    return true;
  }

  public boolean aw(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    for (int i = paramArrayOfByte.length; i-- > 0; ) {
      if (dP(paramArrayOfByte[i])) {
        bool = true;
      }
    }
    return bool;
  }

  public boolean ax(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    for (int i = paramArrayOfByte.length; i-- > 0; ) {
      if (dQ(paramArrayOfByte[i])) {
        bool = true;
      }
    }
    return bool;
  }

  public boolean ay(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    Arrays.sort(paramArrayOfByte);
    byte[] arrayOfByte1 = this.dVU;
    byte[] arrayOfByte2 = this.lpp;

    for (int i = arrayOfByte1.length; i-- > 0; ) {
      if ((arrayOfByte2[i] == 1) && (Arrays.binarySearch(paramArrayOfByte, arrayOfByte1[i]) < 0)) {
        dQ(arrayOfByte1[i]);
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
      byte b = paramObjectInput.readByte();
      dP(b);
    }
  }
}