package com.ankamagames.baseImpl.graphics.isometric.highlight;

import com.ankamagames.framework.graphics.engine.entity.Entity3D;

public class HighLightEntity extends Entity3D
{
  public static final HighLightEntity.ObjectFactory biF = new HighLightEntity.ObjectFactory();
  public boolean biG;

  protected void gL()
  {
    super.gL();
    dsJ();
  }

  public void clear()
  {
    super.clear();
    this.biG = false;
  }
}