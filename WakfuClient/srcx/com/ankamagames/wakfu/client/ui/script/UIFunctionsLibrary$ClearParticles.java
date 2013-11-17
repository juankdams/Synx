package com.ankamagames.wakfu.client.ui.script;

import Jg;
import aNL;
import bYE;
import cBQ;
import cDA;
import cag;
import cpa;
import dOc;
import dsg;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$ClearParticles extends dsg
{
  UIFunctionsLibrary$ClearParticles(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "clearParticles";
  }

  public String getDescription()
  {
    return "Enlève tous les systèmes de particule sur un élément d'interface";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yu();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    String str1 = Bv(0);
    String str2 = Bv(1);
    cpa localcpa = cBQ.cxL().coO().nf(str1);
    if (localcpa == null) {
      UIFunctionsLibrary.K.error("[ClearParticles] Impossible de retrouver l'interface d'id=" + str1);
      return;
    }
    dOc localdOc = (dOc)localcpa.fi(str2);
    if (localdOc == null) {
      UIFunctionsLibrary.K.error("[ClearParticles] Impossible de retrouver le widget d'id=" + str2 + " dans l'interface d'id=" + str1);
      return;
    }

    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = localdOc.getAppearance().getChildren().iterator(); localIterator.hasNext(); ) { localObject = (aNL)localIterator.next();
      if ((localObject instanceof cag))
        localArrayList.add((cag)localObject);
    }
    Object localObject;
    for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localObject = (cag)localIterator.next();
      ((cag)localObject).setTimeToLive(100);
    }
  }
}