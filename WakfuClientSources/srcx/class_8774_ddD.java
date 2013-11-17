import com.ankamagames.wakfu.client.console.command.display.HideFightOccluders;
import java.util.ArrayList;

public final class ddD
  implements dGy
{
  public ddD(int paramInt1, int paramInt2, int paramInt3, int paramInt4, ArrayList paramArrayList)
  {
  }

  public boolean d(azX paramazX)
  {
    if (HideFightOccluders.b(paramazX, this.kXc, this.kXd, this.kXe, this.kXf))
      this.kXg.add(paramazX);
    return true;
  }
}