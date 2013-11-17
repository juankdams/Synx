package com.ankamagames.wakfu.client.console.command.display;

import aIH;
import aeF;
import bmz;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import cth;
import dLE;
import dnc;
import java.util.ArrayList;

public class DisplayHpBarCommand
  implements dnc
{
  private static boolean dWw = false;

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    aIH localaIH = WakfuClientInstance.awy().awB();
    boolean bool = !localaIH.a(bmz.fEu);
    localaIH.a(bmz.fEu, bool);
    dh(bool);
  }

  public static void dg(boolean paramBoolean)
  {
    dWw = paramBoolean;
    dh(WakfuClientInstance.awy().awB().a(bmz.fEu));
  }

  public static void dh(boolean paramBoolean) {
    dLE.doY().t("timeline.displayHPBar", Boolean.valueOf(paramBoolean ^ dWw));
  }

  public boolean X() {
    return false;
  }
}