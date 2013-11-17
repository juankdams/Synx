import org.apache.log4j.Logger;

public class cK
  implements aZa
{
  private static final Logger K = Logger.getLogger(cK.class);
  private boolean Rb;
  private long Rc;
  private byte Rd = 100;
  private short Re = 1;

  public cK() {
  }

  public cK(aYQ paramaYQ) {
    d(paramaYQ);
  }

  public cK(boolean paramBoolean, long paramLong, byte paramByte, short paramShort) {
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
    bWY.a(parambjC, this.Rc, this.Rd, this.Re, this.Rb);
  }

  public int getType() {
    return 3;
  }

  public void d(aYQ paramaYQ) {
    this.Rc = paramaYQ.readLong();
    this.Rd = paramaYQ.readByte();
    this.Rb = paramaYQ.bnT();
    this.Re = paramaYQ.readShort();
  }

  public void b(dSw paramdSw) {
    paramdSw.writeLong(this.Rc);
    paramdSw.writeByte(this.Rd);
    paramdSw.lu(this.Rb);
    paramdSw.writeShort(this.Re);
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