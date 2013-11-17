import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import org.apache.log4j.Logger;

public class cCc extends Sq
{
  private static final Logger K = Logger.getLogger(cCc.class);
  CellParticleSystem iul;
  int aEG = 0;
  byte cWk = 0;
  byte ium;
  byte iun;
  byte iuo;
  byte bML;

  public cCc()
  {
  }

  public cCc(byte paramByte1, byte paramByte2, short paramShort, int paramInt, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7)
  {
    super(paramByte1, paramByte2, paramShort);
    this.aEG = paramInt;
    this.cWk = paramByte3;
    this.ium = paramByte4;
    this.iun = paramByte5;
    this.iuo = paramByte6;
    this.bML = paramByte7;
  }

  public void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);
    this.aEG = paramaYQ.readInt();
    this.cWk = paramaYQ.readByte();
    this.ium = paramaYQ.readByte();
    this.iun = paramaYQ.readByte();
    this.iuo = paramaYQ.readByte();
    this.bML = paramaYQ.readByte();
  }

  public void b(dSw paramdSw)
  {
    super.b(paramdSw);
    paramdSw.writeInt(this.aEG);
    paramdSw.writeByte(this.cWk);
    paramdSw.writeByte(this.ium);
    paramdSw.writeByte(this.iun);
    paramdSw.writeByte(this.iuo);
    paramdSw.writeByte(this.bML);
  }

  public String toString() {
    return "ParticleDef{m_systemId=" + this.aEG + ", m_level=" + this.cWk + "m_x=" + this.boO + ", m_y=" + this.boP + ", m_z=" + this.aOl + ", m_offsetX=" + this.ium + ", m_offsetY=" + this.iun + ", m_offsetZ=" + this.iuo + ", m_lod=" + this.bML + '}';
  }

  public cCc cym()
  {
    return new cCc(this.boO, this.boP, this.aOl, this.aEG, this.cWk, this.iun, this.iun, this.iuo, this.bML);
  }
}