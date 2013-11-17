import org.apache.log4j.Logger;

public class bhP extends Gz
{
  private static final Logger K = Logger.getLogger(bhP.class);
  private final int efD;
  private final int aEz;

  public bhP(bNi parambNi, int paramInt1, int paramInt2)
  {
    super(parambNi);
    this.aEz = paramInt1;
    this.efD = paramInt2;
  }

  public int aTy() {
    return this.efD;
  }

  public int ajS() {
    return this.aEz;
  }

  public final cLT yE()
  {
    return cLT.iLE;
  }
}