import org.apache.log4j.Logger;

public abstract class ctN
  implements amB
{
  protected static final Logger K = Logger.getLogger(ctN.class);
  private final dfr idU;
  protected int ie;

  protected ctN(dfr paramdfr)
  {
    this.idU = paramdfr;
  }

  public dfr crj() {
    return this.idU;
  }

  public void dc(int paramInt) {
    this.ie = paramInt;
  }

  public int bP() {
    return this.ie;
  }

  protected final aYr crk() {
    return dsh.luB.BA(this.ie);
  }

  public abstract void execute();

  public abstract boolean h(cTK paramcTK);
}