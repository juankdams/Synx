import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class bCY
  implements cvW
{
  protected static final Logger K = Logger.getLogger(bCY.class);

  private static bCY gxT = new bCY();
  private bUV gxU;
  private doN gxV;
  private ArrayList gxW;
  private final LinkedList gxX;

  public bCY()
  {
    this.gxW = new ArrayList();

    this.gxX = new LinkedList();
  }

  public static bCY bLy()
  {
    return gxT;
  }

  public void bLz()
  {
    dLE.doY().t("petBubbleMessage", null);
    if (this.gxV != null) {
      this.gxV.a(null);
      this.gxV = null;
    }
  }

  public doN bLA() {
    return this.gxV;
  }

  public void a(doN paramdoN)
  {
    if (this.gxV != null)
      K.error("[LD/GD] Attention ! On vient d'écraser un listener non consumé sur le dialogue du gélutin !");
    this.gxV = paramdoN;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    switch (paramcWG.getId())
    {
    case 19150:
      localObject1 = (bzu)paramcWG;
      localObject2 = ((bzu)localObject1).getStringValue();
      boolean bool = ((bzu)localObject1).getBooleanValue();
      a((String)localObject2, bool, ((bzu)localObject1).ah(), brV.qG(((bzu)localObject1).getIntValue()));
      return false;
    case 19151:
      bLD();
      return false;
    case 19148:
      aWc.blo().eO(600195L);

      localObject1 = (hg)dLE.doY().rv("tutorialMessageView");
      localObject2 = (NN)paramcWG;
      hg localhg = new hg(((NN)localObject2).ZY(), ((NN)localObject2).getTitle(), ((NN)localObject2).getDesc(), ((NN)localObject2).getType(), ((NN)localObject2).pi());
      if ((localObject1 != null) && (((hg)localObject1).equals(localhg))) {
        return false;
      }
      dLE.doY().t("tutorialMessageView", localhg);

      if (localObject1 != null) {
        a((hg)localObject1);
      }
      b(localhg);
      return false;
    case 19149:
      localObject1 = (hg)dLE.doY().rv("tutorialMessageView");
      dLE.doY().t("tutorialMessageView", null);
      if (localObject1 != null) {
        a((hg)localObject1);
      }
      return false;
    }

    return true;
  }

  private void a(hg paramhg) {
    int i = paramhg.pi();
    if (i != -1)
      bOU.gUc.b(new dgP(i));
    for (int j = this.gxW.size() - 1; j >= 0; j--) {
      ((In)this.gxW.get(j)).a(paramhg);
    }
    bLB();
  }

  private void bLB() {
    cpa localcpa = cBQ.cxL().coO().nf("tutorialMessageDialog");
    dRq localdRq = (dRq)localcpa.fi("particleContainer");

    localdRq.getAppearance().SU();
  }

  private void b(hg paramhg) {
    for (int i = this.gxW.size() - 1; i >= 0; i--) {
      ((In)this.gxW.get(i)).b(paramhg);
    }
    bLC();
  }

  private void bLC() {
    cpa localcpa = cBQ.cxL().coO().nf("tutorialMessageDialog");
    dRq localdRq = (dRq)localcpa.fi("particleContainer");

    localdRq.getAppearance().SU();

    cag localcag = new cag();
    localcag.aJ();
    localcag.setFile("6001057.xps");
    localcag.setAlignment(aFG.ecg);
    localcag.setFollowBorders(true);
    localcag.setSpeed(1000.0F);
    localcag.setTurnNumber(1);
    localdRq.getAppearance().a(localcag);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      dLE.doY().t("petBubbleMessage", null);
      dLE.doY().t("tutorialMessageView", null);

      this.gxU = new bUV();

      cBQ.cxL().j("wakfu.petDialog", aLJ.class);
      awu localawu;
      while ((localawu = (awu)this.gxX.poll()) != null) {
        this.gxU.a(localawu);
      }

      cBQ.cxL().a("tutorialMessageDialog", VV.dJ("tutorialMessageDialog"), 139280L, (short)10000);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      this.gxW.clear();
      this.gxU.clean();
      this.gxU = null;
      this.gxV = null;

      cBQ.cxL().mN("wakfu.petDialog");
      cBQ.cxL().mW("tutorialMessageDialog");
    }
  }

  public void a(String paramString, boolean paramBoolean, long paramLong, brV parambrV) {
    if (this.gxU == null) {
      this.gxX.add(new awu(paramString, paramBoolean, paramLong, parambrV));
      return;
    }

    this.gxU.a(new awu(paramString, paramBoolean, paramLong, parambrV));
  }

  public void bLD() {
    this.gxU.caW();
  }

  public bUV bLE() {
    return this.gxU;
  }

  public boolean a(In paramIn) {
    return this.gxW.add(paramIn);
  }

  public boolean b(In paramIn) {
    return this.gxW.remove(paramIn);
  }
}