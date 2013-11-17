package com.ankamagames.wakfu.client.core.script.fightLibrary.fightActionGroupFunctionLibrary;

import CA;
import Su;
import aRK;
import arl;
import bFB;
import bXf;
import bYE;
import bnc;
import bxT;
import dPD;
import dqt;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class AddActionToPendingGroup extends dsg
{
  private static final Logger K = Logger.getLogger(AddActionToPendingGroup.class);
  private static final String NAME = "addActionToPendingGroup";
  private static final String Vu = "Permet d'ajouter une action au groupe d'actions du combat du joueur et qui va executer la fonction passée en paramètre sur une certaine durée";
  private static final bYE[] Rf = { new bYE("fighterId", null, bxT.giY, false), new bYE("actionDuration", null, bxT.giY, false), new bYE("functionName", null, bxT.giZ, false), new bYE("functionParams", null, bxT.gje, true) };

  AddActionToPendingGroup(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addActionToPendingGroup";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l1 = Bu(0);
    long l2 = Bu(1);
    String str = Bv(2);
    bFB[] arrayOfbFB = eT(3, paramInt);
    bXf localbXf = cYS();
    Su localSu = CA.Lv().bj(l1);
    if (localSu == null) {
      K.warn("Impossible d'executer la fonction, Fighter inconnu : " + l1);
      return;
    }

    arl localarl = localSu.aeQ();
    if (localarl == null) {
      K.warn("Impossible d'executer la fonction, le fighter n'est pas en combat " + l1);
      return;
    }

    aRK localaRK = new aRK(this, dqt.cXz(), dPD.mik.bJ(), 0, localbXf, str, arrayOfbFB, l2);

    bnc.bxw().a(localarl, localaRK);
    bnc.bxw().d(localarl);
  }

  public String getDescription()
  {
    return "Permet d'ajouter une action au groupe d'actions du combat du joueur et qui va executer la fonction passée en paramètre sur une certaine durée";
  }
}