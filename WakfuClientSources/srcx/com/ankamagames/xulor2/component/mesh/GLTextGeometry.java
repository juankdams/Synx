package com.ankamagames.xulor2.component.mesh;

import Jg;
import Or;
import P;
import aBV;
import aYQ;
import avN;
import bCO;
import bNa;
import bRi;
import bSr;
import bTj;
import brR;
import cBQ;
import cDG;
import cdg;
import cmV;
import cnQ;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import dDq;
import dHL;
import dSw;
import dUq;
import dVI;
import dsZ;
import duS;
import java.awt.Color;
import java.util.ArrayList;
import javax.media.opengl.GL;

public final class GLTextGeometry extends Geometry
{
  public static final GLTextGeometry.ObjectFactory ekj = new GLTextGeometry.ObjectFactory();
  public static final boolean ekk = true;
  private static final int ekl = 400;
  private bRi ekm;
  private long ekn = 0L;
  private boolean eko = false;

  private boolean ekp = false;
  private boolean ekq = false;

  private bNa bPm = null;

  private long bWA = 0L;
  VertexBufferPCT dJj;

  public void setTextBuilder(bRi parambRi)
  {
    this.ekm = parambRi;
  }

  public void b(dSw paramdSw) {
    if (!bB) throw new AssertionError("Currently not implemented"); 
  }

  public void d(aYQ paramaYQ)
  {
    if (!bB) throw new AssertionError("Currently not implemented"); 
  }

  public void M(float paramFloat)
  {
  }

  public void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { if (!bB) throw new AssertionError("Currently not implemented"); 
  }

  public boolean bbs()
  {
    return this.ekp;
  }

  public void setBrightenColor(boolean paramBoolean) {
    this.ekp = paramBoolean;
  }

  public boolean bbt() {
    return this.ekq;
  }

  public void setDarkenColor(boolean paramBoolean) {
    this.ekq = paramBoolean;
  }

  public void setModulationColor(bNa parambNa) {
    if (this.bPm == parambNa) {
      return;
    }
    this.bPm = parambNa;
  }

  public bNa getModulationColor() {
    return this.bPm;
  }

  public void setCurrentTime(long paramLong) {
    this.bWA = paramLong;
  }

  public void a(bSr parambSr)
  {
    if ((!bB) && (parambSr.aJG() != dHL.lSB)) throw new AssertionError();
    GL localGL = (GL)parambSr.bZk();

    dsZ localdsZ = dsZ.cZe();

    avN localavN = dUq.dup().dut();
    duS localduS = this.ekm.buJ();

    ArrayList localArrayList1 = this.ekm.bYi();
    int i = localArrayList1.size();
    int j = this.ekm.getOrientedHeight();

    int k = this.ekm.bYv();

    cmV localcmV = cBQ.cxL().cxS();
    float f1 = localcmV.getScale();
    int m = (int)((localduS.getScreenY() + localduS.getAppearance().getBottomInset()) * f1);
    long l = this.ekm.bYD();
    int n = (l > 0L) && (this.bWA != -1L) ? ef(l) : -1;
    if ((n != -1) && (n >= this.ekm.bXX().getTextBuilder().bYf()) && (this.bWA != -1L)) {
      this.ekm.bXX().bhT();
      this.bWA = -1L;
    }
    int i1 = 0;

    for (int i2 = this.ekm.bYm(); i2 < i; i2++)
    {
      brR localbrR = (brR)localArrayList1.get(i2);

      int i3 = localbrR.getY() - k + j;

      if (i3 + localbrR.getHeight() <= 0)
      {
        break;
      }

      if (localavN != null) {
        if (i3 + m < localavN.getY() + localavN.getHeight())
        {
          if (i3 + localbrR.getHeight() + m <= localavN.getY())
            break;
        }
      }
      else {
        float f2 = 0.0F;
        float f3;
        if (localbrR.aOg() > 0)
          f3 = (this.ekm.getSize().width - localbrR.getWidth()) / localbrR.aOg();
        else {
          f3 = 0.0F;
        }

        ArrayList localArrayList2 = localbrR.bAm();
        for (int i4 = 0; i4 < localArrayList2.size(); i4++) {
          cDG localcDG = (cDG)localArrayList2.get(i4);
          Object localObject;
          switch (vF.bkn[localcDG.czB().ordinal()])
          {
          case 1:
            localObject = (dVI)localcDG;

            dDq localdDq = ((dVI)localObject).getPixmap();
            if ((localdDq != null) && (localdDq.hN() != null))
            {
              int i8 = bCO.bC(localbrR.getX() + ((dVI)localObject).getX() + f2);
              int i9 = ((dVI)localObject).getWidth();
              int i10 = ((dVI)localObject).getImageHeight();

              int i11 = (localbrR.getHeight() - i10) / 2;

              if (this.bPm != null) {
                localGL.glColor4f(this.bPm.QC(), this.bPm.QD(), this.bPm.QE(), this.bPm.getAlpha());
              }
              else
              {
                localGL.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
              }

              localdsZ.a(parambSr, (cdg)localdDq.hN());
              localdsZ.x(parambSr);
              localGL.glBegin(7);

              localGL.glTexCoord2f(localdDq.eVH, localdDq.hYN);
              localGL.glVertex2i(i8, i3 + i11);

              localGL.glTexCoord2f(localdDq.hYM, localdDq.hYN);
              localGL.glVertex2i(i8 + i9, i3 + i11);

              localGL.glTexCoord2f(localdDq.hYM, localdDq.eVG);
              localGL.glVertex2i(i8 + i9, i3 + i10 + i11);

              localGL.glTexCoord2f(localdDq.eVH, localdDq.eVG);
              localGL.glVertex2i(i8, i3 + i10 + i11);

              localGL.glEnd();

              if ((i1 + 1 > n) && (n != -1)) {
                break label1523;
              }
              i1++;
            }
            break;
          case 2:
            localObject = (aBV)localcDG;
            int i7 = 0;
            if ((((aBV)localObject).getText().length() + i1 > n) && (n != -1)) {
              i7 = 1;
            }
            P localP = ((aBV)localObject).aOe();

            Color localColor = ((aBV)localObject).getColor();
            boolean bool1 = ((aBV)localObject).isUnderline();
            boolean bool2 = ((aBV)localObject).aOh();

            if (localColor == null) {
              localColor = this.ekm.bXY();
            }
            if (localP == null) {
              localP = this.ekm.aFz();
            }

            if ((localP != null) && (localColor != null) && (((aBV)localObject).getWidth() != 0) && (((aBV)localObject).getHeight() != 0))
            {
              int i12 = bCO.bC(localbrR.getX() + ((aBV)localObject).getX() + f2);
              f2 += ((aBV)localObject).aOg() * f3;

              if (this.ekp) {
                localColor = localColor.brighter().brighter();
              }
              if (this.ekq) {
                localColor = localColor.darker();
              }
              float f4 = localColor.getAlpha() / 255.0F;
              float f5 = localColor.getRed() / 255.0F;
              float f6 = localColor.getGreen() / 255.0F;
              float f7 = localColor.getBlue() / 255.0F;

              if (this.bPm != null) {
                f5 *= this.bPm.QC();
                f6 *= this.bPm.QD();
                f7 *= this.bPm.QE();
                f4 *= this.bPm.getAlpha();
              }

              localP.begin3DRendering();

              localP.setColor(f5, f6, f7, f4);
              localP.a(((aBV)localObject).aOc(), i12, i7 != 0 ? n - i1 : ((aBV)localObject).getText().length(), i3 + localbrR.bAg(), 1.0F, f3);

              localP.end3DRendering();
              int i13;
              if (bool1) {
                localdsZ.ks(false);
                localdsZ.setLineWidth(1.0F);
                localdsZ.x(parambSr);
                localGL.glColor4f(f5, f6, f7, f4);
                localGL.glBegin(1);
                localGL.glVertex2i(i12, i3);
                i13 = bCO.bC(((aBV)localObject).getWidth() + ((aBV)localObject).aOg() * f3);
                localGL.glVertex2i(i12 + i13, i3);
                localGL.glEnd();
              }

              if (bool2) {
                localdsZ.ks(false);
                localdsZ.setLineWidth(1.0F);
                localdsZ.x(parambSr);
                localGL.glColor4f(f5, f6, f7, f4);
                localGL.glBegin(1);
                localGL.glVertex2i(i12, i3 + localbrR.getHeight() / 2);
                i13 = bCO.bC(((aBV)localObject).getWidth() + ((aBV)localObject).aOg() * f3);
                localGL.glVertex2i(i12 + i13, i3 + localbrR.getHeight() / 2);
                localGL.glEnd();
              }
            }

            i1 += ((aBV)localObject).getText().length();
            if (i7 != 0)
            {
              break label1523;
            }

          }

        }

        bTj localbTj = localbrR.bAf();
        if (localbTj != null) {
          int i5 = localbrR.getX() + localbTj.getX();
          int i6 = localbTj.getWidth();

          if (localbTj.bZK()) {
            if (System.currentTimeMillis() - this.ekn >= 400L) {
              this.eko = (!this.eko);
              this.ekn = System.currentTimeMillis();
            }
          }
          else this.eko = true;

          if (this.eko) {
            localdsZ.ks(false);
            localdsZ.a(cnQ.hVa, cnQ.hUT);
            localdsZ.x(parambSr);
            localGL.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            localGL.glBegin(7);
            localGL.glVertex2i(i5, i3);
            localGL.glVertex2i(i5 + i6, i3);
            localGL.glVertex2i(i5 + i6, i3 + localbrR.getHeight());
            localGL.glVertex2i(i5, i3 + localbrR.getHeight());
            localGL.glEnd();
          }
        }
      }
    }
    label1523: localdsZ.reset();
    localdsZ.x(parambSr);
  }

  public void q(bSr parambSr) {
    if ((!bB) && (parambSr.aJG() != dHL.lSB)) throw new AssertionError();
    GL localGL = (GL)parambSr.bZk();

    dsZ localdsZ = dsZ.cZe();

    avN localavN = dUq.dup().dut();
    duS localduS = this.ekm.buJ();

    ArrayList localArrayList1 = this.ekm.bYi();
    int i = localArrayList1.size();
    int j = this.ekm.getOrientedHeight();

    int k = this.ekm.bYv();

    cmV localcmV = cBQ.cxL().cxS();
    float f1 = localcmV.getScale();
    int m = (int)(localduS.getScreenY() * f1);
    long l = this.ekm.bYD();
    int n = (l > 0L) && (this.bWA != -1L) ? ef(l) : -1;
    if ((n != -1) && (n >= this.ekm.bXX().getTextBuilder().bYf()) && (this.bWA != -1L)) {
      this.ekm.bXX().bhT();
      this.bWA = -1L;
    }
    int i1 = 0;

    for (int i2 = this.ekm.bYm(); i2 < i; i2++)
    {
      brR localbrR = (brR)localArrayList1.get(i2);

      float f2 = 0.0F;
      float f3;
      if (localbrR.aOg() > 0)
        f3 = (this.ekm.getSize().width - localbrR.getWidth()) / localbrR.aOg();
      else {
        f3 = 0.0F;
      }

      int i3 = localbrR.getY() - k + j;

      if (i3 + localbrR.getHeight() <= 0)
      {
        break;
      }

      if (localavN != null) {
        if (i3 + m < localavN.getY() + localavN.getHeight())
        {
          if (i3 + localbrR.getHeight() + m <= localavN.getY())
            break;
        }
      }
      else
      {
        ArrayList localArrayList2 = localbrR.bAm();
        for (int i4 = 0; i4 < localArrayList2.size(); i4++) {
          cDG localcDG = (cDG)localArrayList2.get(i4);
          Object localObject;
          switch (vF.bkn[localcDG.czB().ordinal()])
          {
          case 1:
            localObject = (dVI)localcDG;

            dDq localdDq = ((dVI)localObject).getPixmap();
            if ((localdDq != null) && (localdDq.hN() != null))
            {
              int i8 = bCO.bC(localbrR.getX() + ((dVI)localObject).getX() + f2);
              int i9 = ((dVI)localObject).getWidth();
              int i10 = ((dVI)localObject).getImageHeight();

              if (this.bPm != null) {
                localGL.glColor4f(this.bPm.QC(), this.bPm.QD(), this.bPm.QE(), this.bPm.getAlpha());
              }
              else
              {
                localGL.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
              }

              localdsZ.a(parambSr, (cdg)localdDq.hN());
              localdsZ.x(parambSr);
              localGL.glBegin(7);

              localGL.glTexCoord2f(localdDq.eVH, localdDq.hYN);
              localGL.glVertex2i(i8, i3);

              localGL.glTexCoord2f(localdDq.hYM, localdDq.hYN);
              localGL.glVertex2i(i8 + i9, i3);

              localGL.glTexCoord2f(localdDq.hYM, localdDq.eVG);
              localGL.glVertex2i(i8 + i9, i3 + i10);

              localGL.glTexCoord2f(localdDq.eVH, localdDq.eVG);
              localGL.glVertex2i(i8, i3 + i10);

              localGL.glEnd();

              if ((i1 + 1 > n) && (n != -1)) {
                break label1499;
              }
              i1++;
            }
            break;
          case 2:
            localObject = (aBV)localcDG;
            int i7 = 0;
            if ((((aBV)localObject).getText().length() + i1 > n) && (n != -1)) {
              i7 = 1;
            }
            P localP = ((aBV)localObject).aOe();

            Color localColor = ((aBV)localObject).getColor();
            boolean bool1 = ((aBV)localObject).isUnderline();
            boolean bool2 = ((aBV)localObject).aOh();

            if (localColor == null) {
              localColor = this.ekm.bXY();
            }
            if (localP == null) {
              localP = this.ekm.aFz();
            }

            if ((localP != null) && (localColor != null) && (((aBV)localObject).getWidth() != 0) && (((aBV)localObject).getHeight() != 0))
            {
              int i11 = bCO.bC(localbrR.getX() + ((aBV)localObject).getX() + f2);
              f2 += ((aBV)localObject).aOg() * f3;

              if ((localP.at()) || (this.ekp)) {
                localColor = localColor.brighter().brighter();
              }
              if (this.ekq) {
                localColor = localColor.darker();
              }
              float f4 = localColor.getAlpha() / 255.0F;
              float f5 = localColor.getRed() / 255.0F;
              float f6 = localColor.getGreen() / 255.0F;
              float f7 = localColor.getBlue() / 255.0F;

              if (this.bPm != null) {
                f5 *= this.bPm.QC();
                f6 *= this.bPm.QD();
                f7 *= this.bPm.QE();
                f4 *= this.bPm.getAlpha();
              }

              localP.begin3DRendering();

              localP.setColor(f5, f6, f7, f4);
              localP.a(((aBV)localObject).aOc(), i11, i7 != 0 ? n - i1 : ((aBV)localObject).getText().length(), i3 + localbrR.bAg(), 1.0F, f3);

              localP.end3DRendering();
              int i12;
              if (bool1) {
                localdsZ.ks(false);
                localdsZ.x(parambSr);
                localGL.glLineWidth(1.0F);
                localGL.glColor4f(f5, f6, f7, f4);
                localGL.glBegin(1);
                localGL.glVertex2i(i11, i3);
                i12 = bCO.bC(((aBV)localObject).getWidth() + ((aBV)localObject).aOg() * f3);
                localGL.glVertex2i(i11 + i12, i3);
                localGL.glEnd();
              }

              if (bool2) {
                localdsZ.ks(false);
                localdsZ.x(parambSr);
                localGL.glLineWidth(1.0F);
                localGL.glColor4f(f5, f6, f7, f4);
                localGL.glBegin(1);
                localGL.glVertex2i(i11, i3 + localbrR.getHeight() / 2);
                i12 = bCO.bC(((aBV)localObject).getWidth() + ((aBV)localObject).aOg() * f3);
                localGL.glVertex2i(i11 + i12, i3 + localbrR.getHeight() / 2);
                localGL.glEnd();
              }
            }

            i1 += ((aBV)localObject).getText().length();
            if (i7 != 0)
            {
              break label1499;
            }

          }

        }

        bTj localbTj = localbrR.bAf();
        if (localbTj != null) {
          int i5 = localbrR.getX() + localbTj.getX();
          int i6 = localbTj.getWidth();

          if (localbTj.bZK()) {
            if (System.currentTimeMillis() - this.ekn >= 400L) {
              this.eko = (!this.eko);
              this.ekn = System.currentTimeMillis();
            }
          }
          else this.eko = true;

          if (this.eko) {
            localdsZ.ks(false);
            localdsZ.a(cnQ.hVa, cnQ.hUT);
            localdsZ.x(parambSr);
            localGL.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            localGL.glBegin(7);
            localGL.glVertex2i(i5, i3);
            localGL.glVertex2i(i5 + i6, i3);
            localGL.glVertex2i(i5 + i6, i3 + localbrR.getHeight());
            localGL.glVertex2i(i5, i3 + localbrR.getHeight());
            localGL.glEnd();
          }
        }
      }
    }
    label1499: localdsZ.reset();
    localdsZ.x(parambSr);
  }

  private int ef(long paramLong) {
    long l1 = System.currentTimeMillis();
    if (this.bWA == 0L)
      this.bWA = l1;
    long l2 = l1 - this.bWA;
    return (int)(l2 / paramLong);
  }

  public void bbu() {
    this.bWA = 0L;
  }

  protected void gL()
  {
    this.bWA = 0L;
    this.ekn = 0L;

    this.eko = false;

    this.ekp = false;
    this.ekq = false;
  }

  protected void gM()
  {
    this.ekm = null;
    this.bPm = null;
  }
}