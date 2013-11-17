import org.apache.log4j.Logger;

public class acl
{
  private static final Logger K = Logger.getLogger(acl.class);
  private final int cRk;
  private final int aEz;

  public acl(int paramInt1, int paramInt2)
  {
    this.cRk = paramInt1;
    this.aEz = paramInt2;
  }

  public int aot() {
    return this.cRk;
  }

  public int ajS() {
    return this.aEz;
  }
}