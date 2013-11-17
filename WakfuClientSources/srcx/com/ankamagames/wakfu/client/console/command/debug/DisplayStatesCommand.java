package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import cth;
import dnc;
import java.util.ArrayList;

public class DisplayStatesCommand
  implements dnc
{
  private static boolean dLJ = false;

  public static boolean aIv() {
    return dLJ;
  }

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList) {
    dLJ = !dLJ;

    paramcth.trace(dLJ ? "Affichage forcé des états : ON" : "Affichage forcé des états : OFF");
  }

  public boolean X()
  {
    return false;
  }
}