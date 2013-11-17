public class cnP extends cGj
  implements Comparable
{
  public static final String dwJ = "spell";
  public static final String hUP = "spellXpValue";
  public static final String hUQ = "spellXpGain";
  public static final String dqy = "spellLevelGain";
  public static final String[] bF = { "spell", "spellXpValue", "spellXpGain", "spellLevelGain" };
  private final uP bWM;
  private bDn hUR;
  private dBv hUS;

  public cnP(Kp paramKp, byz parambyz)
  {
    this.bWM = paramKp.UW();
    a(paramKp.UV(), parambyz);
  }

  private void a(dSv paramdSv, byz parambyz)
  {
    long l = this.bWM != null ? this.bWM.DP() : -1L;
    Object localObject;
    if (paramdSv.dsU()) {
      localObject = (bPL)parambyz.bGn().hh(paramdSv.tc());
      this.hUR = new bDn(((bPL)localObject).ble(), ((bPL)localObject).cvu(), ((bPL)localObject).ayX(), Long.valueOf(l), this.bWM.DO());

      this.hUS = ((dBv)localObject);
    } else {
      localObject = (apX)parambyz.auK().hh(paramdSv.tc());
      this.hUR = new bDn(((apX)localObject).ble(), ((apX)localObject).bsN(), ((apX)localObject).nU(), ((apX)localObject).ayX(), Long.valueOf(l), this.bWM.DO());

      this.hUS = ((dBv)localObject);
    }
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if ("spell".equals(paramString)) {
      return this.hUS;
    }
    if ("spellXpValue".equals(paramString)) {
      return this.hUR;
    }
    if ("spellXpGain".equals(paramString)) {
      return bDy();
    }
    if ("spellLevelGain".equals(paramString)) {
      return bBG();
    }
    return this.hUS.getFieldValue(paramString);
  }

  private Object bBG() {
    short s = this.bWM.DO();
    return s > 0 ? bU.fH().getString("levelGain", new Object[] { Short.valueOf(s) }) : null;
  }

  private Object bDy() {
    if (!this.bWM.DS()) {
      return null;
    }
    long l = this.bWM.DP();
    if (l >= 0L) {
      return '+' + bU.fH().getString("xpGain", new Object[] { Long.valueOf(l) });
    }
    return bU.fH().getString("xpGain", new Object[] { Long.valueOf(l) });
  }

  long DP()
  {
    return this.bWM.DP();
  }

  public uP UW() {
    return this.bWM;
  }

  public int a(cnP paramcnP) {
    if (paramcnP == null) {
      return -1;
    }

    int i = Integer.signum(paramcnP.bWM.DO() - this.bWM.DO());

    if (i != 0) {
      return i;
    }

    return Long.signum(paramcnP.bWM.DP() - this.bWM.DP());
  }
}