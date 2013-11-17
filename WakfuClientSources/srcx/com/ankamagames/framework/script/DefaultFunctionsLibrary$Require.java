package com.ankamagames.framework.script;

import bYE;
import dlD;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$Require extends dsg
{
  DefaultFunctionsLibrary$Require(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "require";
  }

  public String getDescription()
  {
    return "Exécute le contenu du script passé en paramètre, et charge les fonctions qu'il contient. Toutes les fonctions contenues dans le script appelé peuvent donc maitnenant être utilisées telles qu'elles dans le script d'origine.";
  }

  public bYE[] ce()
  {
    return DefaultFunctionsLibrary.Xx();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    this.L.LdoFile(dlD.cTt().getPath() + i + dlD.cTt().getExtension());
  }
}