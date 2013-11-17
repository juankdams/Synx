import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;

public abstract class bnM extends dSz
{
  protected final dnq fGS;
  private float fGT;
  private float fGU;
  private float fGV;
  private boolean fGW;
  private final EntitySprite fGX;

  protected bnM(dnq paramdnq, float paramFloat1, float paramFloat2)
  {
    super(paramFloat1, paramFloat2);
    this.fGS = paramdnq;

    this.fGT = 25.0F;
    this.fGU = 0.0F;
    this.fGV = 2.0F;
    this.fGW = false;

    this.fGX = ((EntitySprite)EntitySprite.kYR.bQx());
    this.fGX.mnU = this;
    GLGeometrySprite localGLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.ieZ.bQx();
    this.fGX.a(localGLGeometrySprite);
    localGLGeometrySprite.axl();
    this.fGX.setColor(0.0F, 0.0F, 0.0F, 1.0F);
  }

  public void init(GLAutoDrawable paramGLAutoDrawable)
  {
    super.init(paramGLAutoDrawable);

    this.fGS.awT();
  }

  public void a(GL paramGL)
  {
    if ((!IH.Sd().Se()) && (this.kKr)) {
      paramGL.glClearColor(this.iIf.QC(), this.iIf.QD(), this.iIf.QE(), this.iIf.getAlpha());
      this.kKr = false;
    }
    if (this.fGU <= 0.0F) {
      super.a(paramGL);
      return;
    }

    paramGL.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    int i = (int)(this.fGU * this.bIw / 100.0F);
    super.a(paramGL);

    ayc localayc = dHL.lSB.dhZ();
    localayc.g(Matrix44.bFe);

    this.fGX.c(-this.bIw / 2.0F + i / 2, -this.bIv / 2.0F, (int)this.bIv, i / 2);
    this.fGX.a(localayc);

    this.fGX.c(this.bIw / 2.0F, -this.bIv / 2.0F, (int)this.bIv, i / 2);
    this.fGX.a(localayc);

    paramGL.glClearColor(this.iIf.QC(), this.iIf.QD(), this.iIf.QE(), this.iIf.getAlpha());
  }

  public void cz(int paramInt)
  {
    super.cz(paramInt);

    if (this.fGW) {
      this.fGU += this.fGT * this.fGV * paramInt / 1000.0F;
      if (this.fGU > this.fGT)
        this.fGU = this.fGT;
    }
    else {
      this.fGU -= this.fGT * this.fGV * paramInt / 1000.0F;
      if (this.fGU < 0.0F)
        this.fGU = 0.0F;
    }
  }

  public final void a(dLS paramdLS)
  {
    aWe localaWe = cKV();
    localaWe.dL(paramdLS.getScreenWidth(), paramdLS.getScreenHeight());
    localaWe.C(localaWe.getZoomFactor());
  }

  public void bp(float paramFloat) {
    this.fGT = paramFloat;
  }

  public void bq(float paramFloat) {
    this.fGU = paramFloat;
  }

  public void br(float paramFloat) {
    this.fGV = paramFloat;
  }

  public void eX(boolean paramBoolean) {
    this.fGW = paramBoolean;
  }

  public void bxI()
  {
    super.bxI();
    this.fGX.axl();
  }
}