public class cgh
{
  public static final int bXH = 18;
  public byte hDC;
  public byte hDD;
  public byte hDE;
  public short hDF;
  public short hDG;
  public byte hDH;
  public short hDI;
  public short hDJ;
  public short gKt;
  public short bdV;
  public byte hDK;
  public byte hDL;

  public void y(aYQ paramaYQ)
  {
    this.hDC = paramaYQ.readByte();
    this.hDD = paramaYQ.readByte();
    this.hDE = paramaYQ.readByte();
    this.hDF = paramaYQ.readShort();
    this.hDG = paramaYQ.readShort();
    this.hDH = paramaYQ.readByte();
    this.hDI = paramaYQ.readShort();
    this.hDJ = paramaYQ.readShort();
    this.gKt = paramaYQ.readShort();
    this.bdV = paramaYQ.readShort();
    this.hDK = paramaYQ.readByte();
    this.hDL = paramaYQ.readByte();
  }

  public void d(dSw paramdSw) {
    paramdSw.writeByte(this.hDC);
    paramdSw.writeByte(this.hDD);
    paramdSw.writeByte(this.hDE);
    paramdSw.writeShort(this.hDF);
    paramdSw.writeShort(this.hDG);
    paramdSw.writeByte(this.hDH);
    paramdSw.writeShort(this.hDI);
    paramdSw.writeShort(this.hDJ);
    paramdSw.writeShort(this.gKt);
    paramdSw.writeShort(this.bdV);
    paramdSw.writeByte(this.hDK);
    paramdSw.writeByte(this.hDL);
  }
}