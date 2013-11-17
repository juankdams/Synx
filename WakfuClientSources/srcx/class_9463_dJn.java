import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class dJn
  implements cvW
{
  protected static final Logger K = Logger.getLogger(dJn.class);

  private static dJn lUS = new dJn();
  private dFP lUT;
  private ban lUU;
  private bVI lUV;
  private cag baa;
  private dRq gei;
  private ArrayList bab;
  private final LinkedList gej;
  private static final int gek = 2500;
  private bnm N;

  public dJn()
  {
    this.gej = new LinkedList();
  }

  public static dJn diF()
  {
    return lUS;
  }

  public boolean a(cWG paramcWG)
  {
    paramcWG.getId();

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.lUT == null) {
        K.error("Impossible de charger l'affichage du ladder, il manque les données !");
        return;
      }

      this.N = new cKM(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("dungeonLadder", this.lUT);
      dLE.doY().t("dungeonLadderBackgroundImage", ay.bd().M(bdD.fpx.getId()));

      cBQ.cxL().a("dungeonLadderDialog", VV.dJ("dungeonLadderDialog"), 256L, (short)30000);

      yx();

      cBQ.cxL().j("wakfu.dungeonLadder", cEH.class);

      aWc.blo().eO(600120L);
    }
  }

  private void yx()
  {
    cpa localcpa = cBQ.cxL().coO().nf("dungeonLadderDialog");
    ArrayList localArrayList = new ArrayList();

    dOc localdOc = (dOc)localcpa.fi("background");
    if (localdOc != null) {
      localArrayList.add(localdOc.getAppearance());
    }
    localdOc = (dOc)localcpa.fi("closeButton");
    if (localdOc != null) {
      localArrayList.add(localdOc.getAppearance());
    }

    if (localdOc != null) {
      bNa localbNa1 = new bNa(bNa.gRu.get());
      bNa localbNa2 = new bNa(bNa.gRx.get());

      localdOc.a(new aga(localbNa1, localbNa2, localArrayList, 0, 500, 1, ddp.kWG));
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      clean();

      cBQ.cxL().b(this.N);

      dLE.doY().removeProperty("dungeonLadder");
      dLE.doY().removeProperty("dungeonLadderBackgroundImage");

      cBQ.cxL().mW("dungeonLadderDialog");

      cBQ.cxL().mN("wakfu.dungeonLadder");

      aWc.blo().eO(600121L);
    }
  }

  public void a(aBU paramaBU) {
    this.lUT = new dFP(paramaBU);
    byv.bFN().a(diF());
  }

  public void diG() {
    diI();
    this.lUU = new ban(this, blX.fDg);
    dLE.doY().t("dungeonStatut", this.lUU);
    this.lUV = new bVI(this, null);
    dka.cSF().a(this.lUV, 1000L);

    cBQ.cxL().a("dungeonStatutDialog", VV.dJ("dungeonStatutDialog"), 139264L, (short)10000);
  }

  public static String CJ(int paramInt)
  {
    int i = 0;
    int j = paramInt;
    if (j / 3600 > 0) {
      return "> 1 h ";
    }
    if (paramInt / 60 > 0) {
      i = paramInt / 60;
      j = paramInt % 60;
    }
    return (i < 10 ? "0" + i : Integer.valueOf(i)) + ":" + (j < 10 ? "0" + j : Integer.valueOf(j));
  }

  public void diH() {
    cBQ.cxL().mW("dungeonStatutDialog");
    this.lUU = null;
    dLE.doY().removeProperty("dungeonStatut");
  }

  public void diI() {
    if (this.lUV == null)
      return;
    dka.cSF().j(this.lUV);
    this.lUV = null;
  }

  public void diJ() {
    this.lUU = new ban(this, blX.fDh);
    this.lUU.setText("0");
    dLE.doY().t("dungeonStatut", this.lUU);

    cBQ.cxL().a("dungeonStatutDialog", VV.dJ("dungeonStatutDialog"), 139264L, (short)10000);
  }

  public void diK()
  {
    int i = Integer.parseInt(this.lUU.getText());
    this.lUU.setText(String.valueOf(i + 1));
  }

  public void eG(short paramShort) {
    if (this.lUU == null) {
      K.error("on tente d'afficher le résultat d'un donjon alors qu'il n'existe pas d'interface de statut");
      return;
    }
    this.lUU.bE(paramShort);
  }

  public void iR(String paramString) {
    if (dLE.doY().rv("splashText") != null) {
      this.gej.addLast(paramString);
    } else {
      dLE.doY().t("splashText", paramString);
      if ((!cBQ.cxL().mZ("splashMessageDialog")) || (this.gei == null)) {
        this.gei = ((dRq)cBQ.cxL().a("splashMessageDialog", VV.dJ("splashMessageDialog"), 8210L, (short)10000));
      }

      if (this.gei != null) {
        if (this.baa != null) {
          this.gei.getAppearance().c(this.baa);
        }

        this.baa = new cag();
        this.baa.aJ();
        this.baa.setFile("6001037.xps");
        this.baa.setAlignment(aFG.eck);
        this.gei.getAppearance().a(this.baa);
      }
      fr(true);
    }
  }

  private void bCt() {
    this.bab = new ArrayList();
    cpa localcpa = this.gei.getElementMap();
    this.bab.add(((dRq)localcpa.fi("mainContainer")).getAppearance());
    this.bab.add(((cWk)localcpa.fi("text")).getAppearance());
  }

  private void fq(boolean paramBoolean) {
    cpa localcpa = this.gei.getElementMap();
    ((dRq)localcpa.fi("mainContainer")).setNonBlocking(paramBoolean);
  }

  public void fr(boolean paramBoolean) {
    if (this.gei == null) {
      K.warn("on tente de fade un splashScreen alors qu'il n'est pas chargé");
      return;
    }

    if (this.bab == null) {
      bCt();
    }
    fq(!paramBoolean);
    cpa localcpa = this.gei.getElementMap();
    dRq localdRq = (dRq)localcpa.fi("mainContainer");

    dKW localdKW = (dKW)this.bab.get(0);
    int i;
    int j;
    if (paramBoolean) {
      i = bNa.gRu.get();
      j = bNa.gRx.get();
    } else {
      i = bNa.gRx.get();
      j = bNa.gRu.get();
    }

    if (i != j) {
      if (paramBoolean)
        aWc.blo().blC();
      else {
        aWc.blo().blD();
      }

      bNa localbNa1 = new bNa(i);
      bNa localbNa2 = new bNa(j);

      localdRq.J(aga.class);
      aga localaga = new aga(localbNa1, localbNa2, this.bab, 0, 500, 1, ddp.kWG);
      localaga.a(new cKN(this, paramBoolean));

      localdRq.a(localaga);
    }
  }

  public dFP diL()
  {
    return this.lUT;
  }

  public void clean()
  {
    diI();
    this.lUT = null;
  }
}