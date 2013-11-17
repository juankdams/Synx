import java.util.ArrayList;

public class avH
  implements czC
{
  public static byte dKp = -1;
  public int aw;
  public int hY;
  public int hZ;
  public short aOl;
  public byte bkM;
  public byte bkN;
  public int coX;
  public short dKq;
  public short dKr;
  public byte dKs;
  public int dKt;
  public ArrayList dKu;

  public avH()
  {
  }

  public avH(int paramInt1, int paramInt2, int paramInt3, short paramShort1, byte paramByte1, byte paramByte2, int paramInt4, short paramShort2, short paramShort3, byte paramByte3, int paramInt5)
  {
    this.aw = paramInt1;

    this.hY = paramInt2;
    this.hZ = paramInt3;
    this.aOl = paramShort1;

    this.bkM = paramByte1;
    this.bkN = paramByte2;

    this.coX = paramInt4;

    this.dKq = paramShort2;
    this.dKr = paramShort3;

    this.dKs = paramByte3;
    this.dKt = paramInt5;
  }

  public void d(aYQ paramaYQ) {
    this.aw = paramaYQ.readInt();

    this.hY = paramaYQ.readInt();
    this.hZ = paramaYQ.readInt();
    this.aOl = paramaYQ.readShort();

    this.bkM = paramaYQ.readByte();
    this.bkN = paramaYQ.readByte();

    this.coX = paramaYQ.readInt();

    this.dKq = paramaYQ.readShort();
    this.dKr = paramaYQ.readShort();

    this.dKs = paramaYQ.readByte();
    this.dKt = paramaYQ.readInt();

    int i = paramaYQ.readByte();
    if (i > 0) {
      this.dKu = new ArrayList();
    }

    for (int j = 0; j < i; j++) {
      PH localPH = new PH();
      localPH.d(paramaYQ);
      this.dKu.add(localPH);
    }
  }

  public void b(dSw paramdSw) {
    paramdSw.writeInt(this.aw);

    paramdSw.writeInt(this.hY);
    paramdSw.writeInt(this.hZ);
    paramdSw.writeShort(this.aOl);

    paramdSw.writeByte(this.bkM);
    paramdSw.writeByte(this.bkN);

    paramdSw.writeInt(this.coX);

    paramdSw.writeShort(this.dKq);
    paramdSw.writeShort(this.dKr);

    paramdSw.writeByte(this.dKs);
    paramdSw.writeInt(this.dKt);

    byte b1 = this.dKu == null ? 0 : (byte)this.dKu.size();
    paramdSw.writeByte(b1);
    for (byte b2 = 0; b2 < b1; b2++)
      ((PH)this.dKu.get(b2)).b(paramdSw);
  }

  public void a(PH paramPH)
  {
    if (this.dKu == null) {
      this.dKu = new ArrayList();
    }
    this.dKu.add(paramPH);
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();

    localStringBuilder.append("LandMarkDef{").append("m_x=").append(this.hY).append(", ").append("m_y=").append(this.hZ).append(", ").append("m_z=").append(this.aOl).append(", ").append("m_type=").append(this.bkM).append(", ").append("m_subType=").append(this.bkN).append(", ").append("m_achievementGoalId=").append(this.coX).append(", ").append("m_version").append(this.dKq).append(".").append(this.dKr).append(", ").append("}");

    return localStringBuilder.toString();
  }
}