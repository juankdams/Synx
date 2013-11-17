import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dPS extends cGj
{
  private static final Logger K = Logger.getLogger(dPS.class);
  public static final String mjl = "ready";
  public static final String bMU = "categories";
  public static final String mjm = "currentCategory";
  public static final String dVJ = "articles";
  public static final String eim = "currentPage";
  public static final String mjn = "totalPages";
  private static final String mjo = "wallet";
  private static final String mjp = "pagesDescription";
  public static final int mjq = 10;
  private final Object aNy = new Object();
  private static final int NONE = 1;
  private static final int mjr = 2;
  private static final int mjs = 3;
  private boolean mjt;
  private final ArrayList aBf = new ArrayList();
  private final PX mju = new PX();

  private final ArrayList hkI = new ArrayList();
  private acM mjv;
  private final ArrayList mjw = new ArrayList();

  private int aPg = 0;
  private int mjx = 0;

  private String mjy = null;

  private int aHa = 1;
  private int mjz = 1;
  private int mjA = 1;

  private final ArrayList mjB = new ArrayList();

  public void a(cxt paramcxt)
  {
    synchronized (this.aNy) {
      if (this.aHa == 3)
        paramcxt.brD();
      else {
        this.aBf.add(paramcxt);
      }

      if (this.aHa != 1) {
        return;
      }

      this.aHa = 2;
      this.mjA = 2;
      this.mjz = 2;

      for (dlS localdlS : dlS.values()) {
        this.mjB.add(new cbT(localdlS, this));
      }
      dLE.doY().a(this, new String[] { "wallet" });

      ayS.dQa.a(new dTj(this));

      dGl.lQV.a(new dTi(this));
    }
  }

  private void dqY()
  {
    synchronized (this.aNy) {
      if ((this.aHa != 3) && (this.mjA == 3) && (this.mjz == 3)) {
        this.aHa = 3;
        int i = 0; for (int j = this.aBf.size(); i < j; i++) {
          cxt localcxt = (cxt)this.aBf.get(i);
          localcxt.brD();
        }
        this.aBf.clear();
        rL(null);
      }
    }
  }

  void fo(int paramInt1, int paramInt2) {
    this.mju.c(dlS.ljs.bJ(), paramInt1);
    this.mju.c(dlS.ljt.bJ(), paramInt2);
    int i = 0; for (int j = this.mjB.size(); i < j; i++) {
      cbT localcbT = (cbT)this.mjB.get(i);
      localcbT.cfz();
    }
  }

  int a(dlS paramdlS) {
    return this.mju.ap(paramdlS.bJ());
  }

  public void d(acM paramacM) {
    this.mjv = paramacM;
  }

  public void rL(String paramString) {
    ab(paramString, 1);
  }

  public void dqZ() {
    if (this.aPg == 1) {
      return;
    }
    ab(this.mjy, 1);
  }

  public void dph() {
    if (this.aPg <= 1) {
      return;
    }
    ab(this.mjy, this.aPg - 1);
  }

  public void dpg() {
    if (this.aPg == this.mjx) {
      return;
    }
    ab(this.mjy, this.aPg + 1);
  }

  public void dra() {
    if (this.aPg == this.mjx) {
      return;
    }
    ab(this.mjy, this.mjx);
  }

  public void a(aet paramaet) {
    drd();
    cgz.hEx.a(paramaet.getId(), 1, new dTh(this));
  }

  private void ab(String paramString, int paramInt)
  {
    if (this.mjt) {
      return;
    }
    this.mjy = paramString;
    this.aPg = paramInt;

    if ((this.mjy == null) || (this.mjy.length() == 0))
      drc();
    else
      drb();
  }

  private void drb()
  {
    drd();

    dxC.lEu.a(this.mjv.getId(), this.mjy, this.aPg, 10, new dSQ(this));
  }

  private void drc()
  {
    drd();

    bnY.fHg.a(this.mjv.getId(), this.aPg, 10, new dSS(this));
  }

  private void drd()
  {
    this.mjt = true;
    dLE.doY().a(this, new String[] { "ready" });
  }

  private void dre() {
    this.mjt = false;
    dLE.doY().a(this, new String[] { "ready" });
  }

  public String[] getFields() {
    return lJb;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("wallet")) {
      return this.mjB;
    }
    if (paramString.equals("categories")) {
      return this.hkI;
    }
    if (paramString.equals("currentCategory")) {
      return this.mjv;
    }
    if (paramString.equals("articles")) {
      return this.mjw;
    }
    if (paramString.equals("currentPage")) {
      return Integer.valueOf(this.aPg);
    }
    if (paramString.equals("totalPages")) {
      return Integer.valueOf(this.mjx);
    }
    if (paramString.equals("ready")) {
      return Boolean.valueOf(!this.mjt);
    }
    if (paramString.equals("pagesDescription")) {
      if (this.mjx != 0) {
        return this.aPg + "/" + this.mjx;
      }
      return bU.fH().getString("marketBoard.noResults");
    }

    return null;
  }
}