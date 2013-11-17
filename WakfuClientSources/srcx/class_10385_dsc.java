import org.apache.log4j.Logger;

public class dsc extends Sq
{
  private static final Logger K = Logger.getLogger(dsc.class);
  public int aw;
  public int aSg;
  public int aGs;
  public byte boN;
  public boolean ip;
  public byte io;
  public String cGg;
  public String cGh;

  public dsc()
  {
  }

  public dsc(int paramInt1, int paramInt2, int paramInt3, byte paramByte1, byte paramByte2, byte paramByte3, short paramShort, boolean paramBoolean, byte paramByte4, String paramString1, String paramString2)
  {
    super(paramByte2, paramByte3, paramShort);
    this.aw = paramInt1;
    this.aSg = paramInt2;
    this.aGs = paramInt3;
    this.boN = paramByte1;
    this.ip = paramBoolean;
    this.io = paramByte4;
    this.cGg = paramString1;
    this.cGh = paramString2;
  }

  public void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);
    this.aw = paramaYQ.readInt();
    this.aSg = paramaYQ.readInt();
    this.aGs = paramaYQ.readShort();
    this.boN = paramaYQ.readByte();
    this.ip = paramaYQ.bnT();
    this.io = paramaYQ.readByte();
    this.cGg = paramaYQ.readString();
    this.cGh = paramaYQ.readString();
  }

  public void b(dSw paramdSw)
  {
    super.b(paramdSw);
    paramdSw.writeInt(this.aw);
    paramdSw.writeInt(this.aSg);
    paramdSw.writeShort((short)this.aGs);
    paramdSw.writeByte(this.boN);
    paramdSw.lu(this.ip);
    paramdSw.writeByte(this.io);
    paramdSw.writeString(this.cGg);
    paramdSw.writeString(this.cGh);
  }

  public String toString()
  {
    return "SoundDef{m_id=" + this.aw + ", m_gfxId=" + this.aSg + ", m_type=" + this.aGs + ", m_direction=" + this.boN + ", m_x=" + this.boO + ", m_y=" + this.boP + ", m_z=" + this.aOl + ", m_occluder=" + this.ip + ", m_height=" + this.io + ", m_baseAnimation=" + this.cGg + ", m_params=" + this.cGh + '}';
  }

  public dsc cYL()
  {
    return new dsc(this.aw, this.aSg, this.aGs, this.boN, this.boO, this.boP, this.aOl, this.ip, this.io, this.cGg, this.cGh);
  }
}