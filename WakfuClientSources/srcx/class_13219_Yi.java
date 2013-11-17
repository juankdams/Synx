public class Yi extends tM
{
  public Yi(Rx paramRx, cdz paramcdz)
  {
    this(paramRx, paramcdz, (byte)-1);
  }

  public Yi(Rx paramRx, cdz paramcdz, byte paramByte) {
    super(paramRx, paramByte, paramcdz);
    this.beP.a(this);
  }

  protected int Cc()
  {
    return this.beP.value();
  }

  protected int Cd()
  {
    return this.beP.max();
  }
}