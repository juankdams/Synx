package com.ankamagames.baseImpl.graphics.script.function.particle;

import bYE;
import bxT;
import cWS;
import dsg;
import org.keplerproject.luajava.LuaState;

public class RemoveParticleSystem extends dsg
{
  private static final String NAME = "removeParticleSystem";
  private static final bYE[] Rf = { new bYE("particleUniqueId", "L'Id unique de l'APS", bxT.gja, false), new bYE("stopEmittersToKill", "Si true, les emetteurs seront coupés et le système ne sera supprimé que lorsqu'il n'y a plus de particules vivantes. Si false, détruit immédiatement.", bxT.gjc, true) };

  public RemoveParticleSystem(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeParticleSystem";
  }

  public String getDescription()
  {
    return "Détruit un systeme de particule existant";
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
    int i = Br(0);
    boolean bool = (paramInt >= 2) && (By(1));
    cWS.cKD().A(i, bool);
  }
}