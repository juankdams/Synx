import org.apache.log4j.Logger;

class cIu
{
  ayn dtQ;

  private cIu(alE paramalE)
  {
  }

  public boolean cCs()
  {
    if (this.iEa.aCI.aEt() != dTw.mpX) {
      return false;
    }
    this.dtQ = FB();
    if (this.dtQ == null) {
      alE.an().error(String.format("Fight id=%d de type %s sans protecteur.", new Object[] { Integer.valueOf(this.iEa.aCI.getId()), dTw.mpX }));

      return false;
    }

    return this.dtQ.aKk().Fx() == this.iEa.dmz.byteValue();
  }

  public int cCt() {
    if (this.iEa.dmy.bGy()) {
      return 0;
    }
    return 1021;
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