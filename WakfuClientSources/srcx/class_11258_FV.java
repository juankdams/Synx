public class FV extends bzu
{
  private short bNX = -1;
  private short aSh = -1;
  private short bNY = -1;
  private short bNZ = -1;
  private String m_name = "";
  private boolean bOa = true;

  public void H(short paramShort) {
    this.bNX = paramShort;
  }

  public void I(short paramShort) {
    this.aSh = paramShort;
  }

  public void J(short paramShort) {
    this.bNY = paramShort;
  }

  public void K(short paramShort) {
    this.bNZ = paramShort;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public void aD(boolean paramBoolean) {
    this.bOa = paramBoolean;
  }

  public short Qb() {
    return this.bNX;
  }

  public short nV() {
    return this.aSh;
  }

  public short Qc() {
    return this.bNY;
  }

  public short Qd() {
    return this.bNZ;
  }

  public String getName() {
    return this.m_name;
  }

  public boolean Qe() {
    return this.bOa;
  }
}