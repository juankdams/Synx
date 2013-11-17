import java.util.regex.Matcher;
import java.util.regex.Pattern;

class amP
  implements bPA
{
  amP(dqw paramdqw, Pattern paramPattern, StringBuilder paramStringBuilder, int[] paramArrayOfInt)
  {
  }

  public boolean a(int paramInt, bBn parambBn)
  {
    try
    {
      if (this.dpy.matcher(parambBn.getName().toLowerCase()).find()) {
        this.dpz.append(paramInt).append(" : ").append(parambBn.getName()).append("\r\n");
        this.dpA[0] += 1;
      }
    } catch (Exception localException) {
      cth.cqP().s("Problème de data pour l'item " + paramInt, 16711680);
    }
    return true;
  }
}