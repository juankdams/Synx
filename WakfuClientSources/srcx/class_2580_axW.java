import com.ankamagames.framework.script.libraries.scriptedAction.ScriptedActionFunctionsLibrary;
import com.ankamagames.wakfu.client.core.script.fightLibrary.scriptedAction.WakfuScriptedActionFunctionsLibrary;

final class axW extends dcW
{
  private bxh dNu;
  private boolean dNv = true;

  public void cY(boolean paramBoolean) {
    this.dNv = paramBoolean;
  }

  public boolean a(bxh parambxh) {
    this.dNu = parambxh;
    Su localSu = this.kLP.dg(parambxh.aFL());
    if (localSu == null) {
      return false;
    }

    localSu.aeL().chh();
    bBn localbBn = aJF();

    if (this.dNv) {
      b(localSu, localbBn);
    }

    a(localSu, localbBn);
    return false;
  }

  private bBn aJF()
  {
    int i;
    if (this.dNu.UJ() == -1)
      i = 2145;
    else {
      i = this.dNu.UJ();
    }

    return Hh.QM().dh(i);
  }

  private void a(Su paramSu, bBn parambBn) {
    ge localge = parambBn.bKn();
    int i = ccj.k(localge);
    Dk localDk = (Dk)kN.sy().a(bcR.fmZ, (short)i);
    if (localDk == null) {
      return;
    }

    int j = this.dNu.ep().bJ();
    apX localapX = null;
    if (this.dNu.bEG()) {
      if (paramSu.auK() != null) {
        localapX = (apX)paramSu.auK().ajw().o(this.dNu.OG());
      }
      else {
        localObject = new diM(paramSu);
        localapX = ((diM)localObject).e(this.dNu.OG());
      }
    }

    if (localapX == null) {
      bOJ.a(this.dNu.bQX(), this.dNu.eo(), this.kLP.getId(), paramSu, localge, parambBn.oc());
    }

    Object localObject = new bPQ(this.dNu.bQX(), j, this.dNu.eo(), this.kLP.getId(), localDk, this.dNu.Iy(), this.dNu.Iz(), this.dNu.aFL(), this.dNu.bED(), this.dNu.bEE(), this.dNu.bEF(), this.dNu.UJ(), this.dNu.nU(), localapX);
    bvm localbvm = bnc.bxw().a(this.kLP.getId(), (bSR)localObject);
    ((bPQ)localObject).c(new hQ[] { new WakfuScriptedActionFunctionsLibrary(localbvm) });
    ((bPQ)localObject).c(new hQ[] { new ScriptedActionFunctionsLibrary(localbvm) });
  }

  private void b(Su paramSu, bBn parambBn) {
    lZ locallZ = new lZ().tI().am(cPU.kAA);
    locallZ.a(bU.fH().getString("fight.itemUse", new Object[] { new lZ().tz().a(paramSu.cQF()).tA().tP(), new lZ().tz().a(parambBn.getName()).tP() }));

    locallZ.tJ();
    aEe localaEe = new aEe(locallZ.toString());
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }
}