import java.util.ArrayList;
import org.apache.log4j.Logger;

public class am
{
  private static final Logger K = Logger.getLogger(am.class);
  public static final int bP = -1;
  private final adz bQ = new adz();
  private int bR;

  public boolean n(int paramInt)
  {
    return this.bQ.contains(paramInt);
  }

  public boolean isSelected(int paramInt) {
    return paramInt == this.bR;
  }

  public void o(int paramInt) {
    this.bQ.hL(paramInt);
    this.bR = paramInt;
  }

  public void aV() {
    this.bR = -1;
  }

  public int aW() {
    return this.bR;
  }

  public void clear() {
    this.bQ.clear();
    this.bR = -1;
  }

  public void a(vz paramvz) {
    paramvz.bjU = this.bR;
    for (kr localkr = this.bQ.apz(); localkr.hasNext(); ) {
      cMk localcMk = new cMk();
      localcMk.krF = localkr.next();
      paramvz.bjT.add(localcMk);
    }
  }

  public void b(vz paramvz) {
    this.bR = paramvz.bjU;
    int i = 0; for (int j = paramvz.bjT.size(); i < j; i++)
      this.bQ.hL(((cMk)paramvz.bjT.get(i)).krF);
  }
}