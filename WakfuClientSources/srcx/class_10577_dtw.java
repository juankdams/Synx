import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class dtw extends dai
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final dRH lwo = new bCn(this);
  protected transient byte[] aZY;

  public dtw()
  {
  }

  public dtw(int paramInt)
  {
    super(paramInt);
  }

  public dtw(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public dtw(dnH paramdnH)
  {
    super(paramdnH);
  }

  public dtw(int paramInt, dnH paramdnH)
  {
    super(paramInt, paramdnH);
  }

  public dtw(int paramInt, float paramFloat, dnH paramdnH)
  {
    super(paramInt, paramFloat, paramdnH);
  }

  public Object clone()
  {
    dtw localdtw = (dtw)super.clone();
    localdtw.aZY = ((byte[])this.aZY.clone());
    return localdtw;
  }

  public xd cZM()
  {
    return new xd(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.aZY = new byte[i];
    return i;
  }

  public byte h(short paramShort, byte paramByte)
  {
    int i = dV(paramShort);
    return a(paramShort, paramByte, i);
  }

  public byte i(short paramShort, byte paramByte)
  {
    int i = dV(paramShort);
    if (i < 0)
      return this.aZY[(-i - 1)];
    return a(paramShort, paramByte, i);
  }

  private byte a(short paramShort, byte paramByte, int paramInt)
  {
    byte b = 0;
    int j = 1;
    if (paramInt < 0) {
      paramInt = -paramInt - 1;
      b = this.aZY[paramInt];
      j = 0;
    }
    int i = this.lpp[paramInt];
    this.kOY[paramInt] = paramShort;
    this.lpp[paramInt] = 1;
    this.aZY[paramInt] = paramByte;
    if (j != 0) {
      fZ(i == 0);
    }

    return b;
  }

  public void b(dtw paramdtw)
  {
    paramdtw.a(this.lwo);
  }

  protected void rehash(int paramInt)
  {
    int i = this.kOY.length;
    short[] arrayOfShort = this.kOY;
    byte[] arrayOfByte1 = this.aZY;
    byte[] arrayOfByte2 = this.lpp;

    this.kOY = new short[paramInt];
    this.aZY = new byte[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte2[j] == 1) {
        short s = arrayOfShort[j];
        int k = dV(s);
        this.kOY[k] = s;
        this.aZY[k] = arrayOfByte1[j];
        this.lpp[k] = 1;
      }
  }

  public byte es(short paramShort)
  {
    int i = dU(paramShort);
    return i < 0 ? 0 : this.aZY[i];
  }

  public void clear()
  {
    super.clear();
    short[] arrayOfShort = this.kOY;
    byte[] arrayOfByte1 = this.aZY;
    byte[] arrayOfByte2 = this.lpp;

    Arrays.fill(this.kOY, 0, this.kOY.length, (short)0);
    Arrays.fill(this.aZY, 0, this.aZY.length, (byte)0);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public byte et(short paramShort)
  {
    byte b = 0;
    int i = dU(paramShort);
    if (i >= 0) {
      b = this.aZY[i];
      aQ(i);
    }
    return b;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof dtw)) {
      return false;
    }
    dtw localdtw = (dtw)paramObject;
    if (localdtw.size() != size()) {
      return false;
    }
    return a(new bFU(localdtw));
  }

  public int hashCode() {
    cMY localcMY = new cMY(this, null);
    a(localcMY);
    return localcMY.akt();
  }

  protected void aQ(int paramInt)
  {
    this.aZY[paramInt] = 0;
    super.aQ(paramInt);
  }

  public byte[] yu()
  {
    byte[] arrayOfByte1 = new byte[size()];
    byte[] arrayOfByte2 = this.aZY;
    byte[] arrayOfByte3 = this.lpp;

    int i = arrayOfByte2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte3[i] == 1) {
        arrayOfByte1[(j++)] = arrayOfByte2[i];
      }
    }
    return arrayOfByte1;
  }

  public short[] Vq()
  {
    short[] arrayOfShort1 = new short[size()];
    short[] arrayOfShort2 = this.kOY;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfShort2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfShort1[(j++)] = arrayOfShort2[i];
      }
    }
    return arrayOfShort1;
  }

  public short[] b(short[] paramArrayOfShort)
  {
    int i = size();
    if (paramArrayOfShort.length < i) {
      paramArrayOfShort = (short[])Array.newInstance(paramArrayOfShort.getClass().getComponentType(), i);
    }

    short[] arrayOfShort = (short[])this.kOY;
    byte[] arrayOfByte = this.lpp;

    int j = arrayOfShort.length; for (int k = 0; j-- > 0; ) {
      if (arrayOfByte[j] == 1) {
        paramArrayOfShort[(k++)] = arrayOfShort[j];
      }
    }
    return paramArrayOfShort;
  }

  public boolean C(byte paramByte)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.aZY;

    for (int i = arrayOfByte2.length; i-- > 0; ) {
      if ((arrayOfByte1[i] == 1) && (paramByte == arrayOfByte2[i])) {
        return true;
      }
    }
    return false;
  }

  public boolean N(short paramShort)
  {
    return contains(paramShort);
  }

  public boolean b(dfG paramdfG)
  {
    return c(paramdfG);
  }

  public boolean b(Tp paramTp)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.aZY;
    for (int i = arrayOfByte2.length; i-- > 0; ) {
      if ((arrayOfByte1[i] == 1) && (!paramTp.t(arrayOfByte2[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean a(dRH paramdRH)
  {
    byte[] arrayOfByte1 = this.lpp;
    short[] arrayOfShort = this.kOY;
    byte[] arrayOfByte2 = this.aZY;
    for (int i = arrayOfShort.length; i-- > 0; ) {
      if ((arrayOfByte1[i] == 1) && (!paramdRH.d(arrayOfShort[i], arrayOfByte2[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(dRH paramdRH)
  {
    boolean bool = false;
    byte[] arrayOfByte1 = this.lpp;
    short[] arrayOfShort = this.kOY;
    byte[] arrayOfByte2 = this.aZY;

    bOl();
    try {
      for (i = arrayOfShort.length; i-- > 0; )
        if ((arrayOfByte1[i] == 1) && (!paramdRH.d(arrayOfShort[i], arrayOfByte2[i]))) {
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

  public void a(ctI paramctI)
  {
    byte[] arrayOfByte1 = this.lpp;
    byte[] arrayOfByte2 = this.aZY;
    for (int i = arrayOfByte2.length; i-- > 0; )
      if (arrayOfByte1[i] == 1)
        arrayOfByte2[i] = paramctI.dW(arrayOfByte2[i]);
  }

  public boolean O(short paramShort)
  {
    return j(paramShort, (byte)1);
  }

  public boolean j(short paramShort, byte paramByte)
  {
    int i = dU(paramShort);
    if (i < 0)
      return false;
    int tmp17_16 = i;
    byte[] tmp17_13 = this.aZY; tmp17_13[tmp17_16] = ((byte)(tmp17_13[tmp17_16] + paramByte));
    return true;
  }

  public byte a(short paramShort, byte paramByte1, byte paramByte2)
  {
    int i = dV(paramShort);
    byte b;
    int j;
    if (i < 0) {
      i = -i - 1;
      int tmp25_23 = i;
      byte[] tmp25_20 = this.aZY; b = tmp25_20[tmp25_23] = (byte)(tmp25_20[tmp25_23] + paramByte1);
      j = 0;
    } else {
      b = this.aZY[i] = paramByte2;
      j = 1;
    }

    int k = this.lpp[i];
    this.kOY[i] = paramShort;
    this.lpp[i] = 1;

    if (j != 0) {
      fZ(k == 0);
    }

    return b;
  }

  public void writeExternal(ObjectOutput paramObjectOutput)
  {
    paramObjectOutput.writeByte(0);

    paramObjectOutput.writeInt(this._size);

    cvF localcvF = new cvF(paramObjectOutput);
    if (!a(localcvF))
      throw localcvF.ihg;
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    int i = paramObjectInput.readInt();
    aO(i);

    while (i-- > 0) {
      short s = paramObjectInput.readShort();
      byte b = paramObjectInput.readByte();
      h(s, b);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    a(new bCi(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}