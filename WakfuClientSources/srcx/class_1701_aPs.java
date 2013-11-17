import org.apache.log4j.Logger;

public abstract class aPs extends IR
  implements dUd
{
  private static final Logger K = Logger.getLogger(aPs.class);
  private long aTz;
  private long eLw;
  private int[] eLx;
  private int eLy;
  private long aPT = -1L;

  public void bgk() {
    this.eLx = new int[3];
    for (int i = 0; i < 3; i++)
      this.eLx[i] = (aMM.esf[i] / 1);
    this.eLy = 30;
    if (this.aPT != -1L)
      cAo.cxf().ia(this.aPT);
    this.aPT = cAo.cxf().a(this, 1000L, 1);
    this.eLw = 0L;
  }

  public boolean a(cWG paramcWG) {
    if (!(paramcWG instanceof dKQ)) {
      return true;
    }
    this.eLw += 1L;

    j(new cCg(this));

    return false;
  }

  public abstract void eq(long paramLong);

  public long getId()
  {
    return this.aTz;
  }

  public void a(long paramLong) {
    this.aTz = paramLong;
  }

  public long getTick()
  {
    return this.eLw;
  }

  public void a(agY paramagY)
  {
    b(paramagY);
  }

  public final void b(agY paramagY) {
    if (paramagY.asD() != -1L) {
      return;
    }
    c(paramagY);
  }

  private void c(agY paramagY)
  {
    int i;
    if (paramagY.cql() == -1) {
      i = paramagY.asG() == -1 ? this.eLy : paramagY.asG() / 1;
    }
    else
    {
      i = paramagY.asF() == null ? this.eLx[paramagY.cql()] : paramagY.asF()[paramagY.cql()] / 1;
    }

    paramagY.cK(i);
  }
}