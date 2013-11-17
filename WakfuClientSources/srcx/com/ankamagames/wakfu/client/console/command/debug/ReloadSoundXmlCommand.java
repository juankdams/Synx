package com.ankamagames.wakfu.client.console.command.debug;

import aWc;
import aeF;
import cth;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ReloadSoundXmlCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(ReloadSoundXmlCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    aWc.blo().blT();
    try
    {
      aWc.blo().blU();
    } catch (Exception localException1) {
      paramcth.err("Problème au rechargement des barks");
    }
    try
    {
      aWc.blo().blV();
    } catch (Exception localException2) {
      paramcth.err("Problème au rechargement des grounds");
    }
  }

  public boolean X()
  {
    return false;
  }
}