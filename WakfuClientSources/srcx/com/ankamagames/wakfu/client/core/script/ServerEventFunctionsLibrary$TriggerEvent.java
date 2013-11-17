package com.ankamagames.wakfu.client.core.script;

import bYE;
import bxT;
import byv;
import cyx;
import dIH;
import dsg;
import org.keplerproject.luajava.LuaState;

class ServerEventFunctionsLibrary$TriggerEvent extends dsg
{
  ServerEventFunctionsLibrary$TriggerEvent(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "triggerEvent";
  }

  public String getDescription()
  {
    return "Envoie un événement destiné à déclencher une action coté serveur";
  }

  public bYE[] ce()
  {
    bYE[] arrayOfbYE = new bYE[1];
    arrayOfbYE[0] = new bYE("Id de l'évènement", "Id de l'évènement, utilisé comme filtre côté serveur", bxT.gja, false);
    return arrayOfbYE;
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    dIH localdIH = new dIH();
    localdIH.cb(i);
    byv.bFN().aJK().d(localdIH);
  }
}