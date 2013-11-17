public class dxe extends dKJ
{
  public dxe(byte paramByte)
  {
    super(paramByte);
  }

  public boolean p(dwn paramdwn) {
    if (!(paramdwn.getValue() instanceof brS))
      return super.p(paramdwn);
    brS localbrS = (brS)paramdwn.getValue();
    if (localbrS.dYr == 47) {
      return true;
    }

    return super.p(paramdwn);
  }
}