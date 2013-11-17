import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class bzv extends JY
{
  protected static final Logger K = Logger.getLogger(bzv.class);

  private final List gnt = new ArrayList();
  private short gnu;
  private final cWY gnv = bIi();

  private final aVL gnw = new aVL(this);
  private final cQe gnx = new cQe(this);
  private short gny;
  private int gnz;
  private int gnA;

  protected bzv(aYr paramaYr)
  {
    super(paramaYr);
  }

  public void ir()
  {
    this.gnv.a(UI(), this.gnt);
  }

  protected cWY bIi() {
    return new cWY();
  }

  public void c(cKY paramcKY)
  {
    this.gnt.add(paramcKY);
  }

  public void d(cKY paramcKY)
  {
    this.gnt.remove(paramcKY);
  }

  public void eR(long paramLong) {
    throw new UnsupportedOperationException("Impossible à partir de ce Client/server");
  }

  public void eS(long paramLong) {
    throw new UnsupportedOperationException("Impossible à partir de ce Client/server");
  }

  public cWY bnz()
  {
    return this.gnv;
  }

  public void b(short paramShort1, short paramShort2, int paramInt1, int paramInt2)
  {
    this.gnu = paramShort1;
    this.gny = paramShort2;
    this.gnz = paramInt1;
    this.gnA = paramInt2;
  }

  public short bnA() {
    return this.gnu;
  }

  public short bnB() {
    return this.gny;
  }

  public int bnC() {
    return this.gnz;
  }

  public int bnD() {
    return this.gnA;
  }

  public aVL bIj()
  {
    return this.gnw;
  }

  public cQe bIk() {
    return this.gnx;
  }
}