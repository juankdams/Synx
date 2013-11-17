package com.ankamagames.baseImpl.graphics.script;

import bCF;
import bGL;
import bSj;
import bYE;
import btL;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class LightFunctionsLibrary$AddPointLight extends dsg
{
  LightFunctionsLibrary$AddPointLight(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addPointLight";
  }

  public String getDescription()
  {
    return "Ajoute une lumiere ponctuelle";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("posX", "Position x", bxT.gjb, false), new bYE("posY", "Position y", bxT.gjb, false), new bYE("posZ", "Position z", bxT.gjb, false), new bYE("red", "Teinte de rouge", bxT.gjb, false), new bYE("green", "Teinte de vert", bxT.gjb, false), new bYE("blue", "Teinte de bleu", bxT.gjb, false), new bYE("radius", "Rayon de lumière", bxT.gjb, true) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("lightId", "Id de la lumière", bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    bGL localbGL = (bGL)bSj.hcO.y();
    localbGL.b(new bCF(Bt(0), Bt(1), Bt(2)));

    localbGL.q(Bt(3), Bt(4), Bt(5));
    if (paramInt == 7) {
      localbGL.aG(Bt(6));
    }
    btL.gcv.a(localbGL);
    int i = LightFunctionsLibrary.bUn();
    LightFunctionsLibrary.b(i, localbGL);
    Bz(i);
  }
}