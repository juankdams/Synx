package com.ankamagames.wakfu.client.console.command.debug.anim;

import VV;
import aeF;
import bnW;
import cBQ;
import cth;
import dLE;
import dd;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class AnmDebuggerCommand
  implements dnc
{
  private static final Logger K = Logger.getLogger(AnmDebuggerCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    bCW();
  }

  public boolean X() {
    return false;
  }

  public static void bCW() {
    dLE.doY().t("debug.anm", dd.gW());

    cBQ.cxL().a("debugAnmDialog", VV.dJ("debugAnmDialog"), 1L, (short)10000);
    cBQ.cxL().j("wakfu.debugAnm", bnW.class);
  }
}