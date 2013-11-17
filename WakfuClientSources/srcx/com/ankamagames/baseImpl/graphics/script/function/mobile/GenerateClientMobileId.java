package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bYE;
import bxT;
import dsE;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class GenerateClientMobileId extends dsg
{
  private static final Logger K = Logger.getLogger(GenerateClientMobileId.class);
  private static final String NAME = "generateClientMobileId";
  private static final bYE[] Rf = new bYE[0];
  private static final bYE[] bxk = { new bYE("mobileId", "Id unique", bxT.giY, false) };

  public GenerateClientMobileId(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "generateClientMobileId";
  }

  public String getDescription()
  {
    return "Génère un id unique pour créer un mobile";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public final bYE[] cf()
  {
    return bxk;
  }

  public void S(int paramInt)
  {
    kg(dsE.cYX());
  }
}