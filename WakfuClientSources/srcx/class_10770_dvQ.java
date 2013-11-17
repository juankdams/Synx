public class dvQ extends cGj
  implements nc
{
  public static final String NAME = "name";
  public static final String lBb = "learnDuration";
  public static final String Ac = "duration";
  public static final String AF = "cost";
  public static final String lBc = "requirement";
  public static final String Aw = "effects";
  public static final String lBd = "learnRemainingTime";
  public static final String dQQ = "remainingTime";
  public static final String lBe = "canBePurchased";
  public static final String lBf = "isActive";
  private final cig lBg;

  public dvQ(cig paramcig)
  {
    this.lBg = paramcig;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("name")) {
      return bU.fH().b(138, this.lBg.getId(), new Object[0]);
    }
    if (paramString.equals("learnDuration")) {
      if (!this.lBg.cjX()) {
        return null;
      }
      return bXW.l(this.lBg.cjW());
    }
    if (paramString.equals("duration")) {
      if (!this.lBg.bkM()) {
        return null;
      }
      return bXW.l(this.lBg.cjY());
    }
    Object localObject;
    if (paramString.equals("cost")) {
      localObject = new lZ();
      if (!dbe()) {
        ((lZ)localObject).tI().am(new bNa(0.6F, 0.0F, 0.0F, 1.0F).bUV());
      }
      ((lZ)localObject).bw(this.lBg.qW());
      return ((lZ)localObject).tP();
    }
    if (paramString.equals("requirement")) {
      localObject = new lZ();
      if (!dbf()) {
        ((lZ)localObject).tI().am(new bNa(0.6F, 0.0F, 0.0F, 1.0F).bUV());
      }
      ((lZ)localObject).a(bU.fH().getString("required.level.custom", new Object[] { Integer.valueOf(cdH.hxE.uQ(this.lBg.getId())) }));
      return ((lZ)localObject).tP();
    }
    if (paramString.equals("effects")) {
      return dbc();
    }
    if (paramString.equals("canBePurchased")) {
      return Boolean.valueOf(dbd());
    }
    if (paramString.equals("learnRemainingTime")) {
      if (!this.lBg.cjX()) {
        return null;
      }
      localObject = crP.b(dbh(), this.lBg, CG());
      return c((cYq)localObject);
    }
    if (paramString.equals("remainingTime")) {
      if (!this.lBg.bkM()) {
        return null;
      }
      localObject = crP.c(dbh(), this.lBg, CG());
      return c((cYq)localObject);
    }
    if (paramString.equals("isActive")) {
      return Boolean.valueOf(alL.e(dbh()));
    }

    return null;
  }

  public String dbc() {
    return crP.d(this.lBg);
  }

  private String c(cYq paramcYq) {
    kb localkb = dDE.dft().VN().V(paramcYq);
    return bXW.l(localkb.b(cds.hwO) ? localkb : cds.hwO);
  }

  public int getId() {
    return this.lBg.getId();
  }

  public aRH cjZ() {
    return this.lBg.cjZ();
  }

  private boolean dbd() {
    return (dbe()) && (dbf());
  }

  private boolean dbe() {
    return dbg().CI() >= this.lBg.qW();
  }

  private boolean dbf() {
    return cdH.hxE.dw(this.lBg.getId(), dbg().nU());
  }

  private ud dbg() {
    return (ud)byv.bFN().bFO().bSt();
  }

  private bqd dbh() {
    return CG().lA(this.lBg.getId());
  }

  private cyS CG() {
    return dbg().CG();
  }

  public void dbi() {
    dLE.doY().a(this, new String[] { "canBePurchased", "requirement", "cost" });
  }

  public void update()
  {
    dLE.doY().a(this, new String[] { "canBePurchased" });
  }

  public void byB()
  {
    bXT.hnW.a(this);
  }

  public void byC() {
    bXT.hnW.b(this);
  }

  public void uD() {
    dLE.doY().a(this, new String[] { "remainingTime", "learnRemainingTime", "isActive" });
  }
}