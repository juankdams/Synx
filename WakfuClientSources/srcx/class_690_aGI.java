import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.Arrays;

public abstract class aGI extends VJ
{
  protected bNa bPm = null;
  protected dDq[] cZv;
  protected Entity3D aVX;
  private SF cZx;

  public abstract void a(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3);

  public final Entity getEntity()
  {
    return this.aVX;
  }

  public bNa getModulationColor()
  {
    return this.bPm;
  }

  public void setModulationColor(bNa parambNa)
  {
    if (this.bPm == parambNa) {
      return;
    }
    this.bPm = parambNa;

    if (this.bPm != null)
      this.aVX.setColor(parambNa.QC(), parambNa.QD(), parambNa.QE(), parambNa.getAlpha());
    else
      this.aVX.setColor(1.0F, 1.0F, 1.0F, 1.0F);
  }

  public void bc()
  {
    if (this.cZv != null) {
      Arrays.fill(this.cZv, null);
    }

    this.aVX.axl();
    this.aVX = null;

    if (this.cZx != null) {
      this.cZx.release();
      this.cZx = null;
    }

    this.bPm = null;
  }

  public void aJ()
  {
    if ((!bB) && (this.aVX != null)) throw new AssertionError("Object already checked out");
    this.aVX = ((Entity3D)Entity3D.fAs.bQy());
  }

  protected final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, dDq paramdDq, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0) || (paramdDq == null) || (paramdDq.hN() == null))
      return;
    this.cZx.a(paramInt1, paramInt2, paramInt3, paramInt4, paramdDq, paramFloat1, paramFloat2, paramFloat3, paramFloat4, this.bPm);
  }

  protected final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, dDq paramdDq) {
    if ((paramInt3 == 0) || (paramInt4 == 0) || (paramdDq == null) || (paramdDq.hN() == null))
      return;
    this.cZx.a(paramInt1, paramInt2, paramInt3, paramInt4, paramdDq, this.bPm);
  }

  protected final void hW(int paramInt) {
    if (this.cZx == null)
      this.cZx = new SF();
    this.cZx.a(this.aVX, paramInt);
  }

  protected final void afN() {
    this.cZx.afN();
  }
}