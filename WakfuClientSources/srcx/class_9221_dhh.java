import org.apache.log4j.Logger;

public class dhh extends dRq
{
  private static Logger K = Logger.getLogger(dhh.class);
  public static final String TAG = "RootContainer";
  protected dRq lck;
  protected dRq lcl;
  protected cOP lcm;
  protected final bTc lcn = new bTc(this);

  public void b(aNL paramaNL)
  {
    this.lck.b(paramaNL);
  }

  public void b(crh paramcrh)
  {
    this.lck.b(paramcrh);
  }

  public void a(dOc paramdOc, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
      this.lck.c(paramdOc, paramInt);
    else
      super.c(paramdOc, paramInt);
  }

  public void c(dOc paramdOc, int paramInt)
  {
    a(paramdOc, paramInt, true);
  }

  public String getTag()
  {
    return "RootContainer";
  }

  public dRq getContentContainer()
  {
    return this.lck;
  }

  public cOP getLayeredContainer()
  {
    return this.lcm;
  }

  public bTc getWindowManager()
  {
    return this.lcn;
  }

  public void cQa()
  {
    this.lcm = new cOP();
    this.lcm.aJ();

    this.lck = dRq.checkOut();

    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setSize(new Or(100.0F, 100.0F));
    this.lck.a(localcwP);

    this.lcm.b(this.lck, -30000);

    super.a(this.lcm);
  }

  public void aJ()
  {
    super.aJ();

    dDs localdDs = new dDs(this);
    localdDs.aJ();
    a(localdDs);

    cQa();

    this.mms = true;
  }

  public void bc()
  {
    super.bc();

    this.lcn.clean();

    zC.Ip().b(this);
  }
}