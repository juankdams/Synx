package com.ankamagames.wakfu.client.core.script;

import ZG;
import cFl;
import dFu;
import dlD;
import dtb;
import hQ;
import org.apache.log4j.Logger;

public final class InteractiveDialogScriptManager
{
  private static Logger flN = Logger.getLogger("InteractiveDialogScripts");

  public static final InteractiveDialogScriptManager flO = new InteractiveDialogScriptManager();
  private static final String flP = "interactiveDialogs/";
  private final dFu dlX = new dFu();
  private hQ[] flQ;
  private static long cLq = -1L;

  private InteractiveDialogScriptManager()
  {
    this.flQ = new hQ[] { new InteractiveDialogScriptManager.InnerSoundFunctionsLibrary() };
  }

  public void bqs()
  {
    ZG localZG = cFl.cAH().ir(cLq);
    if (localZG != null) {
      localZG.bH(true);
      localZG.q(0.0F, 0.2F);
    }
    cLq = -1L;
  }

  public String hU(String paramString)
  {
    if ((!bB) && (dlD.cTt().getPath() == null)) throw new AssertionError();
    return String.format("%s%s%s", new Object[] { "interactiveDialogs/", paramString, dlD.cTt().getExtension() });
  }

  public void hV(String paramString) {
    hW(paramString);
  }

  private void hW(String paramString) {
    String str = hU(paramString);
    boolean bool = dtb.pU(dlD.cTt().getPath() + str);
    if (bool)
      dlD.cTt().a(str, this.flQ);
  }
}