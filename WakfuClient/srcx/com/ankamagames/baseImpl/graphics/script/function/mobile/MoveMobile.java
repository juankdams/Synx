package com.ankamagames.baseImpl.graphics.script.function.mobile;

import Nm;
import bFB;
import bQK;
import bXf;
import bYE;
import bxT;
import cGw;
import cUo;
import cfg;
import cuB;
import cwO;
import dMM;
import dqg;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class MoveMobile extends dsg
{
  private static final Logger K = Logger.getLogger(MoveMobile.class);

  private static final Nm cUD = new Nm();

  private static final cGw cUH = new cGw();
  private static final String NAME = "moveMobile";
  private static final bYE[] Rf;

  public MoveMobile(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "moveMobile";
  }

  public String getDescription()
  {
    return "Lance le déplacement d'un mobile de sa position courante vers une position donnée, en utilisant l'animation de marche.";
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
    long l = Bu(0);
    int i = Br(1);
    int j = Br(2);
    int k = Br(3);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null) {
      if ((localcUo instanceof dMM))
      {
        dMM localdMM = (dMM)localcUo;

        cwO.a(localcUo.fa(), localcUo.fb(), i, j, cUH);
        dqg localdqg = dqg.cXq();
        cUD.caA = (localdMM.cgR() != 8);
        localdqg.a(cUD);
        localdqg.a(localdMM.BC(), localdMM.afD(), localdMM.arG());
        localdqg.a(cUH);
        localdqg.ae(localcUo.fa(), localcUo.fb(), (short)(int)localcUo.getAltitude());
        localdqg.af(i, j, (short)k);
        localdqg.cXv();
        cuB localcuB = localdqg.coK();
        cUH.reset();

        if (localcuB.csX()) {
          localdMM.a(localcuB, true, true);
        }
        localdqg.release();

        if (paramInt > 4) {
          bXf localbXf = cYS();
          String str = Bv(4);
          bFB[] arrayOfbFB = eT(5, paramInt);
          localdMM.b(new cfg(this, localbXf, str, arrayOfbFB));
        }

      }
      else
      {
        a(K, "le mobile " + l + " n'est pas un PAthMobile ");
      }
    } else a(K, "le mobile " + l + " n'existe pas ");
  }

  static
  {
    cUD.caA = true;
    cUD.caB = 400;
    cUD.caF = false;

    Rf = new bYE[] { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("worldX", "Destination x", bxT.gja, false), new bYE("worldY", "Destination y", bxT.gja, false), new bYE("altitude", "Destination z", bxT.gja, false), new bYE("func", "Fonction à appeler une fois le mobile à destination", bxT.giZ, true), new bYE("params", "Paramètres de la fonction a appeler", bxT.gje, true) };
  }
}