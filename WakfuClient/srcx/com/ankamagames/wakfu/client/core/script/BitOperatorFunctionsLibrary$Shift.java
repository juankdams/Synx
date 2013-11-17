package com.ankamagames.wakfu.client.core.script;

import bYE;
import bxT;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class BitOperatorFunctionsLibrary$Shift extends dsg
{
  BitOperatorFunctionsLibrary$Shift(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "Shift";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("number", bxT.giY, false), new bYE("direction (>>, <<, >>>)", bxT.giZ, false), new bYE("shift", bxT.gja, false) };
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("number", bxT.giY, false) };
  }

  public void S(int paramInt)
  {
    if (paramInt != 3) {
      BitOperatorFunctionsLibrary.ch().error("nombre de paramètres incorrect");
    } else {
      long l = Bu(0);
      String str = Bv(1);
      int i = Br(2);
      if (str.equals("<<"))
        l <<= i;
      else if (str.equals(">>"))
        l >>= i;
      else if (str.equals(">>>")) {
        l >>>= i;
      }
      kg(l);
    }
  }
}