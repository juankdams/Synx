package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import byv;
import byz;
import cWS;
import cYk;
import cof;
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import cth;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class AddParticleCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (paramArrayList.size() == 3)
      try {
        int i = 0;
        String str = (String)paramArrayList.get(2);
        if (str.startsWith("@")) {
          str = str.substring(1);
          i = 1;
        }
        int j = Integer.valueOf(str).intValue();
        Object localObject1;
        Object localObject2;
        if (i != 0) {
          localObject1 = cof.cop().vY(j);
          localObject2 = byv.bFN().bFO();
          ((FreeParticleSystem)localObject1).b(((byz)localObject2).aeL());
          cWS.cKD().b((IsoParticleSystem)localObject1);
        } else {
          localObject1 = cof.cop().vZ(j);
          localObject2 = byv.bFN().bFO().ML();
          ((CellParticleSystem)localObject1).f(((cYk)localObject2).getX(), ((cYk)localObject2).getY(), ((cYk)localObject2).IB());
          cWS.cKD().b((IsoParticleSystem)localObject1);
        }
      }
      catch (Exception localException)
      {
        Logger.getLogger(AddParticleCommand.class).error("Impossible d'ajouter la particule " + (String)paramArrayList.get(1), localException);
      }
  }

  public boolean X()
  {
    return false;
  }
}