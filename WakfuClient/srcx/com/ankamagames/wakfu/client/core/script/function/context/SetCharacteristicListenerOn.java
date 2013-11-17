package com.ankamagames.wakfu.client.core.script.function.context;

import CA;
import Dz;
import Rx;
import Su;
import bYE;
import bxT;
import dsg;
import eu;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class SetCharacteristicListenerOn extends dsg
{
  private static final Logger K = Logger.getLogger(SetCharacteristicListenerOn.class);

  public SetCharacteristicListenerOn(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setCharacteristicListenerOn";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("characterId", null, bxT.giY, false), new bYE("charac", null, bxT.giZ, false), new bYE("functionOnUpdate", null, bxT.giZ, false), new bYE("décharger a la premiere utilisation", null, bxT.gjc, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    String str1 = Bv(1);
    String str2 = Bv(2);
    boolean bool = By(3);

    Su localSu = CA.Lv().bj(l);
    if (localSu == null) {
      K.error("On veut ajouter un listener sur un perso qui n'existe pas  :" + l);
      return;
    }
    if (!localSu.b(eu.valueOf(str1))) {
      K.error("On veut ajouter un listener a une charac qu'un perso ne possede pas : " + str1);
      return;
    }
    Rx localRx = localSu.d(eu.valueOf(str1));
    localRx.a(new Dz(this, str2, bool, localRx));
  }
}