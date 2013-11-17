import org.apache.log4j.Logger;

public class dOX
{
  protected static final Logger K = Logger.getLogger(dOX.class);

  private static final dOX mgI = new dOX();

  private final cSR mgJ = new cSR();

  public static dOX dqt()
  {
    return mgI;
  }

  public SH Dg(int paramInt)
  {
    SH localSH = (SH)this.mgJ.get(paramInt);
    if (localSH != null) {
      return localSH;
    }
    return null;
  }
}