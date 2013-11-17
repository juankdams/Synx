public class agq
{
  public int biu;
  public String m_name;
  public int cZS;
  public boolean cZT;
  public int cZU;
  public byte cZV;
  public int cZW;

  public agq()
  {
  }

  public agq(int paramInt1, String paramString, int paramInt2, boolean paramBoolean, int paramInt3, byte paramByte, int paramInt4)
  {
    this.biu = paramInt1;
    this.m_name = paramString;
    this.cZS = paramInt2;
    this.cZT = paramBoolean;
    this.cZU = paramInt3;
    this.cZV = paramByte;
    this.cZW = paramInt4;
  }

  final void d(aYQ paramaYQ) {
    this.biu = paramaYQ.readInt();
    int i = paramaYQ.readShort();
    byte[] arrayOfByte = paramaYQ.ot(i);
    this.m_name = dzp.aJ(arrayOfByte);
    this.cZS = paramaYQ.readInt();
    this.cZT = paramaYQ.bnT();
    this.cZU = paramaYQ.readInt();
    this.cZV = paramaYQ.readByte();
    this.cZW = paramaYQ.readInt();
  }

  final void b(dSw paramdSw)
  {
    paramdSw.writeInt(this.biu);
    byte[] arrayOfByte = dzp.qC(this.m_name);
    paramdSw.writeShort((short)arrayOfByte.length);
    paramdSw.writeBytes(arrayOfByte);
    paramdSw.writeInt(this.cZS);
    paramdSw.lu(this.cZT);
    paramdSw.writeInt(this.cZU);
    paramdSw.writeByte(this.cZV);
    paramdSw.writeInt(this.cZW);
  }
}