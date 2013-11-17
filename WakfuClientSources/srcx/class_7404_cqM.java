import com.ankamagames.framework.script.libraries.scriptedAction.ScriptedActionFunctionsLibrary;

final class cqM extends dcW
{
  public boolean a(dbg paramdbg)
  {
    int i = paramdbg.ep().bJ();
    aAZ localaAZ = new aAZ(paramdbg.bQX(), i, paramdbg.eo(), paramdbg.a(), paramdbg.cMW(), paramdbg.cMY());
    localaAZ.fE(paramdbg.cMX());
    localaAZ.O(paramdbg.gA());

    bvm localbvm = bnc.bxw().a((arl)this.kLP, localaAZ);
    localaAZ.c(new hQ[] { new ScriptedActionFunctionsLibrary(localbvm) });

    return false;
  }
}