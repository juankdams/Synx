import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class bvw extends cGj
  implements xl
{
  private static final Logger K = Logger.getLogger(Uc.class);
  public static final String gfw = "totalProgressionText";
  public static final String gfx = "totalProgressionValue";
  public static final String gfy = "lastCompletedAchievement";
  public static final String gfz = "rootCategories";
  public static final String gfA = "selectedFilter";
  public static final String gfB = "filters";
  public static final String gfC = "selectedRootCategory";
  public static final String gfD = "isQuestView";
  public static final String gfE = "questInventory";
  public static final String[] bF = { "totalProgressionText", "totalProgressionValue", "lastCompletedAchievement", "rootCategories", "selectedFilter", "filters", "selectedRootCategory", "isQuestView", "questInventory" };

  protected final cSR gfF = new cSR();
  protected final ArrayList gfG = new ArrayList();
  protected aMT gfH;
  protected bCP gfI;
  protected blY gfJ;

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("totalProgressionText"))
      return GA() + "/" + Gz();
    if (paramString.equals("totalProgressionValue"))
      return Float.valueOf(GA() / Gz());
    if (paramString.equals("lastCompletedAchievement"))
      return bDi();
    if (paramString.equals("rootCategories"))
      return this.gfG;
    if (paramString.equals("filters"))
      return dHX.values();
    if (paramString.equals("selectedFilter"))
      return bMK.bUv().bUz();
    if (paramString.equals("selectedRootCategory")) {
      return this.gfH;
    }
    return null;
  }

  public abstract boolean UO();

  public ckJ bDi() {
    if (this.gfJ == null) {
      return null;
    }
    ArrayList localArrayList = this.gfJ.bdV();
    return localArrayList.size() > 0 ? (ckJ)localArrayList.get(localArrayList.size() - 1) : null;
  }

  public int Gz() {
    int i = 0;
    for (dmn localdmn = this.gfI.bLq(); localdmn.hasNext(); ) {
      localdmn.fl();
      dEE localdEE = (dEE)localdmn.value();
      boolean bool = cHT.iDr.xT(localdEE.getId());
      if ((!bool) && (localdEE.a(byv.bFN().bFO())))
      {
        i++;
      }
    }
    return i;
  }

  public int GA() {
    int i = 0;
    for (dmn localdmn = this.gfI.bLq(); localdmn.hasNext(); ) {
      localdmn.fl();
      dEE localdEE = (dEE)localdmn.value();
      boolean bool = cHT.iDr.xT(localdEE.getId());
      if ((!bool) && (localdEE.a(byv.bFN().bFO())))
      {
        if (this.gfI.md(localdEE.getId()))
          i++;
      }
    }
    return i;
  }

  public boolean a(ckJ paramckJ)
  {
    return false;
  }

  public blY bDj() {
    return this.gfJ;
  }

  public aMT rl(int paramInt) {
    return (aMT)this.gfF.get(paramInt);
  }

  public aMT bDk() {
    return this.gfH;
  }

  public void a(aMT paramaMT) {
    if (this.gfH == paramaMT) {
      return;
    }
    this.gfH = paramaMT;
    dLE.doY().a(this, new String[] { "selectedRootCategory" });
  }

  public aMT rm(int paramInt) {
    return a(paramInt, this.gfF);
  }

  public aMT a(int paramInt, cSR paramcSR) {
    if (paramcSR == null) {
      return null;
    }
    for (dmn localdmn = paramcSR.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      aMT localaMT1 = (aMT)localdmn.value();
      if (localaMT1.getId() == paramInt) {
        return localaMT1;
      }
      aMT localaMT2 = a(paramInt, localaMT1.bdU());
      if (localaMT2 != null) {
        return localaMT2;
      }
    }
    return null;
  }
}