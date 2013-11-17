package com.ankamagames.wakfu.client.core.script;

import YF;
import bAF;
import bFB;
import bQK;
import bXf;
import bYE;
import cUo;
import dsg;
import org.keplerproject.luajava.LuaState;

public class WakfuCharacterFunctionLibrary$ChangeSkin extends dsg
{
  WakfuCharacterFunctionLibrary$ChangeSkin(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "changeSkin";
  }

  public String getDescription()
  {
    return "Change le skin du mobile";
  }

  public bYE[] ce()
  {
    return WakfuCharacterFunctionLibrary.XJ();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    String str1 = Bv(1);

    cUo localcUo = bQK.bXG().gY(l);
    if ((localcUo instanceof bAF)) {
      bAF localbAF = (bAF)localcUo;
      localbAF.jz(str1);

      if (paramInt > 2) {
        bXf localbXf = cYS();
        String str2 = Bv(2);
        bFB[] arrayOfbFB = eT(3, paramInt);

        boolean bool = localbXf.a(str2, arrayOfbFB);

        localcUo.c(new YF(this, bool, localbXf, str2, arrayOfbFB));
      }

    }
    else
    {
      a(WakfuCharacterFunctionLibrary.SR(), "le mobile " + l + " n'existe pas ");
    }
  }
}