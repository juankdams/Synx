import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import java.util.ArrayList;

class qJ extends ArrayList
{
  public void clear()
  {
    for (EntitySprite localEntitySprite : this) {
      localEntitySprite.axl();
    }
    super.clear();
  }

  public void z(float paramFloat) {
    for (EntitySprite localEntitySprite : this)
      localEntitySprite.setColor(paramFloat, paramFloat, paramFloat, paramFloat);
  }
}