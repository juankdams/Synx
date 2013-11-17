import java.util.Arrays;

public class bXG extends dte
{
  public static final byte hmW = 1;
  public static final byte hmX = 2;
  private final byte doI;
  private final String[] aLt;

  public bXG(byte paramByte, String[] paramArrayOfString)
  {
    this.doI = paramByte;
    this.aLt = new String[paramArrayOfString.length];
    System.arraycopy(paramArrayOfString, 0, this.aLt, 0, paramArrayOfString.length);
  }

  public boolean isValid()
  {
    switch (this.doI) {
    case 1:
      return (this.aLt.length == 1) || (this.aLt.length == 2);
    case 2:
      return this.aLt.length == 1;
    }
    return false;
  }

  public void execute()
  {
    switch (this.doI) {
    case 1:
      start();
      return;
    case 2:
      stop();
      return;
    }
    cth.cqP().err("Commande " + this.doI + " invalide!");
  }

  private void start()
  {
    int i = Integer.parseInt(this.aLt[0]);
    int j = this.aLt.length >= 2 ? Integer.parseInt(this.aLt[1]) : -1;

    aIG localaIG = new aIG();
    localaIG.bf((short)107);
    localaIG.bM((byte)3);
    localaIG.mH(i);
    localaIG.mH(j);

    cyx localcyx = byv.bFN().aJK();
    localcyx.d(localaIG);
  }

  private void stop() {
    int i = Integer.parseInt(this.aLt[0]);

    aIG localaIG = new aIG();
    localaIG.bf((short)108);
    localaIG.bM((byte)3);
    localaIG.mH(i);

    cyx localcyx = byv.bFN().aJK();
    localcyx.d(localaIG);
  }

  public String toString()
  {
    return "ChaosCommand{m_cmd=" + this.doI + ", m_args=" + (this.aLt == null ? null : Arrays.asList(this.aLt)) + '}';
  }
}