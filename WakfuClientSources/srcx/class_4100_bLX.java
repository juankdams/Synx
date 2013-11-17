public class bLX extends bkr
  implements bnD
{
  private String aDn;

  bLX()
  {
    this.aDn = "";
  }

  public String mT()
  {
    return this.aDn;
  }

  public void P(String paramString) {
    this.aDn = paramString;
  }

  public void a(abv paramabv)
  {
    paramabv.cPW = this.aDn;
  }

  public void b(abv paramabv)
  {
    this.aDn = paramabv.cPW;
  }
}