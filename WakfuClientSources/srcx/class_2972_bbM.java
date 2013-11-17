import org.apache.log4j.Logger;

public abstract class bbM extends cGj
{
  private static final Logger K = Logger.getLogger(bbM.class);
  public static final String bC = "name";
  public static final String dwE = "levelTextShort";
  public static final String dwH = "currentLevelPercentage";
  public static final String fkZ = "xpText";
  public static final String fla = "xpValue";
  public static final String cKD = "smallIconUrl";
  public static final String erv = "breedName";
  public static final String flb = "lastMealDateText";
  public static final String flc = "dietDescription";
  public static final String fld = "weakDescription";
  public static final String fle = "animatedElement";
  public static final String flf = "petAnimationEquipment";
  public static final String flg = "fightLimitText";
  public static final String flh = "fightLimitDescText";
  public static final String fli = "fightLimit";
  public static final String flj = "hpMax";
  public static final String ery = "hp";
  public static final String flk = "hpDescription";
  public static final String fll = "bonusDescription";
  public static final String eok = "color";
  public static final String flm = "colorName";
  public static final String fln = "equipment";
  public static final String flo = "hasPet";
  public static final String flp = "isActive";
  public static final String[] bF = { "name", "levelTextShort", "currentLevelPercentage", "xpText", "xpValue", "smallIconUrl", "breedName", "lastMealDateText", "animatedElement", "petAnimationEquipment", "dietDescription", "weakDescription", "fightLimitDescText", "fightLimit", "hpMax", "hp", "hpDescription", "bonusDescription", "color", "colorName", "equipment", "hasPet", "isActive" };
  protected bGy flq;
  protected cUb aFh;
  protected dBv flr;

  protected void bqk()
  {
    this.flq = new bGy();

    dlp localdlp = this.aFh.cJh();
    this.flq.jz(localdlp.asS());
    this.flq.c(CG.bFH);
    this.flq.eq("AnimStatique");
    this.flq.a(dFc.dgE());
    this.flq.id(dLw.mbl.asR());
    this.flq.fR((byte)8);
    this.flq.setVisible(true);
    this.flq.asZ();
    dSe localdSe = this.aFh.cJj();
    if (localdSe == null) {
      localdSe = localdlp.Az(localdlp.cTh());
    }
    this.flq.a(localdSe);
    bBn localbBn = Hh.QM().dh(this.aFh.cJk());
    if (localbBn != null) {
      this.flq.rT(localbBn.oc());
    }
    this.flq.asZ();
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name")) {
      return getName();
    }
    if (paramString.equals("levelTextShort")) {
      return bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(this.aFh.nU()) });
    }
    if (paramString.equals("currentLevelPercentage"))
      return Integer.valueOf(this.aFh.IT() / 100);
    Object localObject1;
    if (paramString.equals("xpText")) {
      localObject1 = this.aFh.cJh();
      lZ locallZ = new lZ();
      locallZ.tz();
      locallZ.a(bU.fH().getString("xpRatio", new Object[] { Integer.valueOf(this.aFh.IT()), Integer.valueOf(((dlp)localObject1).ei((short)(this.aFh.nU() + 1))) }));
      locallZ.tA().tH();
      locallZ.a(bU.fH().getString("pet.xpDesc"));
      return locallZ.tP();
    }
    int n;
    if (paramString.equals("xpValue")) {
      localObject1 = this.aFh;
      int i = ((cUb)localObject1).nU();
      int k = ((cUb)localObject1).cJh().aGh();
      n = i * k;
      float f = ((cUb)localObject1).IT() - n;
      return Float.valueOf(f / k);
    }
    if (paramString.equals("lastMealDateText")) {
      return bqn();
    }
    if (paramString.equals("animatedElement")) {
      return this.flq;
    }
    if (paramString.equals("petAnimationEquipment"))
      return this.flq.aty();
    cUb localcUb;
    if (paramString.equals("fightLimitDescText")) {
      localObject1 = new lZ();
      localcUb = this.aFh;
      ((lZ)localObject1).a(bU.fH().getString("pet.fightLimitDesc", new Object[] { Byte.valueOf(localcUb.cJh().aGf()) }));
      return ((lZ)localObject1).tP();
    }
    if (paramString.equals("fightLimitText")) {
      localObject1 = new lZ();
      localcUb = this.aFh;
      ((lZ)localObject1).a(bU.fH().getString("pet.fightLimit", new Object[] { Integer.valueOf(bqm()), Byte.valueOf(localcUb.cJh().aGf()) }));
      return ((lZ)localObject1).tP();
    }
    int i1;
    if (paramString.equals("fightLimit")) {
      boolean bool = bql();
      int j = this.aFh.cJh().aGf();
      Boolean[] arrayOfBoolean = new Boolean[j];
      n = this.aFh.cJn();
      for (i1 = 0; i1 < arrayOfBoolean.length; i1++) {
        arrayOfBoolean[i1] = Boolean.valueOf((i1 < n) && (!bool) ? 1 : false);
      }
      return arrayOfBoolean;
    }
    Object localObject2;
    Object localObject3;
    if (paramString.equals("weakDescription")) {
      localObject2 = "";
      localObject3 = this.aFh.cJh().cTg();
      int m = 0; for (n = localObject3.length; m < n; m++) {
        if (m > 0) {
          localObject2 = (String)localObject2 + ", ";
        }
        localObject2 = (String)localObject2 + Hh.QM().dh(localObject3[m]).getName();
      }
      return bU.fH().getString("pet.weakDesc", new Object[] { localObject2 });
    }
    if (paramString.equals("dietDescription")) {
      localObject2 = new lZ();
      this.aFh.cJh().c(new aT(this, (lZ)localObject2));

      localObject3 = this.aFh.cJh().MD();
      cds localcds1 = this.aFh.cJh().MC();
      n = localcds1.getDays() * 24 + localcds1.getHours();
      i1 = ((cds)localObject3).getDays() * 24 + ((cds)localObject3).getHours();
      return bU.fH().getString("pet.dietDesc", new Object[] { ((lZ)localObject2).tP(), Integer.valueOf(n), Integer.valueOf(i1), bqn() });
    }
    if (paramString.equals("hpMax")) {
      localObject2 = this.aFh;
      return Integer.valueOf(((cUb)localObject2).cJh().aGa());
    }
    if (paramString.equals("hp")) {
      return Integer.valueOf(bqo());
    }
    if (paramString.equals("color")) {
      localObject2 = (bVw)Hh.QM().dh(this.aFh.cJi());
      return ((bVw)localObject2).getFieldValue("iconUrl");
    }
    if (paramString.equals("colorName")) {
      localObject2 = (bVw)Hh.QM().dh(this.aFh.cJi());
      return ((bVw)localObject2).getName();
    }
    if (paramString.equals("equipment")) {
      return Hh.QM().eO(this.aFh.cJk());
    }
    if (paramString.equals("hasPet")) {
      return Boolean.valueOf(true);
    }
    if (paramString.equals("isActive")) {
      return Boolean.valueOf(!this.aFh.cJs());
    }
    if (paramString.equals("hpDescription")) {
      localObject2 = new lZ();
      localObject3 = this.aFh;
      try {
        ((lZ)localObject2).a(dfn.eT((byte)4), 16, 16, null).a(" ");
      } catch (bdh localbdh) {
        K.warn(localbdh.getMessage());
        ((lZ)localObject2).a(bU.fH().getString("HPShort")).a(" : ");
      }
      ((lZ)localObject2).bw(bqo()).a("/").bw(((cUb)localObject3).cJh().aGa());

      ((lZ)localObject2).tH();
      cds localcds2 = this.aFh.cJh().MD();
      cds localcds3 = this.aFh.cJh().MC();
      i1 = localcds3.getDays() * 24 + localcds3.getHours();
      int i2 = localcds2.getDays() * 24 + localcds2.getHours();
      ((lZ)localObject2).a(bU.fH().getString("pet.hpDesc", new Object[] { Integer.valueOf(i1), Integer.valueOf(i2) }));
      return ((lZ)localObject2).tP();
    }
    return this.flr.getFieldValue(paramString);
  }

  public boolean bql() {
    dxL localdxL1 = this.aFh.cJo();
    dxL localdxL2 = dDE.dft().VN();
    return localdxL1.V(localdxL2).b(this.aFh.cJh().cTi());
  }

  public int bqm() {
    return bql() ? 0 : this.aFh.cJn();
  }

  private String bqn() {
    dxL localdxL1 = this.aFh.cJl();
    if (localdxL1.avJ()) {
      return null;
    }
    dxL localdxL2 = dDE.dft().VN();
    kb localkb = localdxL1.V(localdxL2);
    return localkb.rN() ? bXW.l(localkb) : "";
  }

  private int bqo() {
    cUb localcUb = this.aFh;
    return localcUb.aGa();
  }

  public abstract boolean bhR();

  public String getName() {
    String str = this.aFh.getName();
    return (str == null) || (str.length() == 0) ? (String)this.flr.getFieldValue("name") : str;
  }

  public cUb nJ() {
    return this.aFh;
  }

  public abstract int getId();

  public abstract long bhS();
}