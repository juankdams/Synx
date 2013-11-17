package com.ankamagames.baseImpl.graphics.script;

import bGL;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class LightFunctionsLibrary$SetPointLightColor extends dsg
{
  LightFunctionsLibrary$SetPointLightColor(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setPointLightColor";
  }

  public String getDescription()
  {
    return "Change la couleur d'une lumière ponctuelle";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("lightId", "Id de la lumière", bxT.gja, false), new bYE("red", "Teinte de rouge", bxT.gjb, false), new bYE("green", "Teinte de vert", bxT.gjb, false), new bYE("blue", "Teinte de bleu", bxT.gjb, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    bGL localbGL = LightFunctionsLibrary.to(Br(0));
    if (localbGL != null)
    {
      localbGL.r(Bt(1), Bt(2), Bt(3));
    }
    else a(LightFunctionsLibrary.gV(), "La lumière n'existe pas");
  }
}