import org.apache.log4j.Logger;

public class dLf extends aPs
{
  protected static final Logger K = Logger.getLogger(dLf.class);
  private static final dLf lZF = new dLf();

  private final aoL lZG = new aoL();

  public static dLf djM() {
    return lZF;
  }

  public void f(bls parambls)
  {
    this.lZG.put(parambls.getId(), parambls);
    super.a(parambls);
  }

  public bls kG(long paramLong)
  {
    return (bls)this.lZG.get(paramLong);
  }

  public void j(dGy paramdGy)
  {
    this.lZG.s(paramdGy);
  }

  public void bE(long paramLong)
  {
    bls localbls = (bls)this.lZG.remove(paramLong);
    if (localbls != null) {
      K.info("FloorItem despawn : " + localbls.getId() + " phase = " + localbls.cql() + " lock = " + localbls.cqo());
      localbls.bwt();
    }
  }

  public void eq(long paramLong)
  {
    bE(paramLong);
  }

  public boolean a(cWG paramcWG)
  {
    return super.a(paramcWG);
  }

  public void initialize() {
    a(5L);
    bgk();
  }
}