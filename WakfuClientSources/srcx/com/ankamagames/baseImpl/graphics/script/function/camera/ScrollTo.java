package com.ankamagames.baseImpl.graphics.script.function.camera;

import aWe;
import aZs;
import bCF;
import bFB;
import bXf;
import bYE;
import bxT;
import cXf;
import com.ankamagames.baseImpl.graphics.script.CameraFunctionsLibrary;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;
import pG;
import pK;

public class ScrollTo extends dsg
{
  private static final Logger K = Logger.getLogger(ScrollTo.class);

  public ScrollTo(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "scrollTo";
  }

  public String getDescription()
  {
    return "Permet de définir la position de la caméra en effectuant un scrolling régulier";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("x", "Position x désirée", bxT.gjb, false), new bYE("y", "Position y désirée", bxT.gjb, false), new bYE("z", "Position z désirée", bxT.gjb, false), new bYE("function Name", "Fonction à appeler lorsque la caméra est arivé a destination", bxT.giZ, true), new bYE("function Params", "Paramètres de la fonction à appeler", bxT.gje, true) };
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
      localaWe.a(aZs.fgh);
      localaWe.a(new bCF(f1, f2, f3));
      localaWe.a(new pK(this, localaWe));

      if (paramInt > 3) {
        bXf localbXf = cYS();
        String str = Bv(3);
        bFB[] arrayOfbFB = eT(4, paramInt);
        localaWe.a(new pG(this, localaWe, localbXf, str, arrayOfbFB));
      }

    }
    else
    {
      a(K, "pas de camera associée à CameraFunctionsLibrary");
    }
  }
}