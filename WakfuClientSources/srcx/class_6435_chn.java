public class chn extends ciH
{
  public chn()
  {
    this(new aFT(0L));
  }

  public chn(aFT paramaFT) {
    super(4);
    a(paramaFT);
  }

  public void a(aFT paramaFT) {
    sF().setInt(0L, paramaFT.intValue());
  }

  public aFT cjr() {
    return new aFT(sF().getInt(0L));
  }
}