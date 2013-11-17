package com.ankamagames.wakfu.client.console.command.display;

import aIH;
import aeF;
import bSH;
import bmz;
import bzu;
import cjO;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import cth;
import dnc;
import java.util.ArrayList;

public class EnableMiniMapCommand
  implements dnc
{
  private static boolean fco = true;

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    aIH localaIH = WakfuClientInstance.awy().awB();
    boolean bool = localaIH.a(bmz.fEU);
    localaIH.a(bmz.fEU, !bool);
    es(!bool);
  }

  public boolean X() {
    return false;
  }

  public static void es(boolean paramBoolean) {
    boolean bool = (paramBoolean) && (bSH.bZs().bMq());
    if (bool == fco) {
      return;
    }
    fco = bool;

    bzu localbzu = new bzu();
    localbzu.d(16606);
    localbzu.c(paramBoolean);
    cjO.clE().j(localbzu);
  }

  public static boolean bmz() {
    return fco;
  }
}