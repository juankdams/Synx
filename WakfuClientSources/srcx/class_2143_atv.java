import com.ankamagames.baseImpl.graphics.script.function.world.RunOnFadeOut;

public class atv
  implements dnV
{
  private final String brS;
  private final bXf boY;
  private final bFB[] bpa;

  public atv(RunOnFadeOut paramRunOnFadeOut, String paramString, bXf parambXf, bFB[] paramArrayOfbFB)
  {
    if ((!bB) && (parambXf == null)) throw new AssertionError("FadeOutListener avec un script null");
    if ((!bB) && (paramString == null)) throw new AssertionError("FadeOutListener avec une fonction nulle");
    this.brS = paramString;
    this.bpa = paramArrayOfbFB;
    this.boY = parambXf;
  }

  public void Hi() {
  }

  public void Hj() {
    this.boY.a(this.brS, this.bpa, new cIG[0]);
    IH.Sd().b(this);
  }

  public void Hk()
  {
  }

  public void Hl()
  {
  }
}