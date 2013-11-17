import com.ankamagames.framework.script.libraries.scriptedAction.ScriptedActionFunctionsLibrary;
import com.ankamagames.wakfu.client.core.script.fightLibrary.scriptedAction.WakfuScriptedActionFunctionsLibrary;
import org.apache.log4j.Logger;

public final class Kx
{
  private static final Logger K = Logger.getLogger(Kx.class);
  private final ckT aCI;
  private final Fe bXc;

  public Kx(ckT paramckT, Fe paramFe)
  {
    this.aCI = paramckT;
    this.bXc = paramFe;
  }

  public void execute() {
    if (this.aCI == null) {
      K.error("[FIGHT] On veut executer un sort sur un combat inconnu " + this.bXc.a());
      return;
    }

    Su localSu = this.aCI.dg(this.bXc.Iw());
    if (localSu == null) {
      return;
    }

    cew localcew = localSu.aeL();
    localcew.chh();

    apX localapX = t(localSu);

    if (localapX == null) {
      return;
    }

    bOJ.b(this.bXc.bQX(), this.bXc.eo(), this.bXc.a(), localSu);

    a(this.bXc.OG());
  }

  private apX t(Su paramSu)
  {
    dCi localdCi = paramSu.auK();
    apX localapX;
    if ((localdCi != null) && (localdCi.ajw() != null)) {
      localapX = (apX)localdCi.ajw().o(this.bXc.OG());
    } else {
      diM localdiM = new diM(paramSu);
      localapX = localdiM.e(this.bXc.OG());
    }
    return localapX;
  }

  private void a(aiZ paramaiZ) {
    bFa localbFa = new bFa(this.bXc.bQX(), this.bXc.ep().bJ(), this.bXc.eo(), this.bXc.a(), paramaiZ, this.bXc.Iy(), this.bXc.Iz(), this.bXc.Iw(), this.bXc.OH(), this.bXc.OI(), this.bXc.OJ());

    bvm localbvm = bnc.bxw().a(this.bXc.a(), localbFa);
    localbFa.c(new hQ[] { new WakfuScriptedActionFunctionsLibrary(localbvm), new ScriptedActionFunctionsLibrary(localbvm) });
  }
}