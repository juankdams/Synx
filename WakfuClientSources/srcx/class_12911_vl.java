import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.util.Comparator;

public class vl
  implements Comparator
{
  public static final vl bjt = new vl();

  public int a(Entity paramEntity1, Entity paramEntity2) {
    if ((paramEntity1 instanceof XulorParticleSystem))
      return -1;
    if ((paramEntity2 instanceof XulorParticleSystem)) {
      return 1;
    }
    float f1 = ((EntitySprite)paramEntity1).bjI();
    float f2 = ((EntitySprite)paramEntity2).bjI();

    return (int)(f2 - f1);
  }
}