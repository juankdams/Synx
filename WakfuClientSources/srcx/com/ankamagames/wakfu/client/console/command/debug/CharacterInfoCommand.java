package com.ankamagames.wakfu.client.console.command.debug;

import Rx;
import aeF;
import byv;
import byz;
import cth;
import dnc;
import eu;
import java.util.ArrayList;

public class CharacterInfoCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    byv localbyv = byv.bFN();
    byz localbyz = localbyv.bFO();

    for (eu localeu : eu.values()) {
      Rx localRx = localbyz.d(localeu);
      int k = localbyz.e(localeu);
      cth.cqP().s(localeu.name() + " \t" + k + "/" + localRx.max(), 11141375);
    }
  }

  public boolean X() {
    return false;
  }
}