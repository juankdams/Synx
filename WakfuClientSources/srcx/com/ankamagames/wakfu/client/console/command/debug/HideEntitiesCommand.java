package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import chi;
import cjA;
import cth;
import dnc;
import java.util.ArrayList;

public class HideEntitiesCommand
  implements dnc
{
  public static int ksw = 0;
  public static final int ksx = 1;
  public static final int ksy = 2;
  public static final int ksz = 4;

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    int i = 0;
    if (!paramArrayList.isEmpty()) {
      i = ksw;
      for (String str : ((String)paramArrayList.get(0)).split(" ")) {
        i = f(i, str);
      }
    }
    ksw = i;
    com.ankamagames.framework.graphics.engine.entity.Entity.mob = ksw == 0 ? null : cFJ();

    a(paramcth);
  }

  private void a(cth paramcth) {
    if (ksw == 0) {
      paramcth.trace("Tout visible");
      return;
    }

    String str = "";
    if ((ksw & 0x1) == 1) {
      str = str + "mobs ";
    }
    if ((ksw & 0x2) == 2) {
      str = str + "joueurs ";
    }
    if ((ksw & 0x4) == 4) {
      str = str + "localPlayer ";
    }
    paramcth.trace("masqué: " + str);
  }

  private static int f(int paramInt, String paramString) {
    if (paramString.equals("npc")) {
      return paramInt ^ 0x1;
    }
    if (paramString.equals("players")) {
      return paramInt ^ 0x2;
    }
    if (paramString.equals("local")) {
      return paramInt ^ 0x4;
    }
    if (paramString.equals("0")) {
      return 0;
    }
    return paramInt;
  }

  private cjA cFJ() {
    return new chi(this);
  }

  public boolean X()
  {
    return false;
  }
}