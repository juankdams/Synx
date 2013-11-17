import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bsK extends dRq
  implements Qe, dbR
{
  private static Logger K = Logger.getLogger(bsK.class);
  public static final String TAG = "rollingText";
  private long fZO;
  private static final String[] fZP = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
  private static final String fZQ = "text";
  private ArrayList fZR;
  private ArrayList fZS;
  private ArrayList fZT;
  private boolean fZU;
  private static final int cQA = 25;
  private static final float fZV = 500.0F;
  public static final int fZW = 2000;
  private int fZX;
  private int fZY;
  private int fZZ;
  private P dQn;
  private bNa aDi;
  private boolean gaa;
  private boolean gab;

  public bsK()
  {
    this.fZR = new ArrayList();
    this.fZS = new ArrayList();
    this.fZT = new ArrayList();

    this.fZZ = -1;

    this.gaa = false;
    this.gab = false;
  }
  public void setFont(P paramP) {
    if (paramP == this.dQn) {
      return;
    }
    this.dQn = paramP;
    for (dxw localdxw : this.fZR) {
      cWk localcWk = (cWk)localdxw.getList().getElementMap().fi("text");
      localcWk.setFont(paramP);
    }
  }

  public void setColor(bNa parambNa, String paramString) {
    if ((paramString == null) || (paramString.equals("text"))) {
      if (parambNa == this.aDi) {
        return;
      }
      this.aDi = parambNa;

      for (dxw localdxw : this.fZR) {
        cWk localcWk = (cWk)localdxw.getList().getElementMap().fi("text");
        localcWk.setColor(parambNa, "text");
      }
    }
  }

  private ccG bAR()
  {
    int i = 0;
    int j = 0;
    for (localcWk : fZP) {
      int n = this.dQn.a(localcWk.charAt(0));
      int i1 = this.dQn.c(localcWk.charAt(0));
      if (n > i)
        i = n;
      if (i1 > j) {
        j = i1;
      }
    }
    ??? = new ccG();
    ((ccG)???).aJ();
    ((ccG)???).setElementMap(this.cUY);
    ((ccG)???).setCellSize(new Or(i, j));
    ((ccG)???).setAutoIdealSize(true);
    ((ccG)???).setIdealSizeMinRows(1);
    ((ccG)???).setIdealSizeMaxRows(1);
    ((ccG)???).setIdealSizeMinColumns(1);
    ((ccG)???).setIdealSizeMaxColumns(1);
    ((ccG)???).setExpandable(false);
    ((ccG)???).setNonBlocking(false);
    ((ccG)???).setScrollMode(aQA.eNm);
    ((ccG)???).setSelectionable(false);
    ((ccG)???).setScrollBar(false);
    ((ccG)???).setScrollOnMouseWheel(false);

    dpm localdpm1 = new dpm();
    localdpm1.aJ();
    localdpm1.setAlign(aFG.eck);
    ((ccG)???).a(localdpm1);

    eR localeR = new eR();
    localeR.aJ();

    cWk localcWk = new cWk();
    localcWk.aJ();
    localcWk.setElementMap(this.cUY);
    localcWk.setExpandable(false);

    dpm localdpm2 = new dpm();
    localdpm2.aJ();
    localdpm2.setAlign(aFG.eck);
    localcWk.a(localdpm2);

    if (this.dQn != null) {
      localObject2 = new bJA();
      ((bJA)localObject2).aJ();
      ((bJA)localObject2).setRenderer(this.dQn);
      localcWk.getAppearance().a((aNL)localObject2);
    }

    if (this.aDi != null) {
      localObject2 = new cAf();
      ((cAf)localObject2).aJ();
      ((cAf)localObject2).setColor(this.aDi);
      localcWk.getAppearance().a((aNL)localObject2);
    }
    localcWk.setId("text");

    Object localObject2 = new aaE();
    ((aaE)localObject2).aJ();
    ((aaE)localObject2).setAttribute("text");
    localcWk.a((aNL)localObject2);
    localcWk.rV();

    localeR.a(localcWk);
    localeR.rV();

    ((ccG)???).a(localeR);
    ((ccG)???).rV();
    ((ccG)???).setContent(fZP);

    a((aNL)???);
    rV();

    return ???;
  }

  public void setNumber(long paramLong) {
    this.fZO = paramLong;

    int i = String.valueOf(this.fZO).length();
    if (i != this.fZY) {
      this.fZY = i;
      this.fZX = (2000 / (this.fZY * 2 - 1));

      this.gaa = true;
      setNeedsToPreProcess();
    }

    this.gab = true;
    setNeedsToPostProcess();
  }

  private void bAS() {
    dxw localdxw1 = null;
    int i = this.fZR.size();
    if (!this.fZR.isEmpty()) {
      localdxw1 = (dxw)this.fZR.get(i - 1);
    }
    Byte localByte = Byte.valueOf("" + String.valueOf(this.fZO).charAt(i));
    try {
      dxw localdxw2 = new dxw(this, bAR(), i, localdxw1, localByte.byteValue(), null);
      this.fZR.add(localdxw2);
    } catch (Exception localException) {
      localException.printStackTrace();
    }
  }

  public boolean start() {
    if (this.fZR.isEmpty()) {
      return false;
    }
    if (this.fZY > this.fZR.size()) {
      return false;
    }

    dxw localdxw = (dxw)this.fZR.get(this.fZR.size() - 1);
    this.fZZ = 0;
    if (this.fZR.size() > 1)
      localdxw.dcr();
    else {
      localdxw.dcq();
    }

    return true;
  }

  public void clean() {
    for (dxw localdxw : this.fZR)
      localdxw.clean();
    this.fZR.clear();
  }

  public boolean bb(int paramInt) {
    boolean bool = super.bb(paramInt);

    if (this.gaa) {
      int i = 0; for (int j = this.fZR.size(); i < j; i++) {
        dxw localdxw = (dxw)this.fZR.get(i);
        localdxw.getList().beH();
      }

      this.fZR.clear();

      for (i = 0; i < this.fZY; i++) {
        bAS();
      }
      this.gaa = false;
    }

    return bool;
  }

  public boolean r(int paramInt) {
    boolean bool1 = super.r(paramInt);

    if (this.gab) {
      boolean bool2 = start();
      if (bool2) {
        this.gab = false;
      }
    }
    return bool1;
  }

  private int getCurrentValue()
  {
    int i = 0;
    for (dxw localdxw : this.fZR)
      i = (int)(i + localdxw.dcs().byteValue() * Math.pow(10.0D, this.fZR.size() - 1 - localdxw.dcu()));
    return i;
  }

  public long getTotalDuration() {
    int i = 0;
    for (dxw localdxw : this.fZR) {
      int j = localdxw.dct();
      i += this.fZX * 2 * j;
    }
    return 4000L;
  }

  public void aJ() {
    super.aJ();

    aId localaId = new aId();
    localaId.aJ();

    localaId.setAlign(aFG.ecl);
    a(localaId);

    this.gab = false;
    this.gaa = false;
  }

  public void bc() {
    super.bc();
    clean();
    this.fZT.clear();
  }

  public String getTag() {
    return "rollingText";
  }

  public void a(bOM parambOM) {
    if (!this.fZS.contains(parambOM))
      this.fZS.add(parambOM);
  }

  public void b(bOM parambOM) {
    this.fZS.remove(parambOM);
  }

  private void nv() {
    for (int i = this.fZS.size() - 1; i >= 0; i--)
      ((bOM)this.fZS.get(i)).bID();
  }

  public void a(akt paramakt)
  {
    if (!this.fZT.contains(paramakt))
      this.fZT.add(paramakt);
  }

  public void b(akt paramakt) {
    this.fZT.remove(paramakt);
  }

  private void iX(int paramInt) {
    for (int i = this.fZT.size() - 1; i >= 0; i--)
      ((akt)this.fZT.get(i)).iX(paramInt);
  }
}