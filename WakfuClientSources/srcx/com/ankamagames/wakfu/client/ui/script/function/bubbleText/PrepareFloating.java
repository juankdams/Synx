package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import VV;
import ajb;
import bYE;
import bsP;
import bxT;
import cBQ;
import cOP;
import cbM;
import cwP;
import dIJ;
import dbI;
import dsg;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

final class PrepareFloating extends dsg
{
  private ajb aKQ;
  private int fum;
  private int fun;
  private boolean bPU;
  private int aKS;
  private boolean bPV;
  private String bPW;

  PrepareFloating(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "prepareFloating";
  }

  public String getDescription() {
    return "Prépare une bulle de texte (avec interaction de l'utilisateur) à l'écran";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("align", "Alignement de la bulle de texte", bxT.giZ, false), new bYE("screenXoffset", "Décalage en pixel vers la droite", bxT.gja, false), new bYE("screenYoffset", "Décalage en pixel vers le heut", bxT.gja, false), new bYE("actAsButton", "La bulle se comportera comme la somme des boutons qui lui seront attachés par la suite", bxT.gjc, false), new bYE("duration", "Durée d'affichage de la bulle", bxT.gja, true), new bYE("closeOnClick", "Ferme si on clique sur la bulle", bxT.gjc, true), new bYE("onEndFunc", "Fonction à appaler lors de la fermeture", bxT.giZ, true) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("bubbleId", null, bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    btd();

    eS(paramInt);

    int i = dbI.cNt().cNu();
    String str = "interactiveBubbleDialog" + i;
    dIJ localdIJ = bZ(str);
    il(str);
    a(localdIJ);
    a(i, localdIJ);
    b(localdIJ);
    Bz(i);
  }

  private void a(int paramInt, dIJ paramdIJ) {
    Kd.UN().b(paramInt, paramdIJ);
  }

  private void a(dIJ paramdIJ) {
    bsP.getInstance().getLayeredContainer().b(paramdIJ, 25000);
  }

  private void il(String paramString) {
    if (this.bPW != null)
      Kd.UN().a(paramString.hashCode(), new cbM(this.bPW, cYS(), null));
  }

  private void b(dIJ paramdIJ)
  {
    paramdIJ.setActAsButton(this.bPU);

    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setAlign(this.aKQ);
    localcwP.setXOffset(this.fum);
    localcwP.setYOffset(this.fun);

    paramdIJ.a(localcwP);
    paramdIJ.setVisible(false);
    paramdIJ.setCloseOnClick(this.bPV);

    paramdIJ.setForcedDisplaySpark(false);
    paramdIJ.setUseTargetPositionning(false);
  }

  private dIJ bZ(String paramString) {
    return (dIJ)cBQ.cxL().a(paramString, VV.dJ("interactiveBubbleDialog2"), this.aKS, 8256L, (short)30000);
  }

  private void eS(int paramInt)
  {
    LuaObject localLuaObject;
    if (paramInt >= 5) {
      localLuaObject = getParam(6);
      if (localLuaObject.isNumber())
        this.aKS = ((int)localLuaObject.getNumber());
      else if (localLuaObject.isBoolean())
        this.bPV = localLuaObject.getBoolean();
      else if (localLuaObject.isString()) {
        this.bPW = localLuaObject.getString();
      }
    }

    if (paramInt >= 6) {
      localLuaObject = getParam(7);
      if (localLuaObject.isBoolean())
        this.bPV = localLuaObject.getBoolean();
      else if (localLuaObject.isString()) {
        this.bPW = localLuaObject.getString();
      }
    }

    if (paramInt >= 7) {
      localLuaObject = getParam(8);
      if (localLuaObject.isString())
        this.bPW = localLuaObject.getString();
    }
  }

  private void btd()
  {
    this.aKQ = ajb.valueOf(Bv(0));
    this.fum = Br(1);
    this.fun = Br(2);
    this.bPU = By(3);

    this.aKS = 2147483647;
    this.bPV = false;
    this.bPW = null;
  }
}