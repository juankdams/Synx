package com.ankamagames.wakfu.client.ui.script;

import bJz;
import bYE;
import byv;
import byz;
import cCI;
import dKD;
import dpr;
import dsg;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class UIFunctionsLibrary$SetShortcutUsable extends dsg
{
  UIFunctionsLibrary$SetShortcutUsable(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setShortcutUsable";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YJ();
  }

  public String getDescription() {
    return "Active/désactive le ou les raccourcis de la ou des barres de raccourcis spécifiées";
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    if (paramInt < 1) {
      return;
    }
    byz localbyz = byv.bFN().bFO();
    dpr localdpr = localbyz.bGD();
    boolean bool = By(0);
    Object localObject1;
    Object localObject2;
    if (paramInt == 1) {
      for (localObject1 = localdpr.ka(false).iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (bJz)((Iterator)localObject1).next();
        ((bJz)localObject2).gh(bool);
      }
      for (localObject1 = localdpr.kb(false).iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (bJz)((Iterator)localObject1).next();
        ((bJz)localObject2).gh(bool); }
    }
    else {
      localObject1 = Bv(1);

      localObject2 = cCI.valueOf((String)localObject1);
      if (localObject2 == null) {
        UIFunctionsLibrary.K.error("Impossible de retrouver le type de barre de raccourci suivant : " + (String)localObject1);
        return;
      }
      if (paramInt == 2)
      {
        Iterator localIterator;
        if (((cCI)localObject2).cyS())
          for (localIterator = localdpr.ka(false).iterator(); localIterator.hasNext(); ) { localbJz = (bJz)localIterator.next();
            localbJz.gh(bool);
          }
        bJz localbJz;
        if (((cCI)localObject2).cyT()) {
          for (localIterator = localdpr.kb(false).iterator(); localIterator.hasNext(); ) { localbJz = (bJz)localIterator.next();
            localbJz.gh(bool);
          }
        }
        if (((cCI)localObject2).cyR()) {
          localdpr.cWY().setUsable(bool);
          localdpr.cWZ().setUsable(bool);
        }
      } else {
        byte b = (byte)Br(2);
        if (paramInt == 3) {
          if (((cCI)localObject2).cyS()) {
            localdpr.fs(b).gh(bool);
          }
          if (((cCI)localObject2).cyT())
            localdpr.fr(b).gh(bool);
        }
        else if (paramInt == 4) {
          short s = (short)Br(3);
          if (((cCI)localObject2).cyS()) {
            localdpr.fs(b).cI(s).setUsable(bool);
          }
          if (((cCI)localObject2).cyT())
            localdpr.fr(b).cI(s).setUsable(bool);
        }
      }
    }
  }
}