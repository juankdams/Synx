public abstract class oe extends cKq
{
  public oe()
  {
  }

  public oe(Object paramObject1, Object paramObject2, dOc paramdOc, int paramInt1, int paramInt2, ddp paramddp)
  {
    be(paramObject1);
    bf(paramObject2);
    setWidget(paramdOc);
    setDelay(paramInt1);
    setDuration(paramInt2);
    setTweenFunction(paramddp);
  }

  public void setWidget(dOc paramdOc)
  {
    this.iJj = paramdOc;
  }

  public dOc getWidget()
  {
    return (dOc)this.iJj;
  }
}