import java.io.File;

public abstract class bRt extends wM
  implements MT
{
  protected daL[] fyL = null;

  public void a(daL[] paramArrayOfdaL)
  {
    this.fyL = paramArrayOfdaL;
  }

  protected daL[] buy()
  {
    return this.fyL;
  }

  public abstract boolean a(File paramFile1, String paramString, File paramFile2);
}