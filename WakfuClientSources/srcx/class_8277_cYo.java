import com.ankamagames.framework.script.libraries.scriptedAction.ScriptedActionFunctionsLibrary;
import com.ankamagames.wakfu.client.core.script.fightLibrary.scriptedAction.WakfuScriptedActionFunctionsLibrary;

public final class cYo
{
  private final ckT kLP;
  private final bxh kLQ;
  private final boolean dNv;

  public cYo(ckT paramckT, bxh parambxh, boolean paramBoolean)
  {
    this.kLP = paramckT;
    this.kLQ = parambxh;
    this.dNv = paramBoolean;
  }

  public void execute() {
    Su localSu = this.kLP.dg(this.kLQ.aFL());
    if (localSu == null) {
      return;
    }

    localSu.aeL().chh();
    bBn localbBn = aJF();

    if (this.dNv) {
      b(localSu, localbBn);
    }

    a(localSu, localbBn);
  }

  private bBn aJF()
  {
    int i;
    if (this.kLQ.UJ() == -1)
      i = 2145;
    else {
      i = this.kLQ.UJ();
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

    int j = this.kLQ.ep().bJ();
    apX localapX = null;
    if (this.kLQ.bEG()) {
      if (paramSu.auK() != null) {
        localapX = (apX)paramSu.auK().ajw().o(this.kLQ.OG());
      }
      else {
        localObject = new diM(paramSu);
        localapX = ((diM)localObject).e(this.kLQ.OG());
      }
    }

    if (localapX == null) {
      bOJ.a(this.kLQ.bQX(), this.kLQ.eo(), this.kLP.getId(), paramSu, localge, parambBn.oc());
    }

    Object localObject = new bPQ(this.kLQ.bQX(), j, this.kLQ.eo(), this.kLP.getId(), localDk, this.kLQ.Iy(), this.kLQ.Iz(), this.kLQ.aFL(), this.kLQ.bED(), this.kLQ.bEE(), this.kLQ.bEF(), this.kLQ.UJ(), this.kLQ.nU(), localapX);
    bvm localbvm = bnc.bxw().a(this.kLP.getId(), (bSR)localObject);
    ((bPQ)localObject).c(new hQ[] { new WakfuScriptedActionFunctionsLibrary(localbvm), new ScriptedActionFunctionsLibrary(localbvm) });
  }

  private void b(Su paramSu, bBn parambBn)
  {
    lZ locallZ = new lZ().tI().am(cPU.kAA);
    locallZ.a(bU.fH().getString("fight.itemUse", new Object[] { new lZ().tz().a(paramSu.cQF()).tA().tP(), new lZ().tz().a(parambBn.getName()).tP() }));

    locallZ.tJ();
    aEe localaEe = new aEe(locallZ.toString());
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }
}