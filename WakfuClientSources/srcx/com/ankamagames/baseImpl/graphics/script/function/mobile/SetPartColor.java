package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetPartColor extends dsg
{
  private static final Logger K = Logger.getLogger(SetPartColor.class);
  private static final String NAME = "setPartColor";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false), new bYE("partName", null, bxT.giZ, false), new bYE("red", null, bxT.gjb, false), new bYE("green", null, bxT.gjb, false), new bYE("blue", null, bxT.gjb, false), new bYE("alpha", null, bxT.gjb, false) };

  public SetPartColor(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setPartColor";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
    String str = Bv(1);

    float f1 = (float)Bs(2);
    float f2 = (float)Bs(3);
    float f3 = (float)Bs(4);
    float f4 = (float)Bs(5);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null) {
      int i = Anm.B(str);
      if (i == 0) {
        a(K, "partName invalid " + str);
        return;
      }
      localcUo.e(i, new float[] { f1, f2, f3, f4 });
    }
    else {
      a(K, "le mobile " + l + " n'existe pas ");
    }
  }
}