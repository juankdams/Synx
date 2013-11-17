package com.ankamagames.framework.script;

import bYE;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$Import extends dsg
{
  DefaultFunctionsLibrary$Import(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "import";
  }

  public String getDescription()
  {
    return "Met à disposition toutes les fonctions contenues dans une librairie Java donnée";
  }

  public bYE[] ce()
  {
    return DefaultFunctionsLibrary.Er();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    DefaultFunctionsLibrary.aiN().warn("'import' ne devrait plus être appelé");
  }
}