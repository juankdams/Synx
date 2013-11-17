package com.ankamagames.wakfu.client.core.script;

import aWe;
import bFB;
import bXf;
import bYE;
import bxT;
import byv;
import byz;
import cXf;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import dSz;
import dsg;
import dvl;
import org.keplerproject.luajava.LuaState;
import rp;

public class EventFunctionsLibrary$RunOnInstanceLoaded extends dsg
{
  public EventFunctionsLibrary$RunOnInstanceLoaded(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "runOnInstanceLoaded";
  }

  public String getDescription()
  {
    return "Exécute la fonction passée en paramètre dès que l'instance a fini de charger";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("funcName", "Nom de la fonction", bxT.giZ, false), new bYE("params", "Paramètres de la fonction", bxT.gje, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    dSz localdSz = WakfuClientInstance.awy().Dg();
    if (localdSz != null) {
      aWe localaWe = localdSz.cKV();
      localaWe.a(byv.bFN().bFO().aeL());

      bXf localbXf = cYS();
      String str = Bv(0);
      bFB[] arrayOfbFB = eT(1, paramInt);

      boolean bool = localbXf.a(str, arrayOfbFB);

      localaWe.a(localaWe.xZ());
      localaWe.a(new dvl(this, localaWe, bool, localbXf, str, arrayOfbFB));
    }
    else
    {
      a(EventFunctionsLibrary.ch(), "pas de scene");
    }
  }
}