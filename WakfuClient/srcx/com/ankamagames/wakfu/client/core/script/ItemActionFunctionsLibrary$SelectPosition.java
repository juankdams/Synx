package com.ankamagames.wakfu.client.core.script;

import bFB;
import bXf;
import bYE;
import bgy;
import bxT;
import byv;
import dCU;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class ItemActionFunctionsLibrary$SelectPosition extends dsg
{
  ItemActionFunctionsLibrary$SelectPosition(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "selectPosition";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("funcName", null, bxT.giZ, false), new bYE("funcParams", null, bxT.gje, true) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    String str = Bv(0);
    bFB[] arrayOfbFB1 = eT(1, paramInt);
    bXf localbXf = cYS();

    int i = arrayOfbFB1 != null ? arrayOfbFB1.length : 0;
    bFB[] arrayOfbFB2 = new bFB[i + 4];
    if (i != 0) {
      System.arraycopy(arrayOfbFB1, 0, arrayOfbFB2, 4, arrayOfbFB1.length);
    }

    if (byv.bFN().c(bgy.bte())) {
      byv.bFN().b(bgy.bte());
    }

    if (!localbXf.a(str, arrayOfbFB2)) {
      ItemActionFunctionsLibrary.an().error("Tentative d'enregistrement d'une WaitingTask dans un script alors qu'il y en a déjà une", new UnsupportedOperationException());
      localbXf.ccB();
      return;
    }

    bgy.bte().cJ((byte)1);
    bgy.bte().a(new dCU(this, arrayOfbFB2, localbXf));

    byv.bFN().a(bgy.bte());
  }
}