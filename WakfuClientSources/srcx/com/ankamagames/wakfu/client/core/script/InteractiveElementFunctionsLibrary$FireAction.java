package com.ankamagames.wakfu.client.core.script;

import CA;
import Su;
import bVl;
import bYE;
import bxT;
import dJO;
import dWu;
import dsg;
import ob;
import org.keplerproject.luajava.LuaState;

class InteractiveElementFunctionsLibrary$FireAction extends dsg
{
  InteractiveElementFunctionsLibrary$FireAction(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "fireAction";
  }

  public String getDescription()
  {
    return "Execute une action pour un element interactif";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("interactiveElementId", "Id de l'element interactif", bxT.giY, false), new bYE("action", "Action à executer", bxT.giZ, false), new bYE("user", "Id unique du personnage", bxT.giY, false) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("executed", "Si l'action à bien été executé", bxT.gjc, false) };
  }

  protected void S(int paramInt)
  {
    long l1 = Bu(0);
    String str = Bv(1);
    long l2 = Bu(2);
    ob localob = bVl.caZ().hb(l1);
    try
    {
      Su localSu = CA.Lv().bj(l2);
      dJO localdJO = dJO.valueOf(str);
      boolean bool = localob.vK().b(localdJO, localSu);
      kl(bool);
      return;
    } catch (IllegalArgumentException localIllegalArgumentException) {
      a(InteractiveElementFunctionsLibrary.ch(), "type d'action inconnue " + str);

      cYR();
    }
  }
}