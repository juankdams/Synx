package com.ankamagames.wakfu.client.console.command.fight;

import aeF;
import cth;
import dmM;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class DisableFightBorderCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(DisableFightBorderCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    dmM.cUe().cUj();
    dmM.cUe().cUl();
  }

  public boolean X() {
    return false;
  }
}