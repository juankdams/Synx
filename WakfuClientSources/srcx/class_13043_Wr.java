import java.nio.ByteBuffer;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class Wr
  implements Iterable
{
  private static final Logger K = Logger.getLogger(Wr.class);

  private final aoL cGo = new aoL();

  public Wr()
  {
  }

  public Wr(aKw[] paramArrayOfaKw)
  {
    this();
    for (aKw localaKw : paramArrayOfaKw)
      this.cGo.put(localaKw.eW(), localaKw);
  }

  public void a(long paramLong, uP paramuP)
  {
    this.cGo.put(paramLong, new aKw(paramLong, paramuP));
  }

  public void a(long paramLong, dSv paramdSv, uP paramuP) {
    if (!this.cGo.containsKey(paramLong)) {
      K.error("Joueur id=" + paramLong + " inconnu, impossible de rajouter un sort/skill pour lui.");
    }
    ((aKw)this.cGo.get(paramLong)).a(paramdSv, paramuP);
  }

  public int size() {
    return this.cGo.size();
  }

  public aKw cd(long paramLong) {
    return (aKw)this.cGo.get(paramLong);
  }

  public Iterator iterator() {
    return new bNt(this);
  }

  public int O()
  {
    int[] arrayOfInt = { 1 };
    this.cGo.s(new bNq(this, arrayOfInt));

    return arrayOfInt[0];
  }

  public void write(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put((byte)this.cGo.size());
    this.cGo.s(new bNp(this, paramByteBuffer));
  }

  public static Wr V(ByteBuffer paramByteBuffer)
  {
    return new Wr().W(paramByteBuffer);
  }

  private Wr W(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get();
    for (int j = 0; j < i; j++) {
      aKw localaKw = aKw.ao(paramByteBuffer);
      this.cGo.put(localaKw.eW(), localaKw);
    }
    return this;
  }

  static uP X(ByteBuffer paramByteBuffer) {
    long l = paramByteBuffer.getLong();
    short s = paramByteBuffer.getShort();
    return new uP(l, s);
  }

  static void a(uP paramuP, ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(paramuP.DP());
    paramByteBuffer.putShort(paramuP.DO());
  }
}