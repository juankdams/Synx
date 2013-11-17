package com.ankamagames.wakfu.client.ui.script;

import CH;
import OM;
import aNL;
import bFB;
import bXf;
import bYE;
import cBQ;
import cDA;
import cIM;
import cpa;
import doN;
import dsg;
import java.util.ArrayList;
import org.keplerproject.luajava.LuaState;
import xb;

class UIFunctionsLibrary$AddEventListener extends dsg
{
  UIFunctionsLibrary$AddEventListener(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addEventListener";
  }

  public String getDescription()
  {
    return "Permet d'ajouter une fonction sur un événement sur un widget. On ne peut pas enregistrer 2 fois la même fonction pour un même type d'événement sur un widget d'un dialogue";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XO();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    String str1 = Bv(0);
    cpa localcpa = cBQ.cxL().coO().nf(str1);
    if (localcpa == null) {
      a(UIFunctionsLibrary.K, "Dialogue inconnu " + str1);
      return;
    }

    String str2 = Bv(1);
    aNL localaNL = localcpa.fi(str2);
    if (localaNL == null) {
      a(UIFunctionsLibrary.K, "ElementDispatcher inconnu " + str2 + " dans le dialog " + str1);
      return;
    }

    String str3 = Bv(2);
    boolean bool = "MOUSE_CLICKED_AND_DOUBLE_CLICKED".equals(str3);

    CH localCH = bool ? CH.bGw : CH.valueOf(str3);
    if (localCH == null) {
      a(UIFunctionsLibrary.K, "Type d'evnement inconnu " + str3 + " pour le dialog " + str1);
      return;
    }

    String str4 = Bv(3);
    bFB[] arrayOfbFB = eT(4, paramInt);
    bXf localbXf = cYS();

    Object localObject = (doN)cIM.cDe().a(localbXf, str1, str2, str3, str4);
    if (localObject == null) {
      localObject = new xb(localbXf, str4, arrayOfbFB);

      cIM.cDe().a(localbXf, str1, str2, str3, str4, (OM)localObject);

      localaNL.a(localCH, (doN)localObject, false);
      if (bool)
        localaNL.a(CH.bGx, (doN)localObject, false);
    }
    else {
      ((xb)localObject).a(arrayOfbFB);
      ArrayList localArrayList = localaNL.getListeners(localCH, false);
      if ((localArrayList == null) || (!localArrayList.contains(localObject))) {
        localaNL.a(localCH, (doN)localObject, false);
        if (bool)
          localaNL.a(CH.bGx, (doN)localObject, false);
      }
    }
  }
}