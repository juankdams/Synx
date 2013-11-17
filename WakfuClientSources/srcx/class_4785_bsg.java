import org.apache.log4j.Logger;

public class bsg extends dKf
{
  private static final Logger K = Logger.getLogger(bsg.class);
  private int aPh;

  public bsg(int paramInt)
  {
    super(paramInt);
  }

  public void c(String[] paramArrayOfString) {
    this.aPh = Integer.parseInt(paramArrayOfString[0]);
  }

  public boolean Z(gA paramgA) {
    if (!super.Z(paramgA)) {
      return false;
    }
    byz localbyz = byv.bFN().bFO();

    bCP localbCP = localbyz.bGa();
    return (!localbCP.mc(this.aPh)) || (localbCP.md(this.aPh));
  }

  public String bAu() {
    return bU.fH().getString("item.action.resetAchievement", new Object[] { bU.fH().b(62, this.aPh, new Object[0]) });
  }

  public boolean f(gA paramgA) {
    bZ(paramgA.oj());
    return true;
  }

  public void clear()
  {
  }
}