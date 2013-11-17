package com.ankamagames.wakfu.client.ui.script;

import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class PixmapFunctionsLibrary extends hQ
{
  private static final PixmapFunctionsLibrary grN = new PixmapFunctionsLibrary();

  public static PixmapFunctionsLibrary bJJ()
  {
    return grN;
  }

  public final String getName()
  {
    return "Pixmap";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new PixmapFunctionsLibrary.GetItemPath(paramLuaState, null) };
  }
}