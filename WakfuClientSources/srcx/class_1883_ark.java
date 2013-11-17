import java.util.ArrayList;

public class ark extends cGj
  implements dIX
{
  public static final String dzl = "wallets";
  public static final String dzm = "totalAmount";
  public static final String dzn = "challenge";
  public static final String dzo = "weather";
  public static final String dzp = "ecosystem";
  private bxH dzq;
  private ArrayList bYx = new ArrayList();

  public ark(ayn paramayn, bxH parambxH) {
    this.dzq = parambxH;

    b(paramayn);
  }

  public void b(ayn paramayn) {
    for (bmt localbmt : bmt.values())
      switch (bVp.bMi[localbmt.ordinal()]) {
      case 1:
        break;
      case 2:
        if (paramayn.aKl().size() != 0)
          this.bYx.add(new cgB(localbmt, this.dzq)); break;
      case 3:
        if (paramayn.aKe().size() != 0)
          this.bYx.add(new cgB(localbmt, this.dzq)); break;
      case 4:
        if (dLE.doY().getBooleanProperty("wakfuEcosystemEnabled"))
          this.bYx.add(new cgB(localbmt, this.dzq));
        break;
      }
  }

  public String[] getFields() {
    return null;
  }

  private cgB a(bmt parambmt) {
    int i = 0; for (int j = this.bYx.size(); i < j; i++) {
      cgB localcgB = (cgB)this.bYx.get(i);
      if (localcgB.ciD() == parambmt) {
        return localcgB;
      }
    }
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("wallets"))
      return this.bYx;
    if (paramString.equals("challenge"))
      return a(bmt.fDU);
    if (paramString.equals("weather"))
      return a(bmt.fDV);
    if (paramString.equals("ecosystem"))
      return a(bmt.fDW);
    if (paramString.equals("totalAmount")) {
      return this.dzq.bDx() + "§";
    }
    return null;
  }

  public void c(dsl paramdsl, int paramInt) {
    As();
  }

  public void As() {
    dLE.doY().a(this, new String[] { "wallets", "totalAmount" });

    cgB localcgB1 = a(bmt.fDU);
    if (localcgB1 != null) {
      localcgB1.bot();
    }
    cgB localcgB2 = a(bmt.fDV);
    if (localcgB2 != null) {
      localcgB2.bot();
    }
    cgB localcgB3 = a(bmt.fDW);
    if (localcgB3 != null)
      localcgB3.bot();
  }
}