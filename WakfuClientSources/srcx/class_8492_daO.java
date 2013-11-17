import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class daO
  implements bX, cvW, dBv
{
  private static final Logger K = Logger.getLogger(daO.class);
  private static daO kSA = new daO();
  public static final String kSB = "overHeadInfos";
  public static final String kSC = "breedIconUrl";
  public static final String kSD = "breedIconColor";
  public static final String aGo = "title";
  public static final String kSE = "breed";
  public static final String kSF = "monsters";
  public static final String kSG = "hooded";
  public static final String kSH = "resource";
  public static final String[] bF = { "overHeadInfos", "breedIconUrl", "breedIconColor", "title" };
  private dxn kSI;
  private List TS = new ArrayList();
  private bZc kSJ;
  private dD kSK;
  private String TT;
  private String kSL;
  private String hh;

  public static daO cML()
  {
    return kSA;
  }

  public bZc cMM() {
    return this.kSJ;
  }

  public void a(bZc parambZc) {
    if (parambZc != null)
      parambZc.b(this);
    if (parambZc != this.kSJ) {
      return;
    }
    this.kSJ = null;

    if (this.kSI != null) {
      this.kSI.setVisible(false);
    }
    cAo.cxf().b(this);
  }

  public void jr(long paramLong)
  {
    if (this.kSJ == null)
      return;
    if (!(this.kSJ instanceof cew))
      return;
    Su localSu = ((cew)this.kSJ).cbD();
    if (!(localSu instanceof bKm))
      return;
    if (((bKm)localSu).CD() != paramLong)
      return;
    this.kSK.hw().clear();
    dxz.a(localSu, this.kSK);
    this.TS = this.kSK.hw();
    dLE.doY().a(this, bF);
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    if ((paramcWG instanceof dKQ)) {
      localObject = (dKQ)paramcWG;
      if (cMN()) {
        return false;
      }
      return false;
    }

    switch (paramcWG.getId())
    {
    case 16591:
      localObject = (sd)paramcWG;
      a(((sd)localObject).hv());
      return false;
    case 16590:
      localObject = (dD)paramcWG;
      cAo.cxf().b(this);
      this.kSK = ((dD)localObject);
      long l;
      if (((dD)localObject).hz())
        l = ((dD)localObject).hA();
      else {
        l = byv.bFN().bFO().aeQ() != null ? 0L : ()(WakfuClientInstance.awy().awB().c(bmz.fEF) * 1000.0F);
      }

      this.kSJ = this.kSK.hv();
      this.kSJ.a(this);

      if (l != 0L)
        cAo.cxf().a(this, l, 0, 1);
      else {
        cMN();
      }

      return false;
    }

    return true;
  }

  private boolean cMN() {
    bZc localbZc = this.kSK.hv();

    cBQ.cxL().a("overheadDialog", localbZc);

    bNa localbNa = new bNa(bNa.gRx.get());
    this.kSI.getAppearance().setModulationColor(localbNa);

    this.TS = this.kSK.hw();
    this.TT = this.kSK.hx();
    this.kSL = this.kSK.hy().toString();
    this.hh = this.kSK.getTitle();
    dLE.doY().a(this, bF);

    localbNa = new bNa(localbZc.ff());
    localbNa.z(0.9F);
    this.kSI.getAppearance().setModulationColor(localbNa);

    if ((this.kSI != null) && (!this.TS.isEmpty()))
    {
      this.kSI.setVisible(true);
    }

    return false;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.kSI = ((dxn)cBQ.cxL().a("overheadDialog", VV.dJ("overheadDialog"), 73729L, (short)10000));

      this.kSI.setVisible(false);

      dLE.doY().t("overHead", this);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().mW("overheadDialog");
      this.kSI = null;
      cAo.cxf().b(this);
      dLE.doY().removeProperty("overHead");
    }
  }

  public long getId() {
    return 88L;
  }

  public void a(long paramLong)
  {
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("overHeadInfos"))
      return this.TS;
    if (paramString.equals("breedIconUrl"))
      return this.TT;
    if (paramString.equals("breedIconColor"))
      return this.kSL;
    if (paramString.equals("title")) {
      return this.hh;
    }
    return null;
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

  public void b(boolean paramBoolean, dnS paramdnS) {
    if (!paramBoolean)
      a(this.kSJ);
  }
}