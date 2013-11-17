package com.ankamagames.framework.graphics.engine.text;

import FB;
import MD;
import bNa;
import bSr;
import cEh;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.ankamagames.framework.kernel.core.maths.Matrix44.ObjectFactory;
import cxn;
import dRJ;
import dsZ;
import hf;
import java.util.ArrayList;

public class EntityText extends Entity
{
  public static final EntityText.ObjectFactory laL = new EntityText.ObjectFactory();
  private static final Matrix44 laM = (Matrix44)Matrix44.bFc.bQx();
  private static final Matrix44 hdd = (Matrix44)Matrix44.bFc.bQx();
  protected String hi;
  protected int gKk;
  protected int haG;
  protected int laN;
  protected int laO;
  protected int laP;
  protected final ArrayList hqr;
  protected int laQ;
  protected int laR;
  protected int laS;
  private int laT;
  private GeometryText laU;
  private GeometryBackground laV;
  private boolean laW;
  private float dka = 1.0F;
  private dRJ laX = dRJ.mnq;

  private EntityText()
  {
    this.hqr = new ArrayList(32);
  }

  public final void a(GeometryText paramGeometryText)
  {
    paramGeometryText.gQ();
    if (this.laU != null)
      this.laU.axl();
    this.laU = paramGeometryText;
  }

  public final void a(GeometryBackground paramGeometryBackground) {
    if (paramGeometryBackground != null)
      paramGeometryBackground.gQ();
    if (this.laV != null)
      this.laV.axl();
    this.laV = paramGeometryBackground;
  }

  public final void s(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    if (this.laV == null) {
      return;
    }
    this.laV.setColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public final GeometryText cPA() {
    return this.laU;
  }

  public final GeometryBackground cPB() {
    return this.laV;
  }

  public final void M(float paramFloat) {
  }

  public final void p(bSr parambSr) {
    if (!isVisible()) {
      return;
    }
    if (this.laW) {
      pa(this.hi);
      this.laW = false;
    }

    parambSr.f(dsE().aGp());

    this.mnV.i(parambSr);

    int i = 0;
    int j = 0;

    dsZ.cZe().ks(false);
    if (this.laV != null) {
      int k = Math.max(this.laO, this.haG);
      int m = Math.max(this.laP, this.laN);

      this.laV.setWidth(k);
      this.laV.setHeight(m);
      this.laV.bz(this.laR + this.laX.iO(k));
      this.laV.bA(this.laS + this.laX.iP(m));
      this.laV.a(parambSr);
      i = (int)(i + this.laV.bJd());
      j = (int)(j + this.laV.bJg());
    }

    this.laU.aj(this.laR, this.laS);
    this.laU.cS(this.laX.iO(this.laO) + i);
    this.laU.cT(this.laX.iP(this.laP) + j);

    this.laU.P(this.hqr);
    this.laU.zc(this.laQ);
    this.laU.setScale(this.dka);
    this.laU.a(parambSr);

    this.mnW.i(parambSr);
  }

  public final void m(cEh paramcEh) {
    cxn localcxn = (cxn)dsE().sz(0);
    localcxn.d(paramcEh);
    dsE().bMH();

    this.laU.m(paramcEh);
  }

  public final void eH(int paramInt1, int paramInt2) {
    this.laR = paramInt1;
    this.laS = paramInt2;
  }

  public void a(hf paramhf) {
    this.laU.a(paramhf);
    this.laW = true;
  }

  public final void setText(String paramString) {
    this.hi = paramString;
    this.laW = true;
  }

  public final String getText() {
    return this.hi;
  }

  public final void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.laU.setColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public final bNa getColor() {
    return this.laU.getColor();
  }

  public final void setMaxWidth(int paramInt) {
    if (paramInt < 0)
      paramInt = 2147483647;
    this.gKk = paramInt;
    this.laW = true;
  }

  public final int cPC() {
    return this.laO;
  }

  public final int getTextHeight() {
    return this.laP;
  }

  public final int getMinWidth() {
    return this.haG;
  }

  public int getMaxWidth() {
    return this.gKk;
  }

  public final void setMinWidth(int paramInt) {
    this.haG = paramInt;
  }

  public final int getMinHeight() {
    return this.laN;
  }

  public final void setMinHeight(int paramInt) {
    this.laN = paramInt;
  }

  public float getZoom() {
    return this.dka;
  }

  public void setZoom(float paramFloat) {
    this.dka = paramFloat;
  }

  protected void gL()
  {
    super.gL();

    this.gKk = 2147483647;
    this.haG = 0;
    this.laN = 0;

    this.laO = 0;

    this.laR = 0;
    this.laS = 0;

    this.laT = 2;
    this.laW = false;

    this.dka = 1.0F;
    this.laX = dRJ.mnq;

    cxn localcxn = new cxn();
    localcxn.Ls();
    dsE().a(localcxn);
  }

  protected void gM()
  {
    super.gM();
    this.hqr.clear();

    if (this.laU != null) {
      this.laU.axl();
      this.laU = null;
    }
    if (this.laV != null) {
      this.laV.axl();
      this.laV = null;
    }
  }

  protected void pa(String paramString) {
    this.hqr.clear();
    this.laO = 0;
    this.laP = 0;

    if ((paramString == null) || (paramString.length() == 0)) {
      this.laQ = 0;
      return;
    }
    if (this.gKk == 0) {
      return;
    }

    StringBuilder localStringBuilder1 = new StringBuilder(128);
    StringBuilder localStringBuilder2 = new StringBuilder(128);
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;

    while (i < arrayOfChar.length) {
      StringBuilder localStringBuilder3 = new StringBuilder(128);
      MD localMD = new MD(0, 0);

      int j = 0;
      int k = 0;
      while ((localMD.getX() < this.gKk) && (i < arrayOfChar.length) && (j == 0)) {
        char c = arrayOfChar[(i++)];

        int m = 1;
        if (i < arrayOfChar.length) {
          int n = arrayOfChar[i];
          if ((n == 46) || (n == 63) || (n == 33) || (n == 58) || (n == 59) || (n == 44)) {
            m = 0;
          }
        }
        if ((c == ' ') && (m != 0)) {
          localStringBuilder3.append(localStringBuilder2.toString()).append(' ');
          localStringBuilder2 = new StringBuilder(128);
          k = 1;
        } else if (c == '\n') {
          j = 1;
          localStringBuilder3.append(localStringBuilder2.toString());
          localStringBuilder2 = new StringBuilder(128);
          k = 1;
        } else {
          localStringBuilder2.append(c);
        }

        if (j == 0) {
          localStringBuilder1.append(c);
          localMD = this.laU.oz(localStringBuilder1.toString());
        }

      }

      if (k == 0) {
        localStringBuilder3.append(localStringBuilder2.toString());
        localStringBuilder2 = new StringBuilder(128);
      }

      if (i >= arrayOfChar.length) {
        localStringBuilder3.append(localStringBuilder2.toString());
      }

      localStringBuilder1 = new StringBuilder(128);
      if (localStringBuilder2.length() != 0) {
        localStringBuilder1.append(localStringBuilder2);
      }

      String str = localStringBuilder3.toString();
      if (str.length() >= 0)
      {
        localMD = this.laU.oz(str);
        this.hqr.add(localStringBuilder3.toString().toCharArray());
        this.laO = Math.max(this.laO, localMD.getX());
        this.laP += localMD.getY();
      }
    }
    this.laQ = (this.laP / this.hqr.size() + this.laT);
    this.laP = (this.laQ * this.hqr.size());
  }

  public void a(dRJ paramdRJ) {
    this.laX = paramdRJ;
  }
}