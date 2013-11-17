package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import OM;
import bFB;
import bXf;
import bYE;
import btF;
import bxT;
import cIM;
import cOx;
import dIJ;
import dLy;
import doN;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;
import xb;

public final class AddTimedButton extends dsg
{
  private static final Logger K = Logger.getLogger(AddTimedButton.class);

  AddTimedButton(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addTimedButton";
  }

  public String getDescription()
  {
    return "Ajoute une bouton à une bulle interactive";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("bubbleId", "Id de la bulle", bxT.gja, false), new bYE("text", "Texte du bouton à afficher", bxT.giZ, false), new bYE("time", "Durée avant activation du bouton", bxT.gja, false), new bYE("function", "Nom de la fonction à appeler lors du clic sur le bouton", bxT.giZ, false), new bYE("parameters", "Paramètres à passer à la fonction", bxT.gje, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    String str1 = btF.f(Bv(1), new Object[0]);

    int j = Br(2);
    String str2 = Bv(3);
    bFB[] arrayOfbFB = eT(4, paramInt);
    bXf localbXf = cYS();

    cOx localcOx = localbXf.a(j, 1, str2, arrayOfbFB);
    Object localObject = (doN)cIM.cDe().a(localbXf, "interactiveBubbleDialog" + i, str1, "MOUSE_CLICKED", str2);

    if (localObject == null) {
      localObject = new dLy(this, localbXf, str2, arrayOfbFB, localbXf, localcOx);

      cIM.cDe().a(localbXf, "interactiveBubbleDialog" + i, str1, "MOUSE_CLICKED", str2, (OM)localObject);
      dIJ localdIJ = Kd.UN().fA(i);
      if (localdIJ != null)
        localdIJ.a(str1, (doN)localObject, true);
      else
        a(K, "id de bulle correspondant à rien");
    } else {
      ((xb)localObject).a(arrayOfbFB);
    }
  }
}