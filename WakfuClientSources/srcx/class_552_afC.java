public enum afC
{
  private final afC cYD;

  private afC()
  {
    this.cYD = null;
  }

  private afC(afC arg3)
  {
    Object localObject;
    this.cYD = localObject;
  }

  public boolean a(afC paramafC) {
    afC localafC = this;
    while (localafC != null) {
      if (localafC == paramafC)
        return true;
      localafC = localafC.cYD;
    }
    return false;
  }
}