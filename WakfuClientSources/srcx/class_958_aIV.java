import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class aIV extends asM
{
  public static final String bsP = "level";
  public static final String ehV = "levelText";
  public static final String ehW = "levelTextColor";
  public static final String ehX = "currentXpPercentage";
  public static final String ehY = "nextXpPercentage";
  public static final String ehZ = "nextXpPercentageInit";
  public static final String eia = "xpRatio";
  public static final String dyD = "recipes";
  public static final String cdn = "harvests";
  public static final String eib = "currentRecipesPage";
  public static final String eic = "currentHarvestsPage";
  public static final String eid = "hasHarvest";
  public static final String eie = "hasSeedsToPlant";
  public static final String eif = "hasCuttingsToTake";
  public static final String eig = "hasResourcesToHarvest";
  public static final String eih = "hasRecipe";
  public static final String eii = "numResourcesHarvestedTitle";
  public static final String eij = "numSeedsPlantedTitle";
  public static final String eik = "numSeedsHarvestedTitle";
  public static final String eil = "currentPageText";
  public static final String eim = "currentPage";
  public static final String ein = "maxNumPages";
  public static final String eio = "numPerPage";
  public static final String eip = "isOkFiltered";
  public static final String eiq = "isAbcSorted";
  public static final String eir = "isLevelSorted";
  public static final String eis = "isAbcSortActivated";
  public static final String eit = "isLevelSortActivated";
  public static final String eiu = "passportIconUrl";
  public static final String eiv = "isCraft";
  public static final String eiw = "numSeedsPlanted";
  public static final String eix = "numCuttingsTaken";
  public static final String eiy = "numResourcesHarvested";
  public static final String eiz = "numRecipesDone";
  public static final String eiA = "freeMode";
  public static final String[] bF = { "level", "levelText", "currentXpPercentage", "nextXpPercentage", "recipes", "passportIconUrl", "isOkFiltered", "isAbcSorted", "isLevelSorted", "isAbcSortActivated", "isLevelSortActivated" };
  private bNK eiB;
  private ArrayList dyE;
  private ArrayList cdq;
  private boolean eiC = false;
  private dGY eiD = dGY.lRR;
  private dGY eiE = dGY.lRP;
  private String eiF = "";

  private long eiG = -1L;
  private int eiH = 0;

  private boolean eiI = false;
  private int aPg;
  private ajP eiJ;
  private lB eiK;
  public static final int eiL = 8;
  private static final int eiM = 30;

  public aIV(int paramInt, bNK parambNK)
  {
    super(paramInt);

    this.eiB = parambNK;

    aUV();
    aUU();
  }

  public aIV(int paramInt) {
    this(paramInt, null);
  }

  public void a(lB paramlB) {
    this.eiK = paramlB;
  }

  public boolean aES() {
    return !this.dyE.isEmpty();
  }

  public boolean aET() {
    return !this.cdq.isEmpty();
  }

  public void dv(boolean paramBoolean) {
    this.eiI = paramBoolean;
    dLE.doY().a(this, new String[] { "freeMode" });
  }

  public int aER() {
    return this.buP;
  }

  public short nU() {
    return byv.bFN().bFO().aTn().getLevel(this.buP);
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    azP localazP = byv.bFN().bFO().aTn();
    if (paramString.equals("level"))
      return Short.valueOf(nU());
    if (paramString.equals("levelText"))
      return bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(nU()) });
    if (paramString.equals("levelTextColor")) {
      String str1 = new lZ().tI().am(getColor().bUV()).o(nU()).tJ().tP();
      return bU.fH().getString("levelShort.custom", new Object[] { str1 });
    }if (paramString.equals("xpRatio")) {
      long l1 = localazP.ll(this.buP);
      long l2 = Et.D(localazP.getLevel(this.buP));
      long l3 = Et.D((short)(localazP.getLevel(this.buP) + 1));
      String str2 = bU.fH().iK(l1 - l2);
      String str3 = bU.fH().iK(l3 - l2);
      return new lZ().a(str2).a("/").a(str3).tP();
    }if (paramString.equals("currentXpPercentage"))
      return Double.valueOf(Math.min(1.0D, localazP.lj(this.buP)));
    if ((paramString.equals("nextXpPercentage")) || (paramString.equals("nextXpPercentageInit"))) {
      if (this.eiG == -1L) {
        return Double.valueOf(localazP.lj(this.buP));
      }
      if (Et.bq(this.eiG) > nU()) {
        return Float.valueOf(1.0F);
      }
      return Double.valueOf(localazP.e(this.buP, this.eiG));
    }if (paramString.equals("passportIconUrl")) {
      try {
        if (!bAy.jy(String.format(ay.bd().getString("craftPassportIconsPath"), new Object[] { Integer.valueOf(this.buP) })))
          return null;
      }
      catch (bdh localbdh) {
        return null;
      }
      return ay.bd().a("craftPassportIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(this.buP) });
    }if (paramString.equals("hasRecipe"))
      return Boolean.valueOf(!aUV().isEmpty());
    if (paramString.equals("hasHarvest"))
      return Boolean.valueOf(!aUU().isEmpty());
    ArrayList localArrayList1;
    dra localdra;
    if (paramString.equals("hasSeedsToPlant")) {
      localArrayList1 = aUU();
      if (localArrayList1.isEmpty()) {
        return Boolean.valueOf(false);
      }
      localdra = (dra)localArrayList1.get(0);
      switch (cvi.cKb[localdra.cYc().ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
        return Boolean.valueOf(true);
      }
      return Boolean.valueOf(false);
    }
    if (paramString.equals("hasResourcesToHarvest")) {
      localArrayList1 = aUU();
      if (localArrayList1.isEmpty()) {
        return Boolean.valueOf(false);
      }
      localdra = (dra)localArrayList1.get(0);
      if (localdra.cYc() == bcz.fmE) {
        return Boolean.valueOf(false);
      }
      return Boolean.valueOf(true);
    }if (paramString.equals("hasCuttingsToTake")) {
      localArrayList1 = aUU();
      if (localArrayList1.isEmpty()) {
        return Boolean.valueOf(false);
      }
      localdra = (dra)localArrayList1.get(0);
      switch (cvi.cKb[localdra.cYc().ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        return Boolean.valueOf(true);
      }
      return Boolean.valueOf(false);
    }
    if (paramString.equals("numSeedsHarvestedTitle"))
      return aUS();
    if (paramString.equals("numSeedsPlantedTitle"))
      return aUQ();
    if (paramString.equals("numResourcesHarvestedTitle"))
      return aUR();
    if (paramString.equals("harvests"))
      return aUU();
    if (paramString.equals("recipes"))
      return aUV();
    if (paramString.equals("isOkFiltered"))
      return Boolean.valueOf(this.eiC);
    if (paramString.equals("isAbcSorted"))
      return Boolean.valueOf(this.eiD == dGY.lRP);
    if (paramString.equals("isLevelSorted"))
      return Boolean.valueOf(this.eiE == dGY.lRP);
    if (paramString.equals("isAbcSortActivated"))
      return Boolean.valueOf(this.eiD != dGY.lRR);
    if (paramString.equals("isLevelSortActivated"))
      return Boolean.valueOf(this.eiE != dGY.lRR);
    if (paramString.equals("isCraft"))
      return Boolean.valueOf(aUT());
    int i;
    if (paramString.equals("numSeedsPlanted")) {
      i = localazP.lm(this.buP);
      return new lZ().a(": ").bw(i).tP();
    }if (paramString.equals("numCuttingsTaken")) {
      i = localazP.ln(this.buP);
      return new lZ().a(": ").bw(i).tP();
    }if (paramString.equals("numResourcesHarvested")) {
      i = localazP.lo(this.buP);
      return new lZ().a(": ").bw(i).tP();
    }if (paramString.equals("numRecipesDone")) {
      i = localazP.lp(this.buP);
      return new lZ().a(": ").bw(i).tP();
    }if (paramString.equals("freeMode"))
      return Boolean.valueOf(this.eiI);
    if (paramString.equals("currentPage")) {
      if (this.eiK != null)
        return Integer.valueOf(this.eiK.sT());
      return Integer.valueOf(0);
    }if (paramString.equals("currentPageText")) {
      if ((this.eiJ != ajP.dju) && (this.eiK != null)) {
        return this.eiK.sU();
      }
      return this.aPg + 1 + "/" + aVg();
    }
    if (paramString.equals("numPerPage")) {
      if (this.eiK != null)
        return Integer.valueOf(this.eiK.sW()); 
    } else { if (paramString.equals("maxNumPages"))
        return Integer.valueOf(aVg() - 1);
      if (paramString.equals("currentRecipesPage")) {
        if (this.eiK != null)
          return this.eiK.sX();
        return null;
      }if (paramString.equals("currentHarvestsPage")) {
        i = this.aPg * 8;
        int j = Math.min(this.cdq.size(), i + 8);
        ArrayList localArrayList2 = new ArrayList();
        for (int k = i; k < j; k++) {
          localArrayList2.add(this.cdq.get(k));
        }
        return localArrayList2;
      }
    }
    return super.getFieldValue(paramString);
  }

  private String aUQ() {
    ArrayList localArrayList = aUU();
    if (localArrayList.isEmpty()) {
      return null;
    }
    dra localdra = (dra)localArrayList.get(0);
    return bU.fH().b(100, localdra.cYc().bqH(), new Object[0]);
  }

  private String aUR() {
    ArrayList localArrayList = aUU();
    if (localArrayList.isEmpty()) {
      return null;
    }
    dra localdra = (dra)localArrayList.get(0);
    return bU.fH().b(109, localdra.cYc().bqH(), new Object[0]);
  }

  private String aUS() {
    ArrayList localArrayList = aUU();
    if (localArrayList.isEmpty()) {
      return null;
    }
    dra localdra = (dra)localArrayList.get(0);
    return bU.fH().b(108, localdra.cYc().bqH(), new Object[0]);
  }

  private boolean aUT() {
    azP localazP = byv.bFN().bFO().aTn();
    if (localazP.lm(this.buP) > 0) {
      return false;
    }
    if (localazP.ln(this.buP) > 0) {
      return false;
    }

    if (localazP.lo(this.buP) > 0) {
      return false;
    }

    return true;
  }

  private static bNa getColor() {
    return clP.hPn;
  }

  public ArrayList aUU()
  {
    if (this.cdq != null) {
      return this.cdq;
    }

    this.cdq = dyJ.lFm.dk(this.buP, nU() + 30);

    return this.cdq;
  }

  public ArrayList aUV() {
    if (this.dyE != null) {
      return this.dyE;
    }
    byz localbyz = byv.bFN().bFO();
    this.dyE = new ArrayList();
    for (dmn localdmn = DA.bIr.eD(this.buP).cPi(); localdmn.hasNext(); ) {
      localdmn.fl();
      cGx localcGx = (cGx)localdmn.value();
      String str = bU.fH().b(46, localcGx.getId(), new Object[0]);
      if ((nU() + 30 >= localcGx.cig()) && (
        (!localcGx.c(yK.bso)) || (localbyz.aTn().bx(this.buP, localcGx.getId()))))
      {
        boolean bool = localbyz.a(localcGx);
        if (((!this.eiC) || (bool)) && 
          ((this.eiF.length() == 0) || (str.toUpperCase().contains(this.eiF.toUpperCase()))) && (
          (this.eiB == null) || (this.eiB.x(localcGx.getId(), localcGx.getType()))))
        {
          cfm localcfm = new cfm(localcGx, this);
          localcfm.gT(bool);
          this.dyE.add(localcfm);
        }
      }
    }
    aUW();
    return this.dyE;
  }

  private void aUW() {
    if ((this.eiD.equals(dGY.lRR)) && (this.eiE.equals(dGY.lRR))) {
      return;
    }

    Collections.sort(this.dyE, new cvj(this));
  }

  public bNK aUX()
  {
    return this.eiB;
  }

  public void gF(String paramString) {
    this.eiF = paramString;
    aVf();
  }

  public String aUY() {
    return this.eiF;
  }

  public void dY(long paramLong) {
    this.eiG = paramLong;
    dLE.doY().a(this, new String[] { "nextXpPercentage" });
  }

  public void aUZ() {
    this.eiC = (!this.eiC);
    aVf();
    dLE.doY().a(this, new String[] { "isOkFiltered" });
  }

  public void aVa() {
    this.eiD = this.eiD.dhQ();
    this.eiE = dGY.lRR;
    aUW();
    dLE.doY().a(this, new String[] { "isLevelSorted", "isLevelSortActivated", "isAbcSortActivated", "isAbcSorted", "recipes" });
  }

  public void aVb() {
    this.eiE = this.eiE.dhQ();
    this.eiD = dGY.lRR;
    aUW();
    dLE.doY().a(this, new String[] { "isLevelSorted", "isLevelSortActivated", "isAbcSortActivated", "isAbcSorted", "recipes" });
  }

  public void aVc() {
    if (this.dyE == null) {
      return;
    }

    byz localbyz = byv.bFN().bFO();

    int i = 0;
    for (int j = this.dyE.size() - 1; j >= 0; j--) {
      cfm localcfm = (cfm)this.dyE.get(j);
      boolean bool = localbyz.a(localcfm.cii());
      if ((this.eiC) && (!bool)) {
        this.dyE.remove(j);
        i = 1;
      }
      localcfm.gT(bool);
    }

    if (i != 0)
      dLE.doY().a(this, new String[] { "recipes" });
  }

  public void aVd()
  {
    aVf();
  }

  public void aVe() {
    aVf();
    dLE.doY().a(this, new String[] { "level", "levelTextColor", "levelText", "nextXpPercentageInit", "currentXpPercentage" });
  }

  public void aVf()
  {
    this.dyE = null;
    this.cdq = null;
    aUV();
    aUU();
    String str = this.eiJ == ajP.dju ? "currentHarvestsPage" : "currentRecipesPage";
    dLE.doY().a(this, new String[] { "recipes", "harvests", "maxNumPages", "currentPage", "currentPageText", "numPerPage", str });
  }

  public boolean isUnknown()
  {
    return false;
  }

  public void a(ajP paramajP) {
    this.eiJ = paramajP;
    this.aPg = 0;
    if (this.eiK != null) {
      this.eiK.bn(this.aPg);
    }
    dLE.doY().a(this, new String[] { "maxNumPages", "currentPage", "currentPageText", "numPerPage", "currentHarvestsPage", "currentRecipesPage" });
  }

  public int aVg()
  {
    if (this.eiJ == ajP.dju)
      return (int)Math.ceil(this.cdq.size() / 8.0F);
    if (this.eiK != null)
      return this.eiK.sV();
    return 0;
  }

  public void bn(int paramInt) {
    int i = aVg();
    if (paramInt < 0) {
      paramInt = 0;
    }
    if (paramInt >= i) {
      paramInt = i - 1;
    }

    this.aPg = paramInt;
    if (this.eiK != null) {
      this.eiK.bn(paramInt);
    }
    dLE.doY().a(this, new String[] { "currentPage", "currentPageText", "numPerPage", "currentHarvestsPage", "currentRecipesPage" });
  }

  public int sT()
  {
    return this.eiK == null ? 0 : this.eiK.sT();
  }
}