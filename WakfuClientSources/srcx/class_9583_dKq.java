public class dKq
{
  protected final Je lYb;
  protected int lYc;
  protected byte lYd = 1;

  public dKq(dKq paramdKq)
  {
    this.lYb = new Je(paramdKq.lYb);
    this.lYc = paramdKq.lYc;
    this.lYd = paramdKq.lYd;
  }

  public dKq(cSJ paramcSJ, int paramInt)
  {
    int i = paramcSJ.getWidth() * paramcSJ.getHeight();
    this.lYb = new Je(i);

    int j = paramcSJ.getWidth();
    int k = paramcSJ.getHeight();

    for (int m = 0; m < j; m++) {
      for (int n = 0; n < k; n++) {
        this.lYb.set(n * j + m, paramcSJ.getAlpha(m, n) >= paramInt);
      }
    }
    this.lYc = j;
  }

  public dKq(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, byte paramByte)
  {
    this.lYc = bCO.aB(paramInt2 / paramByte);
    this.lYb = Je.e(paramArrayOfByte, paramInt1, paramInt3);
    this.lYd = paramByte;
  }

  public dKq(byte[] paramArrayOfByte, int paramInt, byte paramByte)
  {
    this.lYc = bCO.aB(paramInt / paramByte);
    this.lYb = Je.p(paramArrayOfByte);
    this.lYd = paramByte;
  }

  public void J(int paramInt, boolean paramBoolean)
  {
    this.lYb.set(paramInt, paramBoolean);
  }

  public void k(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.lYb.set(paramInt2 / this.lYd * this.lYc + paramInt1 / this.lYd, paramBoolean);
  }

  public boolean fj(int paramInt1, int paramInt2)
  {
    return this.lYb.get(paramInt2 / this.lYd * this.lYc + paramInt1 / this.lYd);
  }
}