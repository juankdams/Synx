import java.util.ArrayList;
import javax.swing.JFrame;

class WT
  implements Runnable
{
  WT(tr paramtr)
  {
  }

  public void run()
  {
    if (beV.a(this.cGH.bdH) != null)
      beV.a(this.cGH.bdH).b(this.cGH.bdH.dYL, this.cGH.bdH.aUq);
    StringBuilder localStringBuilder = new StringBuilder("PSys Debug ").append(" Part.: ").append(this.cGH.bdH.dYL.size()).append(" (max ").append(this.cGH.bdH.fsk).append(") Lights: ").append(this.cGH.bdH.aUq.size()).append(" (max ").append(this.cGH.bdH.fsl).append(")");

    beV.b(this.cGH.bdH).setTitle(localStringBuilder.toString());
  }
}