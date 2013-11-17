package com.ankamagames.wakfu.client.console.command.commonIn;

import Ts;
import aeF;
import bpn;
import ceb;
import cpa;
import cth;
import dOc;
import dnc;
import java.util.ArrayList;
import zC;

public class ChatCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (!Ts.agx().isEmpty()) {
      return;
    }

    azb();
  }

  public boolean X() {
    return false;
  }

  public static void azb() {
    zC.Ip().e((dOc)ceb.cgG().cgH().getElementMap().fi("textEditorRenderableContainer.chatInput"));
  }
}