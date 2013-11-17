import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup.ObjectFactory;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.awt.Dimension;
import java.awt.Insets;
import org.apache.log4j.Logger;

public abstract class bah
{
  private static final Logger K = Logger.getLogger(bah.class);
  protected dWq fhW;
  protected EntityGroup bqm;
  protected cxn fhX;
  protected cxn fhY;
  private bNa bPm;
  protected dDq bQC;
  protected float blZ = 1.0F;
  protected int ib;
  protected int ia;
  private float fhZ = (0.0F / 0.0F); private float fia = (0.0F / 0.0F);

  public void setMapDisplayer(dWq paramdWq)
  {
    if (this.fhW != null) {
      this.fhW.clear();
    }

    this.fhW = paramdWq;
    this.fhW.init();
  }

  public final int getHeight() {
    return this.ib;
  }

  public final void setHeight(int paramInt)
  {
    this.ib = paramInt;
  }

  public final int getWidth() {
    return this.ia;
  }

  public final void setWidth(int paramInt)
  {
    this.ia = paramInt;
  }

  public final Entity getEntity() {
    return this.bqm;
  }

  public final dDq getPixmap() {
    return this.bQC;
  }

  public final bNa getModulationColor() {
    return this.bPm;
  }

  public void setPixmap(dDq paramdDq)
  {
    this.bQC = paramdDq;
  }

  public final void setModulationColor(bNa parambNa) {
    if (this.bPm == parambNa) {
      return;
    }
    this.bPm = parambNa;
  }

  public final void C(float paramFloat) {
    this.blZ = paramFloat;
    this.fhX.c(this.blZ, this.blZ, this.blZ);
    bpa();
  }

  protected final void N(float paramFloat1, float paramFloat2)
  {
    if ((this.fhZ == paramFloat1) && (this.fia == paramFloat2)) {
      return;
    }
    this.fhZ = paramFloat1;
    this.fia = paramFloat2;
    this.fhY.b(paramFloat1, paramFloat2, -10000.0F);
    bpa();
  }

  protected void bpa() {
    if (this.fhW == null)
      return;
    this.fhW.getEntity().dsE().bMH();
  }

  protected abstract void aGQ();

  public void a(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    a(paramDimension);
    if (this.fhW != null) {
      this.fhW.a(this);
      aGQ();
      bpa();
    }
  }

  protected abstract void a(Dimension paramDimension);

  public final void cg(int paramInt1, int paramInt2)
  {
    this.ia = paramInt1;
    this.ib = paramInt2;
  }

  public void bc() {
    this.bQC = null;

    this.bqm.axl();
    this.bqm = null;
    this.bPm = null;

    if (this.fhW != null) {
      this.fhW.clear();
      this.fhW = null;
    }
  }

  public void aJ() {
    if ((!bB) && (this.bqm != null)) throw new AssertionError();
    if ((!bB) && (this.fhW != null)) throw new AssertionError();
    this.bqm = ((EntityGroup)EntityGroup.ecY.bQy());
    this.bqm.mnU = this;

    this.fhX = new cxn();
    this.fhY = new cxn();

    this.fhZ = (0.0F / 0.0F);
    this.fia = (0.0F / 0.0F);
  }

  public final bNa getColor()
  {
    return this.bPm == null ? bNa.gRx : this.bPm;
  }
}