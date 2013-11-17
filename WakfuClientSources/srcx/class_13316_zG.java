import java.util.ArrayList;
import org.apache.log4j.Logger;

public class zG extends alO
{
  private static final Logger K = Logger.getLogger(zG.class);

  protected void a(cew paramcew, bp parambp)
  {
  }

  public void b(cew paramcew)
  {
    bp localbp = (bp)ayx();
    this.dmN.clear();
    a(localbp, localbp, paramcew);
  }

  public void a(bp parambp1, bp parambp2, cew paramcew) {
    if (parambp2.kk == null) {
      K.warn("On essaye de désappliquer un mobile qui n'a pas été appliqué correctement");
    }

    paramcew.o(parambp2.kk);
    bQK.bXG().gX(parambp2.kk.getId());
    parambp2.kk = null;
  }
}