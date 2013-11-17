public abstract class cDG extends dQQ
{
  private cUE ixb = cUE.kHo;
  protected ddB ixc;
  private int ieW = 0;
  private int ixd = 0;

  protected aFE fNU = null;

  public abstract int aOb();

  public cUE czB()
  {
    return this.ixb;
  }

  protected void a(cUE paramcUE)
  {
    this.ixb = paramcUE;
  }

  public ddB aOi()
  {
    return this.ixc;
  }

  public void c(ddB paramddB)
  {
    this.ixc = paramddB;
  }

  public int getStartIndex()
  {
    return this.ieW;
  }

  public void setStartIndex(int paramInt)
  {
    this.ieW = paramInt;
  }

  public int getEndIndex()
  {
    return this.ixd;
  }

  public void setEndIndex(int paramInt)
  {
    this.ixd = paramInt;
  }

  public aFE bAh()
  {
    if ((this.fNU == null) && (this.ixc != null)) {
      return this.ixc.bAh();
    }
    return this.fNU;
  }

  public void a(aFE paramaFE)
  {
    this.fNU = paramaFE;
  }

  public abstract int a(P paramP, int paramInt);

  public abstract int b(P paramP, int paramInt);

  public abstract int c(P paramP, int paramInt);
}