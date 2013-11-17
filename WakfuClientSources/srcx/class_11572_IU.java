import org.apache.log4j.Logger;

public class IU extends Pg
{
  protected static final Logger K = Logger.getLogger(IU.class);

  public IU() {
  }

  public Pg Sm() {
    return new IU();
  }

  public IU(short paramShort1, String paramString, int paramInt, short paramShort2, dhJ paramdhJ, dCi paramdCi) {
    super(paramShort1, paramString, paramInt, paramShort2, paramdhJ, paramdCi);
  }

  public IU a(short paramShort1, String paramString, int paramInt, short paramShort2, dhJ paramdhJ, dCi paramdCi) {
    return new IU(paramShort1, paramString, paramInt, paramShort2, paramdhJ, paramdCi);
  }

  public IU(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramShort, paramadL, parambPr, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public Pg a(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    return new IU(paramShort, paramadL, parambPr, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public void b(dhJ paramdhJ1, dhJ paramdhJ2)
  {
    super.b(paramdhJ1, paramdhJ2);
    byo localbyo = (byo)paramdhJ1;
    Su localSu = (Su)paramdhJ2;
    cew localcew = localbyo.aeL();

    if (localSu == null) {
      return;
    }

    localbyo.iT(localSu.oc());
    localbyo.gE(localSu.oc());

    if ((localSu instanceof bKm)) {
      localObject = (bKm)localSu;

      aMl localaMl = new aMl();
      aKG localaKG1 = agt.arQ().b(Rw(), ((bKm)localObject).bRO(), ((bKm)localObject).bRP(), ((bKm)localObject).xK());
      if (localaKG1 != null) {
        localaMl.a(new bas(2, localaKG1.getColor()));
      }
      aKG localaKG2 = agt.arQ().a(Rw(), ((bKm)localObject).bRJ(), ((bKm)localObject).bRK(), ((bKm)localObject).xK());
      if (localaKG2 != null) {
        localaMl.a(new bas(1, localaKG2.getColor()));
      }
      aKG localaKG3 = agt.arQ().a(Rw(), ((bKm)localObject).bRM(), this.aHn);
      if (localaKG3 != null) {
        localaMl.a(new bas(8, localaKG3.getColor()));
      }
      localaMl.b(new cCt(localSu.afm(), diq.ph("VETEMENTCUSTOM")));
      localaMl.b(new cCt(localSu.afl(), diq.ph("CHEVEUXCUSTOM")));

      localbyo.b(localaMl);

      bDQ localbDQ = ((bKm)localObject).adr();
      if (localbDQ != null)
        localbyo.a(localbDQ);
    }
    else if ((localSu instanceof byo))
    {
      localObject = ((byo)localSu).bFE();
      localbyo.b((aMl)localObject);
    } else {
      K.error("Summoner type not handled : " + localSu + " : " + localSu.getClass().getSimpleName());
      return;
    }

    localbyo.b(localSu.aeu());

    Object localObject = localSu.aeL();
    if (localObject != null) {
      ((cew)localObject).chq().k(localcew);
    }

    localbyo.aek();

    localcew.setVisible(false);
  }
}