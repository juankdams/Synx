package com.ankamagames.wakfu.client.core.script;

import aTj;
import ayg;
import bCO;
import bYE;
import bxT;
import byv;
import byz;
import cWS;
import cYk;
import cbQ;
import cfb;
import cof;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import cwO;
import dsg;
import java.util.List;
import org.keplerproject.luajava.LuaState;

public class AmbianceFunctionLibrary$SetEnvironmentParticleSystem extends dsg
{
  AmbianceFunctionLibrary$SetEnvironmentParticleSystem(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setEnvironmentAps";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("APS Id", null, bxT.gjb, false), new bYE("level", null, bxT.gjb, false) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    int j = Br(1);

    cbQ localcbQ = new cbQ();
    List localList = ayg.aJQ().bjr();

    byz localbyz = byv.bFN().bFO();
    int k = 0; for (int m = localList.size(); k < m; k++) {
      cfb localcfb = (cfb)localList.get(k);
      long l = bCO.cM(localcfb.getX(), localcfb.getY());
      if (!localcbQ.N(l)) {
        localcbQ.add(l);
        int n = localcfb.getX() * 18;
        int i1 = localcfb.getY() * 18;

        FreeParticleSystem localFreeParticleSystem = cof.cop().dC(i, j);
        localFreeParticleSystem.f(n, i1, cwO.V(n, i1, localbyz.ML().IB()));
        cWS.cKD().b(localFreeParticleSystem);
      }
    }
    ayg.aJQ().b(new aTj(i, j, localcbQ));
  }
}