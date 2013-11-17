import org.apache.log4j.Logger;

public class cwC
  implements Cloneable
{
  protected static final Logger K = Logger.getLogger(cwC.class);
  private double dLg;

  public cwC(int paramInt)
  {
    this.dLg = paramInt;
  }

  public cwC(double paramDouble)
  {
    this.dLg = paramDouble;
  }

  public static cwC mr(String paramString) {
    if (paramString.charAt(paramString.length() - 1) != '%') {
      return null;
    }

    double d = Double.valueOf(paramString.substring(0, paramString.length() - 1)).doubleValue();
    return new cwC(d);
  }

  public double getValue() {
    return this.dLg;
  }

  public void P(double paramDouble) {
    this.dLg = paramDouble;
  }

  public boolean a(cwC paramcwC)
  {
    return (paramcwC != null) && (paramcwC.dLg == this.dLg);
  }

  public Object clone()
  {
    try
    {
      return super.clone();
    } catch (CloneNotSupportedException localCloneNotSupportedException) {
      K.error("Exception", localCloneNotSupportedException);
    }
    return null;
  }
}