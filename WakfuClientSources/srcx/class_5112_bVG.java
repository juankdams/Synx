import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bVG
{
  protected static final Logger K = Logger.getLogger(bVG.class);

  protected final adz hhM = new adz();

  public boolean ui(int paramInt) {
    return this.hhM.hL(paramInt);
  }

  public final boolean uj(int paramInt) {
    return this.hhM.contains(paramInt);
  }

  public void clear() {
    this.hhM.clear();
  }

  private void cbk() {
    adz localadz = cbp.hsN.cfa();
    localadz.g(new cDr(this));
  }

  public void a(cBY paramcBY)
  {
    for (kr localkr = this.hhM.apz(); localkr.hasNext(); ) {
      nn localnn = new nn();
      localnn.aRM = localkr.next();
      paramcBY.fcy.add(localnn);
    }
  }

  public final void b(cBY paramcBY) {
    for (int i = 0; i < paramcBY.fcy.size(); i++) {
      ui(((nn)paramcBY.fcy.get(i)).aRM);
    }
    cbk();
  }
}