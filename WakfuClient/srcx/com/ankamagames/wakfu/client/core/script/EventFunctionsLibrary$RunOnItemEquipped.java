package com.ankamagames.wakfu.client.core.script;

import bFB;
import bXf;
import bYE;
import bhD;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;
import sR;

class EventFunctionsLibrary$RunOnItemEquipped extends dsg
{
  public EventFunctionsLibrary$RunOnItemEquipped(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "runOnItemEquipped";
  }

  public String getDescription()
  {
    return "Exécute la fonction passée en paramètre dès qu'un objet de referenceID donné est équippé. Le callback se désenregistre automatiquement une fois éxécuté.";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("itemReferenceId", "Reference Id a écouter", bxT.gja, false), new bYE("funcName", "Focntion à appeler", bxT.giZ, false), new bYE("params", "Paramètres de la fonction à appeler", bxT.gje, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    sR localsR = new sR(i);
    String str = Bv(1);
    bFB[] arrayOfbFB = eT(2, paramInt);
    bXf localbXf = cYS();
    bhD.btQ().a(localsR, localbXf, str, arrayOfbFB, true);
  }
}