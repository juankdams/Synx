package com.ankamagames.wakfu.client.console.command.fight;

import aeF;
import cth;
import dnc;
import dux;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ReportCellCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(ReportCellCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    dux.reportCell(null);
  }

  public boolean X() {
    return false;
  }
}