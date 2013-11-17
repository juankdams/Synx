import org.apache.log4j.Logger;

public abstract class aLI
{
  private static final Logger K = Logger.getLogger(aLI.class);

  private final cSR eqC = new cSR();

  public void load(String paramString)
  {
    aYQ localaYQ = aYQ.V(dtb.readFile(paramString));
    int i = localaYQ.readInt();
    for (int j = 0; j < i; j++) {
      int k = localaYQ.readInt();
      bnp localbnp = mZ(k);
      localbnp.g(localaYQ);
      this.eqC.put(k, localbnp);
    }
  }

  protected abstract bnp mZ(int paramInt);

  public bnp ee(int paramInt)
  {
    return (bnp)this.eqC.get(paramInt);
  }
}