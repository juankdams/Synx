package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import VV;
import bQK;
import bYE;
import bsP;
import bxT;
import cBQ;
import cOP;
import cUo;
import cbM;
import dIJ;
import dbI;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

final class Prepare extends dsg
{
  private static final Logger K = Logger.getLogger(Prepare.class);
  private boolean bPU;
  private int aKS;
  private boolean bPV;
  private String bPW;

  Prepare(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "prepare";
  }

  public String getDescription()
  {
    return "Prépare une bulle de texte (avec interaction de l'utilisateur) associe à un mobile.";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("mobileId", "Id du mobile sur lequel attacher la bulle", bxT.giY, false), new bYE("actAsButton", "La bulle se comportera comme la somme des boutons qui lui seront attachés par la suite", bxT.gjc, false), new bYE("duration", "Durée d'affichage de la bulle", bxT.gja, true), new bYE("closeOnClick", "Ferme si on clique sur la bulle", bxT.gjc, true), new bYE("onEndFunc", "Fonction a appeler à la fermeture de la fenetre", bxT.giZ, true) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("bubbleId", "Id de la bulle créée", bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    cUo localcUo = bQK.bXG().gY(Bu(0));
    if (localcUo == null) {
      a(K, "Le mobile n'existe pas " + Bu(0));
      cYR();
      return;
    }

    QZ();
    eS(paramInt);

    int i = dbI.cNt().cNu();
    String str = "interactiveBubbleDialog" + i;
    dIJ localdIJ = bZ(str);

    bY(str);
    a(localdIJ);
    a(localcUo, localdIJ);
    a(i, localdIJ);
    Bz(i);
  }

  private void bY(String paramString) {
    if (this.bPW != null)
      Kd.UN().a(paramString.hashCode(), new cbM(this.bPW, cYS(), null));
  }

  private dIJ bZ(String paramString)
  {
    return (dIJ)cBQ.cxL().a(paramString, VV.dJ("interactiveBubbleDialog"), this.aKS, 8256L, (short)30000);
  }

  private static void a(int paramInt, dIJ paramdIJ)
  {
    Kd.UN().b(paramInt, paramdIJ);
  }

  private static void a(dIJ paramdIJ) {
    bsP.getInstance().getLayeredContainer().b(paramdIJ, 25000);
  }

  private void a(cUo paramcUo, dIJ paramdIJ) {
    paramdIJ.setTarget(paramcUo);
    paramdIJ.setActAsButton(this.bPU);
    paramdIJ.setVisible(false);
    paramdIJ.setCloseOnClick(this.bPV);
  }

  private void QZ() {
    this.aKS = 2147483647;
    this.bPU = By(1);
    this.bPV = false;
    this.bPW = null;
  }

  private void eS(int paramInt)
  {
    LuaObject localLuaObject;
    if (paramInt >= 3) {
      localLuaObject = getParam(4);
      if (localLuaObject.isNumber())
        this.aKS = ((int)localLuaObject.getNumber());
      else if (localLuaObject.isBoolean())
        this.bPV = localLuaObject.getBoolean();
      else if (localLuaObject.isString()) {
        this.bPW = localLuaObject.getString();
      }
    }

    if (paramInt >= 4) {
      localLuaObject = getParam(5);
      if (localLuaObject.isBoolean())
        this.bPV = localLuaObject.getBoolean();
      else if (localLuaObject.isString()) {
        this.bPW = localLuaObject.getString();
      }
    }

    if (paramInt >= 5) {
      localLuaObject = getParam(6);
      if (localLuaObject.isString())
        this.bPW = localLuaObject.getString();
    }
  }
}