import org.apache.log4j.Logger;

public class sj extends cgs
{
  private static final Logger K = Logger.getLogger(sj.class);
  private Yl bas;
  private dOc aPS;
  private String bat;
  private String SK;

  public sj(Yl paramYl, dOc paramdOc, String paramString)
  {
    this.bas = paramYl;
    this.aPS = paramdOc;
    this.bat = paramString;
  }

  public sj(Yl paramYl, String paramString1, String paramString2) {
    this.bas = paramYl;
    this.SK = paramString1;
    this.bat = paramString2;
  }

  public cgs getConstraint() {
    if (this.aPS == null) {
      cDA localcDA = cBQ.cxL().coO();

      if (localcDA == null) {
        localcDA = cBQ.cxL().coO();
      }
      this.aPS = ((dOc)localcDA.fi(this.SK));
      if (this.aPS == null) {
        K.warn("Impossible de trouver le widget " + this.SK);
      }
    }
    if (this.bas.getConstraint(this.aPS) == null) {
      return null;
    }
    return this.bas.getConstraint(this.aPS).getConstraint(this.bat);
  }

  public int getValue()
  {
    cgs localcgs = getConstraint();
    return localcgs != null ? localcgs.getValue() : 0;
  }

  public void setValue(int paramInt)
  {
    getConstraint().setValue(paramInt);
  }
}