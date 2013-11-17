package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import clK;
import cth;
import dDE;
import dnc;
import dxL;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class HourCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    dDE localdDE = dDE.dft();

    DecimalFormat localDecimalFormat = new DecimalFormat("00");

    dxL localdxL = localdDE.VN();
    StringBuilder localStringBuilder = new StringBuilder().append(localdDE.abK().getName()).append(", ").append(localDecimalFormat.format(localdxL.getDay())).append("/").append(localDecimalFormat.format(localdxL.getMonth())).append("/").append(localdxL.getYear()).append(" ").append(localDecimalFormat.format(localdxL.getHours())).append(":").append(localDecimalFormat.format(localdxL.getMinutes()));

    paramcth.trace(localStringBuilder.toString());
  }

  public boolean X()
  {
    return false;
  }
}