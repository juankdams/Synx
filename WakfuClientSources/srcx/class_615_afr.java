import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryBackground;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryBackground.ObjectFactory;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText.ObjectFactory;
import com.ankamagames.framework.graphics.engine.text.EntityText;
import com.ankamagames.framework.graphics.engine.text.EntityText.ObjectFactory;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;
import java.awt.Dimension;
import java.awt.Insets;

public class afr extends cCO
{
  private dIB cYk = new dIB();
  private acQ cYl = new acQ();
  private EntityText bDH;
  private boolean cYm = true;
  private int hY;
  private int hZ;
  private int ia;
  private int ib;

  public afr()
  {
    super.setInsets(new Insets(this.cYk.getTopMargin(), this.cYk.getLeftMargin(), this.cYk.getBottomMargin(), this.cYk.getRightMargin()));
  }

  public void setSparkAngle(float paramFloat)
  {
    this.cYk.setSparkAngle(paramFloat);
    aqX();
  }

  public void setDisplaySpark(boolean paramBoolean)
  {
    this.cYk.kV(paramBoolean);
    aqX();
  }

  public void a(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    this.hY = paramInsets1.left;
    this.hZ = paramInsets1.bottom;
    this.ia = (paramDimension.width - paramInsets1.left - paramInsets1.right);
    this.ib = (paramDimension.height - paramInsets1.bottom - paramInsets1.top);

    this.bDH.m(new cEh(this.hY, this.hZ, 0.0F));
    this.bDH.setMinWidth(this.ia - (paramInsets2.left + paramInsets2.right));
    this.bDH.setMinHeight(this.ib - (paramInsets2.bottom + paramInsets2.top));
  }

  private void aqX() {
    this.bDH.cPB().a(this.cYk.PU(), this.cYk.PV());
  }

  public Entity getEntity() {
    return this.bDH;
  }

  public void bc() {
    this.bDH.axl();
    this.bDH = null;
  }

  public void aJ() {
    if ((!bB) && (this.bDH != null)) throw new AssertionError();

    this.bDH = ((EntityText)EntityText.laL.bQy());
    GLGeometryText localGLGeometryText = (GLGeometryText)GLGeometryText.lBa.bQy();
    GLGeometryBackground localGLGeometryBackground = (GLGeometryBackground)GLGeometryBackground.aTA.bQy();
    this.bDH.a(localGLGeometryText);
    this.bDH.a(localGLGeometryBackground);
    this.bDH.a(dRJ.mnp);

    localGLGeometryBackground.a(this.cYk.PU(), this.cYk.PV());
    localGLGeometryBackground.b(this.cYk.PW());
    localGLGeometryBackground.a(this.cYk.PX());
    localGLGeometryBackground.j(this.cYk.getLeftMargin(), this.cYk.getRightMargin(), this.cYk.getTopMargin(), this.cYk.getBottomMargin());

    localGLGeometryText.axl();
    localGLGeometryBackground.axl();
  }

  public void setInsets(Insets paramInsets)
  {
  }
}