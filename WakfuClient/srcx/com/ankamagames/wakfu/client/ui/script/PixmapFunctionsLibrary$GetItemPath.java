package com.ankamagames.wakfu.client.ui.script;

import Hh;
import ay;
import bBn;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class PixmapFunctionsLibrary$GetItemPath extends dsg
{
  private PixmapFunctionsLibrary$GetItemPath(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getItemPath";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("id", null, bxT.gja, false) };
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("path", null, bxT.giZ, false) };
  }

  public void S(int paramInt)
  {
    bBn localbBn = Hh.QM().dh(Br(0));
    String str = ay.bd().v(localbBn.oc());

    pP(str);
  }
}