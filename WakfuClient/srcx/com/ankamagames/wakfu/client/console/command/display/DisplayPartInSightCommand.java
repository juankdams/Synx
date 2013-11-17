package com.ankamagames.wakfu.client.console.command.display;

import aYx;
import adr;
import aeF;
import byv;
import byz;
import ciL;
import cth;
import dbL;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class DisplayPartInSightCommand
  implements dnc
{
  private static final Logger K = Logger.getLogger(DisplayPartInSightCommand.class);
  private static final String hFI = "DEBUG_FRONT_LAYER";
  private static final String hFJ = "DEBUG_BACK_LAYER";
  private static final String hFK = "DEBUG_SIDE_LAYER";
  private static final float[] hFL = { 1.0F, 0.0F, 0.0F, 0.5F };
  private static final float[] hFM = { 0.0F, 1.0F, 0.0F, 0.5F };
  private static final float[] hFN = { 0.0F, 0.0F, 1.0F, 0.5F };

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    byz localbyz = byv.bFN().bFO();
    aYx localaYx = localbyz.atN();
    g("DEBUG_FRONT_LAYER", hFL);
    g("DEBUG_BACK_LAYER", hFM);
    g("DEBUG_SIDE_LAYER", hFN);
    int i = localbyz.fa();
    int j = localbyz.fb();
    for (int k = -10; k < 10; k++)
      for (int m = -10; m < 10; m++) {
        adr localadr = localaYx.E(i + k, j + m, localbyz.fc());
        int n = localadr.aps();
        long l = dbL.ac(i + k, j + m, localbyz.fc());
        switch (n) {
        case 0:
          dbL.cNv().h(l, "DEBUG_FRONT_LAYER");
          break;
        case 2:
          dbL.cNv().h(l, "DEBUG_BACK_LAYER");
          break;
        case 1:
        case 3:
          dbL.cNv().h(l, "DEBUG_SIDE_LAYER");
        }
      }
  }

  private void g(String paramString, float[] paramArrayOfFloat)
  {
    ciL localciL = dbL.cNv().oN(paramString);
    if (localciL == null)
      try {
        localciL = dbL.cNv().oL(paramString);
        localciL.g(paramArrayOfFloat);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
    dbL.cNv().oO(paramString);
  }

  public boolean X() {
    return false;
  }
}