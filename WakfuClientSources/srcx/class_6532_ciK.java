import org.apache.log4j.Logger;

public abstract class ciK
{
  protected static final Logger K = Logger.getLogger(ciK.class);

  private final bPu hIa = new bPu();

  public final void a(cRA[] paramArrayOfcRA) {
    for (cRA localcRA : paramArrayOfcRA)
      this.hIa.c(localcRA.Cr(), localcRA.Ct());
  }

  public final dfN dc(short paramShort)
  {
    return (dfN)this.hIa.cx(paramShort);
  }
}