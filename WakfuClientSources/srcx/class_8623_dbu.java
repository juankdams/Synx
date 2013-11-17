public class dbu extends aGb
{
  private final aoL kTs = new aoL();
  private static final int VERSION = 1;

  public void id(String paramString)
  {
    aYQ localaYQ = aYQ.V(dtb.readFile(paramString));
    int i = localaYQ.readInt();
    int j = localaYQ.readInt();
    for (int k = 0; k < j; k++) {
      long l = localaYQ.readLong();
      int m = localaYQ.readInt();
      aZa localaZa = dTa.mpt.a(m, localaYQ);
      this.kTs.put(l, localaZa);
    }
    localaYQ.close();
  }

  public void ie(String paramString) {
    dSw localdSw = new dSw(dtb.qd(paramString));
    localdSw.writeInt(1);
    localdSw.writeInt(this.kTs.size());
    cHu localcHu = this.kTs.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      localdSw.writeLong(localcHu.bic());
      localdSw.writeInt(((aZa)localcHu.value()).getType());
      ((aZa)localcHu.value()).b(localdSw);
    }
    localdSw.close();
  }

  public void a(long paramLong, aZa paramaZa) {
    this.kTs.put(paramLong, paramaZa);
  }

  protected void b(bjC parambjC, long paramLong)
  {
    aZa localaZa = (aZa)this.kTs.get(paramLong);
    if (localaZa == null) {
      return;
    }
    localaZa.b(parambjC);
  }
}