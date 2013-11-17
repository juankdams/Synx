import java.nio.ByteBuffer;

public class buM
  implements dnm
{
  private final gZ gew = new gZ();

  public buM() {
  }

  public buM(eo parameo) {
    parameo.j(this.gew);
  }

  public boolean b(Hp paramHp) {
    gZ localgZ = paramHp.bPC.Ui;
    this.gew.aGg = localgZ.aGg;
    this.gew.aGh = localgZ.aGh;
    return true;
  }

  public boolean c(Hp paramHp) {
    paramHp.bPC = new aSE();
    paramHp.bPC.Ui.aGg = this.gew.aGg;
    paramHp.bPC.Ui.aGh = this.gew.aGh;
    return true;
  }

  public void b(ByteBuffer paramByteBuffer) {
    this.gew.g(paramByteBuffer);
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.gew.h(paramByteBuffer);
  }

  public int O() {
    return this.gew.O();
  }

  public byte xH() {
    return dIi.lTe.ewr;
  }

  public gZ bCE() {
    return this.gew;
  }
}