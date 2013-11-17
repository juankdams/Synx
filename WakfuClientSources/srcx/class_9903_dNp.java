public class dNp
  implements dBv
{
  public static final String bC = "name";
  public static final String RI = "description";
  public static final String mdT = "ownerName";
  public static final String mdU = "localPlayerHasRightToNominate";
  public static final String mdV = "localPlayerHasRightToRevoke";
  public static final String ciu = "iconUrl";
  public static final String mdW = "isSelf";
  private Yp btC;
  private String mdX;
  static final String[] hpV = { "name", "ownerName" };

  static final String[] mdY = { "localPlayerHasRightToNominate", "localPlayerHasRightToRevoke", "iconUrl", "description" };

  private static final String[] bwd = new String[mdY.length + hpV.length];

  public dNp(Yp paramYp)
  {
    this.btC = paramYp;
  }

  public Yp HK() {
    return this.btC;
  }

  public long Hc() {
    return this.btC.getId();
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    cjH localcjH;
    dpE localdpE;
    if (paramString.equals("localPlayerHasRightToRevoke")) {
      localcjH = bPE.bWu().UI().aNd();
      localdpE = localcjH.hv(byv.bFN().bFO().getId());
      if (localdpE == null) {
        return Boolean.valueOf(false);
      }
      return Boolean.valueOf(bfi.b(localdpE.HK(), this.btC));
    }if (paramString.equals("localPlayerHasRightToNominate")) {
      localcjH = bPE.bWu().UI().aNd();
      localdpE = localcjH.hv(byv.bFN().bFO().getId());
      if (localdpE == null) {
        return Boolean.valueOf(false);
      }
      return Boolean.valueOf(bfi.a(localdpE.HK(), this.btC));
    }if (paramString.equals("iconUrl"))
      return ay.bd().a("governmentRankIconPath", "defaultIconPath", new Object[] { Byte.valueOf(this.btC.ajY()) });
    if (paramString.equals("description"))
      return bU.fH().b(40, (short)(int)this.btC.getId(), new Object[0]);
    if (paramString.equals("ownerName"))
      return this.mdX;
    if (paramString.equals("isSelf")) {
      return Boolean.valueOf(byv.bFN().bFO().getName().equals(this.mdX));
    }

    return null;
  }

  public String getName() {
    return bU.fH().b(57, (int)this.btC.getId(), new Object[0]);
  }

  public void rw(String paramString) {
    this.mdX = paramString;
    dLE.doY().a(this, new String[] { "ownerName" });
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

  public String[] getFields() {
    return bwd;
  }

  static
  {
    System.arraycopy(mdY, 0, bwd, 0, mdY.length);
    System.arraycopy(hpV, 0, bwd, mdY.length, hpV.length);
  }
}