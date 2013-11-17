import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aZT
{
  protected static Logger K = Logger.getLogger(aZT.class);
  public static final byte fhh = 30;
  protected final cpy fhi = new cpy();

  public boolean cB(byte paramByte) {
    this.fhi.dP(paramByte);
    return true;
  }

  public void clear() {
    this.fhi.clear();
  }

  public void a(cXW paramcXW)
  {
    for (cQE localcQE = this.fhi.cpa(); localcQE.hasNext(); ) {
      bWd localbWd = new bWd();
      localbWd.his = localcQE.cHr();
      paramcXW.kLl.add(localbWd);
    }
  }

  public final void b(cXW paramcXW) {
    for (int i = 0; i < paramcXW.kLl.size(); i++)
      cB(((bWd)paramcXW.kLl.get(i)).his);
  }
}