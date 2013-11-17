package com.ankamagames.baseImpl.client.proxyclient.base.console.command;

import aeF;
import coq;
import cth;
import dnc;
import java.util.ArrayList;

public class NavigateToCommandSetCommand
  implements dnc
{
  private coq icV;

  public NavigateToCommandSetCommand(coq paramcoq)
  {
    this.icV = paramcoq;
  }

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    paramcth.b(this.icV);
  }

  public boolean X()
  {
    return false;
  }
}