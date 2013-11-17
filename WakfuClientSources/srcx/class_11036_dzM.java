public class dzM
{
  private long aTz;
  private short gKy;
  private short cZu;

  protected dzM(long paramLong, short paramShort1, short paramShort2)
  {
    this.aTz = paramLong;
    this.gKy = paramShort1;
    this.cZu = paramShort2;
  }

  public long getId() {
    return this.aTz;
  }

  public void a(long paramLong) {
    this.aTz = paramLong;
  }

  public short bQz() {
    return this.gKy;
  }

  public void ez(short paramShort) {
    this.gKy = paramShort;
  }

  public short nU() {
    return this.cZu;
  }

  public void aQ(short paramShort) {
    this.cZu = paramShort;
  }

  public String a(boolean paramBoolean, dJf paramdJf) {
    StringBuffer localStringBuffer = new StringBuffer();
    bdi localbdi = cMn.cFp().dP(this.gKy);
    if (paramBoolean) {
      localStringBuffer.append("[").append(this.aTz).append("] ");
    }
    if (paramdJf != dJf.lUJ)
      localStringBuffer.append(localbdi.getName());
    else
      localStringBuffer.append(bU.fH().getString("hooded.monster"));
    Object localObject;
    switch (dAT.lIx[paramdJf.ordinal()]) {
    case 1:
      localObject = new lZ();
      ((lZ)localObject).tI();
      ((lZ)localObject).am(auI.dHF.bUV());
      ((lZ)localObject).a(bU.fH().b(77, byv.bFN().bFO().Lk(), new Object[0])).tJ();
      localStringBuffer.append("\n").append(((lZ)localObject).tP());
      break;
    case 2:
      break;
    case 3:
      break;
    case 4:
      localStringBuffer.append("\n(").append(bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(this.cZu) })).append(")");
    }

    if (paramBoolean) {
      localObject = CA.Lv().bj(this.aTz);
      if ((localObject != null) && ((localObject instanceof byo))) {
        byo localbyo = (byo)localObject;
        for (dKm localdKm : dKm.values()) {
          if (localbyo.c(localdKm)) {
            localStringBuffer.append("\n");
            localStringBuffer.append(localdKm.name());
          }
        }
      }
    }

    return localStringBuffer.toString();
  }
}