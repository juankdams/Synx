package com.ankamagames.wakfu.client.ui.script;

import adF;
import ary;
import awH;
import bU;
import bYE;
import bxT;
import cqz;
import dbI;
import dfj;
import dsg;
import java.util.HashSet;
import org.keplerproject.luajava.LuaState;
import vk;

final class DisplayFlyingText extends dsg
{
  private final int hHT = 4500;
  private int hHV = 600;

  DisplayFlyingText(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "displayFlyingText";
  }

  public bYE[] ce() {
    return new bYE[] { new bYE("R", "Valeur rouge appliquée au texte", bxT.gjb, false), new bYE("G", "Valeur verte appliquée au texte", bxT.gjb, false), new bYE("B", "Valeur bleue appliquée au texte", bxT.gjb, false), new bYE("font", "Font à utiliser", bxT.giZ, false), new bYE("targetId", "Id du mobile concerné", bxT.giY, false), new bYE("textKey", "Clef de traduction du texte", bxT.giZ, false), new bYE("size", "Taille du texte", bxT.gjb, true), new bYE("textParams", "Paramètres éventuels du texte (20 par défaut)", bxT.gje, true) };
  }

  public String getDescription()
  {
    return "Affiche un texte volant au-dessus d'un mobile donné";
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    float f1 = (float)Bs(0);
    float f2 = (float)Bs(1);
    float f3 = (float)Bs(2);

    String str1 = Bv(3);
    long l = Bu(4);
    String str2 = Bv(5);

    int i = 0;

    int j = 20;

    if (paramInt > 6)
      j = Math.max(1, Br(6));
    String[] arrayOfString;
    if (paramInt > 7) {
      arrayOfString = new String[paramInt - 7];
      for (int k = 0; k < arrayOfString.length; k++)
        arrayOfString[k] = Bx(7 + k);
    }
    else {
      arrayOfString = new String[0];
    }

    if (str1.equals("")) {
      i = 5;
      str1 = "wci";
      j = 23;
    }

    Object localObject = null;
    awH localawH = ary.aDT().dh(l);

    if ((localawH != null) && 
      (localawH.isVisible())) {
      localObject = localawH;
    }
    if (localObject == null) {
      return;
    }
    String str3 = bU.fH().getString(str2, arrayOfString);

    if ((str3 != null) && (str3.length() > 0))
      a(f1, f2, f3, str1, i, j, localObject, str3);
  }

  private void a(float paramFloat1, float paramFloat2, float paramFloat3, String paramString1, int paramInt1, int paramInt2, cqz paramcqz, String paramString2)
  {
    vk localvk = new vk();

    dfj localdfj = new dfj(adF.c(paramString1, paramInt1, paramInt2), paramString2, localvk, 4500);
    localdfj.setColor(paramFloat1, paramFloat2, paramFloat3, 1.0F);
    localdfj.a(paramcqz);
    HashSet localHashSet = dbI.cNt().b(paramcqz);
    if (localHashSet != null)
      localdfj.pu(localHashSet.size() * this.hHV);
    dbI.cNt().a(localdfj);
  }
}