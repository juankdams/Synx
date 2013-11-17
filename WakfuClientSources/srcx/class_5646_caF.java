public class caF extends duS
{
  public static final String TAG = "Label";

  public String getTag()
  {
    return "Label";
  }

  public void aJ()
  {
    super.aJ();

    cwJ localcwJ = cwJ.checkOut();
    localcwJ.setWidget(this);
    a(localcwJ);

    setTextBuilder(new bRi(new dCK()));
    getTextBuilder().a(this);

    setMultiline(false);
  }
}