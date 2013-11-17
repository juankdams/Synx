import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import java.awt.Insets;
import java.awt.Point;

public class cKm extends Kc
{
  public void f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    int i = paramInt1 + paramInt7;
    int j = paramInt2 + paramInt6 + paramInt4;
    this.bWt.c(j, i, paramInt3, paramInt4);
  }

  public void a(Point paramPoint, Or paramOr, Insets paramInsets) {
    f(paramPoint.x, paramPoint.y, paramOr.width, paramOr.height, paramInsets.top, paramInsets.bottom, paramInsets.left, paramInsets.right);
  }
}