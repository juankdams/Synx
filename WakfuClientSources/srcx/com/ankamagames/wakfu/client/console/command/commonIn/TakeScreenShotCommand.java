package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import ay;
import bAU;
import bdh;
import bxw;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import cth;
import dnc;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class TakeScreenShotCommand
  implements dnc
{
  private static final Logger K = Logger.getLogger(TakeScreenShotCommand.class);
  private static final String cfN = "../../screenshots/";
  private static final String cfO = ".png";

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    bxw localbxw = new bxw(this, null);
    try
    {
      if (!a(localbxw)) {
        localbxw.c(new RuntimeException("Internal error"));
        return;
      }
    } catch (IOException localIOException) {
      localbxw.c(localIOException);
      return;
    }

    boolean bool = WakfuClientInstance.awy().rs().a(localbxw);

    if (!bool)
      K.error("Impossible de faire une requête de screenShot auprès du Renderer");
  }

  private boolean a(bxw parambxw) {
    String str;
    try {
      str = ay.bd().getString("screenShotPath");
    } catch (bdh localbdh) {
      str = "../../screenshots/";
    }

    File localFile = new File(str);
    if ((!localFile.exists()) && (!localFile.mkdirs())) {
      throw new IOException("Unable to create directory : path=" + str);
    }
    bxw.a(parambxw, new File(localFile, System.currentTimeMillis() + ".png"));
    return bxw.b(parambxw).createNewFile();
  }

  public boolean X() {
    return false;
  }
}