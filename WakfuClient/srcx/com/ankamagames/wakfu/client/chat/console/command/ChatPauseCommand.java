package com.ankamagames.wakfu.client.chat.console.command;

import aAx;
import aeF;
import ahB;
import cth;
import dju;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class ChatPauseCommand
  implements dnc
{
  private static final Logger K = Logger.getLogger(ChatPauseCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList) {
    dju localdju = aAx.aMd().aMi().auy();
    localdju.setPaused(!localdju.isPaused());
  }

  public boolean X() {
    return false;
  }
}