import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.awt.Insets;
import org.apache.log4j.Logger;

public final class bPw
{
  private static final Logger K = Logger.getLogger(bPw.class);
  private bNa bPm;
  private String gWd;
  private dDq bQC;
  private int hY;
  private int hZ;
  private int ib;
  private int ia;
  private bGn eQa = bGn.gCA;
  private boolean cZw;
  private boolean gWe;
  private boolean gWf;
  private EntitySprite bWt;
  private final aIn gWg = new aIn();
  static int eSN;

  public int getX()
  {
    return this.hY;
  }

  public void setX(int paramInt) {
    this.hY = paramInt;
  }

  public int getY() {
    return this.hZ;
  }

  public void setY(int paramInt) {
    this.hZ = paramInt;
  }

  public int getHeight() {
    return this.ib;
  }

  public void setHeight(int paramInt) {
    this.ib = paramInt;
  }

  public int getWidth() {
    return this.ia;
  }

  public void setWidth(int paramInt) {
    this.ia = paramInt;
  }

  public bGn getShape() {
    return this.eQa;
  }

  public void setShape(bGn parambGn) {
    this.eQa = parambGn;
  }

  public void setPixmap(dDq paramdDq) {
    this.bQC = paramdDq;
    if (this.bQC != null)
      this.cZw = true;
  }

  public dDq getPixmap()
  {
    return this.bQC;
  }

  public boolean biY()
  {
    return this.cZw;
  }

  public void b(cEi paramcEi, float paramFloat)
  {
    cxn localcxn = (cxn)this.bWt.dsE().sz(1);
    this.gWg.a(paramcEi, paramFloat);
    localcxn.f(this.gWg);
    if ((paramcEi == cEi.ixL) || (paramcEi == cEi.ixK)) {
      float f1 = localcxn.cuI().getX();
      float f2 = localcxn.cuI().getY();
      localcxn.b(f1, f2, -(getWidth() / 2));
    }
    this.bWt.dsE().b(1, localcxn);
  }

  public void setModulationColor(bNa parambNa) {
    if (parambNa == this.bPm) {
      return;
    }
    if (parambNa != null)
      this.bWt.setColor(parambNa.QC(), parambNa.QD(), parambNa.QE(), parambNa.getAlpha());
    else {
      this.bWt.setColor(1.0F, 1.0F, 1.0F, 1.0F);
    }

    this.bPm = parambNa;
  }

  public bNa getModulationColor() {
    return this.bPm;
  }

  public boolean bVX() {
    return this.gWe;
  }

  public void setFlipHorizontaly(boolean paramBoolean) {
    this.gWe = paramBoolean;
  }

  public boolean bVY() {
    return this.gWf;
  }

  public void setFlipVerticaly(boolean paramBoolean) {
    this.gWf = paramBoolean;
  }

  public String getShader() {
    return this.gWd;
  }

  public void setShader(String paramString) {
    this.gWd = paramString;
    bVZ();
  }

  public void a(Or paramOr, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    if ((this.bQC == null) || (this.bQC.hN() == null)) {
      this.bWt.setVisible(false);
      return;
    }
    this.bWt.setVisible(true);

    int i = paramInsets1.left + paramInsets2.left + paramInsets3.left;
    int j = paramInsets1.bottom + paramInsets2.bottom + paramInsets3.bottom;

    this.bWt.c(j + this.ib + this.hZ, i + this.hY, this.ia, this.ib);

    if (this.bPm != null)
      this.bWt.setColor(this.bPm);
    else {
      this.bWt.setColor(1.0F, 1.0F, 1.0F, 1.0F);
    }

    this.bQC.dfn();
    this.bWt.setTexture(this.bQC.hN());

    this.bWt.dsE().a(0, -this.ia / 2, -this.ib / 2);
    this.bWt.dsE().a(1, this.ia / 2, this.ib / 2);

    if (this.gWe) {
      if (this.gWf)
        this.bWt.cPd().a(this.bQC.bjM(), this.bQC.bjK(), this.bQC.bjL(), this.bQC.bjJ(), this.bQC.getRotation());
      else {
        this.bWt.cPd().a(this.bQC.bjL(), this.bQC.bjK(), this.bQC.bjM(), this.bQC.bjJ(), this.bQC.getRotation());
      }
    }
    else if (this.gWf)
      this.bWt.cPd().a(this.bQC.bjM(), this.bQC.bjJ(), this.bQC.bjL(), this.bQC.bjK(), this.bQC.getRotation());
    else {
      this.bWt.cPd().a(this.bQC.bjL(), this.bQC.bjJ(), this.bQC.bjM(), this.bQC.bjK(), this.bQC.getRotation());
    }

    bVZ();
  }

  private void bVZ() {
    if (dzp.qF(this.gWd)) {
      this.bWt.a(null, 0, null);
      return;
    }
    int i = byn.jo(this.gWd);
    bkk localbkk = Pb.aaU().aaW();

    if (localbkk.pZ(i))
      this.bWt.a(localbkk, i, cmL.hSl);
    else
      K.error("technic invalode " + this.gWd);
  }

  public void bc()
  {
    this.bQC = null;
    this.bPm = null;
    this.gWd = null;

    this.bWt.axl();
    this.bWt = null;
  }

  public void aJ() {
    if ((!bB) && (this.bWt != null)) throw new AssertionError();
    this.bWt = ((EntitySprite)EntitySprite.kYR.bQy());
    this.bWt.mnU = this;

    GeometrySprite localGeometrySprite = (GeometrySprite)GLGeometrySprite.ieZ.bQy();
    this.bWt.a(localGeometrySprite);
    localGeometrySprite.axl();
    BatchTransformer localBatchTransformer = this.bWt.dsE();
    localBatchTransformer.a(new cxn());
    localBatchTransformer.a(new cxn());
  }

  public Entity getEntity() {
    return this.bWt;
  }

  public aIn bWa() {
    return this.gWg;
  }

  public void c(float paramFloat1, float paramFloat2, float paramFloat3) {
    cxn localcxn = (cxn)this.bWt.dsE().sz(1);
    localcxn.c(paramFloat1, paramFloat2, paramFloat3);
    this.bWt.dsE().b(1, localcxn);
  }
}