import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup.ObjectFactory;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.util.ArrayList;

public class bfT extends dOc
  implements cFh, cdm
{
  private static final bfT ftQ = new bfT();
  public static final String TAG = "WorldPositionMarker";
  public static int ftR;
  private static String ftS;
  private float ftT;
  private float ftU;
  private EntityGroup djU;
  private ArrayList cWn = new ArrayList();
  private final ArrayList ftV = new ArrayList();

  private static final aIn ftW = new aIn();

  public static bfT getInstance()
  {
    return ftQ;
  }

  public static void setParticlePath(String paramString)
  {
    ftS = paramString;
  }

  protected void rd()
  {
    super.rd();

    this.bqm.d(this.djU);
  }

  public void a(xk paramxk) {
    this.cWn.add(paramxk);

    XulorParticleSystem localXulorParticleSystem = bHg.bOQ().A(String.format(ftS, new Object[] { Integer.valueOf(paramxk.Gn()) }), 0);
    localXulorParticleSystem.dsE().a(new cxn());
    this.ftV.add(localXulorParticleSystem);
  }

  public void b(xk paramxk) {
    if (this.cWn.remove(paramxk))
    {
      XulorParticleSystem localXulorParticleSystem = (XulorParticleSystem)this.ftV.remove(this.ftV.size() - 1);
      localXulorParticleSystem.ciX();
      localXulorParticleSystem.axl();
    }
  }

  public String getTag()
  {
    return "WorldPositionMarker";
  }

  public boolean isAppearanceCompatible(Jg paramJg) {
    return true;
  }

  private int getOnScreenX(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
    int i = getAppearance().getContentHeight() - paramInt2;
    int j = getAppearance().getContentWidth() - paramInt1;
    float f1 = i / j;
    float f2 = paramFloat1 - j / 2;
    float f3 = paramFloat2 - i / 2;
    float f4 = f3 / f2;
    if (Math.abs(f4) < f1) {
      return f2 > 0.0F ? j : 0;
    }
    return (int)(Math.signum(f2) * i / 2.0F / Math.abs(f4)) + j / 2;
  }

  private int getOnScreenY(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    int i = getAppearance().getContentHeight() - paramInt2;
    int j = getAppearance().getContentWidth() - paramInt1;
    float f1 = i / j;
    float f2 = paramFloat1 - j / 2;
    float f3 = paramFloat2 - i / 2;
    float f4 = f3 / f2;
    if (Math.abs(f4) > f1) {
      return f3 > 0.0F ? i : 0;
    }
    return (int)(Math.signum(f3) * j / 2.0F * Math.abs(f4)) + i / 2;
  }

  private void a(xk paramxk, XulorParticleSystem paramXulorParticleSystem, float paramFloat1, float paramFloat2)
  {
    float f1 = paramxk.getScreenX() - this.ftT;
    float f2 = paramxk.getScreenY() - this.ftU;

    int i = getOnScreenX((int)f1 + paramFloat1, (int)f2 + paramFloat2, 50, 50);
    int j = getOnScreenY((int)f1 + paramFloat1, (int)f2 + paramFloat2, 50, 50);

    cxn localcxn = (cxn)paramXulorParticleSystem.dsE().sz(0);

    float f3 = i - paramFloat1;
    float f4 = j - paramFloat2;
    float f5 = F(f3, f4) - 3.141593F;

    ftW.a(cEi.ixM, f5);
    localcxn.b(i + 25, j + 25, 0.0F);
    localcxn.f(ftW);
    paramXulorParticleSystem.dsE().bMH();

    this.djU.d(paramXulorParticleSystem);
  }

  private float F(float paramFloat1, float paramFloat2) {
    if ((paramFloat1 == 0.0F) && (paramFloat2 < 0.0F)) {
      paramFloat1 = -1.0E-004F;
    }

    float f1 = cEl.af(paramFloat1, paramFloat2);
    float f2 = paramFloat2 / f1;
    float f3 = -paramFloat1 / f1;

    double d = Math.acos(f2);
    return (float)(Math.signum(f3) * d);
  }

  public void clear() {
    this.cWn.clear();

    for (int i = this.ftV.size() - 1; i >= 0; i--) {
      XulorParticleSystem localXulorParticleSystem = (XulorParticleSystem)this.ftV.remove(0);
      localXulorParticleSystem.ciX();
      localXulorParticleSystem.axl();
    }
  }

  public void a(adG paramadG, int paramInt) {
    float f1 = this.czl.getContentWidth() / 2.0F;
    float f2 = this.czl.getContentHeight() / 2.0F;
    this.djU.removeAllChildren();

    for (int i = this.cWn.size() - 1; i >= 0; i--) {
      xk localxk = (xk)this.cWn.get(i);
      XulorParticleSystem localXulorParticleSystem = (XulorParticleSystem)this.ftV.get(i);
      a(localxk, localXulorParticleSystem, f1, f2);

      localXulorParticleSystem.M(paramInt / 1000.0F);
      localXulorParticleSystem.a(this.djU);
    }
  }

  public void b(adG paramadG, float paramFloat1, float paramFloat2)
  {
    this.ftT = paramadG.r(paramFloat1, paramFloat2);
    this.ftU = paramadG.s(paramFloat1, paramFloat2);
  }

  public void bc()
  {
    super.bc();
    this.djU.axl();
    this.djU = null;

    clear();
  }

  public void aJ()
  {
    super.aJ();

    Jg localJg = Jg.checkOut();
    localJg.setWidget(this);
    a(localJg);

    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setSize(new Or(100.0F, 100.0F));
    a(localcwP);

    this.meQ = true;

    if ((!bB) && (this.djU != null)) throw new AssertionError();
    this.djU = ((EntityGroup)EntityGroup.ecY.bQy());
    this.djU.mnU = this;

    this.djU.dsE().a(new cxn());
  }
}