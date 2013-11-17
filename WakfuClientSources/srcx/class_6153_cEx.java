public class cEx
  implements crQ
{
  private bTM iyi;
  private byte[] iyj;
  private byte[] iyk;

  public void b(bTM parambTM)
  {
    this.iyi = parambTM;
  }

  public bTM HA()
  {
    return this.iyi;
  }

  public void aA(byte[] paramArrayOfByte)
  {
    this.iyj = bom.ab(paramArrayOfByte);
  }

  public bTM Oz()
  {
    return new bTM(this.iyj.length);
  }

  public byte[] Oy()
  {
    return bom.ab(this.iyj);
  }

  public void aB(byte[] paramArrayOfByte)
  {
    this.iyk = bom.ab(paramArrayOfByte);
  }

  public bTM Ox()
  {
    if (this.iyk != null) {
      return new bTM(this.iyk.length);
    }
    return Oz();
  }

  public byte[] Ow()
  {
    if (this.iyk != null) {
      return bom.ab(this.iyk);
    }
    return Oy();
  }

  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    aA(arrayOfByte);
  }

  public void f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    aB(arrayOfByte);
    if (this.iyj == null)
      aA(arrayOfByte);
  }
}