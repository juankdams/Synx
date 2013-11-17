package com.ankamagames.baseImpl.graphics.script.function.world;

import bGT;
import bYE;
import bxT;
import dbL;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetPictoColor extends dsg
{
  private static final Logger K = Logger.getLogger(SetPictoColor.class);

  public SetPictoColor(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName() {
    return "setPictoColor";
  }

  public String getDescription()
  {
    return "Modifie la couleur d'un picto dans le monde selon ces coordonnées (en faisant un fondu)";
  }

  public bYE[] ce() {
    return new bYE[] { new bYE("x", null, bxT.gja, false), new bYE("y", null, bxT.gja, false), new bYE("z", null, bxT.gja, false), new bYE("r", null, bxT.gja, false), new bYE("g", null, bxT.gja, false), new bYE("b", null, bxT.gja, false), new bYE("alpha", null, bxT.gja, false), new bYE("time", null, bxT.gja, true) };
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
    int n = Br(4);
    int i1 = Br(5);
    int i2 = Br(6);
    if (paramInt == 8)
      bGT.bOB().a(l, m, n, i1, i2, Br(7));
    else
      bGT.bOB().a(l, m, n, i1, i2);
  }
}