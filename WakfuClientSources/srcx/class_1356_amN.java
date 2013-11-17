import java.util.regex.Matcher;
import java.util.regex.Pattern;

class amN
  implements bPA
{
  amN(dqw paramdqw, Pattern paramPattern, StringBuilder paramStringBuilder, int[] paramArrayOfInt)
  {
  }

  public boolean a(int paramInt, dLB paramdLB)
  {
    try
    {
      if (this.dpy.matcher(paramdLB.getName().toLowerCase()).find()) {
        this.dpz.append(paramInt).append(" : ").append(paramdLB.getName()).append("\r\n");
        this.dpA[0] += 1;
      }
    } catch (Exception localException) {
      cth.cqP().s("Problème de data pour le set " + paramInt, 16711680);
    }
    return true;
  }
}