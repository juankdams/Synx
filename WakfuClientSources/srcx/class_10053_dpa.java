import org.apache.log4j.Logger;

public class dpa
  implements bxz
{
  private static final Logger K = Logger.getLogger(dpa.class);
  public static final String lpu = "extraTurnScorePercentage";
  public static final String lpv = "extraTurnScorePercentageNext";
  public static final String lpw = "extraTurnScoreDescription";
  public static final String lpx = "team";
  public static final String lpy = "timelineIllustrationUrl";
  public static final String lpz = "timelineSmallIllustrationUrl";
  public static final String lpA = "isMonster";
  public static final String lpB = "selectedBonus";
  public static final String erQ = "actorStandardScale";
  private Su aWG;
  private zu aNi;
  private boolean lpC = false;
  private float lpD = 0.0F;
  private bSo lpE = null;
  private long lpF = -1L;

  public dpa(Su paramSu, zu paramzu) {
    this.aWG = paramSu;
    this.aNi = paramzu;

    if (this.aWG.uO() == 1550) {
      Su localSu = this.aWG.adL();
      this.lpF = localSu.getId();
    } else if ((!(this.aWG.aJp() instanceof bdi)) || (!xc.dx(this.aWG.oc())) || (F.a(this.aWG)))
    {
      this.lpF = this.aWG.getId();
    }

    if (this.lpF != -1L)
      aZr.boo().a(this.lpF, this);
  }

  public void cleanUp()
  {
    if (this.lpF != -1L)
      aZr.boo().b(this.lpF, this);
  }

  public Su xg() {
    return this.aWG;
  }

  public zu aDp() {
    return this.aNi;
  }

  public void a(zu paramzu) {
    this.aNi = paramzu;
  }

  private float cWm() {
    int i = this.aNi.lQ();
    float f = this.aNi.aZ(this.aWG.getId()) % i;
    return f / i;
  }

  private float cWn() {
    int i = this.aNi.lQ();
    float f = this.aNi.aZ(this.aWG.getId()) % i;
    f = Math.min(i, f + 100.0F + this.aWG.e(eu.azq));
    return f / i;
  }

  public String[] getFields() {
    return null;
  }

  public void a(uz paramuz, String paramString) {
    if (paramuz != null)
      dLE.doY().a(this.aWG, new String[] { "timelineSmallIllustrationUrl" });
    else
      K.warn(paramString);
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("timelineElementType"))
      return Integer.valueOf(1);
    int j;
    if (paramString.equals("extraTurnScoreDescription")) {
      int i = this.aNi.lQ();
      j = this.aNi.aZ(this.aWG.getId()) % i;
      return bU.fH().getString("fight.extraTurn.score", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
    }if (paramString.equals("extraTurnScorePercentage"))
      return Float.valueOf(cWm());
    if (paramString.equals("extraTurnScorePercentageNext"))
      return Float.valueOf(cWn());
    if (paramString.equals("actorStandardScale")) {
      cew localcew = xg().aeL();
      j = localcew.BC();
      float f = localcew.aty().getScale();
      return Float.valueOf(6.0F / Math.max(j, 6.0F) * 1.4F * f);
    }if (paramString.equals("team"))
      return Byte.valueOf((byte)(cWp() ? 0 : 1));
    if (paramString.equals("timelineIllustrationUrl"))
      return cWo();
    if (paramString.equals("timelineSmallIllustrationUrl")) {
      if (this.lpF != -1L) {
        return aZr.boo().eZ(this.lpF);
      }
      return cWo();
    }if (paramString.equals("isMonster")) {
      return Boolean.valueOf((this.aWG.uO() != 1550) && ((this.aWG.aJp() instanceof bdi)) && (xc.dx(this.aWG.oc())) && (!F.a(this.aWG)));
    }

    if (paramString.equals("selectedBonus")) {
      return this.lpE;
    }
    return null;
  }

  public String cWo() {
    if (this.aWG.uO() == 1550) {
      Su localSu = this.aWG.adL();
      try {
        return String.format(ay.bd().getString("breedContactListIllustrationPath"), new Object[] { Short.valueOf(localSu.uO()), Byte.valueOf(localSu.xK()) });
      } catch (bdh localbdh2) {
        K.error("Exception", localbdh2);
      }
    } else if ((this.aWG instanceof bKm)) {
      try {
        return String.format(ay.bd().getString("breedContactListIllustrationPath"), new Object[] { Short.valueOf(this.aWG.uO()), Byte.valueOf(this.aWG.xK()) });
      } catch (bdh localbdh1) {
        K.error("Exception", localbdh1);
      }
    } else if ((this.aWG.aJp() instanceof bdi)) {
      bdi localbdi = (bdi)this.aWG.aJp();
      int i = localbdi.anr() != -1 ? localbdi.anr() : this.aWG.oc();
      if (xc.dx(i))
        return ay.bd().t(i);
      try
      {
        return String.format(ay.bd().getString("breedContactListIllustrationPath"), new Object[] { Integer.valueOf(xc.dw(i)), Integer.valueOf(xc.dv(i)) });
      } catch (bdh localbdh3) {
        K.error("Exception", localbdh3);
      }
    }

    return null;
  }

  private boolean cWp()
  {
    byz localbyz = byv.bFN().bFO();
    boolean bool;
    if (this.aWG.aeR() == localbyz.aeR())
      bool = this.aWG.Fx() == 0;
    else {
      bool = this.aWG.Fx() == -1;
    }
    return bool;
  }

  public void cWq() {
    cWt();
  }

  public void cWr() {
    cWs();
  }

  public void cWs() {
    int i = this.aNi.lQ();
    float f = this.aNi.aZ(this.aWG.getId()) % i;

    if (f < this.lpD)
      b(new bSo(true));
    else if ((f > this.lpD) && (this.lpE != null)) {
      b(null);
    }

    this.lpD = f;
    dLE.doY().a(this.aWG, new String[] { "extraTurnScoreDescription", "extraTurnScorePercentage" });
  }

  public void b(bSo parambSo)
  {
    this.lpE = parambSo;
    dLE.doY().a(this.aWG, new String[] { "selectedBonus" });
  }

  public void cWt() {
    if ((this.aWG.aeQ() != null) && (!this.aWG.aeQ().aEt().dtx()))
      return;
    int i = this.aNi.lQ();
    float f = this.aNi.aZ(this.aWG.getId()) % i;

    if ((this.aWG.aeI()) && (f + 100.0F + this.aWG.e(eu.azq) >= i)) {
      aKj.bbx().dw(true);
    }

    aKj.bbx().mN((int)bCO.t(cWm() * 100.0F, 1.0F, 100.0F));
  }

  public void setHighlighted(boolean paramBoolean) {
    cew localcew = this.aWG.aeL();
    if (!localcew.isVisible())
      paramBoolean = false;
    if (!this.aWG.afp()) {
      paramBoolean = false;
    }
    if (this.lpC == paramBoolean)
      return;
    this.lpC = paramBoolean;

    if (this.lpC) {
      localcew.cgS();
      localcew.chf();
    } else {
      localcew.cgT();
      localcew.chi();
    }
  }

  public int cWu()
  {
    int i = this.aNi.lQ();
    return this.aNi.aZ(this.aWG.getId()) % (i == 0 ? 1 : i);
  }

  public int cWv() {
    int i = this.aNi.lQ();
    return this.aNi.aZ(this.aWG.getId()) / (i == 0 ? 1 : i);
  }

  public void cWw() {
    dLE.doY().a(this.aWG, new String[] { "team" });
  }
}