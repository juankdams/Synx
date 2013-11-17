public abstract class aMq extends drw
{
  protected final dFu erU = new dFu();
  private final Qb erV;

  protected aMq(Qb paramQb)
  {
    super(new bUC(paramQb));
    this.erV = paramQb;
  }

  public void bI(int paramInt1, int paramInt2)
  {
    if (this.ltY != null)
      ((cbt)this.ltY).dq(paramInt1, paramInt2);
  }

  public boolean bJ(int paramInt1, int paramInt2)
  {
    if (!bK(paramInt1, paramInt2))
      return false;
    this.erU.ah(paramInt1, paramInt2, paramInt2);
    bI(paramInt1, paramInt2);
    return true;
  }

  public int nd(int paramInt) {
    return this.erU.get(paramInt);
  }

  public boolean isFull() {
    if (this.QW.bDx() < this.erV.abT())
      return false;
    for (aso localaso = this.erV.abR(); localaso.hasNext(); ) {
      localaso.fl();
      if (nd(localaso.zY()) < localaso.value())
        return false;
    }
    return true;
  }

  public void clear()
  {
    super.clear();
    this.erU.clear();
  }

  public boolean bK(int paramInt1, int paramInt2)
  {
    return ((bUC)this.ltX).a(this, paramInt1, paramInt2);
  }

  public int bL(int paramInt1, int paramInt2)
  {
    return ((bUC)this.ltX).b(this, paramInt1, paramInt2);
  }
}