import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;

public class dFu extends dVg
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  private final dsW lPy = new cUk(this);
  protected transient int[] bXB;

  public dFu()
  {
  }

  public dFu(int paramInt)
  {
    super(paramInt);
  }

  public dFu(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public dFu(aSO paramaSO)
  {
    super(paramaSO);
  }

  public dFu(int paramInt, aSO paramaSO)
  {
    super(paramInt, paramaSO);
  }

  public dFu(int paramInt, float paramFloat, aSO paramaSO)
  {
    super(paramInt, paramFloat, paramaSO);
  }

  public Object clone()
  {
    dFu localdFu = (dFu)super.clone();
    localdFu.bXB = ((int[])this.bXB.clone());
    return localdFu;
  }

  public aso abR()
  {
    return new aso(this);
  }

  protected int aO(int paramInt)
  {
    int i = super.aO(paramInt);
    this.bXB = new int[i];
    return i;
  }

  public int fg(int paramInt1, int paramInt2)
  {
    int i = Ej(paramInt1);
    return ag(paramInt1, paramInt2, i);
  }

  public int fh(int paramInt1, int paramInt2)
  {
    int i = Ej(paramInt1);
    if (i < 0)
      return this.bXB[(-i - 1)];
    return ag(paramInt1, paramInt2, i);
  }

  private int ag(int paramInt1, int paramInt2, int paramInt3)
  {
    int j = 0;
    int k = 1;
    if (paramInt3 < 0) {
      paramInt3 = -paramInt3 - 1;
      j = this.bXB[paramInt3];
      k = 0;
    }
    int i = this.lpp[paramInt3];
    this.mtW[paramInt3] = paramInt1;
    this.lpp[paramInt3] = 1;
    this.bXB[paramInt3] = paramInt2;
    if (k != 0) {
      fZ(i == 0);
    }

    return j;
  }

  public void d(dFu paramdFu)
  {
    paramdFu.b(this.lPy);
  }

  protected void rehash(int paramInt)
  {
    int i = this.mtW.length;
    int[] arrayOfInt1 = this.mtW;
    int[] arrayOfInt2 = this.bXB;
    byte[] arrayOfByte = this.lpp;

    this.mtW = new int[paramInt];
    this.bXB = new int[paramInt];
    this.lpp = new byte[paramInt];

    for (int j = i; j-- > 0; )
      if (arrayOfByte[j] == 1) {
        int k = arrayOfInt1[j];
        int m = Ej(k);
        this.mtW[m] = k;
        this.bXB[m] = arrayOfInt2[j];
        this.lpp[m] = 1;
      }
  }

  public int get(int paramInt)
  {
    int i = uK(paramInt);
    return i < 0 ? 0 : this.bXB[i];
  }

  public void clear()
  {
    super.clear();
    int[] arrayOfInt1 = this.mtW;
    int[] arrayOfInt2 = this.bXB;
    byte[] arrayOfByte = this.lpp;

    Arrays.fill(this.mtW, 0, this.mtW.length, 0);
    Arrays.fill(this.bXB, 0, this.bXB.length, 0);
    Arrays.fill(this.lpp, 0, this.lpp.length, (byte)0);
  }

  public int wH(int paramInt)
  {
    int i = 0;
    int j = uK(paramInt);
    if (j >= 0) {
      i = this.bXB[j];
      aQ(j);
    }
    return i;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof dFu)) {
      return false;
    }
    dFu localdFu = (dFu)paramObject;
    if (localdFu.size() != size()) {
      return false;
    }
    return b(new dHs(localdFu));
  }

  public int hashCode() {
    YT localYT = new YT(this, null);
    b(localYT);
    return localYT.akt();
  }

  protected void aQ(int paramInt)
  {
    this.bXB[paramInt] = 0;
    super.aQ(paramInt);
  }

  public int[] Vp()
  {
    int[] arrayOfInt1 = new int[size()];
    int[] arrayOfInt2 = this.bXB;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfInt2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfInt1[(j++)] = arrayOfInt2[i];
      }
    }
    return arrayOfInt1;
  }

  public int[] qe()
  {
    int[] arrayOfInt1 = new int[size()];
    int[] arrayOfInt2 = this.mtW;
    byte[] arrayOfByte = this.lpp;

    int i = arrayOfInt2.length; for (int j = 0; i-- > 0; ) {
      if (arrayOfByte[i] == 1) {
        arrayOfInt1[(j++)] = arrayOfInt2[i];
      }
    }
    return arrayOfInt1;
  }

  public int[] d(int[] paramArrayOfInt)
  {
    int i = size();
    if (paramArrayOfInt.length < i) {
      paramArrayOfInt = (int[])Array.newInstance(paramArrayOfInt.getClass().getComponentType(), i);
    }

    int[] arrayOfInt = (int[])this.mtW;
    byte[] arrayOfByte = this.lpp;

    int j = arrayOfInt.length; for (int k = 0; j-- > 0; ) {
      if (arrayOfByte[j] == 1) {
        paramArrayOfInt[(k++)] = arrayOfInt[j];
      }
    }
    return paramArrayOfInt;
  }

  public boolean fG(int paramInt)
  {
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.bXB;

    for (int i = arrayOfInt.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (paramInt == arrayOfInt[i])) {
        return true;
      }
    }
    return false;
  }

  public boolean containsKey(int paramInt)
  {
    return contains(paramInt);
  }

  public boolean a(cIw paramcIw)
  {
    return g(paramcIw);
  }

  public boolean d(cIw paramcIw)
  {
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.bXB;
    for (int i = arrayOfInt.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramcIw.R(arrayOfInt[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean b(dsW paramdsW)
  {
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt1 = this.mtW;
    int[] arrayOfInt2 = this.bXB;
    for (int i = arrayOfInt1.length; i-- > 0; ) {
      if ((arrayOfByte[i] == 1) && (!paramdsW.aL(arrayOfInt1[i], arrayOfInt2[i]))) {
        return false;
      }
    }
    return true;
  }

  public boolean c(dsW paramdsW)
  {
    boolean bool = false;
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt1 = this.mtW;
    int[] arrayOfInt2 = this.bXB;

    bOl();
    try {
      for (i = arrayOfInt1.length; i-- > 0; )
        if ((arrayOfByte[i] == 1) && (!paramdsW.aL(arrayOfInt1[i], arrayOfInt2[i]))) {
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

  public void a(bwW parambwW)
  {
    byte[] arrayOfByte = this.lpp;
    int[] arrayOfInt = this.bXB;
    for (int i = arrayOfInt.length; i-- > 0; )
      if (arrayOfByte[i] == 1)
        arrayOfInt[i] = parambwW.rt(arrayOfInt[i]);
  }

  public boolean aR(int paramInt)
  {
    return fi(paramInt, 1);
  }

  public boolean fi(int paramInt1, int paramInt2)
  {
    int i = uK(paramInt1);
    if (i < 0) {
      return false;
    }
    this.bXB[i] += paramInt2;
    return true;
  }

  public int ah(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = Ej(paramInt1);
    int k;
    int j;
    if (i < 0) {
      i = -i - 1;
      k = this.bXB[i] += paramInt2;
      j = 0;
    } else {
      k = this.bXB[i] = paramInt3;
      j = 1;
    }

    int m = this.lpp[i];
    this.mtW[i] = paramInt1;
    this.lpp[i] = 1;

    if (j != 0) {
      fZ(m == 0);
    }

    return k;
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
      int j = paramObjectInput.readInt();
      int k = paramObjectInput.readInt();
      fg(j, k);
    }
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    b(new cUg(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}