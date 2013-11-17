import java.nio.ByteBuffer;
import java.util.List;
import org.apache.log4j.Logger;

public class Dg
{
  private static final Logger K = Logger.getLogger(Dg.class);
  protected final adz bHy;

  public Dg()
  {
    this.bHy = new adz();
  }

  public Dg(adz paramadz) {
    this.bHy = paramadz;
  }

  public final boolean isEmpty() {
    return this.bHy.isEmpty();
  }

  public void a(Dg paramDg)
  {
    kr localkr = paramDg.bHy.apz();
    while (localkr.hasNext())
      this.bHy.hL(localkr.next());
  }

  public final void add(int paramInt1, int paramInt2)
  {
    this.bHy.hL(V(paramInt1, paramInt2));
  }

  public final boolean contains(int paramInt1, int paramInt2) {
    return this.bHy.contains(V(paramInt1, paramInt2));
  }

  public final boolean b(Dg paramDg) {
    return this.bHy.o(paramDg.bHy.toArray());
  }

  public final boolean U(int paramInt1, int paramInt2) {
    return this.bHy.remove(V(paramInt1, paramInt2));
  }

  public adz Ms() {
    return this.bHy;
  }

  public dRW Mt() {
    dRW localdRW1 = new dRW("partitions");

    kr localkr = this.bHy.apz();
    while (localkr.hasNext()) {
      int i = localkr.next();
      int j = bCO.sg(i);
      int k = bCO.sh(i);

      dRW localdRW2 = new dRW("partition");
      localdRW2.bu("x", String.valueOf(j));
      localdRW2.bu("y", String.valueOf(k));
      localdRW1.e(localdRW2);
    }
    return localdRW1;
  }

  public void a(dRW paramdRW) {
    if ((!bB) && (!paramdRW.getName().equals("partitions"))) throw new AssertionError();

    List localList = paramdRW.sc("partition");
    for (int i = 0; i < localList.size(); i++) {
      dRW localdRW = (dRW)localList.get(i);
      int j = Integer.parseInt(localdRW.sa("x"));
      int k = Integer.parseInt(localdRW.sa("y"));
      add(j, k);
    }
    this.bHy.compact();
  }

  public void c(dSw paramdSw) {
    int i = this.bHy.size();
    paramdSw.writeInt(i);
    kr localkr = this.bHy.apz();
    for (int j = 0; j < i; j++)
      paramdSw.writeInt(localkr.next());
  }

  public void F(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getInt();
    for (int j = 0; j < i; j++) {
      this.bHy.hL(paramByteBuffer.getInt());
    }
    this.bHy.compact();
  }

  protected static int V(int paramInt1, int paramInt2) {
    return bCO.cN(paramInt1, paramInt2);
  }
}