import com.ankamagames.framework.script.libraries.scriptedAction.ScriptedActionFunctionsLibrary;
import com.ankamagames.wakfu.client.core.script.fightLibrary.scriptedAction.WakfuScriptedActionFunctionsLibrary;

final class aHs extends dcW
{
  public boolean a(Fe paramFe)
  {
    Su localSu = (Su)((arl)this.kLP).eu(paramFe.Iw());
    if (localSu != null) {
      bOJ.b(paramFe.bQX(), paramFe.eo(), paramFe.a(), localSu);
    }
    b(paramFe);
    return false;
  }

  private void b(Fe paramFe) {
    bFa localbFa = new bFa(paramFe.bQX(), paramFe.ep().bJ(), paramFe.eo(), paramFe.a(), paramFe.OG(), paramFe.Iy(), paramFe.Iz(), paramFe.Iw(), paramFe.OH(), paramFe.OI(), paramFe.OJ());

    bvm localbvm = bnc.bxw().a(paramFe.a(), localbFa);
    localbFa.c(new hQ[] { new WakfuScriptedActionFunctionsLibrary(localbvm), new ScriptedActionFunctionsLibrary(localbvm) });
  }
}