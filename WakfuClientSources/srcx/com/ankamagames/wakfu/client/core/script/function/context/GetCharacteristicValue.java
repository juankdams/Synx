package com.ankamagames.wakfu.client.core.script.function.context;

import CA;
import Su;
import bYE;
import bxT;
import dsg;
import eu;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class GetCharacteristicValue extends dsg
{
  private static final Logger K = Logger.getLogger(GetCharacteristicValue.class);

  public GetCharacteristicValue(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getCharacteristicValue";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("characterId", null, bxT.giY, false), new bYE("charac", null, bxT.giZ, false) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("characValue", null, bxT.giY, false) };
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    String str = Bv(1);

    Su localSu = CA.Lv().bj(l);
    if (localSu == null) {
      K.error("On veut recup la valeur d'une charac sur un perso qui n'existe pas  :" + l);
      cYR();
      return;
    }
    if (!localSu.b(eu.valueOf(str))) {
      K.error("On veut recup la valeur d'une charac qu'un perso ne possede pas : " + str);
      cYR();
      return;
    }
    Bz(localSu.e(eu.valueOf(str)));
  }
}