import org.apache.log4j.Logger;

public abstract class cjb extends fm
{
  private static final Logger K = Logger.getLogger(cjb.class);

  public cjb(cMS paramcMS, String paramString) {
    super(paramcMS, false, paramString, (short)10000);
  }

  protected abstract String aLX();

  protected void a(boolean paramBoolean, String paramString)
  {
    cpa localcpa = cBQ.cxL().coO().nf(paramString);
    if (localcpa == null) {
      return;
    }

    int i = this.aCk;

    this.aCk = (paramBoolean ? 150 : this.aCk);

    a((dOc)localcpa.fi("container1"), paramBoolean);
    a((dOc)localcpa.fi("image1"), paramBoolean);
    a((dOc)localcpa.fi("image2"), paramBoolean);
    a((dOc)localcpa.fi("image3"), paramBoolean);
    a((dOc)localcpa.fi("text"), paramBoolean);

    if (paramBoolean) {
      this.aCk = 10;
    }
    a((dOc)localcpa.fi("animatedElementLeft"), paramBoolean);
    a((dOc)localcpa.fi("animatedElementRight"), paramBoolean);

    this.aCk = i;
  }

  public void a(coS paramcoS)
  {
    bMo localbMo = (bMo)paramcoS;

    super.a(paramcoS);

    cpa localcpa = cBQ.cxL().coO().nf(this.aCm);
    if (localcpa == null) {
      return;
    }
auC localauC1 = (auC)localcpa.fi("animatedElementLeft");
    auC localauC2 = (auC)localcpa.fi("animatedElementRight");
    String str;
    try {
      str = aLX();
    } catch (bdh localbdh) {
      return;
    }

    localauC1.setFilePath(str);
    localauC1.setAnimName(localbMo.bTI() + "-G");
    localauC1.setDirection(0);
    localauC1.setScale(1.0F);

    localauC2.setFilePath(str);
    localauC2.setAnimName(localbMo.bTI() + "-D");
    localauC2.setDirection(0);
    localauC2.setScale(1.0F);

    a(localauC1);
    a(localauC2);
  }

  protected void O(String paramString)
  {
  }
}