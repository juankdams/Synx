public class wv extends Jg
{
  public static final String TAG = "InteractiveBubbleAppearance";
  private dtO bmp = null;

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);

    if ((paramaNL instanceof dtO))
      this.bmp = ((dtO)paramaNL);
  }

  public String getTag()
  {
    return "InteractiveBubbleAppearance";
  }

  public dtO getBubbleBorder()
  {
    return this.bmp;
  }

  public void bc()
  {
    super.bc();
    this.bmp = null;
  }
}