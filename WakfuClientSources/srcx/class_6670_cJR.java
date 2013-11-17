import org.apache.log4j.Logger;

public class cJR extends cMb
{
  private static final Logger K = Logger.getLogger(cJR.class);
  private ql iIo;

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    if (paramdJO != dJO.lVv) {
      return false;
    }
    d(paramdJO);
    zJ.IC().a(this);
    a(paramdJO);
    return true;
  }

  public dJO eR()
  {
    if ((this.iIo.getId() == 64) && (dDE.dft().VN().Q(cGN.iBW))) {
      return null;
    }
    return dJO.lVv;
  }

  public dJO[] eS()
  {
    if ((this.iIo.getId() == 64) && (dDE.dft().VN().Q(cGN.iBW))) {
      return dJO.lWj;
    }
    return new dJO[] { dJO.lVv };
  }

  public void al()
  {
    this.iIo = ((ql)aKY.epr.a(cdc.hwd, Integer.parseInt(this.fgH)));
  }

  public csx[] am()
  {
    if ((this.iIo.getId() == 64) && (dDE.dft().VN().Q(cGN.iBW))) {
      return csx.icw;
    }
    csl localcsl = (csl)aiI.dfO.avt();
    aCH localaCH = clR.cni().vL(this.iIo.gC());
    localcsl.iT(localaCH.aOR());
    return new csx[] { localcsl };
  }

  public String getName()
  {
    return bU.fH().b(107, this.iIo == null ? -1 : this.iIo.getId(), new Object[0]);
  }

  public void aJ()
  {
    super.aJ();
    this.aTn = 1;
    setVisible(true);
    eu(true);
    ev(true);
    this.krb = true;
    this.haI = true;
  }

  public EA xN() {
    if (this.krh == null)
      this.krh = new qS(this);
    return this.krh;
  }

  public ql cDK()
  {
    return this.iIo;
  }
}