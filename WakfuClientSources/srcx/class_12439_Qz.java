public final class Qz
{
  private static final int cpx = 1;
  private static final int cpy = 8;
  private static final int cpz = 64;
  public static final int cpA = 2048;
  private boolean cpB = false;
  private boolean cpC = false;
  private boolean cpD = false;
  private boolean cpE = false;

  public boolean aci()
  {
    return this.cpB;
  }

  public void bi(boolean paramBoolean)
  {
    this.cpB = paramBoolean;
  }

  public boolean acj()
  {
    return this.cpC;
  }

  public void bj(boolean paramBoolean)
  {
    this.cpC = paramBoolean;
  }

  public boolean ack()
  {
    return this.cpD;
  }

  public void bk(boolean paramBoolean)
  {
    this.cpD = paramBoolean;
  }

  public boolean acl()
  {
    return (this.cpD) && (this.cpE);
  }

  public void bl(boolean paramBoolean)
  {
    this.cpE = paramBoolean;
    if (paramBoolean)
      bk(true);
  }

  public byte[] encode()
  {
    return bTM.getBytes((this.cpC ? 8 : 0) | (this.cpB ? 2048 : 0) | (this.cpD ? 1 : 0) | (this.cpE ? 64 : 0));
  }

  public static Qz d(byte[] paramArrayOfByte, int paramInt)
  {
    int i = bTM.k(paramArrayOfByte, paramInt);
    Qz localQz = new Qz();
    localQz.bj((i & 0x8) != 0);
    localQz.bi((i & 0x800) != 0);
    localQz.bl((i & 0x40) != 0);

    localQz.bk((i & 0x1) != 0);
    return localQz;
  }

  public int hashCode()
  {
    return 3 * (7 * (13 * (17 * (this.cpD ? 1 : 0) + (this.cpE ? 1 : 0)) + (this.cpB ? 1 : 0)) + (this.cpC ? 1 : 0));
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Qz)) {
      return false;
    }
    Qz localQz = (Qz)paramObject;
    return (localQz.cpD == this.cpD) && (localQz.cpE == this.cpE) && (localQz.cpB == this.cpB) && (localQz.cpC == this.cpC);
  }
}