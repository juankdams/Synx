package com.ankamagames.baseImpl.graphics.script.function.camera;

import aWe;
import bCF;
import bFB;
import bXf;
import bYE;
import bpK;
import bxT;
import cXf;
import com.ankamagames.baseImpl.graphics.script.CameraFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;
import rp;

public class SetCamera extends dsg
{
  private static final Logger K = Logger.getLogger(SetCamera.class);

  public SetCamera(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getDescription()
  {
    return "Positionne la caméra sur un point";
  }

  public String getName()
  {
    return "setCamera";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("zoomFactor", "Niveau de zoom désiré (entre 0.9 et 1.9)", bxT.gjb, false), new bYE("x", "Position x désirée", bxT.gjb, false), new bYE("y", "Position y désirée", bxT.gjb, false), new bYE("z", "Position z désirée", bxT.gjb, false), new bYE("funcName", "Fonction a appeler lorsque la caméra est centré sur le point", bxT.giZ, true), new bYE("funcParams", "Paramètres de la fonction a appeler", bxT.gje, true) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    float f1 = (float)Bs(0);
    float f2 = (float)Bs(1);
    float f3 = (float)Bs(2);
    float f4 = (float)Bs(3);

    cXf localcXf = CameraFunctionsLibrary.bvj().bvi();
    if (localcXf != null) {
      aWe localaWe = localcXf.cKV();
      localaWe.a(new bCF(f2, f3, f4));

      localaWe.B(f1);
      if (paramInt > 4) {
        bXf localbXf = cYS();
        String str = Bv(4);
        bFB[] arrayOfbFB = eT(5, paramInt);
        localaWe.a(new bpK(this, localaWe, localbXf, str, arrayOfbFB));
      }

    }
    else
    {
      a(K, "pas de camera associée à CameraFunctionsLibrary");
    }
  }
}