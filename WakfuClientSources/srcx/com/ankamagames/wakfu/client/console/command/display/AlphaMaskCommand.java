package com.ankamagames.wakfu.client.console.command.display;

import CM;
import Su;
import aEe;
import aIH;
import aeF;
import arl;
import bU;
import bmz;
import byv;
import byz;
import cew;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import cth;
import dnc;
import java.util.ArrayList;

public class AlphaMaskCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    aIH localaIH = WakfuClientInstance.awy().awB();
    boolean bool = !localaIH.a(bmz.fEs);
    localaIH.a(bmz.fEs, bool);
    eU(bool);
  }

  public static void eU(boolean paramBoolean) {
    eV(paramBoolean);
    eW(paramBoolean);
    aEe localaEe = new aEe(bU.fH().getString(paramBoolean ? "options.alphaMaskActivated" : "options.alphaMaskDisactivated"));
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }

  public static void eV(boolean paramBoolean) {
    byz localbyz = WakfuClientInstance.awy().awz().bFO();
    if (localbyz == null)
      return;
    cew localcew = localbyz.aeL();
    if (localcew == null)
      return;
    localcew.cc(paramBoolean);
  }

  public static void eW(boolean paramBoolean) {
    byz localbyz = WakfuClientInstance.awy().awz().bFO();
    if (localbyz == null) {
      return;
    }

    cew localcew1 = localbyz.aeL();
    if ((!bB) && (localcew1 == null)) throw new AssertionError();

    arl localarl = localbyz.aeQ();
    if (localarl == null)
      return;
    for (Su localSu : localarl.bgG()) {
      cew localcew2 = localSu.aeL();
      if ((localcew2 != null) && (localcew1 != localcew2))
      {
        localcew2.cc(paramBoolean);
      }
    }
  }

  public boolean X() { return false; }

}