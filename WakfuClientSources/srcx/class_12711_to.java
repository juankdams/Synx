public class to extends alw
{
  private final int baj;

  public to(int paramInt)
  {
    this.baj = paramInt;
  }

  protected String getDescription()
  {
    dDU localdDU = qn.xw().cl(this.baj);

    return a(localdDU);
  }

  protected long P()
  {
    return 0L;
  }

  protected boolean Q()
  {
    return false;
  }

  protected static String a(dDU paramdDU) {
    String str = paramdDU.dfR();
    if ((str != null) && (str.length() == 0)) {
      return null;
    }
    return str;
  }

  protected boolean R() {
    return false;
  }

  protected boolean S() {
    return false;
  }

  protected boolean T() {
    return false;
  }
}