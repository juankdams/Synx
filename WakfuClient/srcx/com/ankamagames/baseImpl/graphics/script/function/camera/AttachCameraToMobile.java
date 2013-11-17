package com.ankamagames.baseImpl.graphics.script.function.camera;

import aBb;
import aWe;
import bFB;
import bQK;
import bXf;
import bYE;
import bxT;
import cUo;
import cXf;
import com.ankamagames.baseImpl.graphics.script.CameraFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;
import rp;

public class AttachCameraToMobile extends dsg
{
  private static final Logger K = Logger.getLogger(AttachCameraToMobile.class);
  private static final boolean DEBUG = true;

  public AttachCameraToMobile(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "attachCameraToMobile";
  }

  public String getDescription()
  {
    return "Attache la caméra à un mobile. Quand le mobile se déplace, la caméra continue de le suivre.";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("mobileId", "id du mobile à suivre", bxT.giY, false), new bYE("funcName", "Fonction à appeler lorsque la caméra est centrée sur le mobile", bxT.giZ, true), new bYE("funcParams", "Paramètres de la fonction appelée", bxT.gje, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null) {
      cXf localcXf = CameraFunctionsLibrary.bvj().bvi();
      if (localcXf != null) {
        aWe localaWe = localcXf.cKV();
        localaWe.a(localcUo);

        if (paramInt > 1) {
          bXf localbXf = cYS();
          String str = Bv(1);
          bFB[] arrayOfbFB = eT(2, paramInt);
          localaWe.a(new aBb(this, localaWe, localbXf, str, arrayOfbFB));
        }

      }
      else
      {
        a(K, "pas de camera associée à CameraFunctionsLibrary");
      }
    } else {
      a(K, "mobile inconnu " + l);
    }
  }
}