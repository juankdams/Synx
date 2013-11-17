package com.ankamagames.wakfu.client.console.command.debug;

import XT;
import aeF;
import aps;
import ars;
import bBc;
import bDk;
import bMG;
import bOh;
import bZv;
import bpu;
import byv;
import byz;
import cKg;
import cth;
import dUx;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class WorldEditorCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(WorldEditorCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList) {
    aps localaps = byv.bFN().bFQ();
    if ((localaps != null) && (bBc.b(localaps.bOR(), bBc.gtl)))
      if (byv.bFN().c(bZv.cdR())) {
        byv.bFN().b(bZv.cdR());
      } else {
        dUx localdUx = bDk.bLI().cr(bOh.D());
        if ((localdUx != null) && (localdUx.bMr())) {
          cKg localcKg = XT.a(ars.dzL.aL(localdUx.az), djK());

          bZv.cdR().a(localcKg);
          byv.bFN().a(bZv.cdR());
        } else {
          paramcth.trace("You must be in a havenworld to open worldEditor.");
        }
      }
  }

  private bpu djK()
  {
    bMG localbMG = byv.bFN().bFO().bSt();
    return bpu.a(localbMG.CD(), localbMG.getName(), localbMG.CH());
  }

  public boolean X() {
    return false;
  }
}