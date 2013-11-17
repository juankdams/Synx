import org.apache.log4j.Logger;

public class cyB extends Sq
{
  private static final Logger K = Logger.getLogger(cyB.class);
  caQ imX;
  int hj;

  public cyB()
  {
  }

  public cyB(byte paramByte1, byte paramByte2, short paramShort, int paramInt)
  {
    super(paramByte1, paramByte2, paramShort);
    this.hj = paramInt;
  }

  public cyB(cyB paramcyB) {
    super(paramcyB);
    this.hj = paramcyB.hj;
  }

  public void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);
    this.hj = paramaYQ.readInt();
  }

  public void b(dSw paramdSw)
  {
    super.b(paramdSw);
    paramdSw.writeInt(this.hj);
  }

  public String toString() {
    return "SoundDef{m_x=" + this.boO + ", m_y=" + this.boP + ", m_z=" + this.aOl + "m_soundId=" + this.hj + '}';
  }

  public cyB cvz()
  {
    return new cyB(this.boO, this.boP, this.aOl, this.hj);
  }
}