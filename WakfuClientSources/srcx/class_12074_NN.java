public class NN extends bzu
{
  private int aGt;
  private String hh;
  private String aGr;
  private String ceB;
  private int aGs;

  public NN(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    this(paramString1, paramString2, paramString3, paramInt1);
    this.aGt = paramInt2;
  }

  public NN(String paramString1, String paramString2, String paramString3, int paramInt) {
    this.hh = paramString1;
    this.aGr = paramString2;
    this.ceB = paramString3;
    this.aGs = paramInt;
  }

  public String getTitle() {
    return this.hh;
  }

  public void setTitle(String paramString) {
    this.hh = paramString;
  }

  public String getDesc() {
    return this.aGr;
  }

  public void aP(String paramString) {
    this.aGr = paramString;
  }

  public String ZY() {
    return this.ceB;
  }

  public void cP(String paramString) {
    this.ceB = paramString;
  }

  public int getType() {
    return this.aGs;
  }

  public void setType(int paramInt) {
    this.aGs = paramInt;
  }

  public int pi() {
    return this.aGt;
  }

  public int getId() {
    return 19148;
  }
}