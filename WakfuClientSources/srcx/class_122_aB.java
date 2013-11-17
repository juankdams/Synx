public class aB extends wZ
{
  private static final String hm = "you must not nest child elements into an extension-point";

  public aB()
  {
  }

  public aB(wZ paramwZ)
  {
    super(paramwZ);
  }

  public final void a(aGK paramaGK)
  {
    throw new cJ("you must not nest child elements into an extension-point");
  }

  public final void a(bTW parambTW)
  {
    throw new cJ("you must not nest child elements into an extension-point");
  }
}