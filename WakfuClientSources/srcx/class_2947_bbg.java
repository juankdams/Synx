import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public abstract class bbg
{
  private static final Logger K = Logger.getLogger(bbg.class);
  public static final String fji = "Using an item with a reference counter < 0 is forbidden";
  private static final short SU = 10;
  private static final int fjj = 2147483646;
  private int fjk;

  public bbg()
  {
    this.fjk = 0;
  }

  public final boolean exists()
  {
    return this.fjk >= 0;
  }

  public void gQ() {
    if ((!bB) && (!exists())) throw new AssertionError("Using an item with a reference counter < 0 is forbidden");
    if ((!bB) && (this.fjk >= 2147483647)) throw new AssertionError("Too many references added");

    if (this.fjk >= 2147483646) {
      if (this.fjk == 2147483646) {
        K.fatal("Too many references added " + getClass().getName(), new Exception());
        JOptionPane.showMessageDialog(null, "Fatal error: Too many references added " + getClass().getName());
        this.fjk += 1;
      }
    }
    else this.fjk += 1;
  }

  public void axl()
  {
    if (--this.fjk == -1)
      DA();
    if (this.fjk == -2)
      K.warn("on enlève encore une reference " + getClass().getSimpleName());
  }

  public final int bpu()
  {
    return this.fjk;
  }

  protected void DL()
  {
  }

  protected void DA() {
    DL();
  }

  final void bpv()
  {
    this.fjk = 0;
  }
}