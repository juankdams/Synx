import org.apache.log4j.Logger;

public final class dDF extends aHv
{
  private static final Logger K = Logger.getLogger(dDF.class);

  public dDF() {
  }

  public dDF dfx() {
    return new dDF();
  }

  public dDF(short paramShort1, String paramString, int paramInt1, short paramShort2, dhJ paramdhJ, int paramInt2, dCi paramdCi)
  {
    super(paramShort1, paramString, paramInt1, paramShort2, paramdhJ, paramInt2, paramdCi);
  }

  public dDF d(short paramShort1, String paramString, int paramInt1, short paramShort2, dhJ paramdhJ, int paramInt2, dCi paramdCi)
  {
    return new dDF(paramShort1, paramString, paramInt1, paramShort2, paramdhJ, paramInt2, paramdCi);
  }

  public dDF(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramShort, paramadL, parambPr, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public dDF d(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    return new dDF(paramShort, paramadL, parambPr, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public void b(dhJ paramdhJ1, dhJ paramdhJ2)
  {
    super.b(paramdhJ1, paramdhJ2);
    byo localbyo = (byo)paramdhJ1;

    localbyo.iT(dfy());
    localbyo.gE(dfy());

    aMl localaMl = new aMl();

    localaMl.b(new cCt(agt.arQ().b(Rw(), xK() == 0, this.ctp), diq.ph("VETEMENTCUSTOM")));

    localbyo.b(localaMl);

    localbyo.b(this.fnA);
    localbyo.aek();
  }

  private short dfy() {
    int i = Rw() * 10;
    if (this.aHn == 0) {
      return (short)(i + 4);
    }
    return (short)(i + 5);
  }
}