import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import org.apache.log4j.Logger;

public class dfz extends dWq
{
  private static final Logger K = Logger.getLogger(dfz.class);

  protected Entity3D asO()
  {
    return (Entity3D)Entity3D.fAs.bQy();
  }

  protected void Jq()
  {
    cOs.i(getEntity());
  }

  public void a(bah parambah)
  {
    Entity3D localEntity3D = (Entity3D)getEntity();
    localEntity3D.clear();

    dDq localdDq = parambah.getPixmap();
    if (localdDq == null)
      return;
    int i = parambah.getWidth();
    int j = parambah.getHeight();
    doM.a(-i / 2, j / 2, i, j, localdDq, parambah.getColor(), localEntity3D);

    for (int k = 0; k < localEntity3D.bvg(); k++)
      localEntity3D.pW(k).a(cnQ.hUU, cnQ.hUY);
  }
}