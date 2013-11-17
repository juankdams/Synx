public class crc
{
  public static final crc iaH = new crc();

  private boolean iaI = false;

  public void cpN()
  {
    hs(true);
  }

  public boolean agt() {
    return (!this.iaI) && (!dqB.cXD().isLoaded());
  }

  public void hs(boolean paramBoolean) {
    this.iaI = paramBoolean;
    dLE.doY().t("guild.isLoading", Boolean.valueOf(paramBoolean));
  }

  public void cleanUp() {
    this.iaI = false;
    dLE.doY().t("guild.isLoading", Boolean.valueOf(false));
  }
}