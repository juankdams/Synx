package com.ankamagames.wakfu.client.core.script;

import bQK;
import bYE;
import cUo;
import diq;
import dsg;
import org.keplerproject.luajava.LuaState;

class WakfuCharacterFunctionLibrary$ApplyParts extends dsg
{
  WakfuCharacterFunctionLibrary$ApplyParts(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setPart";
  }

  public String getDescription()
  {
    return "Positionne une portion d'un anm dans l'anm courant";
  }

  public bYE[] ce()
  {
    return WakfuCharacterFunctionLibrary.XH();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    String str = Bv(1);

    String[] arrayOfString = new String[paramInt - 2];
    for (int i = 2; i < paramInt; i++) {
      arrayOfString[(i - 2)] = Bv(i);
    }

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null)
      localcUo.b(str, diq.J(arrayOfString));
    else
      a(WakfuCharacterFunctionLibrary.asB(), "le mobile " + l + " n'existe pas ");
  }
}