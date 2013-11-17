package com.ankamagames.baseImpl.graphics.script.function.camera;

import aWe;
import bCF;
import bFB;
import bSl;
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

public class ZoomOn extends dsg
{
  private static final Logger K = Logger.getLogger(ZoomOn.class);

  public ZoomOn(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getDescription()
  {
    return "Zoom sur un point pendant un certain temps puis revient à sa position d'origine";
  }

  public String getName()
  {
    return "zoomOn";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("zoomFactor", "Niveau de zoom de la caméra (compris entre 0.9 et 1.9)", bxT.gjb, false), new bYE("time", "Temps au bout duquel la caméra devra revenir à sa position d'origine", bxT.gja, false), new bYE("x", "Position x", bxT.gjb, false), new bYE("y", "Position y", bxT.gjb, false), new bYE("z", "Position z", bxT.gjb, false) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    float f1 = Bt(0);
    int i = Br(1);
    float f2 = Bt(2);
    float f3 = Bt(3);
    float f4 = Bt(4);

    cXf localcXf = CameraFunctionsLibrary.bvj().bvi();
    if (localcXf != null) {
      aWe localaWe = localcXf.cKV();

      bSl localbSl = localaWe.xZ();
      float f5 = localbSl.getWorldX();
      float f6 = localbSl.getWorldY();
      float f7 = localbSl.getAltitude();
      float f8 = localaWe.getZoomFactor();

      localaWe.a(new bCF(f2, f3, f4));

      localcXf.B(f1);

      bXf localbXf = cYS();
      if ((localbSl instanceof cUo)) {
        long l = ((cUo)localbSl).getId();

        bFB[] arrayOfbFB2 = { new bFB(Long.valueOf(l)) };
        localbXf.a(i, 1, "attachCameraToMobile", arrayOfbFB2);

        bFB[] arrayOfbFB3 = { new bFB(Float.valueOf(f8)) };
        localbXf.a(i, 1, "setZoomFactor", arrayOfbFB3);
      } else {
        bFB[] arrayOfbFB1 = new bFB[4];
        arrayOfbFB1[0] = new bFB(Float.valueOf(f8));
        arrayOfbFB1[1] = new bFB(Float.valueOf(f5));
        arrayOfbFB1[2] = new bFB(Float.valueOf(f6));
        arrayOfbFB1[3] = new bFB(Float.valueOf(f7));
        localbXf.a(i, 1, "SetCamera", arrayOfbFB1);
      }
    } else {
      a(K, "pas de camera associée à CameraFunctionsLibrary");
    }
  }
}