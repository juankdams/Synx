package com.ankamagames.wakfu.client.core.script;

import CG;
import axB;
import bAF;
import bKm;
import bQK;
import bUM;
import bXf;
import bYE;
import byv;
import dHZ;
import dLw;
import dsg;
import org.keplerproject.luajava.LuaState;

public class WakfuCharacterFunctionLibrary$CreateActor extends dsg
{
  WakfuCharacterFunctionLibrary$CreateActor(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "createActor";
  }

  public String getDescription()
  {
    return "Ajoute un perso dans le monde. Attention le serveur ne connait pas cet actor.";
  }

  public bYE[] ce()
  {
    return WakfuCharacterFunctionLibrary.Xx();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
    String str = Bv(1);
    int i = Br(2);
    int j = Br(3);
    int k = Br(4);
    byte b1 = (byte)(paramInt >= 6 ? Br(5) : 8);

    int m = cYS().a();

    bUM localbUM = new bUM(this, l, m);

    localbUM.a(dHZ.lSN);

    byte b2 = 0;
    if ((str != null) && (str.length() > 0) && (str.charAt(str.length() - 1) == '1'))
    {
      b2 = 1;
    }

    localbUM.jz(str);
    localbUM.c(CG.bFG);
    localbUM.eq("AnimStatique");
    localbUM.k(i, j, k);
    localbUM.id(dLw.mbl.asR());
    if ((b1 != 4) && (b1 != 8)) {
      a(WakfuCharacterFunctionLibrary.gV(), "nombre de direction (" + b1 + ") inconnu, forcée à 8 ");
      localbUM.fR((byte)8);
    } else {
      localbUM.fR(b1);
    }

    if (paramInt >= 7) {
      bKm.a((short)Br(6), localbUM, b2);
    }

    byv.a(localbUM);
    axB.aIZ().i(localbUM);
    bQK.bXG().d(localbUM);
    cYS().aS(localbUM);
  }
}