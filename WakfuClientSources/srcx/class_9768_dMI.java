import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dMI extends afn
{
  private static final Logger K = Logger.getLogger(dMI.class);
  private static int cVq = 0;
  private int brP;
  private boolean euC = false;

  public dMI() {
    super(cVq++, null, null, null);
  }

  public void rf(int paramInt) {
    this.brP = paramInt;
  }

  public short aqT() {
    if (!this.euC) {
      as(bDk.bLI().cr((short)this.brP).cYh);
      this.euC = true;
    }

    return super.aqT();
  }

  public bNa aqU()
  {
    ArrayList localArrayList = getChildren();

    if (localArrayList.size() == 0) {
      return auI.dHD;
    }

    cwt localcwt = (cwt)localArrayList.get(0);
    return localcwt.aqU();
  }
}