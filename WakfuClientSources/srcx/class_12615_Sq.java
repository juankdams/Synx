import org.apache.log4j.Logger;

public class Sq
  implements czC
{
  private static final Logger K = Logger.getLogger(Sq.class);
  public byte boO;
  public byte boP;
  public short aOl;

  public Sq()
  {
  }

  public Sq(Sq paramSq)
  {
    this.boO = paramSq.boO;
    this.boP = paramSq.boP;
    this.aOl = paramSq.aOl;
  }

  public Sq(byte paramByte1, byte paramByte2, short paramShort) {
    this.boO = paramByte1;
    this.boP = paramByte2;
    this.aOl = paramShort;
    if ((!bB) && ((this.boO < 0) || (this.boO >= 18))) throw new AssertionError();
    if ((!bB) && ((this.boP < 0) || (this.boP >= 18))) throw new AssertionError(); 
  }

  public void d(aYQ paramaYQ)
  {
    this.boO = paramaYQ.readByte();
    this.boP = paramaYQ.readByte();
    this.aOl = paramaYQ.readShort();

    if ((!bB) && ((this.boO < 0) || (this.boO >= 18))) throw new AssertionError();
    if ((!bB) && ((this.boP < 0) || (this.boP >= 18))) throw new AssertionError(); 
  }

  public void b(dSw paramdSw)
  {
    if ((!bB) && ((this.boO < 0) || (this.boO >= 18))) throw new AssertionError();
    if ((!bB) && ((this.boP < 0) || (this.boP >= 18))) throw new AssertionError();
    paramdSw.writeByte(this.boO);
    paramdSw.writeByte(this.boP);
    paramdSw.writeShort(this.aOl);
  }

  public String toString() {
    return "ElementDef{m_x=" + this.boO + ", m_y=" + this.boP + ", m_z=" + this.aOl + '}';
  }

  public Sq ado()
  {
    throw new UnsupportedOperationException("TODO");
  }
}