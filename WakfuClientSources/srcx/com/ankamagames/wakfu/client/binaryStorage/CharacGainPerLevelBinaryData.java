package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import cLO;
import drN;

public class CharacGainPerLevelBinaryData
  implements drN
{
  protected short aSi;
  protected cLO hgh;

  public short uO()
  {
    return this.aSi;
  }
  public cLO cam() {
    return this.hgh;
  }

  public void reset() {
    this.aSi = 0;
    this.hgh = null;
  }

  public void a(bUT parambUT) {
    this.aSi = parambUT.getShort();
    int i = parambUT.getInt();
    this.hgh = new cLO(i);

    for (int j = 0; j < i; j++) {
      byte b = parambUT.get();
      float f = parambUT.getFloat();
      this.hgh.b(b, f);
    }
  }

  public final int gE()
  {
    return aKp.eld.getId();
  }
}