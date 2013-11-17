import com.ankamagames.wakfu.client.core.script.fightLibrary.cast.GetCasterInformation;

public class cKd
{
  protected int aWH;
  protected byte bkM;
  protected String m_name;
  protected int ib;
  protected bhh iIO;
  protected byte aHn;

  public cKd(GetCasterInformation paramGetCasterInformation, bhh parambhh, int paramInt1, String paramString, byte paramByte1, byte paramByte2, int paramInt2)
  {
    this.iIO = parambhh;
    this.ib = paramInt1;
    this.m_name = paramString;
    this.aHn = paramByte1;
    this.bkM = paramByte2;
    this.aWH = paramInt2;
  }

  public bhh aJp() {
    return this.iIO;
  }

  public int getHeight() {
    return this.ib;
  }

  public String getName() {
    return this.m_name;
  }

  public byte xK() {
    return this.aHn;
  }

  public boolean fM() {
    return this.bkM == 1;
  }

  public boolean cDT() {
    return this.bkM == 2;
  }

  public boolean cDU() {
    return this.bkM == 0;
  }

  public int xj() {
    return this.aWH;
  }
}