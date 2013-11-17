import com.ankamagames.wakfu.client.WakfuClientInstance;
import com.ankamagames.wakfu.client.console.command.display.DisplayHpBarCommand;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aKj
  implements bnm, cvW
{
  private static aKj ekB = new aKj();
  private static final String ekC = "watcherContainer";
  private ArrayList ekD = new ArrayList();

  private ArrayList ekE = new ArrayList();

  private kd ekF = null;

  public static aKj bbx()
  {
    return ekB;
  }

  public void bby()
  {
  }

  public void ah(Su paramSu)
  {
    if (F.a(paramSu))
      return;
    String str = "fighterDescriptionDialog" + paramSu.getId();

    if (this.ekE.contains(str))
      gG(str);
    else
      a(paramSu, str);
  }

  public void ai(Su paramSu)
  {
    String str = "fighterDescriptionDialog" + paramSu.getId();
    a(paramSu, str);
  }

  public void aj(Su paramSu) {
    String str = "fighterDescriptionDialog" + paramSu.getId();
    gG(str);
  }

  private void a(Su paramSu, String paramString) {
    if (paramSu.i(cfY.hCt)) {
      return;
    }
    if (!this.ekE.contains(paramString)) {
      this.ekE.add(paramString);

      dOc localdOc = (dOc)cBQ.cxL().a(paramString, VV.dJ("fighterDescriptionDialog"), 1L, (short)10000);

      dLE.doY().a("fighter", paramSu, paramString);

      localdOc.setSizeToPrefSize();

      axU localaxU = this.ekF.getCellRenderable(paramSu);
      if (localaxU != null)
        localdOc.setPosition(localaxU.getScreenX() - localdOc.getWidth(), localaxU.getScreenY());
    }
  }

  private void gG(String paramString)
  {
    if (this.ekE.remove(paramString))
      cBQ.cxL().mW(paramString);
  }

  public void i(String paramString)
  {
    this.ekE.remove(paramString);
  }

  private void a(aAn paramaAn, cYl paramcYl, boolean paramBoolean) {
    Rx localRx = (Rx)paramaAn.atJ();
    if (localRx == null) {
      return;
    }
    String str = "timelineCellDialog2" + paramaAn.getId();

    if (paramBoolean) {
      dhy localdhy = (dhy)paramaAn;
      cCq localcCq = localdhy.Uc();
      if (localcCq == null)
        return;
      Object localObject2;
      Object localObject1;
      if (paramcYl != null) {
        localObject2 = (Su)paramcYl;
        localObject1 = ((Su)localObject2).aeL();
      } else {
        localObject1 = localcCq.cyG();
      }

      if (cBQ.cxL().mZ(str)) {
        cpa localcpa = cBQ.cxL().coO().nf(str);
        localObject2 = (dxn)localcpa.fi("watcherContainer");
      } else {
        localObject2 = (dxn)cBQ.cxL().a(str, VV.dJ("timelineCellDialog2"), 8192L, (short)10000);
      }
      dLE.doY().a("timeline.fighter", new drT(localRx), str);
      ((dxn)localObject2).setTarget((agn)localObject1);

      if (!this.ekD.contains(str))
        this.ekD.add(str);
    }
    else if (this.ekD.remove(str)) {
      cBQ.cxL().mW(str);
    }
  }

  private void f(Su paramSu, boolean paramBoolean)
  {
    String str = "timelineCellDialog" + paramSu.getId();

    if (paramBoolean) {
      if (!this.ekD.contains(str))
      {
        dxn localdxn = (dxn)cBQ.cxL().a(str, VV.dJ("timelineCellDialog"), 8192L, (short)10000);
        dLE.doY().a("timeline.fighter", paramSu, localdxn.getElementMap());
        localdxn.setTarget(paramSu.aeL());
        this.ekD.add(str);
      }
    }
    else if (this.ekD.remove(str))
      cBQ.cxL().mW(str);
  }

  private void x(String paramString, boolean paramBoolean)
  {
  }

  public void dw(boolean paramBoolean)
  {
    cpa localcpa = cBQ.cxL().coO().nf("timePointBarDialog");
    if (localcpa == null) {
      return;
    }

    c((dOc)localcpa.fi("timePointScoreProgressBar"), paramBoolean);
    c((dOc)localcpa.fi("timePointScoreProgressBar2"), paramBoolean);
    c((dOc)localcpa.fi("timePointScoreProgressBar3"), paramBoolean);
  }

  private void c(dOc paramdOc, boolean paramBoolean) {
    if (paramdOc == null) {
      return;
    }
    Jg localJg = paramdOc.getAppearance();

    bNa localbNa1 = new bNa(230, 227, 0, 255);
    bNa localbNa2 = new bNa(0, 170, 255, 255);

    if (paramBoolean)
      localJg.a(new gm(localbNa1, localbNa2, localJg, 0, 500, -1, true, ddp.kWG));
    else
      localJg.J(gm.class);
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    boolean bool;
    ani localani;
    switch (paramcWG.getId()) {
    case 18103:
      localObject = (bWE)paramcWG;
      f(((bWE)localObject).cbD(), ((bWE)localObject).getBooleanValue());
      return false;
    case 18106:
      localObject = (del)paramcWG;
      a(((del)localObject).bQj(), ((del)localObject).cOY(), ((del)localObject).getBooleanValue());
      return false;
    case 18100:
      bool = dLE.doY().getBooleanProperty("displaySecondTimeline");

      dLE.doY().t("displaySecondTimeline", Boolean.valueOf(!bool));

      return false;
    case 18101:
      bool = dLE.doY().getBooleanProperty("timeline.displayStates");
      dLE.doY().t("timeline.displayStates", Boolean.valueOf(!bool));
      return false;
    case 19990:
      localani = (ani)paramcWG;
      switch (localani.azT().getKeyCode()) {
      case 17:
        DisplayHpBarCommand.dg(true);
      }

      return false;
    case 19991:
      localani = (ani)paramcWG;
      switch (localani.azT().getKeyCode()) {
      case 17:
        DisplayHpBarCommand.dg(false);
      }

      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
      localaTL.dW(true);
      localaTL.dX(true);

      cBQ.cxL().a(this);

      dLE.doY().t("displaySecondTimeline", Boolean.valueOf(false));
      dLE.doY().t("timeline.displayStates", Boolean.valueOf(true));

      DisplayHpBarCommand.dg(false);

      zu localzu = (zu)dLE.doY().rv("fight.timeline");
      if (localzu != null) {
        for (localObject1 = localzu.Id().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Su)((Iterator)localObject1).next();
          f((Su)localObject2, true);
        }
        localzu.Ig();
      }

      Object localObject1 = byv.bFN().bFO().aeQ();
      if (localObject1 == null)
        localObject1 = byv.bFN().bFO().bHg();
      Object localObject2 = cBQ.cxL().a("timePointBarDialog", VV.dJ("timePointBarDialog"), 270336L, (short)10000);

      cBQ.cxL().j("wakfu.timeline", cco.class);

      this.ekF = ((kd)((aNL)localObject2).getElementMap().fi("timeline"));
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
      localaTL.dW(false);
      localaTL.dX(false);

      cBQ.cxL().b(this);

      cBQ.cxL().mW("timePointBarDialog");
      cBQ.cxL().mW("timePointBonusSelectionDialog");

      for (int i = this.ekD.size() - 1; i >= 0; i--) {
        cBQ.cxL().mW((String)this.ekD.get(i));
      }
      this.ekD.clear();

      for (i = this.ekE.size() - 1; i >= 0; i--) {
        cBQ.cxL().mW((String)this.ekE.get(i));
      }
      this.ekE.clear();

      cBQ.cxL().mN("wakfu.timeline");

      this.ekF = null;
    }
  }

  public void mN(int paramInt) {
    cpa localcpa = cBQ.cxL().coO().nf("timePointBarDialog");
    if (localcpa == null)
      return;
    a(paramInt, (dOc)localcpa.fi("numBonusLabel"));
  }

  private void a(int paramInt, dOc paramdOc) {
    ArrayList localArrayList = paramdOc.getAppearance().getChildren();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      aNL localaNL = (aNL)localArrayList.get(i);
      if ((localaNL instanceof cag))
        ((cag)localaNL).setLevel(paramInt);
    }
  }
}