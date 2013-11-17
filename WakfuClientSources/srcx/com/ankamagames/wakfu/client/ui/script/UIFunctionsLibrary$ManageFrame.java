package com.ankamagames.wakfu.client.ui.script;

import Bf;
import Rl;
import aKj;
import aPh;
import aYX;
import aoT;
import bYE;
import byv;
import cHM;
import ceb;
import cqu;
import cvW;
import dGW;
import dPm;
import dsg;
import dzx;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;
import pY;
import rS;
import rX;
import tL;
import zV;

class UIFunctionsLibrary$ManageFrame extends dsg
{
  UIFunctionsLibrary$ManageFrame(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "manageFrame";
  }

  public String getDescription()
  {
    return "Active ou désactive des frames, donc des types d'interactions entre l'utilisateur et le jeu.";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XN();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    String str = Bv(0);
    Object localObject;
    if ("FightItemUse".equalsIgnoreCase(str))
      localObject = cHM.cBY();
    else if ("ControlCenter".equalsIgnoreCase(str))
      localObject = Bf.Kk();
    else if ("Chat".equalsIgnoreCase(str))
      localObject = ceb.cgG();
    else if ("Shortcut".equalsIgnoreCase(str))
      localObject = zV.IH();
    else if ("World".equalsIgnoreCase(str))
      localObject = Rl.acN();
    else if ("FightMovementFrame".equalsIgnoreCase(str))
      localObject = aYX.bnY();
    else if ("Flea".equalsIgnoreCase(str))
      localObject = rX.yA();
    else if ("Equipment".equalsIgnoreCase(str))
      localObject = dGW.dhM();
    else if ("CharacterSheet".equalsIgnoreCase(str))
      localObject = pY.xl();
    else if ("CharacterBookSpellDetails".equalsIgnoreCase(str))
      localObject = dPm.dqv();
    else if ("CharacterSpells".equalsIgnoreCase(str))
      localObject = dPm.dqv();
    else if ("TemporaryInventory".equalsIgnoreCase(str))
      localObject = tL.Ca();
    else if ("FightEndFrame".equalsIgnoreCase(str))
      localObject = aPh.bgd();
    else if ("SystemBar".equalsIgnoreCase(str))
      localObject = rS.ys();
    else if ("MRU".equalsIgnoreCase(str))
      localObject = cqu.cpE();
    else if ("Menu".equalsIgnoreCase(str))
      localObject = aoT.aBl();
    else if ("UITimelineFrame".equalsIgnoreCase(str))
      localObject = aKj.bbx();
    else
      localObject = "Protector".equalsIgnoreCase(str) ? dzx.dcY() : null;
    boolean bool = By(1);
    UIFunctionsLibrary.K.info("On enlève la frame " + str);
    if (localObject != null) {
      if (bool) {
        if (!byv.bFN().c((cvW)localObject))
          byv.bFN().a((cvW)localObject);
        else
          a(UIFunctionsLibrary.K, " On essaie de pousser une frame qui est déjà là. C'est soit un bug, soit une erreur dans un scénario.");
      }
      else
        byv.bFN().b((cvW)localObject);
    }
    else
      a(UIFunctionsLibrary.K, "Cette frame n'est pas supportée par manageFrame " + str);
  }
}