package com.ankamagames.baseImpl.graphics.script.function.particle;

import ZP;
import bXf;
import bYE;
import bxT;
import cWS;
import cnj;
import cof;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import dsg;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

public class AddTweenParticleSystem extends dsg
{
  private static final String NAME = "addTweenParticleSystem";
  private static final bYE[] Rf = { new bYE("particleFileId", "Id du systeme", bxT.gja, false), new bYE("startX", "Position de depart x", bxT.gja, false), new bYE("startY", "Position de depart y", bxT.gja, false), new bYE("startZ", "Position de depart z", bxT.gja, false), new bYE("destX", "Position de destination x", bxT.gja, false), new bYE("destY", "Position de destination y", bxT.gja, false), new bYE("destZ", "Position de destination z", bxT.gja, false), new bYE("angle", "Angle de la courbure que le système suivra pour aller d'un point à l'autre", bxT.gja, false), new bYE("type", "Inutilisé (laisser à 1)", bxT.gja, false), new bYE("timeCoef", "Valeur permettant d'accelerer ou de ralentir le déplacement", bxT.gjb, true), new bYE("level", "Niveau du systeme", bxT.gja, true) };

  private static final bYE[] bxk = { new bYE("systemId", "Id unique du systeme", bxT.gja, false), new bYE("movementDuration", "Temps en ms que mettra le déplacement", bxT.gja, false) };

  public AddTweenParticleSystem(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addTweenParticleSystem";
  }

  public String getDescription()
  {
    return "Ajoute un système de particules en le faisant se déplacer entre deux points du monde. Attention, plus l'angle est faible plus le chemin est court, et donc plus le système aura tendance à aller vite.";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public final bYE[] cf()
  {
    return bxk;
  }

  public void S(int paramInt)
  {
    LuaObject localLuaObject = cYS().getLuaState().getLuaObject("fightId");
    int i = -1;
    if (localLuaObject.isNumber()) {
      i = (int)localLuaObject.getNumber();
      if (!cof.cop().wa(i)) {
        Bz(0);
        Bz(0);
        return;
      }
    }

    int j = Br(0);
    int k = Br(1);
    int m = Br(2);
    int n = Br(3);
    int i1 = Br(4);
    int i2 = Br(5);
    int i3 = Br(6);
    int i4 = Br(7);
    Br(8);
    float f = paramInt >= 9 ? Bt(9) : -1.0F;
    FreeParticleSystem localFreeParticleSystem;
    if (paramInt >= 10)
      localFreeParticleSystem = cof.cop().dC(j, Br(10));
    else {
      localFreeParticleSystem = cof.cop().vY(j);
    }
    localFreeParticleSystem.f(k, m, n);
    ZP localZP;
    if (f < 0.0F)
      localZP = new ZP(localFreeParticleSystem, i1, i2, i3, i4);
    else {
      localZP = new ZP(localFreeParticleSystem, i1, i2, i3, i4, f);
    }
    int i5 = (int)localZP.alz();
    localFreeParticleSystem.cS(i);

    cWS.cKD().b(localFreeParticleSystem);
    cnj.cnO().b(localZP);

    Bz(localFreeParticleSystem.getId());
    Bz(i5);
  }
}