public final class cpt extends dTC
{
  public cpt()
  {
  }

  public cpt coY()
  {
    return new cpt();
  }

  public cpt(short paramShort1, String paramString, int paramInt1, short paramShort2, dhJ paramdhJ, int paramInt2, dCi paramdCi)
  {
    super(paramShort1, paramString, paramInt1, paramShort2, paramdhJ, paramInt2, paramdCi);
  }

  public cpt c(short paramShort1, String paramString, int paramInt1, short paramShort2, dhJ paramdhJ, int paramInt2, dCi paramdCi)
  {
    return new cpt(paramShort1, paramString, paramInt1, paramShort2, paramdhJ, paramInt2, paramdCi);
  }

  public cpt(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramShort, paramadL, parambPr, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public cpt c(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    return new cpt(paramShort, paramadL, parambPr, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public void b(dhJ paramdhJ1, dhJ paramdhJ2)
  {
    super.b(paramdhJ1, paramdhJ2);
    byo localbyo = (byo)paramdhJ1;

    localbyo.iT(coZ());
    localbyo.gE(coZ());

    aMl localaMl = new aMl();

    localaMl.b(new cCt(agt.arQ().b(Rw(), xK() == 0, this.ctp), diq.ph("VETEMENTCUSTOM")));

    localbyo.b(localaMl);

    localbyo.b(this.fnA);
    localbyo.aek();
  }

  private int coZ() {
    int i = 1;
    i *= 1000;
    i += Rw() * 10 + this.aHn;
    i *= 100;
    i++;
    return i;
  }
}