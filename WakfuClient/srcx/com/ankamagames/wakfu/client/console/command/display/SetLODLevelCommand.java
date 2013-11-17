package com.ankamagames.wakfu.client.console.command.display;

import aIH;
import aeF;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import cth;
import dnc;
import java.util.ArrayList;
import yR;

public class SetLODLevelCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    aIH localaIH = WakfuClientInstance.awy().awB();
    int i = localaIH.d(yR.bsK);
    int j = (i + 1) % 3;
    localaIH.a(yR.bsK, j);
    eq((byte)j);
  }

  public boolean X() {
    return false;
  }

  public static void eq(byte paramByte) {
    WakfuClientInstance.awy().iS(paramByte);
  }
}