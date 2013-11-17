public class mg extends cih
{
  public static final mg aQh = new cCN();
  private final int aQi;
  private short aQj;
  private short aQk;
  private short aQl;

  public mg(int paramInt1, int paramInt2, aPb paramaPb, int paramInt3, short paramShort)
  {
    super(paramInt1, paramInt2, paramaPb, paramInt3);
    this.aQi = paramShort;
  }

  public int tU() {
    return this.aQi;
  }

  public void a(short paramShort1, short paramShort2, short paramShort3) {
    this.aQj = paramShort1;
    this.aQk = paramShort2;
    this.aQl = paramShort3;
  }

  public short tV() {
    return this.aQj;
  }

  public short tW() {
    return this.aQk;
  }

  public short tX() {
    return this.aQl;
  }

  public String toString()
  {
    return "IEHavenWorldBoardParameter{m_havenWorldDefinitionId=" + this.aQi + '}';
  }
}