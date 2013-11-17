import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class bSR
{
  protected static Logger K = Logger.getLogger(bSR.class);
  public static final long heb = -9223372036854775808L;
  public static final int hec = -1;
  protected ArrayList aBf = new ArrayList();
  private int gLo;
  private int aRR;
  private int aRQ;
  private long fCs = -9223372036854775808L;
  private long kD = -9223372036854775808L;
  private boolean hed = false;

  private int hee = -1;
  private bvm hef;

  public bSR(int paramInt1, int paramInt2, int paramInt3)
  {
    this.gLo = paramInt1;
    this.aRR = paramInt2;
    this.aRQ = paramInt3;
  }

  public abstract void run();

  public void a(bqu parambqu) {
    this.aBf.add(parambqu);
  }

  public void b(bqu parambqu) {
    this.aBf.remove(parambqu);
  }

  public int bQX() {
    return this.gLo;
  }

  public void tX(int paramInt) {
    this.gLo = paramInt;
  }

  public int uK() {
    return this.aRR;
  }

  public void tY(int paramInt) {
    this.aRR = paramInt;
  }

  public int eo() {
    return this.aRQ;
  }

  public void tZ(int paramInt) {
    this.aRQ = paramInt;
  }

  public long bwv() {
    return this.fCs;
  }

  public void fE(long paramLong) {
    this.fCs = paramLong;
  }

  public int bZu() {
    return this.hee;
  }

  public void ua(int paramInt) {
    this.hee = paramInt;
  }

  public long gA() {
    return this.kD;
  }

  public void O(long paramLong) {
    this.kD = paramLong;
  }

  public void a(bvm parambvm) {
    this.hef = parambvm;
  }

  public bvm bZv() {
    return this.hef;
  }

  protected void bZw()
  {
    try
    {
      kO();
    } catch (Exception localException1) {
      K.error("Exception levee", localException1);
    }

    for (bqu localbqu : (bqu[])this.aBf.toArray(new bqu[this.aBf.size()]))
      try {
        localbqu.c(this);
      } catch (Exception localException2) {
        K.error("Exception levee", localException2);
      }
  }

  public boolean bZx()
  {
    return this.hed;
  }

  public void gE(boolean paramBoolean) {
    this.hed = paramBoolean;
  }

  protected abstract void kO();

  public String toString() {
    return "{Action UID=" + bQX() + " id=" + eo() + " type=" + uK() + "}";
  }

  public int bZy()
  {
    return -1;
  }
}