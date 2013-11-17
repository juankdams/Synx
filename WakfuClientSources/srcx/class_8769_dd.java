import com.ankamagames.wakfu.client.core.script.function.context.CreateAnimatedElement;
import java.util.ArrayList;

public class dd
  implements dBv
{
  private static final dd SV = new dd();
  public static final String SW = "linkages";
  public static final String SX = "selectedLinkage";
  public static final String TYPE = "type";
  private ArrayList SY = new ArrayList();
  private String SZ;
  private String Ta = "players";

  public static dd gW()
  {
    return SV;
  }

  public void gX() {
    this.SY.clear();
    ArrayList localArrayList = new ArrayList();
    cew localcew = byv.bFN().bFO().aeL();
    localcew.c(new afj(this, localcew, localArrayList));
  }

  public void setType(String paramString)
  {
    this.Ta = paramString;
    dLE.doY().a(this, new String[] { "type" });
  }

  public void C(String paramString) {
    b(this.Ta, paramString);
  }

  public void b(String paramString1, String paramString2) {
    cew localcew = byv.bFN().bFO().aeL();
    try
    {
      String str = CreateAnimatedElement.i(paramString1, paramString2);
      localcew.b(str, true);
    }
    catch (Exception localException) {
    }
    gX();
    if (this.SY.size() > 0)
      D((String)this.SY.get(0));
  }

  public void D(String paramString)
  {
    this.SZ = paramString;
    dLE.doY().a(this, new String[] { "selectedLinkage" });

    byv.bFN().bFO().aeL().eq(paramString);

    play();
  }

  public void play() {
    if (this.SZ != null)
      byv.bFN().bFO().aeL().eq(this.SZ);
  }

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("linkages"))
      return this.SY;
    if (paramString.equals("selectedLinkage"))
      return this.SZ;
    if (paramString.equals("type")) {
      return this.Ta;
    }
    return null;
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
}