import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class jq extends dOc
  implements asO, dKW
{
  public static final String TAG = "FlippingImage";
  private final ArrayList aKO;
  private bPw aKP;
  protected ajb aKQ;
  private boolean aKR;
  private int aKS;
  private int aKT;
  private int aKU;
  private boolean aKV;
  private aVm aKW;
  private boolean aKX;
  private boolean aKY;
  public static final int aKZ = "textures".hashCode();
  public static final int aLa = "duration".hashCode();
  public static final int aLb = "flipCount".hashCode();
  public static final int aLc = "vertical".hashCode();
  public static final int aLd = "shader".hashCode();

  public jq()
  {
    this.aKO = new ArrayList();

    this.aKQ = ajb.dhZ;
  }

  public String getTag()
  {
    return "FlippingImage";
  }

  public boolean isAppearanceCompatible(Jg paramJg) {
    return true;
  }

  protected void rd()
  {
    super.rd();
    if ((this.bqm != null) && (this.aKP.getEntity() != null))
      this.bqm.d(this.aKP.getEntity());
  }

  public void bc()
  {
    super.bc();
    this.aKQ = null;

    int i = 0; for (int j = this.aKO.size(); i < j; i++)
      ((dDq)this.aKO.get(i)).setTexture(null);
    this.aKO.clear();

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
    super.aJ();

    this.aKP = new bPw();
    this.aKP.aJ();

    Jg localJg = Jg.checkOut();
    localJg.setWidget(this);
    a(localJg);
  }

  public void validate()
  {
    if (this.aKP != null) {
      re();
      this.aKP.a(this.haN, this.czl.getMargin(), this.czl.getBorder(), this.czl.getPadding());
    }
    super.validate();
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

  private void re()
  {
    if (this.aKP == null) {
      return;
    }

    dDq localdDq = this.aKP.getPixmap();
    if (localdDq == null) {
      return;
    }

    setMeshBoundsFromComponent(localdDq.getWidth(), localdDq.getHeight(), this.czl.getContentWidth(), this.czl.getContentHeight());
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

    int i = getBiggestWidth();
    int j = getBiggestHeight();

    if ((this.haL == null) || (this.haL.width != i) || (this.haL.height != j)) {
      setMinSize(new Or(i, j));
      bool = true;
    }

    return bool;
  }

  private int getBiggestWidth() {
    int i = 0;
    for (dDq localdDq : this.aKO) {
      int j = localdDq.getWidth();
      if (j > i)
        i = j;
    }
    return i;
  }

  private int getBiggestHeight() {
    int i = 0;
    for (dDq localdDq : this.aKO) {
      int j = localdDq.getHeight();
      if (j > i)
        i = j;
    }
    return i;
  }

  public boolean bb(int paramInt)
  {
    boolean bool1 = super.bb(paramInt);

    if (this.aKY) {
      for (dDq localdDq : this.aKO) {
        if (!localdDq.hN().gI())
          return true;
      }
      rf();

      this.aKY = false;
    }

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

  public String getShader() {
    return this.aKP.getShader();
  }

  public void setShader(String paramString) {
    this.aKP.setShader(paramString);
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

  public void a(dDq paramdDq) {
    this.aKR = true;
    setNeedsToPreProcess();
  }

  public void setPixmaps(String[] paramArrayOfString) {
    this.aKO.clear();
    if (paramArrayOfString.length == 0)
      return;
    for (String str : paramArrayOfString) {
      ae(str);
    }
    setTextureIndex(0);
    rf();
    this.aKY = true;
    setNeedsToPreProcess();
  }

  public void setTextures(Iterable paramIterable) {
    this.aKO.clear();
    for (String str : paramIterable) {
      ae(str);
    }
    setTextureIndex(0);
    rf();
    this.aKY = true;
    setNeedsToPreProcess();
  }

  private void ae(String paramString)
  {
    try {
      URL localURL = new URL(paramString);
      if (!bAy.d(localURL)) {
        K.error("Impossible de charger la texture=" + paramString);
        return;
      }
      uz localuz = dQU.drS().n(localURL);
      this.aKO.add(new dDq(localuz));
    } catch (MalformedURLException localMalformedURLException) {
      localMalformedURLException.printStackTrace();
    }
  }

  public void setTextureIndex(int paramInt) {
    this.aKT = paramInt;
    if ((paramInt < 0) || (paramInt >= this.aKO.size())) {
      K.error("Index de texture inconnu=" + paramInt);
      return;
    }

    this.aKP.setPixmap((dDq)this.aKO.get(paramInt));

    this.aKR = true;
    setNeedsToPreProcess();
  }

  public void c(bdj parambdj)
  {
    jq localjq = (jq)parambdj;
    super.c(parambdj);
    localjq.setAlign(this.aKQ);
    localjq.setModulationColor(getModulationColor());
    localjq.setShader(getShader());
    localjq.setDuration(this.aKS);
    localjq.setFlipCount(this.aKU);
    localjq.setVertical(this.aKX);
    localjq.meW = true;
  }

  public void setDuration(int paramInt) {
    this.aKS = paramInt;
  }

  public void start() {
    if (this.aKO.isEmpty()) {
      K.error("Impossible de lancer le flip sans texture !!!");
      return;
    }
    this.aKV = true;
    J(aVm.class);
    this.aKW = new aVm(this, Float.valueOf(0.0F), Float.valueOf(6.283186F), 0, this.aKS, ddp.kWF, this.aKU);
    a(this.aKW);
  }

  public void stop() {
    this.aKV = false;
    this.aKW.nv();
    J(aVm.class);
  }

  public void setFlipCount(int paramInt) {
    this.aKU = paramInt;

    if (this.aKV)
      stop();
  }

  public void setVertical(boolean paramBoolean)
  {
    this.aKX = paramBoolean;
  }

  private void rg()
  {
    int i = this.aKT + 1;
    if (i >= this.aKO.size())
      i = 0;
    setTextureIndex(i);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == aLa)
      setDuration(bUD.aR(paramString));
    else if (paramInt == aLb)
      setFlipCount(bUD.aR(paramString));
    else if (paramInt == aLc)
      setVertical(bUD.getBoolean(paramString));
    else if (paramInt == aLd)
      setShader(paramString);
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == aKZ) {
      if ((paramObject == null) || ((paramObject instanceof String[])))
        setPixmaps((String[])paramObject);
      else if ((paramObject instanceof Iterable))
        setTextures((Iterable)paramObject);
      else
        return false;
    }
    else if (paramInt == aLa)
      setDuration(bUD.aR(paramObject));
    else if (paramInt == aLb)
      setFlipCount(bUD.aR(paramObject));
    else if (paramInt == aLc)
      setVertical(bUD.getBoolean(paramObject));
    else if (paramInt == aLd)
      setShader(bUD.getString(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}