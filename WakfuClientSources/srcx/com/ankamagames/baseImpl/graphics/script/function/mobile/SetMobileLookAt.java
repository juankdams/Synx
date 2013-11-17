package com.ankamagames.baseImpl.graphics.script.function.mobile;

import CG;
import La;
import bQK;
import bYE;
import bxT;
import cUo;
import dMM;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobileLookAt extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileLookAt.class);
  private static final String NAME = "setMobileLookAt";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("worldX", "Position x", bxT.gja, false), new bYE("worldY", "Position y", bxT.gja, false), new bYE("isHeightDirections", "Si true dirige le perso dans un monde a 8 directions, sinon à 4", bxT.gjc, true) };

  private static final bYE[] Vt = { new bYE("directionIndex", "Index de la nouvelle direction du personnage", bxT.gja, false) };

  public SetMobileLookAt(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileLookAt";
  }

  public String getDescription()
  {
    return "Oriente un mobile pour qu'il puisse regarder un point donné de l'espace";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public final bYE[] cf()
  {
    return Vt;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo == null) {
      a(K, "le mobile " + l + " n'existe pas ");
      cYR();
      return;
    }
    int i = Br(1);
    int j = Br(2);
    boolean bool = paramInt >= 4 ? By(3) : i(localcUo);

    int k = i - localcUo.fa();
    int m = j - localcUo.fb();

    CG localCG = localcUo.E();

    if ((bool) && ((k != 0) || (m != 0)))
      localCG = La.l(k, m);
    else if (!bool) {
      localCG = new La(k, m, 0).Vy();
    }
    if (localCG != CG.bFP) {
      localcUo.c(localCG);
    }
    Bz(localCG.m_index);
  }

  private static boolean i(cUo paramcUo) {
    if ((paramcUo instanceof dMM))
      return ((dMM)paramcUo).cgR() == 8;
    return false;
  }
}