import org.apache.log4j.Logger;

public class bPy
  implements cvW
{
  private static final boolean aRN = false;
  private static final Logger K = Logger.getLogger(bPy.class);

  private static final bPy gWi = new bPy();

  private final bPu gWj = new bPu();

  public bPy() {
    this.gWj.c((short)17013, new ceZ());
  }

  public static bPy bWb()
  {
    return gWi;
  }

  public boolean a(cWG paramcWG)
  {
    cpw localcpw = (cpw)this.gWj.cx((short)paramcWG.getId());
    return (localcpw == null) || (localcpw.a(paramcWG));
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean);
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean);
  }
}