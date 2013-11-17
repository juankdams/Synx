import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;
import org.apache.log4j.Logger;

class sz extends dQp
{
  private static final Logger K = Logger.getLogger(sz.class);
  private Entity3D bbH;

  public void reset()
  {
    super.reset();
    this.bbH.axl();
    this.bbH = null;
  }

  public EntityGroup b(ahm paramahm)
  {
    EntityGroup localEntityGroup = super.b(paramahm);
    GLGeometrySprite localGLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.ieZ.bQy();

    int i = 48 + paramahm.ats() * 8;
    localGLGeometrySprite.c(i - 16, -24.0F, 48, i);
    localGLGeometrySprite.setColor(0.5F, 0.5F, 0.5F, 1.0F);
    localGLGeometrySprite.i(0.0F, 0.0F, 1.0F, 1.0F);

    if ((!bB) && (this.bbH != null)) throw new AssertionError();
    this.bbH = ((Entity3D)Entity3D.fAs.bQy());
    this.bbH.a(localGLGeometrySprite, byn.bFr().gjS, Material.mwz);
    localGLGeometrySprite.axl();
    this.bbH.a(Pb.aaU().aaV(), cmL.hRG, cmL.hSk);
    this.bbH.a(cHU.iDw);
    this.bbH.b(bcW.fnv);
    this.bbH.setVisible(false);

    localEntityGroup.d(this.bbH);

    return localEntityGroup;
  }

  public void S(boolean paramBoolean) {
    if (paramBoolean) {
      bkk localbkk = Pb.aaU().aaV();
      this.bbH.setVisible(!localbkk.pZ(cmL.hRH));
    } else {
      this.bbH.setVisible(false);
    }
  }
}