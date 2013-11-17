package com.ankamagames.wakfu.client.console.command.display;

import aIH;
import aeF;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import cth;
import dmM;
import dnc;
import java.util.ArrayList;
import yR;

public class SetFightLODLevelCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    aIH localaIH = WakfuClientInstance.awy().awB();
    int i = localaIH.d(yR.bsL);
    int j = (i + 1) % 3;
    localaIH.a(yR.bsL, j);
    R((byte)j);
  }

  public boolean X() {
    return false;
  }

  public static void R(byte paramByte) {
    dmM.cUe().AP(paramByte);
  }
}