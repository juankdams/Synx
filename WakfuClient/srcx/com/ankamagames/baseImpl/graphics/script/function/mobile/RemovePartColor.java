package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import dR;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class RemovePartColor extends dsg
{
  private static final Logger K = Logger.getLogger(RemovePartColor.class);
  private static final String NAME = "removePartColor";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false), new bYE("partName", null, bxT.giZ, false) };

  public RemovePartColor(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "removePartColor";
  }

  public bYE[] ce() {
    return Rf;
  }

  public bYE[] cf() {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    String str = Bv(1);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null) {
      int i = Anm.B(str);
      if (i == 0) {
        a(K, "partName invalid " + str);
        return;
      }
      localcUo.aty().ax(i);
    }
    else {
      a(K, "le mobile " + l + " n'existe pas ");
    }
  }
}