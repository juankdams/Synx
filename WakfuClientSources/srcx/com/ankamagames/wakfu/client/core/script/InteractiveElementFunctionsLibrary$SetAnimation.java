package com.ankamagames.wakfu.client.core.script;

import bFB;
import bVl;
import bXf;
import bYE;
import bjp;
import bxT;
import dsg;
import ob;
import org.keplerproject.luajava.LuaState;

public class InteractiveElementFunctionsLibrary$SetAnimation extends dsg
{
  InteractiveElementFunctionsLibrary$SetAnimation(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setAnimation";
  }

  public String getDescription()
  {
    return "Joue l'animation donnée pour un element interactif";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("id", "Id de l'element interactif", bxT.giY, false), new bYE("animationName", "Nom de lanimation", bxT.giZ, false), new bYE("func", null, bxT.giZ, true), new bYE("params", null, bxT.gje, true) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
    String str1 = Bv(1);

    ob localob = bVl.caZ().hb(l);
    if (localob == null) {
      a(InteractiveElementFunctionsLibrary.ch(), "l'élément d'ID " + l + " n'existe pas");
      return;
    }

    localob.eq(str1);

    if (paramInt <= 2) {
      return;
    }

    bXf localbXf = cYS();
    String str2 = Bv(2);
    bFB[] arrayOfbFB = eT(3, paramInt);

    boolean bool = localbXf.a(str2, arrayOfbFB);

    localob.a(new bjp(this, localob, bool, localbXf, str2, arrayOfbFB));
  }
}