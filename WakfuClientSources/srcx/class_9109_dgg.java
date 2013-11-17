import org.apache.log4j.Logger;

public class dgg extends bnp
{
  private static final Logger K = Logger.getLogger(dgg.class);

  private final aqX lbe = new aqX();
  private final IW lbf = new IW((byte)9, (byte)9);
  private aN[] lbg;

  public dgg(int paramInt)
  {
    super(paramInt);
  }

  public void g(aYQ paramaYQ)
  {
    super.g(paramaYQ);
    this.lbe.g(paramaYQ);
    this.lbf.g(paramaYQ);
    E(paramaYQ);
  }

  private void E(aYQ paramaYQ) {
    int i = paramaYQ.readShort() & 0xFFFF;
    this.lbg = new aN[i];
    for (int j = 0; j < i; j++)
      this.lbg[j] = aN.c(paramaYQ);
  }

  public aqX cPI()
  {
    return this.lbe;
  }

  IW cPJ() {
    return this.lbf;
  }

  aN[] cPK()
  {
    return this.lbg;
  }
}