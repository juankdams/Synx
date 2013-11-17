import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class dUc extends cGj
  implements bxz, Comparable
{
  public static final String bC = "name";
  public static final String ciu = "iconUrl";
  private static final String bsP = "level";
  private static final String kyS = "isFollowed";
  private static final String mrp = "isLeader";
  private static final String mrq = "stateStyle";
  private static final String flk = "hpDescription";
  private static final String mrr = "hpPercentage";
  private static final String mrs = "positionIconUrl";
  private aay mrt;
  private caY icx = new fA(this);

  private dUc(bGr parambGr, aay paramaay)
  {
    this.mrt = paramaay;
  }

  public String[] getFields() {
    return bGr.bF;
  }

  private String dui() {
    cYk localcYk1 = bGr.a(this.mru).dum().ML();
    cYk localcYk2 = this.mrt.ML();

    int i = localcYk2.getX() - localcYk1.getX();
    int j = localcYk2.getY() - localcYk1.getY();

    if ((i == 0) && (j == 0)) {
      return null;
    }

    float f1 = WakfuClientInstance.awy().Dg().r(i, j);
    float f2 = WakfuClientInstance.awy().Dg().s(i, j);

    float f3 = cEl.af(f1, f2);
    int k = Math.round(f1 / f3 * bCO.gxu);
    int m = Math.round(f2 / f3 * bCO.gxu);

    switch (djC.RE[CG.T(k, m).ordinal()]) {
    case 1:
      return ay.bd().a("compassIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(1) });
    case 2:
      return ay.bd().a("compassIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(0) });
    case 3:
      return ay.bd().a("compassIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(7) });
    case 4:
      return ay.bd().a("compassIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(6) });
    case 5:
      return ay.bd().a("compassIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(5) });
    case 6:
      return ay.bd().a("compassIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(4) });
    case 7:
      return ay.bd().a("compassIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(3) });
    case 8:
      return ay.bd().a("compassIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(2) });
    }

    return null;
  }

  public void duj() {
    aZr.boo().fa(getId());
    dLE.doY().a(this, new String[] { "iconUrl" });
  }

  public void a(uz paramuz, String paramString) {
    if (paramuz != null)
      dLE.doY().a(this, new String[] { "iconUrl" });
    else
      bGr.K.warn(paramString);
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("name"))
      return this.mrt.getName();
    if (paramString.equals("iconUrl"))
      return aZr.boo().eZ(this.mrt.eq());
    if (paramString.equals("level"))
      return bU.fH().getString("partyList.MemberFormatedName", new Object[] { Short.valueOf(this.mrt.nU()) });
    if (paramString.equals("isFollowed"))
      return Boolean.valueOf(anv());
    if (paramString.equals("positionIconUrl"))
      return dui();
    if (paramString.equals("hpDescription")) {
      lZ locallZ = new lZ();
      locallZ.a(bU.fH().getString("HPShort")).a(" : ");
      locallZ.bw(((bgo)this.mrt.dhK()).cqE()).a("/").bw(((bgo)this.mrt.dhK()).cPY());

      return locallZ.tP();
    }if (paramString.equals("hpPercentage"))
      return Float.valueOf(((bgo)this.mrt.dhK()).cqE() / ((bgo)this.mrt.dhK()).cPY());
    if (paramString.equals("stateStyle"))
      return dul();
    if (paramString.equals("isLeader")) {
      return Boolean.valueOf(duk());
    }
    return null;
  }

  public boolean duk() {
    return bGr.b(this.mru) == this;
  }

  private String dul() {
    if (((bgo)this.mrt.dhK()).isDead())
      return "partyStateDead";
    if (((bgo)this.mrt.dhK()).cRB()) {
      return "partyStateInFight";
    }
    return "";
  }

  public void fireStateChanged()
  {
    dLE.doY().a(this, new String[] { "stateStyle" });
  }

  public long getId() {
    return this.mrt.eq();
  }

  public short Lk() {
    return this.mrt.Lk();
  }

  public String toString() {
    return this.mrt.getName();
  }

  public aay dum() {
    return this.mrt;
  }

  public boolean anv() {
    return this.mrt.anv();
  }

  public int compareTo(Object paramObject)
  {
    if ((paramObject instanceof dUc)) {
      dUc localdUc = (dUc)paramObject;
      if (getId() == bGr.b(this.mru).getId()) {
        return -1;
      }
      if (localdUc.getId() == bGr.b(this.mru).getId()) {
        return 1;
      }
      return toString().compareTo(localdUc.toString());
    }
    return 0;
  }

  public void dun() {
    Su localSu = CA.Lv().bj(this.mrt.eq());
    if (localSu != null) {
      Rx localRx = localSu.d(eu.ayM);
      localRx.a(this.icx);
      this.icx.a(localRx);
    }

    aZr.boo().a(this.mrt.eq(), this);
    aZr.boo().fa(this.mrt.eq());
  }

  public void duo() {
    Su localSu = CA.Lv().bj(this.mrt.eq());
    if (localSu != null) {
      localSu.d(eu.ayM).b(this.icx);
    }

    aZr.boo().b(this.mrt.eq(), this);
  }
}