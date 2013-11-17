package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import bYE;
import btF;
import bxT;
import dIJ;
import dcY;
import dsg;
import org.keplerproject.luajava.LuaState;

final class SetText extends dsg
{
  SetText(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setText";
  }

  public String getDescription()
  {
    return "Spécifie le texte d'une bulle de dialogue";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("bubbleId", "Id de la bulle", bxT.gja, false), new bYE("text", "Texte à afficher", bxT.giZ, false), new bYE("parameters", "Paramètres du texte", bxT.gje, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    dIJ localdIJ = Kd.UN().fA(Br(0));
    String[] arrayOfString = null;
    if (eA(paramInt)) {
      arrayOfString = new String[paramInt - 2];
      g(arrayOfString);
    }
    if (localdIJ != null) {
      a(localdIJ, arrayOfString);
      return;
    }
    dcY localdcY = Kd.UN().fC(Br(0));
    if (localdcY != null)
      a(localdcY, arrayOfString);
  }

  private void a(dcY paramdcY, String[] paramArrayOfString)
  {
    if (paramArrayOfString != null)
      paramdcY.setText(btF.f(Bv(1), paramArrayOfString));
    else
      paramdcY.setText(btF.f(Bv(1), new Object[0]));
  }

  private void a(dIJ paramdIJ, String[] paramArrayOfString) {
    if (paramArrayOfString != null)
      paramdIJ.setBubbleText(btF.f(Bv(1), paramArrayOfString));
    else
      paramdIJ.setBubbleText(btF.f(Bv(1), new Object[0]));
  }

  private void g(String[] paramArrayOfString) {
    for (int i = 0; i < paramArrayOfString.length; i++) {
      String str = Bx(i + 2);
      paramArrayOfString[i] = str;
    }
  }

  private boolean eA(int paramInt) {
    return paramInt > 2;
  }
}