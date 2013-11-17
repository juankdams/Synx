package com.ankamagames.baseImpl.graphics.script.function.camera;

import aWe;
import bCF;
import bFB;
import bXf;
import bYE;
import bxT;
import cXf;
import com.ankamagames.baseImpl.graphics.script.CameraFunctionsLibrary;
import dST;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetWorldTarget extends dsg
{
  private static final Logger K = Logger.getLogger(SetWorldTarget.class);

  public SetWorldTarget(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setWorldTarget";
  }

  public String getDescription()
  {
    return "permet de définir la position de la caméra";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("coordX", "Position x", bxT.gjb, false), new bYE("coordY", "Position y", bxT.gjb, false), new bYE("altitude", "Position z", bxT.gjb, false), new bYE("funcName", "Fonction a appeler lorsque la caméra est centré", bxT.giZ, true), new bYE("funcParams", "Paramètres de la fonction a appeler", bxT.gje, true) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    float f1 = Bt(0);
    float f2 = Bt(1);
    float f3 = Bt(2);

    cXf localcXf = CameraFunctionsLibrary.bvj().bvi();
    if (localcXf != null) {
      aWe localaWe = localcXf.cKV();
      localaWe.a(new bCF(f1, f2, f3));

      if (paramInt > 3) {
        bXf localbXf = cYS();
        String str = Bv(3);
        bFB[] arrayOfbFB = eT(4, paramInt);
        localaWe.a(new dST(this, localaWe, localbXf, str, arrayOfbFB));
      }

    }
    else
    {
      a(K, "pas de camera associée à CameraFunctionsLibrary");
    }
  }
}