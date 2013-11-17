public class cVL extends Jg
  implements Qe
{
  public static final String TAG = "ListAppearance";
  public static final String hhY = "selection";
  private bNa kIr;

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);
    if ((paramaNL instanceof cAf))
      setColor(((cAf)paramaNL).getColor(), null);
  }

  public String getTag()
  {
    return "ListAppearance";
  }

  public void setColor(bNa parambNa, String paramString)
  {
    if ((paramString == null) || (paramString.equalsIgnoreCase("selection"))) {
      this.kIr = parambNa;
      if ((this.aPS instanceof ccG)) {
        ((ccG)this.aPS).setMouseOverColor(this.kIr);
        ((ccG)this.aPS).setSelectedColor(this.kIr);
      }
    } else {
      super.setColor(parambNa, paramString);
    }
  }

  public void bc()
  {
    super.bc();

    this.kIr = null;
  }
}