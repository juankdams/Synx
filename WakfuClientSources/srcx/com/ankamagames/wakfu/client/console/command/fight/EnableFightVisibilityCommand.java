package com.ankamagames.wakfu.client.console.command.fight;

import aeF;
import cth;
import dmM;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class EnableFightVisibilityCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(EnableFightVisibilityCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    dmM.cUe().jB(false);
    dmM.cUe().cUl();
  }

  public boolean X() {
    return false;
  }
}