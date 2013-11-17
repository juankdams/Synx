import org.apache.log4j.Logger;

class cKJ
{
  ayn dtQ;

  private cKJ(alE paramalE)
  {
  }

  public boolean cEf()
  {
    if (this.iEa.aCI.aEt() != dTw.mpX) {
      return false;
    }
    this.dtQ = FB();
    if (this.dtQ == null) {
      alE.an().error(String.format("Fight id=%d de type %s sans protecteur.", new Object[] { Integer.valueOf(this.iEa.aCI.getId()), dTw.mpX }));

      return false;
    }

    return this.dtQ.aKk().Fx() == 1 - this.iEa.dmz.byteValue();
  }

  private ayn FB() {
    for (Su localSu : this.iEa.aCI.bgG()) {
      ayn localayn = l(localSu);
      if (localayn != null)
        return localayn;
    }
    return null;
  }

  private ayn l(Su paramSu)
  {
    if ((paramSu.getType() != 1) || (!(paramSu instanceof byo)))
    {
      return null;
    }
    byo localbyo = (byo)paramSu;

    return localbyo.FB();
  }
}