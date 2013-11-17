import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.Comparator;

final class cfE
  implements Comparator
{
  public int a(Entity paramEntity1, Entity paramEntity2)
  {
    return (int)(paramEntity1.mnP - paramEntity2.mnP);
  }
}