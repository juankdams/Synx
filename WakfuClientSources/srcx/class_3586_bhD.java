import java.util.HashMap;
import org.apache.log4j.Logger;

public class bhD
{
  private static final Logger K = Logger.getLogger(bhD.class);
  private static final boolean DEBUG = true;
  private static final bhD fws = new bhD();

  private final HashMap fwt = new HashMap();

  public static bhD btQ()
  {
    return fws;
  }

  public final void a(dPJ paramdPJ, bXf parambXf, String paramString, bFB[] paramArrayOfbFB, boolean paramBoolean)
  {
    cp localcp = (cp)this.fwt.get(paramdPJ);
    if (localcp == null) {
      localcp = new cp();
      this.fwt.put(paramdPJ, localcp);
    }
    localcp.a(parambXf, paramString, paramArrayOfbFB, paramBoolean);
  }

  public final cp b(dPJ paramdPJ)
  {
    return (cp)this.fwt.get(paramdPJ);
  }

  public final cp c(dPJ paramdPJ)
  {
    return (cp)this.fwt.remove(paramdPJ);
  }

  public void d(dPJ paramdPJ) {
    cp localcp = (cp)this.fwt.get(paramdPJ);
    if ((localcp != null) && 
      (localcp.a(paramdPJ)))
      this.fwt.remove(paramdPJ);
  }

  public void a(dPJ paramdPJ, bXf parambXf)
  {
    cp localcp = (cp)this.fwt.get(paramdPJ);
    if ((localcp != null) && 
      (localcp.a(parambXf)))
      this.fwt.remove(paramdPJ);
  }

  public void clean()
  {
    this.fwt.clear();
  }
}