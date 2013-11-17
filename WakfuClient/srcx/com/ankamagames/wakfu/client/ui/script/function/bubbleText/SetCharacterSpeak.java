package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Su;
import aEe;
import bFB;
import bQK;
import bTx;
import bU;
import bYE;
import btF;
import bxT;
import cUo;
import cew;
import cyw;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class SetCharacterSpeak extends dsg
{
  private static final Logger K = Logger.getLogger(SetCharacterSpeak.class);

  SetCharacterSpeak(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setCharacterSpeak";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("mobileId", null, bxT.giY, false), new bYE("translationKey", null, bxT.giZ, false), new bYE("translation parameters", null, bxT.gjd, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    String str1 = Bv(1);
    bFB[] arrayOfbFB = null;
    boolean bool = false;
    if (paramInt > 2) {
      if (isTable(2))
        arrayOfbFB = Bw(2);
      else if (isBoolean(2)) {
        bool = By(2);
      }
    }

    if (paramInt > 3) {
      bool = By(3);
    }

    cUo localcUo = bQK.bXG().gY(l);

    if (localcUo == null) {
      a(K, "mobile inconnu " + l);
      return;
    }

    if (!(localcUo instanceof cew)) {
      a(K, "le mobile " + l + " n'est pas valide");
      return;
    }

    Su localSu = ((cew)localcUo).cbD();
    String[] arrayOfString;
    if (arrayOfbFB != null) {
      arrayOfString = new String[arrayOfbFB.length];
      for (int i = 0; i < arrayOfbFB.length; i++)
        arrayOfString[i] = btF.f((String)arrayOfbFB[i].getValue(), new Object[0]);
    }
    else {
      arrayOfString = new String[0];
    }

    String str2 = bU.fH().getString(str1, arrayOfString);

    aEe localaEe = new aEe(localSu.getName(), l, str2);
    localaEe.mm(1);
    localaEe.setResizable(bool);

    bTx.f(new cyw(this, localaEe));
  }
}