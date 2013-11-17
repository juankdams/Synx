import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import org.apache.log4j.Logger;

public class cOs extends dWq
{
  private static final Logger K = Logger.getLogger(cOs.class);

  protected EntitySprite cGo()
  {
    return (EntitySprite)EntitySprite.kYR.bQy();
  }

  protected void Jq()
  {
    i(getEntity());
  }

  public static void i(Entity paramEntity) {
    cxn localcxn1 = new cxn();
    localcxn1.f(new aIn(cEi.ixM, -0.7853982F));
    localcxn1.c(0.5F * bCO.gxu, bCO.gxu, 1.0F);

    cxn localcxn2 = new cxn();
    localcxn2.f(new aIn(cEi.ixK, -1.047198F));

    paramEntity.dsE().a(localcxn1);
    paramEntity.dsE().a(localcxn2);
  }

  public void h(uz paramuz)
  {
    ((EntitySprite)getEntity()).i(paramuz);
  }

  public void a(bah parambah)
  {
    dDq localdDq = parambah.getPixmap();
    if (localdDq == null)
      return;
    int i = parambah.getWidth();
    int j = parambah.getHeight();
    doM.a(-i / 2, j / 2, i, j, localdDq, parambah.getColor(), (EntitySprite)getEntity());
    ((EntitySprite)getEntity()).cPd().a(cnQ.hUU, cnQ.hUY);
  }
}