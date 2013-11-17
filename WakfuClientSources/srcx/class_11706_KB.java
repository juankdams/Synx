import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

public class KB
  implements dbK
{
  public void a(doc paramdoc, int paramInt)
  {
    int i = paramdoc.Ft();
    int j = paramdoc.getDuration();

    GLGeometrySprite localGLGeometrySprite = (GLGeometrySprite)paramdoc.cVt().pW(0);

    paramdoc.setXOffset(-localGLGeometrySprite.getWidth() / 2);

    doc.a(paramdoc);

    float f = 1.0F;
    if (i < j / 4)
      f = doc.t(i, -0.5F, 1.6F, j / 4);
    else if (i > j * 3 / 4) {
      f = doc.t(i - j * 3 / 4, 1.5F, -1.6F, j / 4);
    }
    paramdoc.cVt().setColor(1.0F, 1.0F, 1.0F, f);
  }
}