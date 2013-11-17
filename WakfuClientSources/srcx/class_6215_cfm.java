import java.util.ArrayList;

public class cfm extends cGj
{
  public static final String bC = "name";
  public static final String bsP = "level";
  public static final String hpU = "quantityText";
  public static final String hAg = "levelShort";
  public static final String hAh = "ingredients";
  public static final String hAi = "productionPercentage";
  public static final String hAj = "productionPercentageShort";
  public static final String hAk = "isSecretRecipe";
  public static final String hAl = "hasCriterion";
  public static final String hAm = "criterionDescription";
  public static final String hAn = "obsolete";
  public static final String hAo = "canAfford";
  public static final String hAp = "canUseAsIngredient";
  public static final String hAq = "machines";
  public static final String[] bF = { "name", "level", "quantityText", "ingredients", "productionPercentage", "hasCriterion", "isSecretRecipe", "obsolete", "canAfford" };
  private final cGx hAr;
  private final asM hAs;
  private static final bNa hAt = new bNa(0.8F, 0.0F, 0.0F, 1.0F);
  private static final bNa hAu = new bNa(0.8F, 0.4F, 0.0F, 1.0F);
  private static final bNa hAv = new bNa(0.8F, 0.8F, 0.0F, 1.0F);

  private boolean hAw = false;
  private boolean hAx;

  public cfm(cGx paramcGx, asM paramasM)
  {
    this.hAr = paramcGx;
    this.hAs = paramasM;

    this.hAx = cif();
  }

  private boolean cif() {
    bmj[] arrayOfbmj = this.hAr.cBx();
    int[] arrayOfInt = new int[arrayOfbmj.length];
    for (int i = 0; i < arrayOfbmj.length; i++) {
      arrayOfInt[i] = arrayOfbmj[i].gw();
    }
    return DA.bIr.i(arrayOfInt);
  }

  private static boolean a(deT paramdeT, bmj[] paramArrayOfbmj) {
    for (bmj localbmj : paramArrayOfbmj) {
      if (paramdeT.zQ(localbmj.gw()) != null) {
        return false;
      }
    }
    return true;
  }

  public void gT(boolean paramBoolean) {
    this.hAw = paramBoolean;
    dLE.doY().a(this, new String[] { "canAfford" });
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("level")) {
      String str1 = new lZ().tz().o(cig()).tA().tP();
      return bU.fH().getString("craft.recipeLevel", new Object[] { str1 });
    }if (paramString.equals("levelShort"))
      return bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(cig()) });
    if (paramString.equals("quantityText")) {
      int i = cik();
      return "x" + i;
    }if (paramString.equals("ingredients"))
      return cih();
    long l;
    lZ locallZ;
    bNa localbNa;
    if (paramString.equals("productionPercentage")) {
      l = Math.round(this.hAr.dE(this.hAs.nU()) * 100.0D);
      locallZ = new lZ();
      localbNa = bNa.gRx;
      if (l < 100L) {
        if (l > 50L)
          localbNa = hAv;
        else if (l > 25L)
          localbNa = hAu;
        else {
          localbNa = hAt;
        }
      }
      String str2 = locallZ.tz().am(localbNa.bUV()).P(l).tA().tP();
      return bU.fH().getString("craft.recipeChance", new Object[] { str2 });
    }if (paramString.equals("productionPercentageShort")) {
      l = Math.round(this.hAr.dE(this.hAs.nU()) * 100.0D);
      locallZ = new lZ();
      localbNa = bNa.gRx;
      if (l < 100L) {
        if (l > 50L)
          localbNa = hAv;
        else if (l > 25L)
          localbNa = hAu;
        else {
          localbNa = hAt;
        }
      }
      locallZ.tI().am(localbNa.bUV()).a(l + "%").tJ();
      return locallZ.tP();
    }if (paramString.equals("isSecretRecipe"))
      return Boolean.valueOf(this.hAr.c(yK.bso));
    if (paramString.equals("hasCriterion"))
      return Boolean.valueOf(this.hAr.F() != null);
    Object localObject2;
    if (paramString.equals("criterionDescription")) {
      localObject1 = this.hAr.F();
      if (localObject1 == null) {
        return null;
      }
      localObject2 = new lZ();
      boolean bool = this.hAr.aQ(byv.bFN().bFO());
      ((lZ)localObject2).tI().am((bool ? bNa.gRA : bNa.gRz).bUV());
      ((lZ)localObject2).a(daj.a((dKY)localObject1));
      ((lZ)localObject2).tJ();
      return ((lZ)localObject2).tP();
    }if (paramString.equals("canAfford"))
      return Boolean.valueOf(this.hAw);
    if (paramString.equals("canUseAsIngredient"))
      return Boolean.valueOf(this.hAx);
    if (paramString.equals("obsolete")) {
      localObject1 = DA.bIr.eD(this.hAs.aER());
      localObject2 = byv.bFN().bFO();
      short s = ((byz)localObject2).aTn().getLevel(this.hAs.aER());
      return Boolean.valueOf(Et.a(s, cig(), (deT)localObject1, (aGH)localObject2) == 0L);
    }if (paramString.equals("machines")) {
      return cil();
    }
    Object localObject1 = (chm)cij();
    return localObject1 != null ? ((chm)localObject1).cbh().getFieldValue(paramString) : null;
  }

  public short cig() {
    return this.hAr.cig();
  }

  public String getName() {
    return bU.fH().b(46, this.hAr.getId(), new Object[0]);
  }

  public ArrayList cih() {
    ArrayList localArrayList = new ArrayList();
    for (BZ localBZ = this.hAr.cBy(); localBZ.hasNext(); ) {
      localBZ.fl();
      cIF localcIF = (cIF)bSx.hdo.tU(localBZ.zY());
      int i = localcIF != null ? localcIF.cCN() : localBZ.zY();
      localArrayList.add(new agi(localBZ.Lb(), (bVw)Hh.QM().dh(i)));
    }
    return localArrayList;
  }

  public cGx cii() {
    return this.hAr;
  }

  public bBn cij() {
    bmj localbmj = this.hAr.dD(this.hAs.nU());
    if (localbmj == bmj.fDN) {
      return null;
    }
    cIF localcIF = (cIF)bSx.hdo.tU(localbmj.gw());
    return localcIF == null ? Hh.QM().dh(localbmj.gw()) : localcIF;
  }

  public short cik() {
    return this.hAr.dD(this.hAs.nU()).nP();
  }

  public String cil() {
    lZ locallZ = new lZ();
    int[] arrayOfInt = this.hAr.cBt();

    int i = 0; for (int j = arrayOfInt.length; i < j; i++) {
      if (i != 0) {
        locallZ.a(", ");
      }
      locallZ.a(bU.fH().b(59, arrayOfInt[i], new Object[0]));
    }

    return locallZ.tP();
  }
}