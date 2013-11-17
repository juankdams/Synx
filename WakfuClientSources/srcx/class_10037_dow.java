public final class dow
{
  private static dow loN = new dow();

  public static dow cVB() {
    return loN;
  }

  public boolean a(aTl paramaTl)
  {
    if (paramaTl == null)
      return false;
    int i = paramaTl.dJ(paramaTl.bP());
    return dwC.dbQ().BQ(i).a(aRk.eOb);
  }

  public boolean b(aTl paramaTl) {
    if (paramaTl == null)
      return false;
    int i = paramaTl.dJ(paramaTl.bP());
    return dwC.dbQ().BQ(i).a(aRk.eOd);
  }

  public boolean a(cvY paramcvY, int paramInt) {
    aYr localaYr = paramcvY.UI();
    dqU localdqU = localaYr.aMP().jq(paramInt);
    if (localdqU == dqU.ltp)
      return false;
    if (localdqU == dqU.ltq) {
      return !paramcvY.HL();
    }
    int i = paramcvY.dJ(localaYr.bP());
    dkI localdkI = dwC.dbQ().BQ(i);
    return !localdkI.a(aRk.eOj);
  }
}