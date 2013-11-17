package com.ankamagames.wakfu.client.binaryStorage;

import aBR;
import aKp;
import bUT;
import drN;

public class AvatarBreedColorsBinaryData
  implements drN
{
  protected int aw;
  protected aBR[] bay;

  public int getId()
  {
    return this.aw;
  }
  public aBR[] yK() {
    return this.bay;
  }

  public void reset() {
    this.aw = 0;
    this.bay = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();

    int i = parambUT.getInt();
    this.bay = new aBR[i];
    for (int j = 0; j < i; j++) {
      this.bay[j] = new aBR();
      this.bay[j].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.emZ.getId();
  }
}