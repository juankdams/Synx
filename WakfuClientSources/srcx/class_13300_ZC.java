public class ZC extends dCh
{
  private final Boolean cLi;

  private ZC(aAY paramaAY, Boolean paramBoolean)
  {
    this.cLi = paramBoolean;
  }

  protected VK akI()
  {
    return new VK();
  }

  protected void a(VK paramVK)
  {
    this.bdf.dUr.t().a(paramVK, this.cLi);
  }

  protected void b(VK paramVK)
  {
    dOj localdOj = this.bdf.dUr.t();
    localdOj.clear();
    localdOj.b(paramVK);
  }
}