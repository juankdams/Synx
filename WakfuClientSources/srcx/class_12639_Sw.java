import java.util.HashMap;
import org.apache.log4j.Logger;

public class Sw
{
  private static final Logger K = Logger.getLogger(Sw.class);
  private static final boolean aRN = false;
  private static Sw ctw = new Sw();
  private final HashMap bhO;

  public Sw()
  {
    this.bhO = new HashMap();
  }

  public P a(aYE paramaYE) {
    return (P)this.bhO.get(paramaYE);
  }

  public boolean b(aYE paramaYE) {
    return this.bhO.containsKey(paramaYE);
  }

  public void c(aYE paramaYE) {
    if ((!bB) && (b(paramaYE))) throw new AssertionError("textrenderers should be created once");
    bMR localbMR;
    if (paramaYE.at())
      localbMR = new bMR(paramaYE.bnO(), paramaYE.isAntiAliased(), false, aAF.dTA);
    else {
      localbMR = new bMR(paramaYE.bnO(), paramaYE.isAntiAliased(), false);
    }
    localbMR.setUseVertexArrays(false);
    this.bhO.put(paramaYE, localbMR);
  }

  public static Sw afx()
  {
    return ctw;
  }
}