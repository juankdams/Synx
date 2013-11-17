public class dAS extends dOc
{
  public static final String TAG = "spacer";

  public String getTag()
  {
    return "spacer";
  }

  public boolean isAppearanceCompatible(Jg paramJg) {
    return true;
  }

  public void aJ()
  {
    super.aJ();

    Jg localJg = Jg.checkOut();
    localJg.setWidget(this);
    a(localJg);
  }
}