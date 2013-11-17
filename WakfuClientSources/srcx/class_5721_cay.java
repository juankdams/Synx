import java.util.List;
import org.apache.log4j.Logger;

public abstract class cay
  implements dBv
{
  private static final Logger K = Logger.getLogger(cay.class);
  public static final String dqx = "spells";
  private dCi hro = null;

  public static final String[] bF = { "spells" };

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("spells")) {
      return aeA();
    }

    return null;
  }

  public void ceJ() {
    dLE.doY().a(this, new String[] { "spells" });
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public abstract Iterable aeA();

  public dCi ceK() {
    return this.hro;
  }

  public boolean aeE() {
    return this.hro != null;
  }

  public void a(List paramList, dhJ paramdhJ) {
    aP(paramdhJ);
    for (apX localapX : paramList)
      try {
        this.hro.c(localapX);
      } catch (dI localdI) {
        K.error("Exception levee", localdI);
      } catch (dcF localdcF) {
        K.error("Exception levee", localdcF);
      }
  }

  public void aP(dhJ paramdhJ)
  {
    this.hro = new dCi((short)40, new diM(paramdhJ), null, false, false, false);
  }

  public void aeD() {
    if (this.hro == null)
      return;
    this.hro.ajy();
    this.hro = null;
  }
}