public class coT extends dCO
{
  private Su dUZ;

  public coT(Rx paramRx, cdz paramcdz, Su paramSu, Rx[] paramArrayOfRx)
  {
    super(paramRx, paramcdz, (byte)39, paramArrayOfRx);
    this.dUZ = paramSu;
  }

  protected Object Cm() {
    if (this.dUZ.aJu())
      return Integer.valueOf(this.dUZ.e(eu.ayX));
    return super.Cm();
  }
}