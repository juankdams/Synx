import org.apache.log4j.Logger;

public class dMG extends cgs
{
  private cgs mcP;

  public dMG(cgs paramcgs)
  {
    if (paramcgs != null) {
      this.mcP = paramcgs;
    } else {
      cgs.ch().error("Le Spring passé en paramètre est null");
      this.mcP = vi(0);
    }
  }

  public int getValue()
  {
    return -this.mcP.getValue();
  }

  public void setValue(int paramInt)
  {
    this.mcP.setValue(paramInt);
  }

  public void bc()
  {
    super.bc();
    this.mcP = null;
  }
}