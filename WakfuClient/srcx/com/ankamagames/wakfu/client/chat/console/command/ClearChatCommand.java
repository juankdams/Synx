package com.ankamagames.wakfu.client.chat.console.command;

import aAx;
import aeF;
import ahB;
import cth;
import dju;
import dnc;
import java.util.ArrayList;

public class ClearChatCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    ahB localahB = aAx.aMd().aMi();
    if (localahB == null)
      return;
    dju localdju = localahB.auy();
    if (localdju == null)
      return;
    localdju.clear();
  }

  public boolean X() {
    return false;
  }
}