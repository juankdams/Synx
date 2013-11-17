package com.ankamagames.wakfu.client.ui.script;

import OM;
import bCY;
import bFB;
import bU;
import bXf;
import bYE;
import brV;
import bxT;
import cHx;
import cIM;
import doN;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;
import xb;

public class UIFunctionsLibrary$PushPetMessage extends dsg
{
  UIFunctionsLibrary$PushPetMessage(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "pushPetMessage";
  }

  public String getDescription() {
    return "[Obsolète] Ouvre une bulle de dialogue Gélutin au dessus du joueur";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Ze();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    try {
      if (paramInt < 1) {
        UIFunctionsLibrary.K.warn("On utilise PushPetMessage sans argument !");
        return;
      }
      int i = Br(0);
      String str1;
      if (i == 0) {
        str1 = bU.fH().getString(Bv(1));
      } else {
        localObject1 = new String[i - 1];
        for (j = 1; j < localObject1.length; j++) {
          localObject2 = Bx(j);
          localObject1[(j - 1)] = localObject2;
        }
        str1 = bU.fH().getString(Bv(1), (Object[])localObject1);
      }
      Object localObject1 = Boolean.valueOf((paramInt == 2) || (By(2)));
      if (paramInt < 4) {
        bCY.bLy().a(str1, ((Boolean)localObject1).booleanValue(), 0L, brV.fNZ);
        return;
      }

      int j = 3;
      Object localObject2 = eT(j, paramInt);
      if (localObject2[0].bNs() == bxT.gjb) {
        bCY.bLy().a(str1, ((Boolean)localObject1).booleanValue(), Br(j), brV.fNZ);
        j++;
      } else {
        bCY.bLy().a(str1, ((Boolean)localObject1).booleanValue(), 0L, brV.fNZ);
      }

      String str2 = Bv(j);
      bFB[] arrayOfbFB = eT(j + 1, paramInt);
      bXf localbXf = cYS();
      String str3 = "petBubbleDialog";
      Object localObject3 = (doN)cIM.cDe().a(localbXf, "petBubbleDialog", null, null, str2);
      if (localObject3 == null) {
        localObject3 = new cHx(this, localbXf, str2, arrayOfbFB);

        cIM.cDe().a(localbXf, "petBubbleDialog", null, null, str2, (OM)localObject3);

        bCY.bLy().a((doN)localObject3);
      } else {
        ((xb)localObject3).a(arrayOfbFB);
        doN localdoN = bCY.bLy().bLA();
        if ((localdoN == null) || (localdoN != localObject3))
          bCY.bLy().a((doN)localObject3);
      }
    }
    catch (Exception localException) {
      UIFunctionsLibrary.K.error("Exception levée lors de l'ajout d'un message de familier", localException);
    }
  }
}