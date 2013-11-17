public class bKi extends bGZ
{
  private final int gLU;
  private final int bVj;
  private final byte bvo;
  private boolean bVm;
  private int[] fZm;

  public bKi(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, bZA parambZA, int paramInt9, byte paramByte, cWE paramcWE, boolean paramBoolean, int[] paramArrayOfInt)
  {
    super(paramInt1, paramInt3, paramInt4, paramInt5, paramInt6, paramInt8, parambZA, paramInt9, paramcWE);

    this.gLU = paramInt2;
    this.bVj = paramInt7;
    this.bvo = paramByte;
    this.bVm = paramBoolean;
    this.fZm = paramArrayOfInt;
  }

  public int bRD() {
    return this.gLU;
  }

  public byte IS() {
    return this.bvo;
  }

  public int Ux() {
    return this.bVj;
  }

  public boolean UA() {
    return this.bVm;
  }

  public int[] bAA() {
    return this.fZm;
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CollectAction{");
    localStringBuilder.append(super.toString());
    localStringBuilder.append("m_resourceStep=").append(this.gLU);
    localStringBuilder.append(", m_collectItemId=").append(this.bVj);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}