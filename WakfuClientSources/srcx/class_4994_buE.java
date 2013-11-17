import com.ankamagames.wakfu.client.ui.script.function.bubbleText.ShowMonologue;

public class buE
  implements doN
{
  public buE(ShowMonologue paramShowMonologue, int[] paramArrayOfInt, dIJ paramdIJ, String[] paramArrayOfString, String paramString, bXf parambXf, bFB[] paramArrayOfbFB, int paramInt)
  {
  }

  public boolean a(cSx paramcSx)
  {
    this.gec[0] += 1;
    int i = this.gec[0];
    this.ged.setBubbleText(this.gee[i]);
    if (i == this.gee.length - 1) {
      this.ged.a(0, this, new cVP(this));
    }

    return false;
  }
}