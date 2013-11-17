import java.io.Reader;

public abstract class dkV extends dwE
  implements bEc, cBO
{
  private boolean lit = true;

  public void jx(boolean paramBoolean)
  {
    this.lit = paramBoolean;
  }

  public Reader b(Reader paramReader)
  {
    aAd localaAd = new aAd(paramReader);
    if (!this.lit) {
      localaAd.a(new bgV());
    }
    localaAd.a(this);
    return localaAd;
  }
}