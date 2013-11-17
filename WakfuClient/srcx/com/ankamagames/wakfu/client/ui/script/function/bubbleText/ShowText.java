package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import bFB;
import bMt;
import bQK;
import bYE;
import btF;
import bxT;
import byv;
import byz;
import cUo;
import cbM;
import dcY;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

final class ShowText extends dsg
{
  private static final Logger K = Logger.getLogger(ShowText.class);

  ShowText(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "showText";
  }

  public String getDescription()
  {
    return "Affiche une bulle de texte au dessus d'un personnage. La bulle s'effacera au bout d'un certain temps(dépend de la taille du texte)";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("characterId", "Id du mobile", bxT.giY, false), new bYE("text", "Texte à afficher", bxT.giZ, false), new bYE("offsetX", "Décalage en pixel vers la droite", bxT.gja, false), new bYE("offsetY", "Décalage en pixel vers le haut", bxT.gja, false), new bYE("infiniteDuration", "Si true la bulle reste toujours affichée", bxT.gjc, true), new bYE("funcOnEnd", "Fonction à appeler à la fin", bxT.giZ, true), new bYE("params", "Paramètres de fonction de fin", bxT.gje, true) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("bubbleId", "Id de la bulle créée", bxT.gja, false), new bYE("displayTime", "Temps d'affichage en ms", bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null) {
      String str1 = btF.f(Bv(1), new Object[0]);
      String str2 = bMt.bTO();
      dcY localdcY = bMt.jR(str2);
      try {
        localdcY.t(true, false);
        localdcY.setText(str1);
      } catch (Exception localException) {
        K.warn(localException.getMessage());
        return;
      }
      localdcY.setTarget(localcUo);
      localdcY.setBubbleObserver(byv.bFN().bFO().aeL());
      localdcY.setXOffset(Br(2));
      localdcY.setYOffset(Br(3));
      boolean bool = false;
      String str3 = null;
      bFB[] arrayOfbFB = null;

      if (paramInt >= 5) {
        if (getParam(6).isBoolean()) {
          bool = By(4);
        } else if (getParam(6).isString()) {
          str3 = Bv(4);
          if (paramInt >= 6) {
            arrayOfbFB = eT(5, paramInt);
          }
        }
      }

      if (paramInt >= 6) {
        if (getParam(7).isString()) {
          str3 = Bv(5);
        }
        if (paramInt >= 7) {
          arrayOfbFB = eT(6, paramInt);
        }
      }

      if (bool) {
        localdcY.setDuration(-1);
      }

      int i = localdcY.cIP();
      Kd.UN().a(localdcY);
      if (str3 != null) {
        cbM localcbM = new cbM(str3, cYS(), arrayOfbFB);
        Kd.UN().b(i, localcbM);
      }

      Bz(localdcY.getAdviserId());
      Bz(localdcY.getDuration());
    } else {
      a(K, "mobile " + l + " inexistant");
      cYR();
      cYR();
    }
  }
}