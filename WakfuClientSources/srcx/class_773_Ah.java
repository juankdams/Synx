import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import org.apache.log4j.Logger;

public class Ah extends dWq
{
  private static final Logger K = Logger.getLogger(Ah.class);
  private EntityGroup bvE;
  private EntitySprite bvF;
  private dDq bvG;
  private bNa aDh;

  protected EntityGroup Jo()
  {
    this.bvF = ((EntitySprite)EntitySprite.kYR.bQy());
    this.bvF.mnU = this;

    this.bvE = ((EntityGroup)EntityGroup.ecY.bQy());
    this.bvE.mnU = this;

    EntityGroup localEntityGroup = (EntityGroup)EntityGroup.ecY.bQy();
    localEntityGroup.d(this.bvF);
    localEntityGroup.d(this.bvE);
    return localEntityGroup;
  }

  public EntityGroup Jp() {
    return this.bvE;
  }

  protected void Jq()
  {
    cOs.i(this.bvF);
  }

  public void a(bah parambah)
  {
    if (this.aDh != null) {
      doM.a(0, 0, this.bvG.getWidth(), this.bvG.getHeight(), this.bvG, parambah.getColor(), this.bvF);

      int i = parambah.getWidth();
      int j = parambah.getHeight();
      this.bvF.c(j / 2, -i / 2, (int)(1.7F * i), (int)(1.7F * j));
      this.bvF.cPd().a(cnQ.hUU, cnQ.hUY);
    }
  }

  public void clear()
  {
    super.clear();
    this.bvE = null;
    this.bvF = null;
  }

  public void a(dDq paramdDq, bNa parambNa) {
    this.bvG = paramdDq;
    this.aDh = parambNa;
  }
}