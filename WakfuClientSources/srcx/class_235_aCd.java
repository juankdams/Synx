import java.util.Collection;
import java.util.Date;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.log4j.Logger;

public class aCd
{
  public static final Logger K = Logger.getLogger(aCd.class);
  private final cFI cIj;
  private final Date dWr;
  private final TreeSet dWs;
  private final AtomicInteger dWt;

  aCd(cFI paramcFI, Date paramDate)
  {
    this.cIj = paramcFI;
    this.dWr = new Date(paramDate.getTime());
    this.dWs = new TreeSet(ckn.hLt);
    this.dWt = new AtomicInteger(0);
  }

  public cFI ajJ()
  {
    return this.cIj;
  }

  public Date aOm()
  {
    return this.dWr;
  }

  public int aOn() {
    return this.dWt.get();
  }

  public Collection aOo() {
    return this.dWs;
  }

  void a(aGj paramaGj) {
    this.dWs.add(paramaGj);
  }

  void lQ(int paramInt) {
    this.dWt.set(paramInt);
  }

  int aOp() {
    return this.dWt.decrementAndGet();
  }

  public String toString() {
    return "{NewsChannel lang=" + this.cIj.cAZ() + " pubDate=" + this.dWr + " items count=" + this.dWs.size() + '}';
  }
}