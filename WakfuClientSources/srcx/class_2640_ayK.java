import java.util.ArrayList;

public class ayK extends cGj
{
  public static final String AF = "cost";
  public static final String dPD = "kamas";
  public static final String T = "result";
  public static final String dPE = "criterion";
  public static final String GB = "level";
  public static final String czg = "enabled";
  public static final String[] bF = { "cost", "kamas", "result", "criterion", "level", "enabled" };

  private static final ctR dPF = new ctR();
  private static final int dPG = 13126;
  private static final int dPH = 13127;
  private static final int dPI = 13128;
  private ArrayList dPJ = new ArrayList();
  private ArrayList dPK = new ArrayList();
  private aYt dPL;

  public ayK(aYt paramaYt)
  {
    paramaYt.c(new awZ(this));

    paramaYt.d(new awR(this));

    this.dPL = paramaYt;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("cost"))
      return aKN();
    if (paramString.equals("kamas")) {
      int i = this.dPL.bnM();
      return i > 0 ? Integer.valueOf(i) : null;
    }if (paramString.equals("criterion"))
      return aKM();
    if (paramString.equals("level")) {
      agi localagi = aKP();
      if (localagi == null) {
        return null;
      }
      short s = localagi.Hu().nU();
      return bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(s) });
    }if (paramString.equals("enabled"))
      return Boolean.valueOf(aKO());
    if (paramString.equals("result")) {
      return aKP();
    }
    return null;
  }

  private String aKM() {
    bZA localbZA = this.dPL.F();
    if (localbZA == null) {
      return null;
    }
    String str = daj.a(localbZA);
    lZ locallZ = new lZ();
    locallZ.a(str);
    return locallZ.tP();
  }

  private ArrayList aKN() {
    return this.dPJ;
  }

  private boolean aKO() {
    byz localbyz = byv.bFN().bFO();
    bZA localbZA = this.dPL.F();
    if ((localbZA != null) && (!localbZA.i(localbyz, this, this.dPL, localbyz.ayL()))) {
      return false;
    }
    boolean bool = this.dPL.c(new awS(this, localbyz));

    if (!bool) {
      return false;
    }

    if (localbyz.fO().bDx() < this.dPL.bnM()) {
      return false;
    }

    return true;
  }

  public agi aKP() {
    if (this.dPK.isEmpty()) {
      return null;
    }
    return (agi)this.dPK.get(0);
  }

  public aYt aKQ() {
    return this.dPL;
  }

  public int getOrder() {
    return this.dPL.getOrder();
  }

  public int aKR() {
    int i = 0;
    for (agi localagi : this.dPJ) {
      int j = dPF.get(localagi.Hu().getId());
      i += localagi.nP() * (j == 0 ? 1 : j);
    }
    return i;
  }

  static
  {
    dPF.put(13126, 1);
    dPF.put(13127, 10);
    dPF.put(13128, 100);
  }
}