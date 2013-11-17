import org.apache.log4j.Logger;

class dLu
  implements dBv
{
  private static final Logger K = Logger.getLogger(dLu.class);
  public static final String bC = "name";
  public static final String fIh = "isActivated";
  private final String[] bF = { "name", "isActivated" };
  private final short aDx;
  private final String m_name;
  private final bPu maZ;
  private final cyE mba = new cyE();

  dLu(short paramShort, String paramString, bPu parambPu) {
    this.aDx = paramShort;
    this.m_name = paramString;
    this.maZ = parambPu;
    this.maZ.a(new Mi(this));
  }

  public String[] getFields()
  {
    return this.bF;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("name")) {
      return bU.fH().getString("tooltipTutorial." + this.m_name);
    }
    if (paramString.equals("isActivated")) {
      return Boolean.valueOf(apR());
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

  public short nc() {
    return this.aDx;
  }

  public String getName() {
    return this.m_name;
  }

  public boolean apR() {
    for (bM localbM = this.maZ.bVW(); localbM.hasNext(); ) {
      localbM.fl();
      if (((cAe)localbM.value()).apR())
        return true;
    }
    return false;
  }

  public void cz(boolean paramBoolean) {
    buj localbuj = buj.bCk();

    this.maZ.s(new Me(this, paramBoolean, localbuj));
  }

  bM doQ()
  {
    return this.maZ.bVW();
  }

  public cAe eI(short paramShort) {
    return (cAe)this.maZ.cx(paramShort);
  }

  public cAe fP(byte paramByte) {
    return (cAe)this.maZ.cx(this.mba.ea(paramByte));
  }

  public String toString()
  {
    return "Tutorial{m_id=" + this.aDx + ", m_name='" + this.m_name + '\'' + ", m_partsCount=" + this.maZ.size() + '}';
  }
}