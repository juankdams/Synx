import java.util.ArrayList;
import java.util.List;

public final class ae
  implements dBv
{
  public static final String bC = "name";
  public static final String bD = "elements";
  public static final String bE = "isVisible";
  public static final String[] bF = { "name", "elements", "isVisible" };
  private final String m_name;
  private boolean bG;
  private final List bH = new ArrayList();
  private final ArrayList bI = new ArrayList();

  public ae(String paramString) {
    this.m_name = paramString;
    this.bG = true;
  }

  public ae(String paramString, boolean paramBoolean) {
    this.m_name = paramString;
    this.bG = paramBoolean;
  }

  public String getName()
  {
    return this.m_name;
  }

  public List aP()
  {
    return this.bH;
  }

  public void k(String paramString)
  {
    this.bI.add(paramString);
  }

  public ArrayList aQ()
  {
    return this.bI;
  }

  public void a(dAD paramdAD)
  {
    this.bH.add(paramdAD);
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.m_name;
    if (paramString.equals("elements"))
      return this.bH;
    if (paramString.equals("isVisible")) {
      return Boolean.valueOf(this.bG);
    }
    return null;
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public boolean isVisible() {
    return this.bG;
  }

  public void setVisible(boolean paramBoolean) {
    this.bG = paramBoolean;
    dLE.doY().a(this, new String[] { "isVisible" });
    bWP.cbM().E(this.m_name, paramBoolean);
  }

  public void update() {
    for (dAD localdAD : this.bH) {
      localdAD.update();
    }
    dLE.doY().a(this, new String[] { "elements", "isVisible", "name" });
  }
}