import org.apache.log4j.Logger;

public class pI extends BO
{
  private static Logger K = Logger.getLogger(pI.class);

  private aFG aWn = null;

  public void setup(dFD paramdFD)
  {
    if ((paramdFD instanceof aWM))
      ((aWM)paramdFD).setAlign(this.aWn);
  }

  public void setAlignment(aFG paramaFG)
  {
    this.aWn = paramaFG;
  }

  public aFG getAlignment()
  {
    return this.aWn;
  }

  public void c(bdj parambdj)
  {
    pI localpI = (pI)parambdj;
    super.c(localpI);
    localpI.aWn = this.aWn;
  }
}