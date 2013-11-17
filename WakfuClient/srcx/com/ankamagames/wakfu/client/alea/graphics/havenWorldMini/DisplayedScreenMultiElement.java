package com.ankamagames.wakfu.client.alea.graphics.havenWorldMini;

import aIJ;
import aRa;
import bCa;
import bxF;
import cid;
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import org.apache.log4j.Logger;

public class DisplayedScreenMultiElement extends DisplayedScreenElement
{
  private static final Logger K = Logger.getLogger(DisplayedScreenMultiElement.class);

  private static final cid bqk = cid.d(0, false, false);

  public static final DisplayedScreenMultiElement.ObjectFactory bql = new DisplayedScreenMultiElement.ObjectFactory();
  private EntityGroup bqm;
  private aIJ aDa;
  private aRa bqn;
  private int aVc;
  private int aVd;
  private int ia;
  private int ib;

  public void a(aRa paramaRa)
  {
    this.bqn = paramaRa;
  }

  public void a(int paramInt1, int paramInt2, short paramShort, int paramInt3) {
    ScreenElement localScreenElement = (ScreenElement)ScreenElement.lHn.bQy();
    localScreenElement.aj(paramInt1, paramInt2, paramShort);
    localScreenElement.b(bqk);

    localScreenElement.Cf((byte)(paramInt3 + 1));
    c(localScreenElement);
    localScreenElement.axl();
  }

  private void a(aIJ paramaIJ, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.aDa = paramaIJ;
    this.aVc = paramInt1;
    this.aVd = paramInt2;
    this.ia = paramInt3;
    this.ib = paramInt4;
  }

  public Entity GG()
  {
    return this.bqm;
  }

  public void GH()
  {
    if (this.bqm != null) {
      this.bqm.axl();
    }
    this.bqm = ((EntityGroup)EntityGroup.ecY.bQy());
    this.bqm.mnU = this;
    atq();
    c(this.bqm);

    GI();
    this.bqm.nB();
  }

  private void GI()
  {
    float f = bpc().ddH() * 10.0F;
    for (int i = 0; i < this.ib; i++) {
      for (int j = 0; j < this.ia; j++) {
        int k = this.aDa.R(this.aVc + j, this.aVd + i);
        bxF.a(this.bqm, k, j, i, f, this.bqn.nE(k));
      }
    }

    this.aDa.e(new bCa(this, f));
  }

  public boolean M(int paramInt1, int paramInt2)
  {
    return false;
  }

  public void d(float[] paramArrayOfFloat)
  {
    if (this.bqm == null) {
      return;
    }
    for (Entity localEntity : this.bqm.aSj())
      a((EntitySprite)localEntity, paramArrayOfFloat);
  }

  protected void e(float[] paramArrayOfFloat)
  {
    for (Entity localEntity : this.bqm.aSj()) {
      EntitySprite localEntitySprite = (EntitySprite)localEntity;
      localEntitySprite.setColor(paramArrayOfFloat[0], paramArrayOfFloat[1], paramArrayOfFloat[2], paramArrayOfFloat[3]);
      localEntitySprite.cPe();
    }
  }

  protected void gM()
  {
    super.gM();
    if (this.bqm != null) {
      this.bqm.axl();
      this.bqm = null;
    }
  }
}