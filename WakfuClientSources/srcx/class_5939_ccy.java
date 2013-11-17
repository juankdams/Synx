import java.util.HashMap;
import java.util.Map;

public class ccy
{
  public static final String TAG = "SOAP-ENV:Envelope";
  public static final String hui = "xmlns:SOAP-ENV";
  public static final String huj = "http://schemas.xmlsoap.org/soap/envelope/";
  public static final String huk = "xmlns:xsd";
  public static final String hul = "http://www.w3.org/2001/XMLSchema";
  public static final String hum = "xmlns:xsi";
  public static final String hun = "http://www.w3.org/2001/XMLSchema-instance";
  public static final String huo = "xmlns:SOAP-ENC";
  public static final String hup = "http://schemas.xmlsoap.org/soap/encoding/";
  public static final String huq = "SOAP-ENV:encodingStyle";
  public static final String hur = "http://schemas.xmlsoap.org/soap/encoding/";
  public static final String hus = "xmlns:ns1";
  private final String hut;
  private bcx huu;
  private final Map huv = new HashMap();

  public ccy(String paramString) {
    this.hut = paramString;
  }

  public void a(bcx parambcx) {
    this.huu = parambcx;
  }

  public bcx cfJ() {
    return this.huu;
  }

  public Map getHeaderFields() {
    return this.huv;
  }

  public void n(Map paramMap) {
    this.huv.putAll(paramMap);
  }

  public CC bqC() {
    CC localCC = new CC("SOAP-ENV:Envelope", "");

    localCC.c(new dvw("xmlns:SOAP-ENV", "http://schemas.xmlsoap.org/soap/envelope/"));
    localCC.c(new dvw("xmlns:ns1", this.hut));
    localCC.c(new dvw("xmlns:xsd", "http://www.w3.org/2001/XMLSchema"));
    localCC.c(new dvw("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance"));
    localCC.c(new dvw("xmlns:SOAP-ENC", "http://schemas.xmlsoap.org/soap/encoding/"));
    localCC.c(new dvw("SOAP-ENV:encodingStyle", "http://schemas.xmlsoap.org/soap/encoding/"));

    if (this.huu != null) {
      localCC.a(this.huu.bqC());
    }
    return localCC;
  }

  public static ccy f(bwZ parambwZ) {
    CC localCC = parambwZ.bEx();

    String str = localCC.getName();
    if (!str.equals("SOAP-ENV:Envelope")) {
      throw new IllegalArgumentException("Le nom de l'élément ne respecte pas la norme : " + str);
    }
    K localK1 = localCC.e("xmlns:ns1");
    if (localK1 == null) {
      throw new IllegalArgumentException("Paramètre xmlns:ns1 manquant dans l'enveloppe.");
    }
    K localK2 = localCC.b("SOAP-ENV:Body");
    if (localK2 == null) {
      throw new IllegalArgumentException("Enfant SOAP-ENV:Body manquant dans l'enveloppe.");
    }
    ccy localccy = new ccy(localK1.getStringValue());
    localccy.huu = bcx.v(localK2);

    return localccy;
  }
}