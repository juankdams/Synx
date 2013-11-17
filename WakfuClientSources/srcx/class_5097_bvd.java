import org.apache.log4j.Logger;

public class bvd extends cMb
{
  private static final Logger K = Logger.getLogger(bvd.class);
  private aWx geO;

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    if (dDE.dft().VN().Q(cGN.iBW)) {
      return false;
    }
    if (paramdJO != dJO.lVv) {
      return false;
    }

    if (azM.dRs.aLF()) {
      Th localTh = new Th();
      byv.bFN().aJK().d(localTh);
    }

    if (!byv.bFN().c(cgf.ciu())) {
      byv.bFN().a(cgf.ciu());
    }
    return true;
  }

  public dJO eR()
  {
    if (dDE.dft().VN().Q(cGN.iBW)) {
      return null;
    }
    return dJO.lVv;
  }

  public dJO[] eS()
  {
    if (dDE.dft().VN().Q(cGN.iBW)) {
      return dJO.lWj;
    }
    return new dJO[] { dJO.lVv };
  }

  public csx[] am()
  {
    if (dDE.dft().VN().Q(cGN.iBW)) {
      return csx.icw;
    }
    return new csx[] { aiI.dfO.avt() };
  }

  public byte bY()
  {
    return 4;
  }

  public void aJ()
  {
    super.aJ();
    x((short)1);
    eu(true);
    D(true);
    if ((!bB) && (this.geO != null)) throw new AssertionError(); 
  }

  public boolean sO()
  {
    return true;
  }

  public void bc()
  {
    super.bc();
    this.geO = null;
  }

  public String getName()
  {
    if (this.geO != null) {
      return bU.fH().b(136, this.geO.getId(), new Object[0]);
    }
    return "#ERROR#";
  }

  public int hA()
  {
    return 0;
  }

  public void al()
  {
    super.al();
    this.aTn = 1;

    String[] arrayOfString = this.fgH.split(";");
    if (arrayOfString.length != 1) {
      K.error("[LD] La borne de krosmoz " + this.aTz + " doit avoir " + 1 + " paramètre");
      return;
    }
    int i;
    try {
      i = Integer.valueOf(arrayOfString[0]).intValue();
    } catch (NumberFormatException localNumberFormatException) {
      K.error("[LD] La borne de krosmoz " + this.aTz + " a un parametre [" + Integer.valueOf(arrayOfString[0]) + "] qui n'est pas du bon type (id attendu)");
      return;
    }

    aWx localaWx = (aWx)aKY.epr.a(cdc.hwn, i);
    if (localaWx == null) {
      K.error("[LD] La borne de krosmoz " + this.aTz + " a un parametre [" + Integer.valueOf(arrayOfString[0]) + "] qui ne correspond a rien dans les Admins");
      return;
    }
    this.geO = localaWx;
  }

  public void a(abc paramabc)
  {
    K.info("[ON VIEW UPDATED] " + paramabc);
  }

  public void bCM() {
    super.bCM();
    this.krd = false;
  }

  public EA xN()
  {
    if (this.krh == null)
      this.krh = new ll(this);
    return this.krh;
  }
}