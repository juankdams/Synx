import java.nio.ByteBuffer;

public class bva extends bGI
{
  private int brP;
  private String m_name;
  private Dg geL;
  private short bNX;
  private short aSh;

  public bva()
  {
    super(-1);
    this.m_name = null;
    this.geL = null;
    a(new aVP(this));
  }

  public bva(int paramInt, String paramString, Dg paramDg, short paramShort1, short paramShort2) {
    super(paramInt);
    this.m_name = paramString;
    this.geL = paramDg;
    this.bNX = paramShort1;
    this.aSh = paramShort2;

    a(new aVP(this));
  }

  public int bpl() {
    return this.brP;
  }

  public void rf(int paramInt) {
    this.brP = paramInt;
  }

  public void read(ByteBuffer paramByteBuffer) {
    d(paramByteBuffer.getInt());
    byte[] arrayOfByte = new byte[paramByteBuffer.getShort() & 0xFFFF];
    paramByteBuffer.get(arrayOfByte);
    this.m_name = dzp.aJ(arrayOfByte);
    this.geL = new Dg();
    this.geL.F(paramByteBuffer);

    this.bNX = paramByteBuffer.getShort();
    this.aSh = paramByteBuffer.getShort();
  }

  public void a(dSw paramdSw) {
    paramdSw.writeInt(getId());
    byte[] arrayOfByte = dzp.qC(this.m_name);
    paramdSw.writeShort((short)arrayOfByte.length);
    paramdSw.writeBytes(arrayOfByte);
    this.geL.c(paramdSw);

    paramdSw.writeShort(this.bNX);
    paramdSw.writeShort(this.aSh);
  }

  public String getName()
  {
    return this.m_name;
  }

  public Dg bCL() {
    return this.geL;
  }

  public short Qb() {
    return this.bNX;
  }

  public short nV() {
    return this.aSh;
  }

  public boolean cB(int paramInt1, int paramInt2) {
    int i = oU.bV(paramInt1);
    int j = oU.bW(paramInt2);
    return this.geL.contains(i, j);
  }
}