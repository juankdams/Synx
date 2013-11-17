public class ww extends bzu
{
  private String hh;
  private String aLm;
  private byte bkO;
  private byte bkQ;

  public ww(String paramString1, String paramString2, byte paramByte1, byte paramByte2)
  {
    this.hh = paramString1;
    this.aLm = paramString2;
    this.bkO = paramByte1;
    this.bkQ = paramByte2;
  }

  public String getTitle() {
    return this.hh;
  }

  public String getDescription() {
    return this.aLm;
  }

  public byte EU() {
    return this.bkO;
  }

  public byte EV() {
    return this.bkQ;
  }
}