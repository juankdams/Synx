import org.apache.log4j.Logger;

public class cYg
{
  protected static Logger K = Logger.getLogger(cYg.class);

  private final dPx kLB = new dPx();

  private static cYg kLC = new cYg();

  public static cYg cLD()
  {
    return kLC;
  }

  public dwq jo(long paramLong)
  {
    dcc localdcc = (dcc)this.kLB.bf(bhg.fy(paramLong));
    if (localdcc != null) {
      return localdcc.jo(paramLong);
    }
    return null;
  }

  public void a(dwq paramdwq) {
    byte b = bhg.fy(paramdwq.getId());
    dcc localdcc = (dcc)this.kLB.bf(b);
    if (localdcc == null) {
      localdcc = new dcc();
      this.kLB.c(b, localdcc);
    }
    localdcc.a(paramdwq);
  }

  public void jp(long paramLong) {
    byte b = bhg.fy(paramLong);
    dcc localdcc = (dcc)this.kLB.bf(b);
    if (localdcc != null) {
      localdcc.jp(paramLong);
      if (localdcc.isEmpty())
        this.kLB.be(b);
    }
  }

  public dcc eN(byte paramByte) {
    return (dcc)this.kLB.bf(paramByte);
  }
}