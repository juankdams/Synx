import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aHr extends dxn
  implements cFh, cdm
{
  public static final aHr efc = new aHr();
  public static final String TAG = "compass";
  public static final String chd = "progressBar";
  public static final String efd = "compassOrientation";
  private alP cdb;
  private czv efe;
  private czv eff;
  private float cAH;
  private float efg;
  private final ArrayList efh;
  public static final int efi = "angle".hashCode();
  public static final int efj = "proximity".hashCode();

  public aHr()
  {
    this.efh = new ArrayList();
  }

  public dOc getWidgetByThemeElementName(String paramString, boolean paramBoolean)
  {
    if (paramString.equals("progressBar"))
      return this.cdb;
    if (paramString.equals("compassOrientation")) {
      return this.eff;
    }

    return null;
  }

  public String getTag() {
    return "compass";
  }

  private float getEffectiveProximity() {
    float f1 = 0.05F;
    float f2 = 0.3F;
    return (1.0F - this.efg) * 0.3F + 0.05F;
  }

  private void aTo() {
    float f = this.cAH + 6.283186F * getEffectiveProximity() / 2.0F;
    this.cdb.getProgressBarMesh().setDeltaAngle(f);
    this.cdb.ayz();
  }

  public void setAngle(float paramFloat) {
    this.cAH = paramFloat;
    this.eff.getImageMesh().b(cEi.ixM, paramFloat);
    aTo();
    cfM();
    setNeedsToPostProcess();
  }

  public void setProximity(float paramFloat) {
    this.efg = paramFloat;
    this.cdb.getProgressBarMesh().setFullCirclePercentage(getEffectiveProximity());
    aTo();
  }

  public void a(xk paramxk) {
    this.efh.add(paramxk);
    if (!paramxk.Gt()) {
      paramxk.h(getTarget().fa(), getTarget().fb(), getTarget().fc());
    }

    uz localuz = aKN.bcs().gN(paramxk.fJ());
    if (localuz == null) {
      K.error("On essai d'ajouter un marqueur avec l'url=" + paramxk.fJ() + " mais l'icone n'exite pas !!!");
      return;
    }
    this.efe.setPixmap(new dDq(localuz));
    setVisible(true);
  }

  public void b(xk paramxk) {
    this.efh.remove(paramxk);
    setVisible(false);
  }

  private float F(float paramFloat1, float paramFloat2) {
    if ((paramFloat1 == 0.0F) && (paramFloat2 < 0.0F)) {
      paramFloat1 = -1.0E-004F;
    }
    if ((paramFloat1 == 0.0F) && (paramFloat2 == 0.0F))
      return -1.570796F;
    float f1 = cEl.af(paramFloat1, paramFloat2);
    float f2 = paramFloat2 / f1;
    float f3 = -paramFloat1 / f1;

    double d = Math.acos(f2);
    return (float)(Math.signum(f3) * d) - 1.570796F;
  }

  public void a(adG paramadG, int paramInt) {
    if (this.efh.isEmpty()) {
      return;
    }
    xk localxk = (xk)this.efh.get(0);

    float f1 = getTarget().getWorldX();
    float f2 = getTarget().getWorldY();

    float f3 = cEl.af(localxk.Gq() - localxk.getStartX(), localxk.Gr() - localxk.getStartY());
    float f4 = cEl.af(f1 - localxk.getX(), f2 - localxk.getY());
    setProximity(1.0F - bCO.t(f4 / (f3 * 1.2F), 0.0F, 1.0F));

    float f5 = paramadG.r(f1, f2);
    float f6 = paramadG.g(f1, f2, getTarget().fc());
    int i = localxk.getScreenX();
    int j = localxk.getScreenY();

    setAngle(F(f5 - i, f6 - j));
  }

  public void b(adG paramadG, float paramFloat1, float paramFloat2) {
  }

  public void bc() {
    super.bc();

    this.cdb = null;
    this.eff = null;
    this.efe = null;

    this.efh.clear();
  }

  public void aJ() {
    super.aJ();

    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setSize(new Or(200, 200));
    a(localcwP);

    diu localdiu = new diu(this, null);
    localdiu.aJ();
    a(localdiu);

    setVisible(false);
    setYOffset(-130);

    this.cdb = new alP();
    this.cdb.aJ();
    this.cdb.setDisplayType(bpg.fIS);
    this.cdb.setValue(1.0F);
    this.cdb.setNonBlocking(true);
    cWi localcWi = (cWi)this.cdb.getProgressBarMesh();
    localcWi.bj(0.75F);
    localcWi.bk(0.8F);
    a(this.cdb);

    this.eff = new czv();
    this.eff.aJ();
    this.eff.setNonBlocking(true);
    a(this.eff);

    this.efe = new czv();
    this.efe.aJ();
    this.efe.setNonBlocking(true);
    a(this.efe);
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);

    aHr localaHr = (aHr)parambdj;
    localaHr.setAngle(this.cAH);
    localaHr.setProximity(this.efg);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == efi)
      setAngle(bUD.getFloat(paramString));
    else if (paramInt == efj)
      setProximity(bUD.getFloat(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == efi)
      setAngle(bUD.getFloat(paramObject));
    else if (paramInt == efj)
      setProximity(bUD.getFloat(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}