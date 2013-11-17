import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bhd extends dRq
  implements asO, doT
{
  public static final String TAG = "multipleImage";
  public static final String cRL = "internalPopup";
  public static final String cRM = "internalPopupTextView";
  protected aTS fvq;
  private boolean fvr;
  private Point cGN;
  protected boolean fvs;
  protected boolean aKR;
  protected boolean fvt;
  private boolean fvu;
  private boolean fvv;
  protected int fvw;
  protected int fvx;
  private int fvy;
  private int fvz;
  protected int eSJ;
  protected int eSK;
  private int fvA;
  private int fvB;
  private boolean fvC;
  private boolean fvD;
  private final ArrayList eSH;
  private final ArrayList eSI;
  private dDq bQC;
  private aG fvE;
  private doN fvF;
  private doN cGQ;
  private doN fvG;
  private doN fvH;
  private dOc fvI;
  private cWk fvJ;
  private zp fvK;
  private String ftS;
  private bki fvL;
  public static final int bFb = "modulationColor".hashCode();
  public static final int fvM = "imagePath".hashCode();
  public static final int fvN = "manualInnerMove".hashCode();
  public static final int fvO = "useInnerMoveTween".hashCode();
  public static final int fvP = "shrinkToImageWidth".hashCode();
  public static final int fvQ = "shrinkToImageHeight".hashCode();
  public static final int fvR = "toggleInnerMoveOnClick".hashCode();

  public bhd()
  {
    this.fvr = false;
    this.cGN = null;

    this.fvs = false;
    this.aKR = true;
    this.fvt = false;

    this.fvu = false;
    this.fvv = false;

    this.eSJ = 0; this.eSK = 0;

    this.fvA = 0;
    this.fvB = 0;

    this.fvC = false;
    this.fvD = false;

    this.eSH = new ArrayList();
    this.eSI = new ArrayList();

    this.bQC = null;

    this.fvE = null;
  }

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof aAR)) {
      setPixmap((aAR)paramaNL);
    } else if (((paramaNL instanceof dOc)) && (paramaNL.getId().equals("internalPopup"))) {
      this.fvI = ((dOc)paramaNL);
      this.fvI.setVisible(false);
    }

    super.a(paramaNL);
  }

  protected void rd() {
    if ((this.bqm != null) && (this.fvq.getEntity() != null)) {
      this.bqm.d(this.fvq.getEntity());
    }
    super.rd();
  }

  public void setImageListener(bki parambki) {
    this.fvL = parambki;
  }

  public String getTag()
  {
    return "multipleImage";
  }

  public void setModulationColor(bNa parambNa)
  {
    if (this.fvq != null) {
      this.fvq.setModulationColor(parambNa);
    }
    int i = 0; for (int j = this.eSI.size(); i < j; i++) {
      XulorParticleSystem localXulorParticleSystem = ((aG)this.eSI.get(i)).bO();
      if (localXulorParticleSystem != null)
        localXulorParticleSystem.m(parambNa.QC() * parambNa.getAlpha(), parambNa.QD() * parambNa.getAlpha(), parambNa.QE() * parambNa.getAlpha(), parambNa.getAlpha());
    }
  }

  public boolean getManualInnerMove()
  {
    return this.fvC;
  }

  public void setManualInnerMove(boolean paramBoolean) {
    this.fvC = paramBoolean;
    btI();
  }

  private void btI() {
    duv localduv = duv.lyl;
    if (this.fvC) {
      if ((this.fvu) && (!this.fvv))
        localduv = duv.lyp;
      else if ((this.fvv) && (!this.fvu))
        localduv = duv.lyq;
      else {
        localduv = duv.lyn;
      }
    }
    setCursorType(localduv);
  }

  public void setUseInnerMoveTween(boolean paramBoolean) {
    btJ();
    if (paramBoolean)
      b(0.0F, 1.0F, 0.0F, 1.0F, 5000);
  }

  public boolean getShrinkToImageWidth()
  {
    return this.fvv;
  }

  public void setShrinkToImageWidth(boolean paramBoolean) {
    this.fvv = paramBoolean;
    btI();
  }

  public boolean getShrinkToImageHeight()
  {
    return this.fvu;
  }

  public void setShrinkToImageHeight(boolean paramBoolean) {
    this.fvu = paramBoolean;
    btI();
  }

  public boolean getToggleInnerMoveOnClick()
  {
    return this.fvD;
  }

  public void setToggleInnerMoveOnClick(boolean paramBoolean) {
    this.fvD = paramBoolean;
  }

  public void setPixmap(aAR paramaAR) {
    this.eSH.clear();
    if (this.fvq != null) {
      this.fvq.clear();
    }
    this.bQC = paramaAR.getPixmap();
    this.bQC.a(this);
    Ib localIb = new Ib(this.bQC, 0, 0);
    this.eSH.add(localIb);
  }

  public bNa getModulationColor()
  {
    return this.fvq != null ? this.fvq.getModulationColor() : null;
  }

  public int getDeltaX()
  {
    return this.fvw;
  }

  public void setDeltaX(int paramInt) {
    int i = -(this.fvA - this.czl.getContentWidth());
    int j = 0;
    int k = bCO.J(paramInt, i, 0);
    if (k != this.fvw) {
      this.fvw = k;
      this.aKR = true;
      setNeedsToPreProcess();

      if (this.fvL != null)
      {
        if (this.fvw == i)
          this.fvL.aR((byte)2);
        else if (this.fvw == 0)
          this.fvL.aR((byte)0);
        else
          this.fvL.aR((byte)1);
      }
    }
  }

  public int getDeltaY()
  {
    return this.fvx;
  }

  public void setDeltaY(int paramInt) {
    int i = 0;
    int j = this.fvB - this.czl.getContentHeight();
    int k = bCO.J(paramInt, 0, j);
    if (k != this.fvx) {
      this.fvx = k;
      this.aKR = true;
      setNeedsToPreProcess();

      if (this.fvL != null)
        if (this.fvx == 0)
          this.fvL.aS((byte)2);
        else if (this.fvx == j)
          this.fvL.aS((byte)0);
        else
          this.fvL.aS((byte)1);
    }
  }

  public String getParticlePath()
  {
    return this.ftS;
  }

  public void setParticlePath(String paramString) {
    this.ftS = paramString;
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return true;
  }

  public void setImagePath(String paramString) {
    if (paramString == null) {
      return;
    }
    URL localURL1;
    try
    {
      localURL1 = new URL(paramString);
    } catch (MalformedURLException localMalformedURLException) {
      K.error("URL invalide : " + paramString);
      return;
    }
    bwZ localbwZ;
    try {
      localbwZ = cBQ.h(localURL1);
    } catch (Exception localException1) {
      K.error("Problème lors de la lecture du fichier de map d'url : " + localURL1);
      return;
    }

    this.eSH.clear();
    if (this.fvq != null) {
      this.fvq.clear();
    }

    this.fvw = 0;
    this.fvx = 0;
    this.eSJ = 0;
    this.eSK = 0;

    ArrayList localArrayList = localbwZ.bEx().getChildren();
    int i = localArrayList.size();
    for (int j = 0; j < i; j++) {
      K localK1 = (K)localArrayList.get(j);
      if ((!localK1.getName().equals("#text")) && (!localK1.getName().equals("#comment")))
      {
        if (localK1.getName().equalsIgnoreCase("parameters")) {
          K localK2 = localK1.e("maxWidth");
          if (localK2 != null) {
            this.eSJ = localK2.getIntValue();
          }
          localK2 = localK1.e("maxHeight");
          if (localK2 != null) {
            this.eSK = localK2.getIntValue();
          }
          localK2 = localK1.e("totalWidth");
          if (localK2 != null) {
            this.fvA = localK2.getIntValue();
          }
          localK2 = localK1.e("totalHeight");
          if (localK2 != null)
            this.fvB = localK2.getIntValue();
        }
        else
        {
          int k;
          int m;
          Object localObject1;
          Object localObject2;
          if (localK1.getName().equalsIgnoreCase("image")) {
            k = 0;
            m = 0;
            uz localuz = null;

            K localK3 = localK1.e("x");
            if (localK3 != null) {
              k = localK3.getIntValue();
            }
            localK3 = localK1.e("y");
            if (localK3 != null) {
              m = localK3.getIntValue();
            }
            localK3 = localK1.e("texture");
            if (localK3 != null) {
              localObject1 = localK3.getStringValue();
              try {
                URL localURL2 = bAy.c(localURL1, (String)localObject1);
                localObject2 = localURL2.toString();
                localuz = fK((String)localObject2);
              } catch (Exception localException2) {
                K.error("Problème lors de la récupération de la texture de la map");
              }
            }

            localObject1 = new Ib(new dDq(localuz), k, m);
            this.eSH.add(localObject1);
          } else if (localK1.getName().equalsIgnoreCase("text")) {
            k = 0;
            m = 0;
            int n = 40;
            int i1 = 40;
            localObject1 = null;
            K localK4 = localK1.e("x");
            if (localK4 != null) {
              k = localK4.getIntValue();
            }
            localK4 = localK1.e("y");
            if (localK4 != null) {
              m = localK4.getIntValue();
            }
            localK4 = localK1.e("width");
            if (localK4 != null) {
              n = localK4.getIntValue();
            }
            localK4 = localK1.e("height");
            if (localK4 != null) {
              i1 = localK4.getIntValue();
            }
            localK4 = localK1.e("key");
            if (localK4 != null) {
              localObject1 = localK4.getStringValue();
            }

            localObject2 = null;
            if (this.ftS != null) {
              localObject2 = bHg.bOQ().jM(this.ftS);
              if (localObject2 != null) {
                cDz.iwP.c((ParticleSystem)localObject2);
                ((XulorParticleSystem)localObject2).gQ();
                ((XulorParticleSystem)localObject2).j(k + n / 2, m + i1 / 2);
                ((XulorParticleSystem)localObject2).a(this.fvq.biZ());
                localObject3 = this.fvq.getModulationColor();
                if (localObject3 != null) {
                  ((XulorParticleSystem)localObject2).m(((bNa)localObject3).QC() * ((bNa)localObject3).getAlpha(), ((bNa)localObject3).QD() * ((bNa)localObject3).getAlpha(), ((bNa)localObject3).QE() * ((bNa)localObject3).getAlpha(), ((bNa)localObject3).getAlpha());
                }

              }

            }

            Object localObject3 = new aG((String)localObject1, k, m, n, i1, (XulorParticleSystem)localObject2);
            this.eSI.add(localObject3);
          }
        }
      }
    }
    this.fvt = true;
    this.aKR = true;
    setNeedsToPreProcess();
  }

  private boolean rf()
  {
    boolean bool = false;
    int i = 0;
    int j = 0;

    if (this.fvu) {
      j = this.fvB;
    }

    if (this.fvv) {
      i = this.fvA;
    }

    if ((this.haL == null) || (i != this.haL.width) || (j != this.haL.height)) {
      setMinSize(new Or(i, j));
      bool = true;
    }

    return bool;
  }

  public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt)
  {
    J(zp.class);

    this.fvK = new zp(this, paramFloat1, paramFloat2, paramFloat3, paramFloat4, this, 0, paramInt, ddp.kWG);
    this.fvK.yc(-1);
    a(this.fvK);
  }

  public void btJ() {
    J(zp.class);
  }

  public void setTweenPaused(boolean paramBoolean) {
    if (this.fvK != null)
      this.fvK.setPaused(paramBoolean);
  }

  public boolean btK()
  {
    return this.fvK != null;
  }

  private uz fK(String paramString) {
    return tq.Bg().b(dHL.lSB.dhZ(), byn.jp(paramString), paramString, false);
  }

  public void rV()
  {
    super.rV();

    this.fvJ = ((cWk)getElementMap().fi("internalPopupTextView"));
  }

  public void bc()
  {
    super.bc();

    this.fvK = null;

    bsP.getInstance().b(CH.bGv, this.cGQ, false);

    this.fvG = null;
    this.fvH = null;
    this.cGQ = null;
    this.fvF = null;
    this.fvL = null;

    if (this.fvq != null) {
      this.fvq.bc();
      this.fvq = null;
    }

    if (this.bQC != null) {
      this.bQC.b(this);
      this.bQC = null;
    }

    this.eSH.clear();
    this.ftS = null;

    for (int i = this.eSI.size() - 1; i >= 0; i--) {
      XulorParticleSystem localXulorParticleSystem = ((aG)this.eSI.get(i)).bO();
      if (localXulorParticleSystem != null) {
        localXulorParticleSystem.axl();
      }
    }
    this.eSI.clear();
  }

  public void aJ()
  {
    super.aJ();

    setNonBlocking(false);

    setLayoutManager(null);

    Jg localJg = Jg.checkOut();
    localJg.setWidget(this);
    a(localJg);

    setNeedsToPreProcess();

    this.fvq = new aTS();
    this.fvq.aJ();

    btL();
  }

  public void ajj()
  {
    super.ajj();
    this.meE.setNeedsScissor(true);
  }

  public void validate()
  {
    if (this.fvq != null) {
      this.fvq.a(this.haN, this.czl.getMargin(), this.czl.getBorder(), this.czl.getPadding());
    }

    if (this.fvI != null) {
      if (this.fvE != null) {
        this.fvI.setVisible(true);
        this.fvI.setSizeToPrefSize();

        int i = -aFG.eck.ba(this.fvE.getWidth(), this.fvI.getWidth()) + this.fvE.getX() + this.fvw;
        int j = this.fvE.getY() + this.fvx + this.fvE.getHeight();

        this.fvI.setPosition(i, j);
      } else {
        this.fvI.setVisible(false);
      }
    }
    super.validate();
  }

  private void btL() {
    this.fvF = new yk(this);

    a(CH.bGu, this.fvF, false);

    this.cGQ = new yj(this);

    bsP.getInstance().a(CH.bGr, this.cGQ, false);

    this.fvG = new yf(this);

    a(CH.bGq, this.fvG, false);

    this.fvH = new ye(this);

    a(CH.bGo, this.fvH, false);

    a(CH.bGw, new yg(this), false);
  }

  private boolean isInside(aG paramaG, int paramInt1, int paramInt2)
  {
    return (paramaG.getX() <= paramInt1) && (paramaG.getX() + paramaG.getWidth() >= paramInt1) && (paramaG.getY() <= paramInt2) && (paramaG.getY() + paramaG.getHeight() >= paramInt2);
  }

  public boolean bb(int paramInt)
  {
    boolean bool1 = super.bb(paramInt);

    int i = 0;

    boolean bool2 = rf();

    if (this.fvs) {
      this.fvB = (this.eSK = this.bQC.getHeight());
      this.fvA = (this.eSJ = this.bQC.getWidth());
      setDeltaX(this.fvw);
      setDeltaY(this.fvx);
      this.fvs = false;
      this.aKR = true;
      this.fvt = true;
    }

    if ((this.fvq != null) && (this.aKR)) {
      this.fvq.setX(this.fvw);
      this.fvq.setY(this.fvx);
      this.fvq.setHeight(this.eSK);
      this.fvq.setWidth(this.eSJ);
      this.aKR = false;
      i = 1;
    }

    if ((this.fvq != null) && (this.fvt)) {
      this.fvq.clear();
      j = 0; for (k = this.eSH.size(); j < k; j++) {
        this.fvq.a((Ib)this.eSH.get(j));
      }

      this.fvt = false;
      i = 1;
    }

    int j = 0; for (int k = this.eSI.size(); j < k; j++) {
      ((aG)this.eSI.get(j)).g(this.fvw, this.fvx);
    }

    if (i != 0) {
      try {
        if (this.czl != null)
          this.fvq.a(this.haN, this.czl.getMargin(), this.czl.getBorder(), this.czl.getPadding());
      }
      catch (NullPointerException localNullPointerException) {
        K.error("imageMesh = " + this.fvq + ", appearance = " + this.czl, localNullPointerException);
      }
    }

    if (bool2) {
      cfM();
    }

    return bool1;
  }

  public boolean r(int paramInt) {
    super.r(paramInt);

    this.fvq.biZ().removeAllChildren();
    int i = 0; for (int j = this.eSI.size(); i < j; i++) {
      XulorParticleSystem localXulorParticleSystem = ((aG)this.eSI.get(i)).bO();
      if (localXulorParticleSystem != null) {
        localXulorParticleSystem.a(this.fvq.biZ());
      }
    }

    return true;
  }

  public void c(bdj parambdj)
  {
    bhd localbhd = (bhd)parambdj;
    super.c(parambdj);

    localbhd.b(CH.bGr, this.cGQ, false);
    localbhd.b(CH.bGq, this.fvG, false);
    localbhd.b(CH.bGo, this.fvH, false);
    localbhd.b(CH.bGu, this.fvF, false);

    localbhd.setModulationColor(localbhd.getModulationColor());
    localbhd.setManualInnerMove(this.fvC);
    localbhd.setShrinkToImageWidth(this.fvv);
    localbhd.setShrinkToImageHeight(this.fvu);
    localbhd.setToggleInnerMoveOnClick(this.fvD);
  }

  public void a(dDq paramdDq) {
    this.fvs = true;
    setNeedsToPreProcess();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == fvP)
      setShrinkToImageWidth(bUD.getBoolean(paramString));
    else if (paramInt == fvQ)
      setShrinkToImageHeight(bUD.getBoolean(paramString));
    else if (paramInt == fvR)
      setToggleInnerMoveOnClick(bUD.getBoolean(paramString));
    else if (paramInt == fvO)
      setUseInnerMoveTween(bUD.getBoolean(paramString));
    else if (paramInt == fvN)
      setManualInnerMove(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == fvP)
      setShrinkToImageWidth(bUD.getBoolean(paramObject));
    else if (paramInt == fvQ)
      setShrinkToImageHeight(bUD.getBoolean(paramObject));
    else if (paramInt == bFb)
      setModulationColor((bNa)paramObject);
    else if (paramInt == fvM)
      setImagePath((String)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}