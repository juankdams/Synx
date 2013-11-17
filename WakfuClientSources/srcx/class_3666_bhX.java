import org.apache.log4j.Logger;

public abstract class bhX
{
  protected static final Logger K = Logger.getLogger(bhX.class);
  protected final Qb erV;

  protected bhX(Qb paramQb)
  {
    this.erV = paramQb;
  }

  public abstract boolean a(dsl paramdsl, int paramInt);

  public abstract boolean b(dsl paramdsl, int paramInt);
}