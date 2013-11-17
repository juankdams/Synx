import org.apache.log4j.Logger;

public abstract class cVn
{
  protected static final Logger K = Logger.getLogger(cVn.class);

  protected final cSR hKd = new cSR();

  public void d(aPH paramaPH)
  {
    this.hKd.put(paramaPH.getId(), paramaPH);
  }

  public void e(aPH paramaPH)
  {
    this.hKd.remove(paramaPH.getId());
  }

  public aPH zf(int paramInt)
  {
    return (aPH)this.hKd.get(paramInt);
  }
}