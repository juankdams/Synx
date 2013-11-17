public class aGf extends ciH
{
  public aGf()
  {
    this(new bbF(0L));
  }

  public aGf(bbF parambbF) {
    super(1);
    a(parambbF);
  }

  public void a(bbF parambbF) {
    sF().setByte(0L, parambbF.byteValue());
  }

  public bbF aSp() {
    return new bbF(sF().getChar(0L));
  }
}