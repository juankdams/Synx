package com.ankamagames.wakfu.client.console.command.fight;

import aeF;
import cth;
import dmM;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class DisableFightVisibilityCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(DisableFightVisibilityCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    dmM.cUe().jB(true);
    dmM.cUe().cUl();
  }

  public boolean X() {
    return false;
  }
}