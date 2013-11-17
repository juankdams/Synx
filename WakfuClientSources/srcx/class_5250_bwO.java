public class bwO
  implements dxY
{
  public static final String gho = "nameWithFormat";
  public static final String RH = "iconUrl";
  public static final String ghp = "effectDescription";
  public static final String bsP = "level";
  public static final String bHK = "levelValue";
  public static final String ghq = "maxLevelValue";
  public static final String[] bF = { "nameWithFormat", "iconUrl", "effectDescription", "level", "levelValue", "maxLevelValue" };
  private final aAn ghr;
  private short cZu;

  public bwO(aAn paramaAn, short paramShort)
  {
    this.ghr = paramaAn;
    this.cZu = paramShort;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("nameWithFormat"))
      return bU.fH().b(6, (short)(int)this.ghr.clt(), new Object[0]);
    if (paramString.equals("iconUrl"))
      return ay.bd().a("effectAreasIconsPath", null, new Object[] { Short.valueOf((short)(int)this.ghr.clt()) });
    if (paramString.equals("effectDescription")) {
      axj localaxj = new axj(this.ghr, this.cZu, 0);
      return localaxj.cAK();
    }if (paramString.equals("level"))
      return bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(this.cZu) });
    if (paramString.equals("levelValue"))
      return Short.valueOf(this.cZu);
    if (paramString.equals("maxLevelValue")) {
      return Short.valueOf(bEt());
    }

    return null;
  }

  public short bEt() {
    return 200;
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

  public short bEu() {
    return (short)(int)this.ghr.clt();
  }

  public void cb(short paramShort) {
    this.cZu = paramShort;
    dLE.doY().a(this, bF);
  }

  public short nU() {
    return this.cZu;
  }
}