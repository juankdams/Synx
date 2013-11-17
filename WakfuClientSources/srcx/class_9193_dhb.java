public class dhb extends Yi
{
  private Su dUZ;

  public dhb(Rx paramRx, cdz paramcdz, Su paramSu)
  {
    this(paramRx, paramcdz, paramSu, (byte)4);
  }

  public dhb(Rx paramRx, cdz paramcdz, Su paramSu, byte paramByte) {
    super(paramRx, paramcdz, paramByte);
    this.dUZ = paramSu;
  }

  protected Object Cm() {
    if (this.dUZ.aJu())
      return Integer.valueOf(this.dUZ.e(eu.ayX));
    return super.Cm();
  }
}