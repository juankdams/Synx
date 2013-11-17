package com.ankamagames.wakfu.client.alea.graphics.particle;

import Su;
import UG;
import arl;
import bSl;
import byv;
import byz;
import cew;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import dmM;

public class WakfuFreeParticleSystem extends FreeParticleSystem
{
  public WakfuFreeParticleSystem(boolean paramBoolean)
  {
    super(paramBoolean);
  }

  public boolean isVisible()
  {
    arl localarl;
    try {
      byz localbyz = byv.bFN().bFO();
      if (localbyz == null)
        return true;
      localarl = localbyz.bGv();
    } catch (Exception localException) {
      return super.isVisible();
    }
    int i = a();
    if ((localarl != null) && 
      (localarl.getId() != i) && (localarl.LB().aq(fa(), fb())))
    {
      return false;
    }

    if (i != -1) {
      bSl localbSl = Gu();
      Su localSu = null;
      if ((localbSl instanceof Su))
        localSu = (Su)localbSl;
      else if ((localbSl instanceof cew)) {
        localSu = ((cew)localbSl).cbD();
      }
      if (localSu != null) {
        boolean bool = localSu.byd();
        if (bool) {
          return false;
        }
      }
      return dmM.cUe().AN(i);
    }

    return super.isVisible();
  }
}