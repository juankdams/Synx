import java.io.IOException;
import org.apache.log4j.Logger;

public class aYn extends cGj
{
  public static final String NAME = "name";
  public static final String fdZ = "actorDescriptorLibrary";
  private final ahm fea;
  private final int aTl;

  public aYn(int paramInt1, int paramInt2)
  {
    String str = null;
    try {
      str = String.format(ay.bd().getString("ANMInteractiveElementPath"), new Object[] { Integer.valueOf(paramInt2) });
    } catch (bdh localbdh) {
      beO.K.warn("Problème au chargement de la propriété ANMInteractiveElementPath");
    }

    this.fea = new ahm();
    try {
      this.fea.b(str, true);
    } catch (IOException localIOException) {
      beO.K.error("Problème au chargement de " + str);
    }
    this.fea.em(String.valueOf(paramInt2));

    this.aTl = paramInt1;
  }

  public int vH() {
    return this.aTl;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return bU.fH().b(99, this.aTl, new Object[0]);
    if (paramString.equals("actorDescriptorLibrary")) {
      return this.fea;
    }
    return null;
  }
}