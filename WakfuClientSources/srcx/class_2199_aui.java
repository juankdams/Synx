import java.util.ArrayList;

public class aui extends cGj
{
  public static final String bC = "name";
  public static final String dGr = "guildPerms";
  public static final String dGs = "anonymousPerms";
  public static final String dGt = "individualPerms";
  public static final String ciu = "iconUrl";
  private static final String[] bF = { "name", "guildPerms", "anonymousPerms", "individualPerms", "iconUrl" };
  private int aWH;
  private int aSg;
  private cub dGu;
  private ArrayList dGv = new ArrayList();

  public aui(int paramInt, cub paramcub) {
    this.aWH = paramInt;
    bBn localbBn = Hh.QM().dh(this.aWH);
    if (localbBn != null) {
      this.aSg = localbBn.oc();
    }
    this.dGu = paramcub;
    my();
  }

  public boolean a(cuU paramcuU) {
    Xi localXi = this.dGu.b(paramcuU);
    return (localXi != null) && (localXi.a(Ka.fv(this.aWH)));
  }

  public int xj() {
    return this.aWH;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("guildPerms"))
      return Boolean.valueOf(a(cuU.ifD));
    if (paramString.equals("anonymousPerms"))
      return Boolean.valueOf(a(cuU.ifC));
    if (paramString.equals("individualPerms"))
      return this.dGv;
    if (paramString.equals("iconUrl")) {
      return ay.bd().a("itemsIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(this.aSg) });
    }
    return null;
  }

  public String getName() {
    return bU.fH().getString(String.format("%s.%s", new Object[] { "roomType", Integer.valueOf(this.aWH) }));
  }

  public void my() {
    this.dGv.clear();
    Ej localEj = this.dGu.csz();
    int i = 0; for (int j = localEj.size(); i < j; i++) {
      this.dGv.add(new cvm(this, (dym)localEj.get(i), null));
    }

    dLE.doY().a(this, new String[] { "individualPerms" });
  }

  public void aGu() {
    for (int i = this.dGv.size() - 1; i >= 0; i--)
      ((cvm)this.dGv.get(i)).cte();
  }
}