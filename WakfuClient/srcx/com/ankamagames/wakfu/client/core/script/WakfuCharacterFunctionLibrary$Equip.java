package com.ankamagames.wakfu.client.core.script;

import ay;
import bQK;
import bYE;
import bdh;
import cUo;
import diq;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class WakfuCharacterFunctionLibrary$Equip extends dsg
{
  WakfuCharacterFunctionLibrary$Equip(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "equip";
  }

  public String getDescription()
  {
    return "Applique un équipement dans un slot sur un mobile";
  }

  public bYE[] ce()
  {
    return WakfuCharacterFunctionLibrary.XL();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    String str1 = Bv(1);

    String[] arrayOfString = new String[paramInt - 2];
    for (int i = 2; i < paramInt; i++) {
      arrayOfString[(i - 2)] = Bv(i);
    }

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null)
      try {
        String str2 = ay.bd().getString("ANMEquipmentPath");
        str2 = String.format(str2, new Object[] { str1 });
        localcUo.b(str2, diq.J(arrayOfString));
      } catch (bdh localbdh) {
        WakfuCharacterFunctionLibrary.aUd().error("Erreur au chargement d'une propriété", localbdh);
      }
    else
      a(WakfuCharacterFunctionLibrary.aUe(), "le mobile " + l + " n'existe pas ");
  }
}