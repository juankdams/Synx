import java.util.EnumMap;
import org.apache.log4j.Logger;

public class aNh
  implements dBv
{
  protected static final Logger K = Logger.getLogger(aNh.class);

  public static final aNh eth = new aNh();
  private final EnumMap eti;
  private static final String[] bF;

  private aNh()
  {
    this.eti = new EnumMap(dEX.class);
  }

  public void a(dEX paramdEX, boolean paramBoolean)
  {
    this.eti.put(paramdEX, Boolean.valueOf(paramBoolean));
  }

  public boolean a(dEX paramdEX)
  {
    Boolean localBoolean = (Boolean)this.eti.get(paramdEX);
    if (localBoolean != null) {
      return localBoolean.booleanValue();
    }

    return false;
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    return Boolean.valueOf(a(dEX.qW(paramString)));
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

  public boolean bdY() {
    return (a(dEX.lOj)) && (a(dEX.lOk));
  }

  static
  {
    dEX[] arrayOfdEX = dEX.values();
    bF = new String[arrayOfdEX.length];
    for (int i = 0; i < arrayOfdEX.length; i++)
      bF[i] = arrayOfdEX[i].getPropertyName();
  }
}