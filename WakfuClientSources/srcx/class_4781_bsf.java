import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bsf extends cGj
{
  private static final Logger K = Logger.getLogger(bsf.class);
  public static final String aGo = "title";
  public static final String RI = "description";
  public static final String fOt = "gifts";
  public static final String ciu = "iconUrl";
  public static final String fOu = "guid";
  public static final String[] bF = { "title", "description", "gifts" };
  private String fOv;
  private String fOw;
  private final ArrayList fOx;
  private byte fOy = 1;

  public bsf() {
    this.fOx = new ArrayList();
  }

  public void a(cNH paramcNH) {
    this.fOv = paramcNH.title;
    this.fOw = paramcNH.message;

    ArrayList localArrayList = paramcNH.aZC;
    for (iE localiE : localArrayList) {
      cxN localcxN = localiE.aIA;
      Object localObject;
      try {
        localObject = ddO.a(localcxN);
      } catch (aSc localaSc) {
        K.error("Impossible de créer le gift " + localcxN, localaSc);
        localObject = new ot();
      }
      this.fOx.add(localObject);
    }
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("title"))
      return this.fOv;
    if (paramString.equals("description"))
      return this.fOw;
    if (paramString.equals("gifts"))
      return this.fOx;
    if (paramString.equals("iconUrl"))
      return ay.bd().a("giftTypeIconPath", "defaultIconPath", new Object[] { Byte.valueOf(this.fOy) });
    if (paramString.equals("guid")) {
      return this.fOv;
    }
    return null;
  }

  public boolean a(dTe paramdTe, boolean paramBoolean) {
    int i = this.fOx.indexOf(paramdTe);
    if (i == -1) {
      return false;
    }

    if (paramdTe.K(paramBoolean)) {
      this.fOx.remove(paramdTe);
    }

    if (this.fOx.size() != 0) {
      dLE.doY().a(this, new String[] { "gifts" });
    }
    return this.fOx.size() == 0;
  }
}