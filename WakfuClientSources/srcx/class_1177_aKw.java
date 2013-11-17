import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aKw
  implements Iterable
{
  private final long kM;
  private final uP enS;
  private final List enT = new ArrayList();

  public static aKw eg(long paramLong)
  {
    return new aJC(paramLong, uP.biS);
  }

  public aKw(long paramLong, uP paramuP)
  {
    this.kM = paramLong;
    this.enS = paramuP;
  }

  public long eW() {
    return this.kM;
  }

  public uP bch() {
    return this.enS;
  }

  public int size() {
    return this.enT.size();
  }

  public Iterator iterator() {
    return this.enT.iterator();
  }

  int O() {
    return 19 + this.enT.size() * 15;
  }

  void write(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.kM);
    Wr.a(this.enS, paramByteBuffer);
    paramByteBuffer.put((byte)this.enT.size());
    for (int i = 0; i < this.enT.size(); i++) {
      Kp localKp = (Kp)this.enT.get(i);
      localKp.write(paramByteBuffer);
    }
  }

  static aKw ao(ByteBuffer paramByteBuffer) {
    long l = paramByteBuffer.getLong();
    uP localuP = Wr.X(paramByteBuffer);
    return new aKw(l, localuP).ap(paramByteBuffer);
  }

  private aKw ap(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get();
    for (int j = 0; j < i; j++) {
      this.enT.add(Kp.P(paramByteBuffer));
    }
    return this;
  }

  public void a(dSv paramdSv, uP paramuP) {
    this.enT.add(new Kp(paramdSv, paramuP));
  }
}