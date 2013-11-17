package com.ankamagames.wakfu.client.core.script.function.context;

import ahm;
import ay;
import bYE;
import bdh;
import bxT;
import dLw;
import dps;
import dsE;
import dsg;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class CreateAnimatedElement extends dsg
{
  private static final Logger K = Logger.getLogger(CreateAnimatedElement.class);

  public CreateAnimatedElement(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "createAnimatedElement";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("type", null, bxT.giZ, false), new bYE("spriteName", null, bxT.giZ, false), new bYE("worldX", null, bxT.gja, false), new bYE("worldY", null, bxT.gja, false), new bYE("altitude", null, bxT.gja, false), new bYE("animName", null, bxT.giZ, true) };
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("id", null, bxT.giY, false) };
  }

  public void S(int paramInt)
  {
    String str1 = Bv(0);
    String str2 = Bv(1);
    int i = Br(2);
    int j = Br(3);
    int k = Br(4);
    String str3 = paramInt >= 6 ? Bv(5) : "1_AnimStatique";

    long l = getId();
    while (dps.cXa().jR(l) != null) {
      K.warn("contient déjà un élement avec cet id " + l);
      l = getId();
    }
    ahm localahm = new ahm(l, i, j, k);
    try
    {
      localahm.b(i(str1, str2), true);
    } catch (IOException localIOException) {
      K.error("", localIOException);
      cYR();
      return;
    }

    localahm.em(str1 + "/" + str2);
    localahm.id(dLw.mbl.asR());
    localahm.eq(str3);

    dps.cXa().k(localahm);

    kg(l);
  }

  private static long getId()
  {
    return dsE.cYX();
  }

  private static String aw(String paramString) {
    if (paramString.equals("interactives"))
      return "ANMInteractiveElementPath";
    if (paramString.equals("resources"))
      return "ANMResourcePath";
    if (paramString.equals("npcs"))
      return "npcGfxPath";
    if (paramString.equals("pets"))
      return "petGfxPath";
    if (paramString.equals("players"))
      return "playerGfxPath";
    if (paramString.equals("dynamics"))
      return "ANMDynamicElementPath";
    return null;
  }

  public static String i(String paramString1, String paramString2) {
    String str1 = aw(paramString1.toLowerCase());
    try {
      if (str1 != null) {
        String str2 = ay.bd().getString(str1);
        return String.format(str2, new Object[] { paramString2 });
      }
    } catch (bdh localbdh) {
      K.error("problème avec le type " + paramString1, localbdh);
    }
    K.error("type inconnu " + paramString1);
    return paramString1 + "/" + paramString2;
  }
}