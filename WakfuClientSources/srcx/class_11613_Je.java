import java.io.OutputStream;

public final class Je
{
  private static final int bSE = 8;
  private static final int bSF = 3;
  private byte[] bSG;

  private Je()
  {
  }

  public Je(Je paramJe)
  {
    this.bSG = new byte[paramJe.bSG.length];
    System.arraycopy(paramJe.bSG, 0, this.bSG, 0, this.bSG.length);
  }

  public Je(int paramInt)
  {
    this.bSG = new byte[getDataLength(paramInt)];
  }

  public Je(int paramInt, boolean paramBoolean)
  {
    this.bSG = new byte[getDataLength(paramInt)];
    aJ(paramBoolean);
  }

  public final boolean get(int paramInt)
  {
    return c(this.bSG, paramInt);
  }

  public final void set(int paramInt, boolean paramBoolean)
  {
    a(this.bSG, paramInt, paramBoolean);
  }

  public final void aJ(boolean paramBoolean)
  {
    int i;
    if (paramBoolean)
      for (i = 0; i < this.bSG.length; i++)
        this.bSG[i] = -1;
    else
      for (i = 0; i < this.bSG.length; i++)
        this.bSG[i] = 0;
  }

  private void resize(int paramInt)
  {
    if ((!bB) && (paramInt < this.bSG.length * 8)) throw new AssertionError("loosing data in BitSet (oldSize=" + this.bSG.length + " newSize=" + paramInt + ")");

    byte[] arrayOfByte = new byte[(paramInt + 7) / 8];
    System.arraycopy(this.bSG, 0, arrayOfByte, 0, this.bSG.length);
    this.bSG = arrayOfByte;
  }

  public final int capacity()
  {
    return this.bSG.length * 8;
  }

  private static byte fo(int paramInt)
  {
    if ((!bB) && (paramInt >= 8)) throw new AssertionError("bit index should be < 8 , found : " + paramInt);

    return (byte)(1 << paramInt);
  }

  public final byte[] SS()
  {
    return this.bSG;
  }

  public final void write(OutputStream paramOutputStream)
  {
    paramOutputStream.write(this.bSG);
  }

  public static Je e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Je localJe = new Je();
    localJe.bSG = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, localJe.bSG, 0, paramInt2);
    return localJe;
  }

  public static Je p(byte[] paramArrayOfByte) {
    Je localJe = new Je();
    localJe.bSG = paramArrayOfByte;
    return localJe;
  }

  public static boolean c(byte[] paramArrayOfByte, int paramInt) {
    if ((!bB) && (paramInt >> 3 >= paramArrayOfByte.length)) throw new AssertionError("trying to get a bit index=" + paramInt + " but only " + paramArrayOfByte.length * 8 + " available.");

    int i = paramInt >> 3;
    int j = 7 - (paramInt - (i << 3));
    return (paramArrayOfByte[i] & fo(j)) != 0;
  }

  public static void a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean) {
    if ((!bB) && (paramInt >> 3 >= paramArrayOfByte.length)) throw new AssertionError("trying to set a bit index=" + paramInt + " but only " + paramArrayOfByte.length * 8 + " available.");

    int i = paramInt >> 3;
    int j = 7 - (paramInt - (i << 3));

    if (paramBoolean)
    {
      int tmp79_78 = i; paramArrayOfByte[tmp79_78] = ((byte)(paramArrayOfByte[tmp79_78] | fo(j)));
    }
    else
    {
      int tmp94_93 = i; paramArrayOfByte[tmp94_93] = ((byte)(paramArrayOfByte[tmp94_93] & (fo(j) ^ 0xFFFFFFFF)));
    }
  }

  public static int getDataLength(int paramInt) { return paramInt + 7 >> 3; }

}