import org.apache.log4j.Logger;

public class SW extends bIS
{
  protected static final Logger K = Logger.getLogger(SW.class);

  public SW()
  {
  }

  public bIS age() {
    return new SW();
  }

  public SW(short paramShort1, String paramString, int paramInt1, short paramShort2, dhJ paramdhJ, int paramInt2, dCi paramdCi) {
    super(paramShort1, paramString, paramInt1, paramShort2, paramdhJ, paramInt2, paramdCi);
  }

  public SW a(short paramShort1, String paramString, int paramInt1, short paramShort2, dhJ paramdhJ, int paramInt2, dCi paramdCi) {
    return new SW(paramShort1, paramString, paramInt1, paramShort2, paramdhJ, paramInt2, paramdCi);
  }

  public SW(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramShort, paramadL, parambPr, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public bIS b(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    return new SW(paramShort, paramadL, parambPr, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public void b(dhJ paramdhJ1, dhJ paramdhJ2)
  {
    super.b(paramdhJ1, paramdhJ2);
    a((byo)paramdhJ1, (Su)paramdhJ2);
  }

  public void a(byo parambyo, Su paramSu) {
    if (paramSu == null) {
      return;
    }

    parambyo.iT(paramSu.oc());
    parambyo.gE(paramSu.oc());

    if ((paramSu instanceof bKm)) {
      localObject1 = (bKm)paramSu;

      localObject2 = new aMl();
      aKG localaKG1 = agt.arQ().b(Rw(), ((bKm)localObject1).bRO(), ((bKm)localObject1).bRP(), ((bKm)localObject1).xK());
      if (localaKG1 != null) {
        ((aMl)localObject2).a(new bas(2, localaKG1.getColor()));
      }
      aKG localaKG2 = agt.arQ().a(Rw(), ((bKm)localObject1).bRJ(), ((bKm)localObject1).bRK(), ((bKm)localObject1).xK());
      if (localaKG2 != null) {
        ((aMl)localObject2).a(new bas(1, localaKG2.getColor()));
      }
      aKG localaKG3 = agt.arQ().a(Rw(), ((bKm)localObject1).bRM(), this.aHn);
      if (localaKG3 != null) {
        ((aMl)localObject2).a(new bas(8, localaKG3.getColor()));
      }
      ((aMl)localObject2).b(new cCt(paramSu.afm(), diq.ph("VETEMENTCUSTOM")));
      ((aMl)localObject2).b(new cCt(paramSu.afl(), diq.ph("CHEVEUXCUSTOM")));

      parambyo.b((aMl)localObject2);

      bDQ localbDQ = ((bKm)localObject1).adr();
      if (localbDQ != null)
        parambyo.a(localbDQ);
    }
    else if ((paramSu instanceof byo))
    {
      localObject1 = ((byo)paramSu).bFE();
      parambyo.b((aMl)localObject1);
    }
    else {
      K.error("Summoner type not handled : " + paramSu + " : " + paramSu.getClass().getSimpleName());
      return;
    }

    parambyo.b(paramSu.aeu());

    Object localObject1 = parambyo.aeL();
    Object localObject2 = paramSu.aeL();
    if (localObject2 != null)
    {
      ((cew)localObject2).chq().o((cew)localObject1);
      ((cew)localObject2).chq().n((cew)localObject1);
      ((cew)localObject2).chq().m((cew)localObject1);
      ((cew)localObject2).chq().l((cew)localObject1);
    }

    parambyo.aek();
  }

  protected void p(dhJ paramdhJ)
  {
    super.p(paramdhJ);
    byo localbyo = (byo)paramdhJ;
    bND localbND = localbyo.bFz();
    if (localbND == null) {
      return;
    }
    double d = this.gJv / 100.0F;

    if (this.ddP == null)
      return;
    for (bfE localbfE : this.ddP) {
      apX localapX = (apX)localbfE.ow();
      localapX.d((short)(int)(localbfE.nU() * d), true);
      localbND.f(localapX);
    }
  }
}