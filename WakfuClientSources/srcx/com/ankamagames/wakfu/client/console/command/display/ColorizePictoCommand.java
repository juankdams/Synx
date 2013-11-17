package com.ankamagames.wakfu.client.console.command.display;

import aeF;
import bGT;
import byv;
import byz;
import cth;
import dbL;
import dnc;
import java.util.ArrayList;

public class ColorizePictoCommand
  implements dnc
{
  private static float dFa = 1.0F;

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    byz localbyz = byv.bFN().bFO();
    long l1 = localbyz.fa();
    long l2 = localbyz.fb();
    long l3 = localbyz.fc();

    long l4 = dbL.ac((int)l1, (int)l2, (int)l3);
    if (dFa == 1.0F)
      dFa = 0.2F;
    else
      dFa = 1.0F;
    bGT.bOB().a(l4, 1.0F, 1.0F, 1.0F, dFa);
  }

  public boolean X()
  {
    return false;
  }
}