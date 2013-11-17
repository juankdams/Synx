package com.ankamagames.baseImpl.graphics.script.function.world;

import bGT;
import bYE;
import bxT;
import dbL;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetPictoAlpha extends dsg
{
  private static final Logger K = Logger.getLogger(SetPictoAlpha.class);

  public SetPictoAlpha(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName() {
    return "setPictoAlpha";
  }

  public String getDescription()
  {
    return "Modifie l'alpha d'un picto dans le monde selon ces coordonnées (en faisant un fondu)";
  }

  public bYE[] ce() {
    return new bYE[] { new bYE("x", null, bxT.gja, false), new bYE("y", null, bxT.gja, false), new bYE("z", null, bxT.gja, false), new bYE("alpha", null, bxT.gja, false), new bYE("time", null, bxT.gja, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt) {
    int i = Br(0);
    int j = Br(1);
    int k = Br(2);
    long l = dbL.ac(i, j, k);
    int m = Br(3);
    if (paramInt == 5)
      bGT.bOB().a(l, 1.0F, 1.0F, 1.0F, m, Br(4));
    else
      bGT.bOB().a(l, 1.0F, 1.0F, 1.0F, m);
  }
}