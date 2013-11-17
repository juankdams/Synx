public class aeB extends cwV
{
  public static final String cVU = "regexp";
  private boolean cVV = false;

  private static final Zk cVW = new Zk();

  private cyp cVX = null;
  private String cVY;
  private boolean cVZ = false;

  private void p(FF paramFF)
  {
    if (!this.cVV) {
      this.cVX = cVW.o(paramFF);
      this.cVV = true;
    }
  }

  private void aqk() { if (this.cVZ) {
      this.cVX.setPattern(this.cVY);
      this.cVZ = false;
    }
  }

  public void setPattern(String paramString)
  {
    if (this.cVX == null) {
      this.cVY = paramString;
      this.cVZ = true;
    } else {
      this.cVX.setPattern(paramString);
    }
  }

  public String q(FF paramFF)
  {
    p(paramFF);
    if (cum()) {
      return s(paramFF).q(paramFF);
    }
    aqk();
    return this.cVX.getPattern();
  }

  public cyp r(FF paramFF)
  {
    p(paramFF);
    if (cum()) {
      return s(paramFF).r(paramFF);
    }
    aqk();
    return this.cVX;
  }

  public aeB s(FF paramFF)
  {
    return (aeB)U(paramFF);
  }
}