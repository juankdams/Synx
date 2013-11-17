 enum auH
{
  auH()
  {
    super(str, i, null);
  }
  public boolean a(aRL paramaRL, bhL parambhL) {
    if (!(parambhL instanceof byz)) {
      return false;
    }
    byz localbyz = (byz)parambhL;
    short s = localbyz.Lk();
    bMG localbMG = (bMG)((bWy)parambhL).bSD();

    dwN localdwN = localbyz.bHa();
    int i = (localdwN != null) && (localdwN.sN() == localbyz.getId()) ? 1 : 0;
    if (i != 0) {
      return true;
    }
    int j = (localdwN != null) && (localbMG.ay(localdwN.sN()) != null) ? 1 : 0;
    boolean bool = coz.b(s, localbMG);

    return (bool) || (j != 0);
  }
}