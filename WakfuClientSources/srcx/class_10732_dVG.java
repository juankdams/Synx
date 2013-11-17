import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

public class dVG
  implements dbK
{
  public void a(doc paramdoc, int paramInt)
  {
    int i = paramdoc.Ft();
    int j = paramdoc.getDuration();

    GLGeometrySprite localGLGeometrySprite = (GLGeometrySprite)paramdoc.cVt().pW(0);

    paramdoc.setYOffset((int)doc.t(i, 60.0F, 60.0F, j));
    paramdoc.setXOffset(-localGLGeometrySprite.getWidth() / 2);

    doc.a(paramdoc);

    float f1 = j * 0.8F;
    float f2 = bCO.t(doc.t(Math.min(i, f1), 20.0F, -20.1F, f1), 0.0F, 1.0F);
    paramdoc.cVt().setColor(1.0F, 1.0F, 1.0F, f2);
  }
}