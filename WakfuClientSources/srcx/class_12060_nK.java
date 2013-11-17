import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

public class nK
{
  public static boolean a(EntitySprite paramEntitySprite, int paramInt1, int paramInt2)
  {
    return (paramEntitySprite.bjJ() <= paramInt1) && (paramEntitySprite.bjK() >= paramInt1) && (paramEntitySprite.bjM() <= paramInt2) && (paramEntitySprite.bjL() >= paramInt2);
  }
}