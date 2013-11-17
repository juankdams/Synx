import com.ankamagames.baseImpl.graphics.script.function.world.RunOnFadeIn;

public class yp
  implements dnV
{
  private final String brS;
  private final bXf boY;
  private final bFB[] bpa;

  public yp(RunOnFadeIn paramRunOnFadeIn, String paramString, bXf parambXf, bFB[] paramArrayOfbFB)
  {
    if ((!bB) && (parambXf == null)) throw new AssertionError("FadeInListener avec un script null");
    if ((!bB) && (paramString == null)) throw new AssertionError("FadeInListener avec une fonction nulle");
    this.brS = paramString;
    this.bpa = paramArrayOfbFB;
    this.boY = parambXf;
  }

  public void Hi() {
    this.boY.a(this.brS, this.bpa, new cIG[0]);
    IH.Sd().b(this);
  }

  public void Hj()
  {
  }

  public void Hk()
  {
  }

  public void Hl()
  {
  }
}