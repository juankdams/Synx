import org.apache.log4j.Logger;

public class brS
  implements czC
{
  private static final Logger K = Logger.getLogger(brS.class);
  public long aTz;
  public short dYr;
  public int[] fNV;
  public byte[] bFC;
  public boolean cTI;
  public short fNW = -1;

  public void d(aYQ paramaYQ)
  {
    this.aTz = paramaYQ.readLong();
    this.dYr = paramaYQ.readShort();
    int i = paramaYQ.readByte() & 0xFF;
    this.fNV = paramaYQ.ov(i);
    int j = paramaYQ.readShort() & 0xFFFF;
    this.bFC = paramaYQ.ot(j);
    this.cTI = paramaYQ.bnT();
    this.fNW = paramaYQ.readShort();
  }

  public void b(dSw paramdSw) {
    paramdSw.writeLong(this.aTz);
    paramdSw.writeShort(this.dYr);
    if (this.fNV == null) {
      paramdSw.writeByte((byte)0);
    } else {
      paramdSw.writeByte((byte)(this.fNV.length & 0xFF));
      for (int i = 0; i < this.fNV.length; i++) {
        paramdSw.writeInt(this.fNV[i]);
      }
    }
    paramdSw.writeShort((short)(this.bFC.length & 0xFFFF));
    paramdSw.writeBytes(this.bFC);
    paramdSw.lu(this.cTI);
    paramdSw.writeShort(this.fNW);
    paramdSw.dsW();
  }
}