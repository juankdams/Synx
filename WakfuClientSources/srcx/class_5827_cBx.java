import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.material.Material.ObjectFactory;
import org.apache.log4j.Logger;

public class cBx extends dxn
  implements bX
{
  private static final Logger K = Logger.getLogger(cBx.class);
  public static final String TAG = "smiley";
  public static final String eOs = "animatedElementViewer";
  private String isA;
  private boolean isB;
  private boolean isC = true;

  public static int gAH = -2147483648;
  private auC isD;
  private float cas;

  public void aE(String paramString1, String paramString2)
  {
    i(paramString1, paramString2, true);
  }

  public void i(String paramString1, String paramString2, boolean paramBoolean) {
    this.isA = paramString1;
    cpa localcpa = cBQ.cxL().coO().nf(this.isA);
    if ((!bB) && (localcpa == null)) throw new AssertionError("Impossible de charger un smiley");

    this.isD = ((auC)localcpa.fi("animatedElementViewer"));

    if (this.isD == null) {
      throw new Exception("On a chargé un Widget de Smiley, mais il n'a pas de widget d'animatedElementViewer...");
    }

    this.isB = paramBoolean;

    setAnimation(paramString2);
    this.cas = this.isD.getAnimatedElement().getScale();
  }

  public void setAnimation(String paramString) {
    this.isD.setAnimName(paramString);
  }

  public void setTarget(bVf parambVf) {
    setTarget(parambVf);
  }

  public void setTarget(ahm paramahm) {
    if (paramahm == this.af) {
      return;
    }

    if ((this.af != null) && ((this.af instanceof ahm))) {
      ((ahm)this.af).b(this);
    }

    super.setTarget(paramahm);

    if (paramahm != null) {
      paramahm.a(this);
      setTargetIsVisible(paramahm.isVisible());
    }
  }

  public void cxB()
  {
    if (this.isB)
      cxD();
    else
      setSmileyIsVisible(false);
  }

  public void setSmileyIsVisible(boolean paramBoolean)
  {
    if (this.isC == paramBoolean) {
      return;
    }
    this.isC = paramBoolean;

    atG();
  }

  protected void atG()
  {
    setVisible((this.lDr) && (this.isC));
  }

  public final void invalidate()
  {
    super.invalidate();
  }

  public MD getComputedPosition(int paramInt1, int paramInt2, int paramInt3)
  {
    MD localMD = super.getComputedPosition(paramInt1, paramInt2, paramInt3);
    int i = localMD.getX();
    int j = localMD.getY();

    localMD.set(i, j);

    return localMD;
  }

  public void a(agn paramagn, int paramInt1, int paramInt2, int paramInt3)
  {
    atG();

    super.a(paramagn, paramInt1, paramInt2, 0);
  }

  protected void k(int paramInt, float paramFloat)
  {
    super.k(paramInt, paramFloat);
    float f1 = paramFloat - 0.5F + this.cas;
    this.isD.setScale(f1);
    float f2 = 1.0F;

    long l = getWatcherContainerAdviser().Ft();
    int i = getDuration();
    if (l < i / 4)
      f2 = (float)l / (i / 4.0F);
    else if (l > i * 3 / 4) {
      f2 = 1.0F - ((float)l - 3 * i / 4.0F) / (i - 3 * i / 4.0F);
    }
    Material localMaterial = (Material)Material.mwD.bQy();
    localMaterial.x(f2, f2, f2, f2);
    this.isD.setMaterial(localMaterial);
    localMaterial.axl();
  }

  private static float n(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    return -paramFloat3 * ((paramFloat1 = paramFloat1 / paramFloat4 - 1.0F) * paramFloat1 * paramFloat1 * paramFloat1 - 1.0F) + paramFloat2;
  }

  public void setDuration(int paramInt) {
    this.lDt.setDuration(paramInt);
  }

  public void cxC()
  {
    this.lDt.dm(0);
    atG();
  }

  public auC getAnimatedElementViewer() {
    return this.isD;
  }

  public int getAdviserId() {
    return this.lDt.getId();
  }

  public String getWidgetId() {
    return this.isA;
  }

  public void cxD() {
    cBQ.cxL().mW(this.isA);
  }

  public void b(boolean paramBoolean, dnS paramdnS) {
    setTargetIsVisible(paramBoolean);
  }

  public float getWorldX()
  {
    if (this.af != null) {
      return this.af.getWorldX();
    }
    return 0.0F;
  }

  public float getWorldY()
  {
    if (this.af != null) {
      return this.af.getWorldY();
    }
    return 0.0F;
  }

  public float getAltitude()
  {
    if (this.af != null) {
      return this.af.getAltitude();
    }
    return 0.0F;
  }

  public int getDuration() {
    return this.lDt.getDuration();
  }

  public void ccT()
  {
    super.ccT();

    if ((this.af != null) && ((this.af instanceof ahm)))
      ((ahm)this.af).b(this);
  }
}