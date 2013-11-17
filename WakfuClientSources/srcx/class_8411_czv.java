import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import org.apache.log4j.Logger;

public class czv extends dOc
  implements asO, doT
{
  public static final String TAG = "Image";
  protected bPw aKP;
  protected boolean iov = false;

  protected boolean iow = false;

  protected boolean aKR = true;

  protected ajb aKQ = ajb.dhZ;
  protected Or iox;
  public static final int drs = "align".hashCode();
  public static final int ioy = "displayShape".hashCode();
  public static final int ioz = "displaySize".hashCode();
  public static final int dUc = "flipHorizontaly".hashCode();
  public static final int dUd = "flipVerticaly".hashCode();
  public static final int ioA = "keepAspectRatio".hashCode();
  public static final int bFb = "modulationColor".hashCode();
  public static final int ioB = "pixmap".hashCode();
  public static final int ioC = "scaled".hashCode();

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof aAR)) {
      setPixmap((aAR)paramaNL);
    }
    super.a(paramaNL);
  }

  protected void rd()
  {
    super.rd();
    if ((this.bqm != null) && (this.aKP.getEntity() != null))
      this.bqm.d(this.aKP.getEntity());
  }

  public String getTag()
  {
    return "Image";
  }

  public dDq getPixmap()
  {
    return this.aKP != null ? this.aKP.getPixmap() : null;
  }

  public void setPixmap(dDq paramdDq)
  {
    if (this.aKP != null) {
      dDq localdDq = this.aKP.getPixmap();
      if (localdDq != null) {
        localdDq.b(this);
      }
      this.aKP.setPixmap(paramdDq);
      paramdDq.a(this);
      this.aKR = true;
      setNeedsToPreProcess();
    }
  }

  public void setPixmap(aAR paramaAR)
  {
    if (this.aKP != null) {
      dDq localdDq = this.aKP.getPixmap();
      if (localdDq != null) {
        localdDq.b(this);
      }
      localdDq = paramaAR.getPixmap();
      if (localdDq != null) {
        localdDq.a(this);
      }
      this.aKP.setPixmap(paramaAR.getPixmap());
      this.aKR = true;
      setNeedsToPreProcess();
    }
  }

  public boolean getScaled()
  {
    return this.iov;
  }

  public void setScaled(boolean paramBoolean)
  {
    if (this.iov != paramBoolean) {
      this.iov = paramBoolean;
      this.aKR = true;
      setNeedsToPreProcess();
    }
  }

  public void setDisplayShape(bGn parambGn)
  {
    if (this.aKP != null)
      this.aKP.setShape(parambGn);
  }

  public bGn getDisplayShape()
  {
    return this.aKP != null ? this.aKP.getShape() : null;
  }

  public boolean getKeepAspectRatio()
  {
    return this.iow;
  }

  public void setKeepAspectRatio(boolean paramBoolean)
  {
    if (this.iow != paramBoolean) {
      this.iow = paramBoolean;
      this.aKR = true;
      setNeedsToPreProcess();
    }
  }

  public ajb getAlign()
  {
    return this.aKQ;
  }

  public void setAlign(ajb paramajb)
  {
    if (!paramajb.equals(this.aKQ)) {
      this.aKQ = paramajb;
      this.aKR = true;
      setNeedsToPreProcess();
    }
  }

  public void setDisplaySize(Or paramOr)
  {
    this.iox = paramOr;
    this.aKR = true;
    setNeedsToPreProcess();
  }

  public Or getDisplaySize()
  {
    return this.iox;
  }

  public void setModulationColor(bNa parambNa)
  {
    if (this.aKP != null)
      this.aKP.setModulationColor(parambNa);
  }

  public bNa getModulationColor()
  {
    return this.aKP != null ? this.aKP.getModulationColor() : null;
  }

  public void setFlipHorizontaly(boolean paramBoolean)
  {
    if (this.aKP != null) {
      this.aKP.setFlipHorizontaly(paramBoolean);
      this.aKR = true;
      setNeedsToPreProcess();
    }
  }

  public boolean getFlipHorizontaly()
  {
    return (this.aKP != null) && (this.aKP.bVX());
  }

  public void setFlipVerticaly(boolean paramBoolean)
  {
    if (this.aKP != null) {
      this.aKP.setFlipVerticaly(paramBoolean);
      this.aKR = true;
      setNeedsToPreProcess();
    }
  }

  public boolean getFlipVerticaly()
  {
    return (this.aKP != null) && (this.aKP.bVY());
  }

  public bPw getImageMesh() {
    return this.aKP;
  }

  public String getShader() {
    return this.aKP.getShader();
  }

  public void setShader(String paramString) {
    this.aKP.setShader(paramString);
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return paramJg instanceof dil;
  }

  public void bc()
  {
    super.bc();
    this.aKQ = null;
    this.iox = null;

    if (this.aKP != null) {
      dDq localdDq = this.aKP.getPixmap();
      if (localdDq != null) {
        localdDq.b(this);
      }
      this.aKP.bc();
      this.aKP = null;
    }
  }

  public void aJ()
  {
    this.aKQ = ajb.dhZ;

    super.aJ();

    this.aKP = new bPw();
    this.aKP.aJ();

    dil localdil = dil.checkOut();
    localdil.setWidget(this);
    a(localdil);
  }

  public void validate()
  {
    if (this.aKP != null) {
      re();
      this.aKP.a(this.haN, this.czl.getMargin(), this.czl.getBorder(), this.czl.getPadding());
    }
    super.validate();
  }

  private void re()
  {
    if (this.aKP == null) {
      return;
    }

    dDq localdDq = this.aKP.getPixmap();
    if (localdDq == null) {
      return;
    }

    if (this.iox != null) {
      a(localdDq, this.czl.getContentWidth(), this.czl.getContentHeight());
      return;
    }
    if (this.iov) {
      b(localdDq, this.czl.getContentWidth(), this.czl.getContentHeight());
      return;
    }
    setMeshBoundsFromComponent(localdDq.getWidth(), localdDq.getHeight(), this.czl.getContentWidth(), this.czl.getContentHeight());
  }

  private void a(dDq paramdDq, int paramInt1, int paramInt2) {
    if (this.iow) {
      MD localMD = c(paramdDq, this.iox.width, this.iox.height);
      setMeshBoundsFromComponent(localMD.getX(), localMD.getY(), paramInt1, paramInt2);
      return;
    }
    setMeshBoundsFromComponent(this.iox.width, this.iox.height, paramInt1, paramInt2);
  }

  private void b(dDq paramdDq, int paramInt1, int paramInt2) {
    if (this.iow) {
      MD localMD = c(paramdDq, paramInt1, paramInt2);
      setMeshBoundsFromComponent(localMD.getX(), localMD.getY(), paramInt1, paramInt2);
      return;
    }
    setMeshBounds(0, 0, paramInt1, paramInt2);
  }

  private MD c(dDq paramdDq, int paramInt1, int paramInt2) {
    if ((paramInt1 == 0) || (paramdDq.getWidth() == 0) || (paramInt2 == 0) || (paramdDq.getHeight() == 0)) {
      return new MD(paramInt1, paramInt2);
    }

    float f1 = paramdDq.getWidth() / paramdDq.getHeight();
    float f2 = paramInt1 / paramInt2;
    if (f1 == f2) {
      return new MD(paramInt1, paramInt2);
    }

    if (f1 > f2) {
      return new MD(paramInt1, (int)(paramInt1 / f1));
    }
    return new MD((int)(paramInt2 * f1), paramInt2);
  }

  private void setMeshBoundsFromComponent(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = this.aKQ.ba(paramInt1, paramInt3);
    int j = this.aKQ.bb(paramInt2, paramInt4);
    setMeshBounds(i, j, paramInt1, paramInt2);
  }

  private void setMeshBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.aKP.setX(paramInt1);
    this.aKP.setY(paramInt2);
    this.aKP.setWidth(paramInt3);
    this.aKP.setHeight(paramInt4);
  }

  public boolean rf()
  {
    boolean bool = false;
    if (this.aKP == null) {
      return false;
    }

    if (this.aKP.getPixmap() != null)
    {
      int i;
      int j;
      if (this.iox != null) {
        i = this.iox.width;
        j = this.iox.height;
      } else {
        i = this.aKP.getPixmap().getWidth();
        j = this.aKP.getPixmap().getHeight();
      }

      if ((this.haL == null) || (i != this.haL.width) || (j != this.haL.height)) {
        setMinSize(new Or(i, j));
        bool = true;
      }
    }
    else if ((this.haL == null) || (this.haL.width != 0) || (this.haL.height != 0)) {
      setMinSize(new Or(0, 0));
      bool = true;
    }

    return bool;
  }

  public boolean bb(int paramInt)
  {
    boolean bool1 = super.bb(paramInt);

    if ((this.aKP != null) && ((this.aKR) || ((this.aKP.getPixmap() != null) && (this.aKP.getPixmap().dfm()))))
    {
      boolean bool2 = rf();

      re();
      try {
        if (this.czl != null)
          this.aKP.a(this.haN, this.czl.getMargin(), this.czl.getBorder(), this.czl.getPadding());
      }
      catch (NullPointerException localNullPointerException) {
        K.error("imageMesh = " + this.aKP + ", appearance = " + this.czl, localNullPointerException);
      }

      if ((bool2) && (this.meE != null)) {
        this.meE.cfM();
      }

      this.aKR = false;
    }

    return bool1;
  }

  public void c(bdj parambdj)
  {
    czv localczv = (czv)parambdj;
    super.c(parambdj);
    localczv.setAlign(this.aKQ);
    localczv.setDisplaySize(this.iox != null ? (Or)this.iox.clone() : null);
    localczv.setKeepAspectRatio(this.iow);
    localczv.setScaled(this.iov);
    localczv.setModulationColor(localczv.getModulationColor());
    localczv.setFlipHorizontaly(getFlipHorizontaly());
    localczv.setFlipVerticaly(getFlipVerticaly());
    localczv.setDisplayShape(getDisplayShape());
  }

  public void a(dDq paramdDq) {
    this.aKR = true;
    setNeedsToPreProcess();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == drs)
      setAlign(ajb.eB(paramString));
    else if (paramInt == ioy)
      setDisplayShape(bGn.jJ(paramString));
    else if (paramInt == ioz)
      setDisplaySize(paramaKN.gK(paramString));
    else if (paramInt == dUc)
      setFlipHorizontaly(bUD.getBoolean(paramString));
    else if (paramInt == dUd)
      setFlipVerticaly(bUD.getBoolean(paramString));
    else if (paramInt == ioA)
      setKeepAspectRatio(bUD.getBoolean(paramString));
    else if (paramInt == bFb)
      setModulationColor(paramaKN.gJ(paramString));
    else if (paramInt == ioC)
      setScaled(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == drs)
      setAlign((ajb)paramObject);
    else if (paramInt == ioy)
      setDisplayShape((bGn)paramObject);
    else if (paramInt == ioz)
      setDisplaySize((Or)paramObject);
    else if (paramInt == dUc)
      setFlipHorizontaly(bUD.getBoolean(paramObject));
    else if (paramInt == dUd)
      setFlipVerticaly(bUD.getBoolean(paramObject));
    else if (paramInt == ioA)
      setKeepAspectRatio(bUD.getBoolean(paramObject));
    else if (paramInt == bFb)
      setModulationColor((bNa)paramObject);
    else if (paramInt == ioB)
      setPixmap((dDq)paramObject);
    else if (paramInt == ioC)
      setScaled(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}