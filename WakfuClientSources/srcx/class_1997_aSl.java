import org.apache.log4j.Logger;

public abstract class aSl
{
  private static final Logger K = Logger.getLogger(aSl.class);

  private final cSR ePz = new cSR();

  public void load(String paramString) {
    aYQ localaYQ = aYQ.V(dtb.readFile(paramString));
    int i = localaYQ.readInt();
    for (int j = 0; j < i; j++) {
      int k = localaYQ.readInt();
      alY localalY = nM(k);
      localalY.g(localaYQ);
      this.ePz.put(k, localalY);
    }
  }

  protected abstract alY nM(int paramInt);

  public alY nN(int paramInt) {
    return (alY)this.ePz.get(paramInt);
  }
}