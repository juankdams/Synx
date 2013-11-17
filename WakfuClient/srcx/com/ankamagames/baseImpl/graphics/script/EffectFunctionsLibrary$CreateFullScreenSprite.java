package com.ankamagames.baseImpl.graphics.script;

import Pb;
import bKZ;
import bYE;
import bdp;
import bhQ;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class EffectFunctionsLibrary$CreateFullScreenSprite extends dsg
{
  EffectFunctionsLibrary$CreateFullScreenSprite(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "createFullScreenSprite";
  }

  public String getDescription()
  {
    return "Affiche une image remplissant complètement l'écran";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("startDuration", "Temps pendant lequel la transparence augmente progressivement (en ms)", bxT.gjb, true), new bYE("midDuration", "Durée de l'effet à la transparence max (en ms)", bxT.gjb, true), new bYE("endDuration", "Temps pendant lequel la transparence diminue progressivement (en ms)", bxT.gjb, true), new bYE("red", "Teinte rouge (entre 0 et 1)", bxT.gjb, true), new bYE("green", "Teinte verte (entre 0 et 1)", bxT.gjb, true), new bYE("blue", "Teinte bleue (entre 0 et 1)", bxT.gjb, true), new bYE("alpha", "Transparence de l'image", bxT.gjb, true), new bYE("textureFileName", "Fichier de l'image à afficher", bxT.giZ, true) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("effectId", "L'id de l'effet", bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    int i = 1000;
    int j = 2000;
    int k = 1000;
    float f1 = 1.0F;
    float f2 = 1.0F;
    float f3 = 1.0F;
    float f4 = 1.0F;
    String str = null;

    if (paramInt >= 1) {
      i = (int)Bs(0);
    }
    if (paramInt >= 2) {
      j = (int)Bs(1);
    }
    if (paramInt >= 3) {
      k = (int)Bs(2);
    }
    if (paramInt >= 4) {
      f1 = (float)Bs(3);
    }
    if (paramInt >= 5) {
      f2 = (float)Bs(4);
    }
    if (paramInt >= 6) {
      f3 = (float)Bs(5);
    }
    if (paramInt >= 7) {
      f4 = (float)Bs(6);
    }
    if (paramInt >= 8) {
      str = Bv(7);
    }

    bdp localbdp = new bdp();
    localbdp.dF(str);
    localbdp.setColor(f1, f2, f3, f4);
    if (j < 0)
      localbdp.e(new bhQ(i));
    else {
      localbdp.e(new bKZ(i, j, k));
    }

    Pb.aaU().a(localbdp);
    Bz(localbdp.getId());
  }
}