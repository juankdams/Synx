import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;

public final class bRi
  implements Iterable
{
  private static final int hat = 1;
  private static final int hau = 2147483647;
  private static final String hav = "...";
  private static final String haw = "\n";
  private duS hax = null;

  private Color hay = Color.BLACK;

  private boolean haz = false;

  private aFE haA = aFE.ecd;

  private aFE haB = aFE.eca;

  private Pw haC = Pw.chX;
  private final atq haD;
  private final ArrayList haE = new ArrayList();
  private brR haF = null;

  private int gKk = 2147483647;

  private int haG = -1;

  private boolean haH = false;

  private boolean haI = false;

  private boolean haJ = false;

  private int haK = 0;

  private final Or haL = new Or(0, 0);

  private final Or haM = new Or(0, 0);

  private final Or haN = new Or(0, 0);

  private boolean haO = true;

  private boolean haP = true;

  private boolean haQ = true;

  private Boolean haR = Boolean.valueOf(false);
  private int haS = 0;
  private int TR = 0;

  private boolean haT = true;
  private boolean haU;
  private long haV = 0L;

  private int haW = 0;
  private int haX = 0;

  public bRi(atq paramatq)
  {
    this.haD = paramatq;
  }

  public void bXW()
  {
    for (int i = this.haE.size() - 1; i >= 0; i--) {
      ((brR)this.haE.get(i)).release();
    }
    this.haE.clear();
  }

  public void a(duS paramduS)
  {
    this.hax = paramduS;
  }

  public duS bXX()
  {
    return this.hax;
  }

  public P aFz()
  {
    return this.haD == null ? null : this.haD.aFz();
  }

  public void a(P paramP)
  {
    if (this.haD.aFz() != paramP) {
      this.haD.a(paramP);
      this.haO = true;
      this.haQ = true;

      this.hax.setNeedsToPreProcess();
      this.hax.setNeedsToMiddleProcess();
    }
  }

  public boolean aFA()
  {
    return this.haD.aFA();
  }

  public void setUseHighContrast(boolean paramBoolean)
  {
    this.haD.setUseHighContrast(paramBoolean);
  }

  public Color bXY()
  {
    return this.hay;
  }

  public void b(Color paramColor) {
    this.hay = paramColor;
  }

  public void h(bNa parambNa)
  {
    if (parambNa != null)
      this.hay = new Color(parambNa.bUP(), parambNa.bUQ(), parambNa.bUR(), parambNa.bUO());
    else
      this.hay = null;
  }

  public aFE bXZ()
  {
    return this.haA;
  }

  public void b(aFE paramaFE)
  {
    this.haA = paramaFE;

    this.haO = true;
    this.hax.setNeedsToMiddleProcess();
  }

  public aFE bYa()
  {
    return this.haB;
  }

  public void setVerticalAlignment(aFE paramaFE)
  {
    this.haB = paramaFE;
  }

  public Pw getOrientation()
  {
    return this.haC;
  }

  public void setOrientation(Pw paramPw)
  {
    if (paramPw != null) {
      this.haC = paramPw;
      this.haQ = true;
      this.haO = true;
      this.hax.setNeedsToPreProcess();
      this.hax.setNeedsToMiddleProcess();
    }
  }

  public boolean bYb() {
    return this.haz;
  }

  public void setJustify(boolean paramBoolean) {
    this.haz = paramBoolean;
  }

  public Boolean bYc() {
    return this.haR;
  }

  public void setAutoHorizontalScrolled(Boolean paramBoolean) {
    this.haR = paramBoolean;
  }

  public void bYd() {
    this.haW = 0;
  }

  public atq bYe()
  {
    return this.haD;
  }

  public String Vt()
  {
    if (this.haD != null) {
      return this.haD.Vt();
    }
    return null;
  }

  public boolean cA(String paramString) {
    if (this.haD == null) {
      return paramString == null;
    }
    return this.haD.cA(paramString);
  }

  public void cB(String paramString)
  {
    if (this.haD != null) {
      this.haD.cB(paramString);
      this.haQ = true;
      this.haO = true;
      this.hax.setNeedsToPreProcess();
      this.hax.setNeedsToMiddleProcess();
    }
  }

  public int bYf() {
    if (this.haD != null) {
      return this.haD.aFk();
    }

    return 0;
  }

  public void cC(String paramString)
  {
    if (this.haD != null) {
      this.haD.cC(paramString);
      this.haQ = true;
      this.haO = true;
      this.hax.setNeedsToPreProcess();
      this.hax.setNeedsToMiddleProcess();
    }
  }

  public void aFi()
  {
    if (this.haD != null) {
      this.haD.aFi();
      this.haQ = true;
      this.haO = true;
      this.hax.setNeedsToPreProcess();
      this.hax.setNeedsToMiddleProcess();
    }
  }

  public void c(ddB paramddB, int paramInt)
  {
    if (this.haD != null) {
      this.haP |= this.haD.a(paramddB, paramInt);
      if (this.haP)
        this.hax.setNeedsToMiddleProcess();
    }
  }

  public void bYg()
  {
    if (this.haD != null) {
      this.haP |= this.haD.aFt();
      if (this.haP)
        this.hax.setNeedsToMiddleProcess();
    }
  }

  public void d(ddB paramddB, int paramInt)
  {
    if (this.haD != null) {
      this.haP |= this.haD.b(paramddB, paramInt);
      if (this.haP)
        this.hax.setNeedsToMiddleProcess();
    }
  }

  public void bYh()
  {
    if (this.haD != null) {
      this.haP |= this.haD.aFx();
      if (this.haP)
        this.hax.setNeedsToMiddleProcess();
    }
  }

  public ArrayList bYi()
  {
    return this.haE;
  }

  public int getMaxWidth()
  {
    return this.gKk;
  }

  public void setMaxWidth(int paramInt)
  {
    this.gKk = paramInt;
    this.haQ = true;
    this.hax.setNeedsToPreProcess();
  }

  public int getMinWidth()
  {
    return this.haG;
  }

  public void setMinWidth(int paramInt)
  {
    this.haG = paramInt;
    this.haQ = true;
    this.hax.setNeedsToPreProcess();
  }

  public boolean bYj()
  {
    return this.haH;
  }

  public void setMultiline(boolean paramBoolean)
  {
    this.haH = paramBoolean;
    this.haQ = true;
    this.hax.setNeedsToPreProcess();
  }

  public boolean bYk()
  {
    return (this.haI) || (this.haJ);
  }

  public void setSelectable(boolean paramBoolean)
  {
    this.haI = paramBoolean;
    this.haQ = true;
    this.haP = true;
    this.hax.setNeedsToPreProcess();
    this.hax.setNeedsToMiddleProcess();
  }

  public boolean isEditable()
  {
    return this.haJ;
  }

  public void setEditable(boolean paramBoolean)
  {
    this.haJ = paramBoolean;
    this.haQ = true;
    this.haP = true;
    this.hax.setNeedsToPreProcess();
    this.hax.setNeedsToMiddleProcess();
  }

  public boolean isTextReduced() {
    return this.haU;
  }

  public boolean bYl() {
    return this.haT;
  }

  public void setEnableShrinking(boolean paramBoolean) {
    this.haT = paramBoolean;
  }

  public int bYm()
  {
    if (bYo()) {
      return this.haK;
    }
    return 0;
  }

  public void tO(int paramInt)
  {
    this.haK = Math.min(Math.max(0, paramInt), bYn());
  }

  public int bYn()
  {
    return this.haE.size() - 1;
  }

  public boolean bYo()
  {
    return (bYk()) && (this.haH);
  }

  public boolean bYp()
  {
    return (bYk()) && (!this.haH);
  }

  public boolean bYq()
  {
    return (this.haT) && ((bYo()) || (bYp()));
  }

  public Or getSize()
  {
    return (Or)this.haN.clone();
  }

  public void setSize(int paramInt1, int paramInt2)
  {
    paramInt1 = Math.max(0, paramInt1);
    paramInt2 = Math.max(0, paramInt2);
    if ((paramInt1 != this.haN.getWidth()) || (paramInt2 != this.haN.getHeight())) {
      this.haN.setSize(paramInt1, paramInt2);
      this.haO = true;
      this.hax.setNeedsToMiddleProcess();
    }
  }

  public int getOrientedWidth()
  {
    return this.haC.isHorizontal() ? this.haN.width : this.haN.height;
  }

  public int getOrientedHeight()
  {
    return this.haC.isHorizontal() ? this.haN.height : this.haN.width;
  }

  public Or getMinSize()
  {
    return (Or)this.haL.clone();
  }

  public Or bYr() {
    return this.haM.aaB();
  }

  public boolean bYs()
  {
    return this.haQ;
  }

  public boolean bYt()
  {
    return this.haO;
  }

  public boolean bYu()
  {
    return this.haP;
  }

  public Cs df(int paramInt1, int paramInt2)
  {
    Cs localCs = new Cs(null, nh.aRH);

    paramInt2 = bYv() - getOrientedHeight() - paramInt2;

    int i = 0; for (int j = this.haE.size(); i < j; i++) {
      brR localbrR = (brR)this.haE.get(i);

      if ((paramInt2 >= localbrR.getBounds().getMinY()) && (paramInt2 <= localbrR.getBounds().getMaxY()))
      {
        int k = localbrR.getX();
        if (localbrR.getBounds().contains(paramInt1, paramInt2)) {
          ArrayList localArrayList = localbrR.bAm();
          for (int m = 0; m < localArrayList.size(); m++) {
            cDG localcDG = (cDG)localArrayList.get(m);
            int n = localcDG.getX() + k;
            if ((n <= paramInt1) && (n + localcDG.getWidth() >= paramInt1)) {
              localCs.w(localcDG);
              return localCs;
            }
          }

        }

        if (paramInt1 < k) {
          localCs.w(localbrR.bAj());
          localCs.x(nh.aRG);
        } else {
          localCs.w(localbrR.bAk());
          localCs.x(nh.aRI);
        }
        return localCs;
      }

    }

    if (!this.haE.isEmpty()) {
      localCs.w(((brR)this.haE.get(this.haE.size() - 1)).bAk());
      localCs.x(nh.aRJ);
    }

    return localCs;
  }

  public int bYv()
  {
    int i = 0;
    if (!this.haE.isEmpty())
    {
      brR localbrR;
      if (bYo()) {
        localbrR = (brR)this.haE.get(bYm());
        if (localbrR != null)
          i = localbrR.getY() + localbrR.getHeight();
      }
      else {
        localbrR = (brR)this.haE.get(this.haE.size() - 1);
        if (this.haB.awb())
          i = getOrientedHeight() + localbrR.getY();
        else if (!this.haB.awa()) {
          i = (getOrientedHeight() + localbrR.getY()) / 2;
        }
      }
    }
    return i;
  }

  public void bYw()
  {
    if (this.haD != null) {
      this.haP |= this.haD.aFB();
      if (this.haP)
        this.hax.setNeedsToMiddleProcess();
    }
  }

  public void ko(String paramString)
  {
    if (this.haD != null) {
      this.haD.fJ(paramString);
      this.haO = true;
      this.haQ = true;
      this.hax.setNeedsToPreProcess();
      this.hax.setNeedsToMiddleProcess();
    }
  }

  public void aFD()
  {
    if (this.haD != null) {
      this.haD.aFD();
      this.haO = true;
      this.hax.setNeedsToMiddleProcess();
    }
  }

  public void aFE()
  {
    if (this.haD != null) {
      this.haD.aFE();
      this.haO = true;
      this.hax.setNeedsToMiddleProcess();
    }
  }

  public void bYx()
  {
    if (this.haD != null) {
      this.haP |= this.haD.aFF();
      if (this.haP)
        this.hax.setNeedsToMiddleProcess();
    }
  }

  public void bYy()
  {
    if (this.haD != null) {
      this.haP |= this.haD.aFG();
      if (this.haP)
        this.hax.setNeedsToMiddleProcess();
    }
  }

  public void bYz()
  {
    if ((this.haF != null) && (!this.haF.isEmpty())) {
      cDG localcDG = this.haF.bAj();
      if (localcDG != null)
        d(localcDG.aOi(), localcDG.getStartIndex());
    }
  }

  public void bYA()
  {
    if (this.haF == null) {
      return;
    }
    if (this.haF.isEmpty()) {
      return;
    }

    cDG localcDG = this.haF.bAk();
    if (localcDG != null)
      d(localcDG.aOi(), localcDG.getEndIndex());
  }

  public void bYB()
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if ((!this.haD.isEmpty()) && (!bYq()) && (!bYj())) {
      int i = 0;
      for (Iterator localIterator = this.haD.iterator(); localIterator.hasNext(); ) { localObject2 = (ddB)localIterator.next();
        switch (dTr.mpP[localObject2.cOJ().ordinal()])
        {
        case 1:
          localObject3 = (cKf)localObject2;

          d1 += ((cKf)localObject3).getWidth();
          d2 = Math.max(d2, ((cKf)localObject3).getHeight());

          i = 0;
          break;
        case 2:
          localObject3 = (ckA)localObject2;
          P localP1 = ((ckA)localObject3).aOe();
          if (localP1 == null) {
            localP1 = aFz();
          }

          if (localP1 != null) {
            localObject4 = ((ckA)localObject3).cmr();
            if ((localObject4 != null) && (((String)localObject4).length() != 0)) {
              int m = localP1.f((String)localObject4);
              int n = localP1.g((String)localObject4);

              d1 += m;
              d2 = Math.max(d2, n);
            }
            else {
              d1 += localP1.ar();
              d2 = Math.max(d2, localP1.as());
            }
            i = localP1.getFont().ph();
          }

          break;
        }

      }

      d1 += i;
    }
    else
    {
      Object localObject1;
      int j;
      int k;
      ddB localddB;
      aFE localaFE;
      int i1;
      cKf localcKf;
      ckA localckA;
      P localP2;
      String str1;
      int i3;
      int i4;
      String str2;
      if ((!this.haD.isEmpty()) && (!bYq()) && (bYj()) && (this.haG > 0))
      {
        localObject1 = new Point(0, 0);

        j = 0;
        localObject2 = null;
        localObject3 = this.haA;
        k = this.gKk != 2147483647 ? Math.max(this.haG, this.gKk) : bYp() ? 2147483647 : this.haG;

        for (localObject4 = this.haD.iterator(); ((Iterator)localObject4).hasNext(); ) { localddB = (ddB)((Iterator)localObject4).next();

          localaFE = localddB.bAh();
          if (localaFE == null) {
            localaFE = this.haA;
          }
          if (localaFE != localObject3) {
            localObject3 = localaFE;
            j = 1;
          }

          i1 = 0;

          switch (dTr.mpP[localddB.cOJ().ordinal()])
          {
          case 1:
            localcKf = (cKf)localddB;

            if (((Point)localObject1).x != 0) {
              int i2 = k - ((Point)localObject1).x;
              if (i2 < localcKf.getWidth()) {
                j = 1;
              }

            }

            if ((j != 0) || (localObject2 == null)) {
              if (localObject2 != null) {
                ((Point)localObject1).x = 0;
                localObject1.y -= ((brR)localObject2).getHeight();
                d2 += ((brR)localObject2).getHeight();
                d1 = Math.max(((Point)localObject1).x, d1);
                ((brR)localObject2).release();
              }
              localObject2 = brR.bAc();
              ((brR)localObject2).a((aFE)localObject3);

              j = 0;
            }

            ((brR)localObject2).setHeight(Math.max(localcKf.getHeight(), ((brR)localObject2).getHeight()));

            ((brR)localObject2).a(localcKf, ((Point)localObject1).x);

            localObject1.x += localcKf.getWidth();

            break;
          case 2:
            localckA = (ckA)localddB;

            localP2 = localckA.aOe();
            if (localP2 == null) {
              localP2 = aFz();
            }
            str1 = localckA.cmr();
            if ((localP2 != null) && (str1 != null))
            {
              i3 = 0;
              while (i3 != -1) {
                i4 = i3;
                i3 = str1.indexOf("\n", i3 + 1);
                str2 = i3 == -1 ? str1.substring(i4) : str1.substring(i4, i3);
                int i5;
                int i6;
                if ((((Point)localObject1).x != 0) && (str2.length() != 0)) {
                  i5 = k - ((Point)localObject1).x;
                  i6 = localP2.a(str2, i5, false);
                  if (i6 == 0) {
                    j = 1;
                  }

                }

                j = (j != 0) || (i1 != 0) || (localObject2 == null) || (str2.startsWith("\n")) ? 1 : 0;

                if (str2.length() == 0)
                {
                  if (j != 0)
                  {
                    if (localObject2 != null) {
                      ((Point)localObject1).x = 0;
                      localObject1.y -= ((brR)localObject2).getHeight();
                      d1 = Math.max(((Point)localObject1).x, d1);
                      d2 += ((brR)localObject2).getHeight();
                    }
                    if (localObject2 != null) {
                      ((brR)localObject2).release();
                    }
                    localObject2 = brR.bAc();
                    ((brR)localObject2).a((aFE)localObject3);

                    j = 0;
                  }

                  ((brR)localObject2).setHeight(Math.max(localP2.as(), ((brR)localObject2).getHeight()));

                  ((brR)localObject2).a("", localckA, i1, i1, ((Point)localObject1).x, 0);
                }
                else
                {
                  i5 = 0;
                  while (i5 < str2.length())
                  {
                    if (j != 0) {
                      if (localObject2 != null) {
                        d1 = Math.max(((Point)localObject1).x, d1);
                        localObject1.y -= ((brR)localObject2).getHeight();
                        d2 += ((brR)localObject2).getHeight();
                      }
                      ((Point)localObject1).x = localP2.getFont().ph();
                      if (localObject2 != null) {
                        ((brR)localObject2).release();
                      }

                      localObject2 = brR.bAc();
                      ((brR)localObject2).a((aFE)localObject3);

                      j = 0;
                    }

                    i6 = k - ((Point)localObject1).x;
                    if (i6 < 0) {
                      i6 = 2147483647;
                    }

                    int i7 = i5 + localP2.a(str2.substring(i5), i6);

                    String str3 = str2.substring(i5, i7);
                    int i8 = localP2.f(str3);
                    int i9 = localP2.g(str3);

                    ((brR)localObject2).setHeight(Math.max(i9, ((brR)localObject2).getHeight()));

                    ((brR)localObject2).qE(Math.max(((brR)localObject2).bAg(), localP2.h(str3)));

                    ((brR)localObject2).a(str3, localckA, i1, i1 + str3.length(), ((Point)localObject1).x, i8);

                    i1 += str3.length();

                    i5 = i7;
                    if (i5 != str2.length())
                    {
                      j = 1;
                      d1 = Math.max(d1, ((Point)localObject1).x + i8);
                    }
                    else {
                      localObject1.x += i8;
                    }
                  }
                }
              }
            }
            break;
          }
        }

        if ((j == 0) && (localObject2 != null)) {
          d2 += ((brR)localObject2).getHeight();
          d1 = Math.max(((Point)localObject1).x, d1);
        }

        if (localObject2 != null) {
          ((brR)localObject2).release();
        }

      }
      else if ((!this.haD.isEmpty()) && (!bYq()) && (bYj()) && (this.haG <= 0)) {
        localObject1 = new Point(0, 0);

        j = 0;
        localObject2 = null;
        localObject3 = this.haA;
        k = 0;

        for (localObject4 = this.haD.iterator(); ((Iterator)localObject4).hasNext(); ) { localddB = (ddB)((Iterator)localObject4).next();

          localaFE = localddB.bAh();
          if (localaFE == null) {
            localaFE = this.haA;
          }
          if (localaFE != localObject3) {
            localObject3 = localaFE;
            j = 1;
          }

          i1 = 0;

          switch (dTr.mpP[localddB.cOJ().ordinal()])
          {
          case 1:
            localcKf = (cKf)localddB;

            if ((j != 0) || (localObject2 == null)) {
              if (localObject2 != null) {
                ((Point)localObject1).x = 0;
                localObject1.y -= ((brR)localObject2).getHeight();
                d2 += ((brR)localObject2).getHeight();
              }
              if (localObject2 != null) {
                ((brR)localObject2).release();
              }

              localObject2 = brR.bAc();
              ((brR)localObject2).a((aFE)localObject3);

              j = 0;
            }

            ((brR)localObject2).setHeight(Math.max(localcKf.getHeight(), ((brR)localObject2).getHeight()));

            ((brR)localObject2).a(localcKf, ((Point)localObject1).x);

            localObject1.x += localcKf.getWidth();
            k = 0;

            break;
          case 2:
            localckA = (ckA)localddB;

            localP2 = localckA.aOe();
            if (localP2 == null) {
              localP2 = aFz();
            }
            k = localP2.getFont().ph();
            str1 = localckA.cmr();
            if ((localP2 != null) && (str1 != null))
            {
              i3 = 0;
              while (i3 != -1)
              {
                i4 = i3;
                i3 = str1.indexOf("\n", i3 + 1);
                str2 = i3 == -1 ? str1.substring(i4) : str1.substring(i4, i3);

                j = (j != 0) || (i1 != 0) || (localObject2 == null) || (str2.startsWith("\n")) ? 1 : 0;

                if (str2.length() == 0)
                {
                  if (j != 0)
                  {
                    if (localObject2 != null) {
                      d1 = Math.max(((Point)localObject1).x + k, d1);
                      ((Point)localObject1).x = 0;
                      localObject1.y -= ((brR)localObject2).getHeight();
                      d2 += ((brR)localObject2).getHeight();
                    }
                    if (localObject2 != null) {
                      ((brR)localObject2).release();
                    }
                    localObject2 = brR.bAc();
                    ((brR)localObject2).a((aFE)localObject3);

                    j = 0;
                  }

                  ((brR)localObject2).setHeight(Math.max(localP2.as(), ((brR)localObject2).getHeight()));

                  ((brR)localObject2).a("", localckA, i1, i1, ((Point)localObject1).x, 0);
                }
                else
                {
                  if (j != 0)
                  {
                    if (localObject2 != null) {
                      d1 = Math.max(((Point)localObject1).x + k, d1);
                      ((Point)localObject1).x = 0;
                      localObject1.y -= ((brR)localObject2).getHeight();
                      d2 += ((brR)localObject2).getHeight();
                    }
                    if (localObject2 != null) {
                      ((brR)localObject2).release();
                    }
                    localObject2 = brR.bAc();
                    ((brR)localObject2).a((aFE)localObject3);
                  }

                  ((brR)localObject2).setHeight(Math.max(localP2.g(str2), ((brR)localObject2).getHeight()));
                  localObject1.x += localP2.f(str2);

                  ((brR)localObject2).qE(Math.max(((brR)localObject2).bAg(), localP2.h(str2)));

                  ((brR)localObject2).a(str2, localckA, i1, i1 + str2.length(), ((Point)localObject1).x, localP2.f(str2));

                  i1 += str2.length();

                  j = i3 != -1 ? 1 : 0;
                }
              }
            }
            break;
          }
        }

        if (localObject2 != null) {
          d1 = Math.max(d1, ((Point)localObject1).x + k);
          d2 += ((brR)localObject2).getHeight();
          ((Point)localObject1).x = 0;
        }

        if (localObject2 != null)
          ((brR)localObject2).release();
      }
      else
      {
        localObject1 = aFz();
        if (localObject1 != null) {
          d1 = ((P)localObject1).ar();
          d2 = ((P)localObject1).as();
        }
      }
    }

    if (this.haC.isHorizontal()) {
      this.haM.setSize(d1, d2);
      this.haL.setSize(Math.max(Math.min(this.gKk, d1), this.haG), d2);
    }
    else {
      this.haM.setSize(d2, d1);

      this.haL.setSize(d2, Math.max(Math.min(this.gKk, d1), this.haG));
    }

    this.haQ = false;
  }

  public void gB(boolean paramBoolean)
  {
    bXW();

    this.haU = false;

    Point localPoint = new Point(0, 0);

    int i = 0;
    boolean bool = false;
    Object localObject1 = null;
    Object localObject2 = this.haA;
    int j = bYp() ? 2147483647 : getOrientedWidth();

    for (Object localObject3 = this.haD.iterator(); ((Iterator)localObject3).hasNext(); ) { localObject4 = (ddB)((Iterator)localObject3).next();

      aFE localaFE = ((ddB)localObject4).bAh();
      if (localaFE == null) {
        localaFE = this.haA;
      }
      if (localaFE != localObject2) {
        localObject2 = localaFE;
        i = 1;
        bool = false;
      }

      m = 0;
      Object localObject6;
      switch (dTr.mpP[localObject4.cOJ().ordinal()])
      {
      case 1:
        localObject5 = (cKf)localObject4;

        if (localPoint.x != 0) {
          int n = getOrientedWidth() - localPoint.x;
          if (n < ((cKf)localObject5).getWidth()) {
            i = 1;
            bool = true;
          }

        }

        if ((i != 0) || (localObject1 == null))
        {
          localObject6 = a((brR)localObject1, bool, localPoint, 0, (aFE)localObject2);
          if (localObject6 == null) {
            return;
          }
          localObject1 = localObject6;
          i = 0;
        }

        ((brR)localObject1).setHeight(Math.max(((cKf)localObject5).getHeight(), ((brR)localObject1).getHeight()));

        ((brR)localObject1).a((cKf)localObject5, localPoint.x);

        localPoint.x += ((cKf)localObject5).getWidth();

        break;
      case 2:
        localObject6 = (ckA)localObject4;

        P localP = ((ckA)localObject6).aOe();
        if (localP == null) {
          localP = aFz();
        }
        String str1 = ((ckA)localObject6).cmr();
        if ((localP != null) && (str1 != null))
        {
          int i1 = 0;
          while (i1 != -1)
          {
            int i2 = i1;
            i1 = str1.indexOf("\n", i1 + 1);
            String str2 = i1 == -1 ? str1.substring(i2) : str1.substring(i2, i1);

            if ((localPoint.x != 0) && (str2.length() != 0)) {
              int i3 = j - localPoint.x;
              int i5 = localP.a(str2, i3, false);
              if (i5 == 0) {
                i = 1;
              }

            }

            i = (i != 0) || (m != 0) || (localObject1 == null) || (str2.startsWith("\n")) ? 1 : 0;

            bool = (i != 0) && (!str2.startsWith("\n"));

            if (str2.length() == 0)
            {
              if (i != 0)
              {
                brR localbrR1 = a((brR)localObject1, bool, localPoint, localP.getFont().ph(), (aFE)localObject2);
                if (localbrR1 == null) {
                  return;
                }
                localPoint.y -= localbrR1.getHeight();
                localObject1 = localbrR1;
                i = 0;
              }

              ((brR)localObject1).setHeight(Math.max(localP.as(), ((brR)localObject1).getHeight()));

              ((brR)localObject1).a("", (ckA)localObject6, m, m, localPoint.x, 0);
            }
            else
            {
              int i4 = 0;
              while (i4 < str2.length())
              {
                if (i != 0) {
                  brR localbrR2 = a((brR)localObject1, bool, localPoint, localP.getFont().ph(), (aFE)localObject2);
                  if (localbrR2 == null) {
                    return;
                  }

                  localObject1 = localbrR2;
                  i = 0;
                }

                int i6 = j - localPoint.x;
                if (i6 < 0) {
                  i6 = 2147483647;
                }
                int i7 = i4 + localP.a(str2.substring(i4), i6);
                String str3 = str2.substring(i4, i7);
                int i8 = localP.f(str3) - localP.getFont().ph();

                int i9 = localP.g(str3);

                ((brR)localObject1).setHeight(Math.max(i9, ((brR)localObject1).getHeight()));

                ((brR)localObject1).qE(Math.max(((brR)localObject1).bAg(), localP.h(str3)));

                if (this.haR.booleanValue()) {
                  if (this.haS != 0) {
                    if (((this.TR > 0) && (this.haS > 0)) || ((this.TR < 0) && (this.haS < 0)))
                      localPoint.x = this.haS;
                    else {
                      localPoint.x = (this.TR + this.haS);
                    }
                    this.TR = localPoint.x;
                  }
                  this.haS = 0;
                }

                ((brR)localObject1).a(str3, (ckA)localObject6, m, m + str3.length(), localPoint.x, i8);

                m += str3.length();

                i4 = i7;
                if (i4 != str2.length())
                {
                  i = 1;
                  bool = true;
                }
                else {
                  localPoint.x += i8;
                }
              }
            }
          }
        }
        break;
      }
    }
    Object localObject4;
    int m;
    Object localObject5;
    if ((i == 0) && (localObject1 != null))
    {
      ((brR)localObject1).setY(localPoint.y - ((brR)localObject1).getHeight());

      ((brR)localObject1).setX(((brR)localObject1).bAh().ba(((brR)localObject1).getWidth(), getOrientedWidth()));

      this.haE.add(localObject1);
      localObject1 = null;
    }

    if (localObject1 != null) {
      ((brR)localObject1).release();
    }

    if (this.haR.booleanValue()) {
      localObject3 = avN.aHC();
      localObject4 = avN.aHC();
      int k = 0; for (m = this.haE.size(); k < m; k++) {
        localObject5 = ((brR)this.haE.get(k)).getBounds();
        ((avN)localObject4).setBounds(((Rectangle)localObject5).x, ((Rectangle)localObject5).y, ((Rectangle)localObject5).width, ((Rectangle)localObject5).height);
        ((avN)localObject3).b((avN)localObject4);
      }

      if ((((avN)localObject3).getX() >= 0) && (((avN)localObject3).getX() + ((avN)localObject3).getWidth() <= getOrientedWidth())) {
        this.TR = 0;
        this.haS = 0;
      }

      ((avN)localObject3).release();
      ((avN)localObject4).release();
    }

    gC(paramBoolean);

    this.haO = false;
  }

  public void gC(boolean paramBoolean)
  {
    ddB localddB1;
    ddB localddB2;
    int i;
    int j;
    boolean bool;
    int k;
    int m;
    if (bYk())
    {
      this.haF = null;

      localddB1 = this.haD.aFq();
      localddB2 = this.haD.aFu();
      i = this.haD.aFs();
      j = this.haD.aFw();
      bool = (isEditable()) && (this.haD.isSelectionEmpty());
      k = (localddB1 != null) && (localddB2 != null) ? 1 : 0;

      m = 0;

      for (brR localbrR : this.haE)
      {
        localbrR.bAe();

        if (k != 0)
        {
          int n = 0;
          int i1 = 0;
          int i2 = 0;

          ArrayList localArrayList = localbrR.bAm();
          for (int i3 = 0; i3 < localArrayList.size(); i3++) {
            cDG localcDG = (cDG)localArrayList.get(i3);
            int i4 = 0;

            if ((this.haF == null) && (m == 0) && (localcDG.aOi() == localddB1) && (localcDG.getStartIndex() <= i) && (localcDG.getEndIndex() >= i))
            {
              m = 1;
              i4 = 1;

              if (j >= this.haX)
              {
                n = localcDG.b(aFz(), i - localcDG.getStartIndex());
              }
              else n = localcDG.getX() + localcDG.b(aFz(), i - localcDG.getStartIndex());

            }

            if ((this.haF == null) && (m != 0) && (localcDG.aOi() == localddB2) && (localcDG.getStartIndex() <= j) && (localcDG.getEndIndex() >= j))
            {
              m = 0;
              if (bool)
                i2 = 1;
              else {
                i2 = localcDG.getX() + localcDG.c(aFz(), j - localcDG.getStartIndex()) - n;
              }

              this.haF = localbrR;
            }

            if (m != 0) {
              if (i4 == 0)
                i2 += localcDG.getWidth();
              else {
                i2 += localcDG.getWidth() - n + localcDG.getX();
              }
            }

          }

          if (i2 != 0) {
            if ((this.haR.booleanValue()) && (paramBoolean))
            {
              i1 = n + i2 - 1;

              if ((n < this.hax.getAppearance().getLeftInset()) && (this.TR != 0)) {
                this.haS = (-n);
              }
              else if ((i1 >= this.hax.getAppearance().getContentWidth() - this.hax.getAppearance().getRightInset()) && (this.haW < i1))
              {
                this.haS = (this.hax.getAppearance().getContentWidth() - this.hax.getAppearance().getRightInset() - i1);
              }
            }

            localbrR.e(n, i2, bool);
            if (this.haS != 0) {
              this.haW = i1;
              this.haX = j;
              gB(false);
            }

          }

        }

      }

    }

    this.haP = false;
  }

  private brR a(brR parambrR, boolean paramBoolean, Point paramPoint, int paramInt, aFE paramaFE)
  {
    paramPoint.x = paramInt;

    if (parambrR != null) {
      paramPoint.y -= parambrR.getHeight();

      parambrR.setY(paramPoint.y);

      if ((this.haz) && (this.haH) && (paramBoolean))
      {
        cDG localcDG1 = parambrR.bAk();
        Object localObject2;
        if ((localcDG1 != null) && (localcDG1.czB() == cUE.kHp)) {
          aBV localaBV1 = (aBV)localcDG1;
          localObject1 = localaBV1.getText();
          if ((localObject1 != null) && (((String)localObject1).endsWith(" "))) {
            localaBV1.setText(((String)localObject1).substring(0, ((String)localObject1).length() - 1));
            int k = parambrR.getWidth();
            int m = localaBV1.getWidth();
            localObject2 = localaBV1.aOe();
            if (localObject2 == null) {
              localObject2 = aFz();
            }

            String str = localaBV1.getText();
            int i1 = ((P)localObject2).f(str);
            localaBV1.setWidth(((P)localObject2).f(str));
            parambrR.bAl();
            int i2 = parambrR.getWidth();
            int i3 = 0;
          }

        }

        int j = 0;
        for (Object localObject1 = parambrR.bAm().iterator(); ((Iterator)localObject1).hasNext(); ) { cDG localcDG2 = (cDG)((Iterator)localObject1).next();
          if (localcDG2.czB() == cUE.kHp)
          {
            aBV localaBV2 = (aBV)localcDG2;
            localObject2 = localaBV2.aOc();
            if (localObject2 != null)
            {
              int n = dzp.a(' ', (char[])localObject2);
              localaBV2.lM(n);

              j += n;
            }
          } } parambrR.lM(j);
      }

      parambrR.setX(parambrR.bAh().ba(parambrR.getWidth(), getOrientedWidth()));

      int i = -paramPoint.y <= getOrientedHeight() ? 1 : 0;
      if ((i != 0) || (bYo()))
      {
        this.haE.add(parambrR);
      }
      else parambrR.release();

      if ((!this.haH) || ((!bYo()) && (i == 0)))
      {
        bYC();

        this.haO = false;
        return null;
      }

    }

    parambrR = brR.bAc();
    parambrR.a(paramaFE);
    return parambrR;
  }

  private void bYC()
  {
    if (this.haE.isEmpty()) {
      return;
    }

    this.haU = true;

    brR localbrR = (brR)this.haE.get(this.haE.size() - 1);
    if (localbrR != null)
    {
      int i = localbrR.bAi();

      while (i > 0)
      {
        cDG localcDG = localbrR.qF(--i);
        if (localcDG.czB() == cUE.kHp)
        {
          aBV localaBV1 = (aBV)localcDG;

          P localP = localaBV1.aOe();
          if (localP == null) {
            localP = aFz();
          }
          if (localP != null)
          {
            int j = localP.f("...");

            int k = getOrientedWidth() - localaBV1.getX();
            if (k >= j)
            {
              char[] arrayOfChar = localaBV1.aOd().getText().toCharArray();
              int m = 0;

              for (int n = 0; n < arrayOfChar.length; n++) {
                i1 = localP.a(arrayOfChar[n]);
                if (m + i1 > k - j) {
                  break;
                }
                m += i1;
              }

              int i1 = n;
              String str = localaBV1.aOd().getText().substring(0, i1);
              int i2 = localP.f(str);

              int i3 = 5;

              if (k - i2 + 5 >= 0)
              {
                localaBV1.setText(str);
                localaBV1.setWidth(i2);

                localbrR.bAl();
                localbrR.setX(localbrR.bAh().ba(localbrR.getWidth(), getOrientedWidth()));

                aBV localaBV2 = localbrR.a("...", null, 0, 0, localaBV1.getX() + i2, j);

                localaBV2.b(localP);
                localaBV2.setColor(localaBV1.getColor());
                localaBV2.a(localaBV1.bAh());
                localaBV2.setUnderline(localaBV1.isUnderline());
                localaBV2.df(localaBV1.aOh());

                return;
              }

            }

          }

        }

        localbrR.qD(i);
      }
    }
  }

  public Iterator iterator()
  {
    return this.haE.iterator();
  }

  public void clean()
  {
    bXW();
    this.haz = false;
    this.hay = Color.BLACK;
    this.haA = aFE.ecd;
    this.haB = aFE.eca;
    this.haC = Pw.chX;
    this.hax = null;
  }

  public duS buJ() {
    return this.hax;
  }

  public void gZ(long paramLong) {
    this.haV = paramLong;
  }

  public long bYD() {
    return this.haV;
  }
}