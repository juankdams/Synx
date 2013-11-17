package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class LinkMobile extends dsg
{
  private static final Logger K = Logger.getLogger(LinkMobile.class);
  private static final String NAME = "linkMobile";
  private static final bYE[] Rf = { new bYE("mobileId", "L'id du mobile source", bxT.giY, false), new bYE("toLink", "L'Id du mobile à attacher", bxT.giY, false) };

  public LinkMobile(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "linkMobile";
  }

  public String getDescription()
  {
    return "Attache un mobile à un mobile source. Il sera attaché au point d'ancrage du mobile source et subira donc ses transformations.";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l1 = Bu(0);
    long l2 = Bu(1);

    cUo localcUo1 = bQK.bXG().gY(l1);
    if (localcUo1 == null) {
      a(K, "le mobile source " + l1 + " n'existe pas ");
      return;
    }

    cUo localcUo2 = bQK.bXG().gY(l2);
    if (localcUo2 == null) {
      a(K, "le mobile cible " + l2 + " n'existe pas ");
      return;
    }
    localcUo1.n(localcUo2);
  }
}