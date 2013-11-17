import java.nio.ByteBuffer;
import java.util.ArrayList;

public class ceB
  implements dnm
{
  private final bQo hzf = new bQo();

  public ceB() {
  }

  public ceB(eo parameo) {
    parameo.j(this.hzf);
  }

  public boolean b(Hp paramHp) {
    ArrayList localArrayList = paramHp.bPD.daT.gYv;
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      TG localTG1 = (TG)localArrayList.get(i);
      TG localTG2 = new TG();
      localTG2.bPw = localTG1.bPw;
      localTG2.aYU = localTG1.aYU;
      this.hzf.gYv.add(localTG2);
    }

    return true;
  }

  public boolean c(Hp paramHp) {
    ArrayList localArrayList = this.hzf.gYv;
    paramHp.bPD = new cir();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      TG localTG1 = (TG)localArrayList.get(i);
      TG localTG2 = new TG();
      localTG2.bPw = localTG1.bPw;
      localTG2.aYU = localTG1.aYU;
      paramHp.bPD.daT.gYv.add(localTG2);
    }

    return true;
  }

  public void b(ByteBuffer paramByteBuffer) {
    this.hzf.g(paramByteBuffer);
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.hzf.h(paramByteBuffer);
  }

  public int O() {
    return this.hzf.O();
  }

  public byte xH() {
    return dIi.lTf.ewr;
  }

  public bQo chD() {
    return this.hzf;
  }
}