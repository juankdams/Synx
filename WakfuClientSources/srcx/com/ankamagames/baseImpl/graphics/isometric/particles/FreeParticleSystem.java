package com.ankamagames.baseImpl.graphics.isometric.particles;

import adG;
import agn;
import ahm;
import auR;
import bSl;
import bUe;
import bjC;
import bjr;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;

public class FreeParticleSystem extends IsoParticleSystem
  implements agn, bSl
{
  private bSl bpK;
  private int bdj = -1;

  private int kO = -2147483648;
  private int kP = -2147483648;
  private int kQ;
  private ArrayList dcp = null;
  private byte gWa;

  public FreeParticleSystem(boolean paramBoolean)
  {
    super(paramBoolean);
  }

  protected boolean bVU()
  {
    return vj(a());
  }

  public float getX()
  {
    if (this.bpK != null)
      return this.bpK.getWorldX();
    return super.getX();
  }

  public float getY()
  {
    if (this.bpK != null)
      return this.bpK.getWorldY();
    return super.getY();
  }

  public float aCv()
  {
    if (this.bpK != null)
      return this.bpK.getAltitude();
    return super.aCv();
  }

  public bSl Gu() {
    return this.bpK;
  }

  public void b(bSl parambSl) {
    if (parambSl == this.bpK)
      return;
    if ((this.bpK instanceof bjr)) {
      ((bjr)this.bpK).b(this);
    }
    this.bpK = parambSl;
    if ((this.bpK instanceof bjr))
      ((bjr)this.bpK).a(this);
  }

  public void a(ahm paramahm, float paramFloat, int paramInt)
  {
    if ((paramFloat == 0.0F) && (paramInt == 0))
      b(paramahm);
    else
      b(new auR(paramahm, paramFloat, paramInt));
  }

  public float getAltitude() {
    return aCv();
  }

  public float getWorldX() {
    return getX();
  }

  public float getWorldY() {
    return getY();
  }

  public void x(float paramFloat1, float paramFloat2) {
    j(paramFloat1, paramFloat2);
  }

  public void k(float paramFloat1, float paramFloat2, float paramFloat3) {
    f(paramFloat1, paramFloat2, paramFloat3);
  }

  public int getScreenX() {
    return this.kO;
  }

  public int getScreenY() {
    return this.kP;
  }

  public void setScreenX(int paramInt) {
    if (this.kO == paramInt) {
      return;
    }

    this.kO = paramInt;
    atF();
  }

  public void setScreenY(int paramInt) {
    if (this.kP == paramInt) {
      return;
    }

    this.kP = paramInt;
    atF();
  }

  public void T(int paramInt) {
    if (this.kQ == paramInt) {
      return;
    }

    this.kQ = paramInt;
    atF();
  }

  public int eY() {
    return this.kQ;
  }

  public boolean eZ() {
    return (this.kO != -2147483648) && (this.kP == -2147483648);
  }

  public void a(bUe parambUe) {
    if (this.dcp == null) {
      this.dcp = new ArrayList();
    }
    this.dcp.add(parambUe);
  }

  public void b(bUe parambUe) {
    if (this.dcp == null) {
      return;
    }
    this.dcp.remove(parambUe);

    if (this.dcp.isEmpty()) {
      this.dcp = null;
      this.kO = (this.kP = -2147483648);
    }
  }

  protected void atF() {
    if (this.dcp != null) {
      int i = this.dcp.size();
      for (int j = 0; j < i; j++)
        ((bUe)this.dcp.get(j)).a(this, this.kO, this.kP, this.kQ);
    }
  }

  public int a()
  {
    bSl localbSl = Gu();
    if ((localbSl instanceof auR))
      localbSl = ((auR)localbSl).Gu();
    if ((localbSl instanceof bjC))
      return ((bjC)localbSl).aeR();
    return this.bdj;
  }

  public void cS(int paramInt) {
    this.bdj = paramInt;
  }

  public void du(byte paramByte)
  {
    super.du(paramByte);
    this.gWa = paramByte;
  }

  public float atu() {
    return this.cat;
  }

  public void b(adG paramadG)
  {
    super.b(paramadG);
  }

  public boolean Pd()
  {
    return (this.bpK != null) || (super.Pd());
  }

  public int Pe()
  {
    if ((this.bpK instanceof ahm))
      return ((ahm)this.bpK).asR() + (this.hEZ ? -1 : 1);
    return super.Pe();
  }

  public boolean c(adG paramadG)
  {
    if (this.bpK != null) {
      bSl localbSl = this.bpK;
      if ((localbSl instanceof auR)) {
        localbSl = ((auR)localbSl).Gu();
      }
      if ((localbSl instanceof ahm)) {
        ahm localahm = (ahm)localbSl;
        Entity localEntity = localahm.getEntity();
        if (localEntity != null) {
          this.mnP = (localEntity.mnP + (this.hEZ ? -1 : 1));
          if (this.mnP < 0L)
            this.mnP = 0L;
          j(localahm.OV(), localahm.OW());
          return true;
        }
      }
    }
    return super.c(paramadG);
  }

  protected void gL()
  {
    super.gL();
    this.bdj = -1;

    this.kO = -2147483648;
    this.kP = -2147483648;
    this.kQ = 0;

    this.dcp = null;
    this.gWa = 0;
  }

  protected void gM()
  {
    super.gM();
    b(null);
  }
}