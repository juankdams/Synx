package com.ankamagames.wakfu.client.console.command.xulor;

import aeF;
import cBQ;
import cth;
import dnc;
import java.util.ArrayList;
import uk;

public class TextureDiagCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    paramcth.trace("Création des images en cours.");
    cBQ.cxL().bSM().CY();
    paramcth.trace("Fin de la création des images");
  }

  public boolean X()
  {
    return false;
  }
}