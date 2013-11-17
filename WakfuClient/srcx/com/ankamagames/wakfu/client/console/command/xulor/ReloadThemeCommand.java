package com.ankamagames.wakfu.client.console.command.xulor;

import aeF;
import cBQ;
import cth;
import dnc;
import java.util.ArrayList;
import uk;

public class ReloadThemeCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    paramcth.trace("Rechargement du fichier de thème en cours...");
    cBQ.cxL().bSM().CP();
    paramcth.trace("Terminé.");
  }

  public boolean X()
  {
    return false;
  }
}