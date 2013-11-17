package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import VV;
import bFB;
import bQK;
import bXf;
import bYE;
import bsP;
import btF;
import buE;
import bxT;
import cBQ;
import cOP;
import cUo;
import dIJ;
import dbI;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class ShowMonologue extends dsg
{
  private static final Logger K = Logger.getLogger(ShowMonologue.class);

  ShowMonologue(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "showMonologue";
  }

  public String getDescription()
  {
    return "Affiche une bulle de texte au dessus d'un personnage avec un bouton suivant qui permet de faire défiler un texte. LE bouton devient 'FIN' pour le dernier texte et fermera la bulle ";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("mobileId", "Id du personnage", bxT.giY, false), new bYE("texts", "Textes à afficher (sous forme de table)", bxT.gjd, false), new bYE("funcOnTerminate", "Fonction à appeler à la fin", bxT.giZ, true), new bYE("funcParams", "Paramètres de la fonction de fin", bxT.gje, true) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("bubbleId", "Id de la bulle", bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    cUo localcUo = bQK.bXG().gY(Bu(0));
    if (localcUo == null) {
      a(K, "Le mobile n'existe pas " + Bu(0));
      Bz(0);
      return;
    }

    bFB[] arrayOfbFB1 = Bw(1);
    if (arrayOfbFB1.length == 0) {
      a(K, "La table de texte est vide");
    }

    String[] arrayOfString = new String[arrayOfbFB1.length];
    for (int i = 0; i < arrayOfbFB1.length; i++) {
      arrayOfString[i] = btF.f((String)arrayOfbFB1[i].getValue(), new Object[0]);
    }

    bXf localbXf = cYS();

    int j = dbI.cNt().cNu();
    dIJ localdIJ = (dIJ)cBQ.cxL().a("interactiveBubbleDialog" + j, VV.dJ("interactiveBubbleDialog"), 8256L, (short)30000);

    bsP.getInstance().getLayeredContainer().b(localdIJ, 25000);
    localdIJ.setVisible(false);
    localdIJ.setTarget(localcUo);
    Kd.UN().b(j, localdIJ);

    int[] arrayOfInt = { 0 };
    localdIJ.setBubbleText(arrayOfString[0]);
    localdIJ.setActAsButton(true);

    String str = paramInt > 2 ? Bv(2) : null;
    bFB[] arrayOfbFB2 = eT(3, paramInt);

    localdIJ.a(btF.f("dialog.next", new Object[0]), new buE(this, arrayOfInt, localdIJ, arrayOfString, str, localbXf, arrayOfbFB2, j), true);

    localdIJ.setCloseOnClick(false);
    localdIJ.show();
    Bz(j);
  }
}