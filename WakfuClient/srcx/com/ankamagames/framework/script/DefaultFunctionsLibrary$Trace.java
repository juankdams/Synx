package com.ankamagames.framework.script;

import bYE;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$Trace extends dsg
{
  DefaultFunctionsLibrary$Trace(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "trace";
  }

  public String getDescription()
  {
    return "Affiche du texte dans la console de debuggage. Si on donne plusieurs valeurs, elle seront séparées par une virgule.";
  }

  public final bYE[] ce()
  {
    return DefaultFunctionsLibrary.brF();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public final void S(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder("[ligne: " + getLineNumber() + ']');
    for (int i = 0; i < paramInt; i++) {
      String str = Bx(i);
      localStringBuilder.append(", ").append(str != null ? str : null);
    }
    DefaultFunctionsLibrary.aiN().info(localStringBuilder.toString());
  }
}