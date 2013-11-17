public class FY extends cGF
  implements bWU
{
  public static final byte bOb = 0;
  public static final byte bOc = 1;
  public static final byte bOd = 2;
  private int aw;
  private String bOe;
  private String bOf;
  private String bOg;
  private boolean bOh;
  private byte bOi;
  private boolean bOj;
  public cCH bOk = new cAz(this);

  public cCH bOl = new cAy(this, 32);

  public cCH bOm = new cAJ(this);

  public FY()
  {
    this.aw = 0;
    this.bOe = "<undefined>";
    this.bOf = "<undefined>";
    this.bOg = "fr";
    this.bOh = false;
    this.bOi = 0;
  }

  public void aJ()
  {
    this.aw = 0;
    this.bOe = "<undefined>";
    this.bOf = "<undefined>";
    this.bOg = "<undefined>";
    this.bOh = false;
    this.bOi = 0;
    this.bOj = false;
  }

  public void bc()
  {
  }

  public boolean Qf()
  {
    return this.bOh;
  }

  public void aE(boolean paramBoolean)
  {
    this.bOh = paramBoolean;
  }

  public int getId()
  {
    return this.aw;
  }

  public String Qg() {
    return this.bOe;
  }

  public void bV(String paramString) {
    this.bOe = paramString;
    this.aw = this.bOe.hashCode();
  }

  public String Qh() {
    return this.bOf;
  }

  public void bW(String paramString) {
    this.bOf = paramString;
  }

  public String getCommunity() {
    return this.bOg;
  }

  public void bX(String paramString) {
    this.bOg = paramString;
  }

  public byte Qi() {
    return this.bOi;
  }

  public void T(byte paramByte) {
    this.bOi = paramByte;
  }

  public byte[] j()
  {
    return a(new cCH[] { this.bOk, this.bOl, this.bOm });
  }

  public cCH[] tn()
  {
    return new cCH[] { this.bOk, this.bOl, this.bOm };
  }

  public boolean isFull() {
    return this.bOj;
  }

  public void aF(boolean paramBoolean) {
    this.bOj = paramBoolean;
  }
}