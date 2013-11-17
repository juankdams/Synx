package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetPartColorByte extends dsg
{
  private static final Logger K = Logger.getLogger(SetPartColorByte.class);
  private static final String NAME = "setPartColorByte";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false), new bYE("partName", null, bxT.giZ, false), new bYE("red", null, bxT.gja, false), new bYE("green", null, bxT.gja, false), new bYE("blue", null, bxT.gja, false), new bYE("alpha", null, bxT.gja, false) };

  public SetPartColorByte(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setPartColorByte";
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

    float f1 = Br(2) / 255.0F;
    float f2 = Br(3) / 255.0F;
    float f3 = Br(4) / 255.0F;
    float f4 = Br(5) / 255.0F;

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