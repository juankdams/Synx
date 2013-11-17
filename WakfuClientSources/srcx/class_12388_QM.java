public class QM extends bVw
{
  private cIF cpV;

  void a(cIF paramcIF)
  {
    this.cpV = paramcIF;
  }

  public cqG acu()
  {
    return cqG.iau;
  }

  public String getName()
  {
    return this.cpV.getName();
  }

  public String getDescription()
  {
    return this.cpV.getDescription();
  }

  public cIF acv() {
    return this.cpV;
  }

  public boolean acw() {
    return this.cpV.cCM() == getId();
  }
}