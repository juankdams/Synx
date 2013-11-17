import com.ankamagames.framework.script.libraries.scriptedAction.ScriptedActionFunctionsLibrary;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

final class ciP extends dcW
{
  private static final Logger gCU = Logger.getLogger(ciP.class);

  public boolean a(auB paramauB)
  {
    int i = paramauB.ep().bJ();

    uY localuY = (uY)bsj.bAv().kD(paramauB.Vc());
    if (localuY == null) {
      gCU.error("Impossible d'instancier un runningEffect :" + paramauB.Vc() + " inconnu");
      return false;
    }
    Object localObject;
    if ((paramauB.aGO() != null) && (!paramauB.aGO().isEmpty())) {
      for (localObject = paramauB.aGO().iterator(); ((Iterator)localObject).hasNext(); ) { cFc localcFc = (cFc)((Iterator)localObject).next();

        bWF localbWF = new bWF(paramauB.bQX(), i, paramauB.a(), ((Integer)localcFc.getFirst()).intValue(), localuY, paramauB.Vd(), paramauB.aGP(), (byte[])localcFc.cAE());
        localbWF.ua(((Integer)localcFc.Lp()).intValue());
        localbWF.cbE();

        bnc.bxw().a(paramauB.a(), localbWF);
        localbWF.c(new hQ[] { new ScriptedActionFunctionsLibrary(localbWF.bZv()) }); }
    }
    else
    {
      localObject = new bWF(paramauB.bQX(), i, paramauB.a(), paramauB.eo(), localuY, paramauB.Vd(), paramauB.aGP(), null);
      ((bWF)localObject).ua(paramauB.czG());
      ((bWF)localObject).cbE();

      bnc.bxw().a(paramauB.a(), (bSR)localObject);
      ((bWF)localObject).c(new hQ[] { new ScriptedActionFunctionsLibrary(((bWF)localObject).bZv()) });
    }

    return false;
  }
}