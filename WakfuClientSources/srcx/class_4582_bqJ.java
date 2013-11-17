import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class bqJ
  implements dBv
{
  public static final String fLN = "shortcuts";
  public static final String fLO = "bindNumberList";
  public static final String fLP = "currentBind";
  public static final String fLQ = "binds";
  private HashMap fLR = new HashMap();

  private aoL fLS = new aoL();

  private ArrayList fLT = new ArrayList();
  private bln fLU;
  private static short fLV = 0;

  private aoL fLW = new aoL();

  private final String[] bF = { "shortcuts", "bindNumberList", "currentBind", "binds" };

  private static final bqJ fLX = new bqJ();

  public static bqJ bzC()
  {
    return fLX;
  }

  public String[] getFields() {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("shortcuts")) {
      ArrayList localArrayList1 = new ArrayList();

      for (cHu localcHu = this.fLW.aBa(); localcHu.hasNext(); ) {
        localcHu.fl();
        ArrayList localArrayList2 = new ArrayList();
        bHT localbHT = (bHT)localcHu.value();
        for (bln localbln : this.fLR.values()) {
          ckW localckW = localbln.bwo();
          if ((localckW != null) && (localckW.getCategory() != null) && (localbHT.getName().equals(localckW.getCategory())))
          {
            localArrayList2.add(localbln);
          }
        }
        Collections.sort(localArrayList2, new dpk(this));

        localbHT.L(localArrayList2);
        localArrayList1.add(localbHT);
      }
      return localArrayList1;
    }if (paramString.equals("currentBind"))
      return this.fLU;
    if (paramString.equals("binds")) {
      return iJ("binding");
    }

    return this.fLR.get(paramString);
  }

  private ArrayList iJ(String paramString) {
    ArrayList localArrayList = new ArrayList();
    for (bln localbln : this.fLR.values()) {
      if (localbln.bwq().equalsIgnoreCase(paramString)) {
        localArrayList.add(localbln);
      }
    }
    return localArrayList;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  private boolean iK(String paramString) {
    return (paramString.equals("common")) || (paramString.equals("world")) || (paramString.equals("fight")) || (paramString.equals("binding")) || (paramString.equals("default"));
  }

  public void initialize()
  {
    this.fLR.clear();
    this.fLS.clear();
    this.fLW.clear();
    fLV = 0;

    ckW[] arrayOfckW1 = bEs.bMK().NB();
    for (ckW localckW : arrayOfckW1) {
      String str1 = localckW.bwq();
      if ((localckW.getId() != null) && (iK(str1))) {
        if (str1.equals("binding"))
          fLV = (short)(fLV + 1);
        this.fLR.put(localckW.getId(), new bln(localckW));
        this.fLS.put(bCO.cM(localckW.getKeyCode(), localckW.cmO()), localckW.getId());
        String str2 = localckW.getCategory();
        if (str2 != null) {
          int k = str2.hashCode();
          if (!this.fLW.containsKey(k))
            this.fLW.put(k, new bHT(str2));
        }
      } else {
        this.fLT.add(Long.valueOf(bCO.cM(localckW.getKeyCode(), localckW.cmO())));
      }
    }

    b(null);
  }

  public boolean fU(long paramLong)
  {
    return this.fLT.contains(Long.valueOf(paramLong));
  }

  public boolean fV(long paramLong)
  {
    return (this.fLS.containsKey(paramLong)) || (this.fLT.contains(Long.valueOf(paramLong)));
  }

  public bln fW(long paramLong)
  {
    String str = (String)this.fLS.get(paramLong);
    if (str != null) {
      bln localbln = (bln)this.fLR.get(str);
      if (localbln != null) {
        return localbln;
      }
    }
    return null;
  }

  public void bzD()
  {
    initialize();
    dLE.doY().a(this, this.bF);
  }

  public void b(bln parambln)
  {
    this.fLU = parambln;
    dLE.doY().a(this, new String[] { "currentBind" });
  }

  public bln bzE() {
    return this.fLU;
  }

  public ckW iL(String paramString) {
    if ((bqJ.fLV = (short)(fLV + 1)) > 20)
      return null;
    return new ckW("binding" + fLV, -1, "!/common/bind ", false, false, false, false, false, paramString);
  }

  public void fc(boolean paramBoolean) {
    if (paramBoolean) {
      ArrayList localArrayList = iJ("binding");
      if (localArrayList.size() > 0)
        b((bln)localArrayList.get(0));
    } else {
      b(null);
    }
  }
}