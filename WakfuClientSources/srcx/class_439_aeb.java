import com.ankamagames.wakfu.client.WakfuClientInstance;
import com.ankamagames.wakfu.client.core.script.InteractiveDialogScriptManager;
import org.apache.log4j.Logger;

public class aeb
  implements cvW, dQl
{
  protected static final Logger K = Logger.getLogger(aeb.class);

  private static final aeb cUW = new aeb();
  private bnm N;
  private dQq cUX;
  private cpa cUY;
  private doN km;
  private apZ cUZ;
  private boolean cVa;
  private ctr cVb;
  private long aHS;

  public static aeb apV()
  {
    return cUW;
  }

  public boolean a(cWG paramcWG)
  {
    if (PO.g(paramcWG)) {
      return false;
    }
    switch (paramcWG.getId()) {
    case 16147:
      bzu localbzu = (bzu)paramcWG;
      int i = localbzu.getIntValue();

      if (i == -1) {
        byv.bFN().b(this);
        return false;
      }

      if (i == -2) {
        this.cUX.drs();
        apV().apX();
        return false;
      }
      dUm localdUm = new dUm();
      localdUm.aS(this.cUX.bel());
      localdUm.Eb(i);
      byv.bFN().aJK().d(localdUm);

      this.cUX.reset();

      bOU.gUc.b(new cAc(this.cUX.bel(), i));
      return false;
    }

    return true;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.N = new dlG(this);

      cBQ.cxL().a(this.N);

      this.cUY = cBQ.cxL().a("interactiveDialogDialog", VV.dJ("interactiveDialogDialog"), 257L, (short)18000).getElementMap();

      this.cUZ = new dlI(this);

      this.km = new dlJ(this);

      bsP.getInstance().a(CH.bGu, this.km, true);
      WakfuClientInstance.awy().rs().a(this.cUZ, true);
      apX();

      cBQ.cxL().j("wakfu.interactiveDialog", nv.class);
      bEX.gzY.a(bpM.fKn, this);
    }
  }

  private void apW()
  {
    if (!this.cVa) {
      cWk localcWk = (cWk)this.cUY.fi("textView");
      localcWk.daL();
      bU(true);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.cUX = null;
      bsP.getInstance().b(CH.bGu, this.km, true);
      WakfuClientInstance.awy().rs().a(this.cUZ);

      cBQ.cxL().mW("interactiveDialogDialog");

      cBQ.cxL().b(this.N);

      cBQ.cxL().mN("wakfu.interactiveDialog");

      InteractiveDialogScriptManager.flO.bqs();

      Object localObject1 = null;
      Object localObject2;
      if (this.cVb == ctr.idl) {
        localObject1 = CA.Lv().bj(this.aHS);
      } else if (this.cVb == ctr.idk) {
        localObject2 = (ayn)cSE.kEZ.xz((int)this.aHS);
        if (localObject2 != null) {
          localObject1 = ((ayn)localObject2).aKk();
        }
      }
      if (localObject1 != null) {
        localObject2 = ((Su)localObject1).aeL();
        ((cew)localObject2).cb(true);
      }
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(int paramInt, ctr paramctr, long paramLong) {
    this.aHS = paramLong;
    this.cVb = paramctr;

    Object localObject = null;
    if (paramctr == ctr.idl) {
      localObject = CA.Lv().bj(paramLong);
    } else if (paramctr == ctr.idk) {
      ayn localayn = (ayn)cSE.kEZ.xz((int)paramLong);
      if (localayn != null) {
        localObject = localayn.aKk();
      }
    }
    if (localObject != null) {
      ((Su)localObject).aeL().cb(false);
    }

    this.cUX = new dQq(agL.daF.ib(paramInt), paramctr, paramLong);
    dLE.doY().t("currentDialog", this.cUX);
    byv.bFN().a(this);
  }

  public void hM(int paramInt) {
    if (this.cUX == null) {
      K.error("On tente de passer à un dialogue d'id=" + paramInt + " alors qu'il n'y a pas de dialog en cours !");
      return;
    }

    if (paramInt == 0) {
      byv.bFN().b(this);
      return;
    }
    this.cUX.b(agL.daF.ib(paramInt));
    apX();
  }

  public void apX() {
    this.cVa = false;
    cWk localcWk = (cWk)this.cUY.fi("textView");
    localcWk.a(new dlL(this, localcWk));

    if (this.cUX != null) {
      InteractiveDialogScriptManager.flO.bqs();
      InteractiveDialogScriptManager.flO.hV(this.cUX.drn());
    }
  }

  private void bU(boolean paramBoolean) {
    for (bVz localbVz : this.cUX.drq()) {
      localbVz.setVisible(paramBoolean);
    }
    this.cVa = true;
  }

  public void a(dhJ paramdhJ, long paramLong) {
  }

  public void u(dhJ paramdhJ) {
    if (paramdhJ != byv.bFN().bFO())
      return;
    byv.bFN().b(this);
  }

  public void apY()
  {
  }
}