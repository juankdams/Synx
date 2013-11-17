import java.util.Map;
import org.apache.log4j.Logger;

public abstract class Pd
{
  private static final Logger K = Logger.getLogger(Pd.class);

  protected final akR cgT = new akR();
  protected final akR cgU = new akR();

  protected Pd()
  {
    Sr();
  }

  protected abstract void Sr();

  public void d(String paramString, Class paramClass)
  {
    a(paramString.toLowerCase(), new dGI(paramClass));
  }

  public void a(String paramString, dUo paramdUo)
  {
    if (this.cgT.containsKey(paramString.toLowerCase())) {
      K.error("le tag (name=" + paramString + ") est déjà utilisé !");
      return;
    }
    this.cgT.put(paramString.toLowerCase(), paramdUo);
    this.cgU.put(paramdUo.bya(), paramdUo);
  }

  public boolean db(String paramString)
  {
    dUo localdUo = (dUo)this.cgT.remove(paramString);
    if (localdUo != null) {
      this.cgU.remove(localdUo.bya());
    }
    return null != localdUo;
  }

  public Map abd()
  {
    return this.cgT;
  }

  public dUo dc(String paramString)
  {
    return (dUo)this.cgT.get(paramString.toLowerCase());
  }

  public dUo l(Class paramClass)
  {
    return (dUo)this.cgU.get(paramClass);
  }
}