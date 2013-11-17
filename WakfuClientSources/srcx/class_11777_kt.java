import java.util.ArrayList;
import java.util.List;

public class kt extends dAD
{
  public static final String bC = "name";
  public static final String aNY = "value";
  public static final String aNZ = "tooltipText";
  public static final String[] aOa = { "name", "value", "tooltipText" };

  public static final String[] aOb = new String[aOa.length + dAD.bF.length];

  private String m_name = "<undefined>";
  protected String m_prefix;
  protected String aOc;
  protected Object aOd;
  private final String hX;
  protected final List aOe = new ArrayList();
  protected bTd aOf;

  public kt(String paramString1, String paramString2, String paramString3, String paramString4, bTd parambTd)
  {
    this(paramString1, paramString2, parambTd);
    this.m_prefix = paramString3;
    this.aOc = paramString4;
  }

  public kt(String paramString1, String paramString2, String paramString3, String paramString4) {
    this(paramString1, paramString2, paramString3, paramString4, null);
  }

  public kt(String paramString1, String paramString2, bTd parambTd) {
    this.m_name = paramString1;
    this.hX = paramString2;
    if (parambTd != null)
      parambTd.b(this);
    this.aOf = parambTd;
  }

  public kt(String paramString1, String paramString2) {
    this(paramString1, paramString2, null);
  }

  public String getName()
  {
    return this.m_name;
  }

  public kt p(Object paramObject) {
    this.aOd = paramObject;
    return this;
  }

  public String getKey() {
    return this.hX;
  }

  public String A(boolean paramBoolean)
  {
    if (this.aOd == null)
      return paramBoolean ? "<i>undefined</i>" : "undefined";
    String str = this.aOd.toString();
    if (this.m_prefix != null)
      str = this.m_prefix + " " + str;
    if (this.aOc != null)
      str = str + " " + this.aOc;
    return paramBoolean ? format(str) : str;
  }

  public String getStringValue()
  {
    return A(true);
  }

  public Object getValue() {
    return this.aOd;
  }

  protected String format(String paramString) {
    if (this.aOf == null)
      return paramString;
    String str = this.aOf.aC(this.aOd);
    if (str == null)
      return paramString;
    return new lZ().am(str).a(paramString).tP();
  }

  public void a(kt paramkt)
  {
    this.aOe.add(paramkt);
  }

  public cHJ sh() {
    return cHJ.iCI;
  }

  public void update() {
    if (this.hX == null) {
      super.update();
      return;
    }

    boq localboq = dAJ.def().deg().rB(this.hX);

    if (localboq != null)
      this.aOd = Long.valueOf(localboq.getValue());
    else {
      this.aOd = null;
    }
    for (kt localkt : this.aOe) {
      localkt.update();
    }
    super.update();
  }

  protected String getTooltipText() {
    if (this.aOe == null) {
      return "";
    }

    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getName()).append(" : ").append(A(false));
    for (kt localkt : this.aOe) {
      localStringBuilder.append("\n");
      localStringBuilder.append(localkt.getName()).append(" : ").append(localkt.A(false));
    }

    return localStringBuilder.toString();
  }

  public String[] getFields() {
    return aOb;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.m_name;
    if (paramString.equals("value"))
      return getStringValue();
    if (paramString.equals("tooltipText")) {
      return getTooltipText();
    }

    return super.getFieldValue(paramString);
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

  public kt ag(String paramString) {
    for (kt localkt : this.aOe) {
      if ((localkt.getKey() != null) && (localkt.getKey().equals(paramString)))
        return localkt;
    }
    return null;
  }

  static
  {
    System.arraycopy(aOa, 0, aOb, 0, aOa.length);
    System.arraycopy(dAD.bF, 0, aOb, aOa.length, dAD.bF.length);
  }
}