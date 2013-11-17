import org.apache.log4j.Logger;

public class cd
  implements aZa
{
  private static final Logger K = Logger.getLogger(cd.class);
  private int Ra;
  private boolean Rb;
  private long Rc;
  private byte Rd = 100;
  private short Re = 1;

  public cd() {
  }

  public cd(aYQ paramaYQ) {
    d(paramaYQ);
  }

  public cd(int paramInt, boolean paramBoolean, long paramLong, byte paramByte, short paramShort) {
    this.Ra = paramInt;
    this.Rb = paramBoolean;
    this.Rc = paramLong;
    this.Rd = paramByte;
    this.Re = paramShort;
  }

  public void b(bjC parambjC) {
    if (!bWY.c(parambjC, this.Rc)) {
      return;
    }
    if (!bWY.hd(this.Rc)) {
      return;
    }
    bWY.a(parambjC, this.Rc, this.Rd, this.Re, this.Ra, this.Rb);
  }

  public int getType() {
    return 5;
  }

  public void d(aYQ paramaYQ) {
    this.Rc = paramaYQ.readLong();
    this.Rd = paramaYQ.readByte();
    this.Ra = paramaYQ.readInt();
    this.Rb = paramaYQ.bnT();
    this.Re = paramaYQ.readShort();
  }

  public void b(dSw paramdSw) {
    paramdSw.writeLong(this.Rc);
    paramdSw.writeByte(this.Rd);
    paramdSw.writeInt(this.Ra);
    paramdSw.lu(this.Rb);
    paramdSw.writeShort(this.Re);
  }

  public void V(int paramInt) {
    this.Ra = paramInt;
  }

  public void i(boolean paramBoolean) {
    this.Rb = paramBoolean;
  }

  public void l(long paramLong) {
    this.Rc = paramLong;
  }

  public void e(byte paramByte) {
    this.Rd = paramByte;
  }

  public void e(short paramShort) {
    this.Re = paramShort;
  }

  public void a(cbQ paramcbQ) {
    paramcbQ.add(this.Rc);
  }
}