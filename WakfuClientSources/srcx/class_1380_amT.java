import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class amT
  implements bPA
{
  amT(dqw paramdqw, Pattern paramPattern, StringBuilder paramStringBuilder, int[] paramArrayOfInt)
  {
  }

  public boolean a(int paramInt, bJC parambJC)
  {
    try
    {
      bXU localbXU = (bXU)parambJC;
      String str = localbXU.cdk().toLowerCase();
      System.out.println(str);
      if (this.dpy.matcher(str).find()) {
        this.dpz.append(paramInt).append(" : ").append(parambJC.getName()).append("\r\n");
        this.dpA[0] += 1;
      }
    } catch (Exception localException) {
      cth.cqP().s("Problème de data pour l'état " + paramInt, 16711680);
    }
    return true;
  }
}