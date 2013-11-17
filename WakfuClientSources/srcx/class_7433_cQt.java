import org.apache.log4j.Logger;

public class cQt extends cMb
{
  private static final Logger K = Logger.getLogger(cQt.class);
  private dNh kBr;

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    if (paramdJO != dJO.lVv) {
      return false;
    }
    El localEl = El.Q(this.kBr.bmk());
    if (dDE.dft().VN().Q(localEl.tw())) {
      return false;
    }
    hx.aGS.b(localEl);

    return true;
  }

  public dJO eR()
  {
    El localEl = El.Q(this.kBr.bmk());
    if (dDE.dft().VN().Q(localEl.tw())) {
      return null;
    }
    return dJO.lVv;
  }

  public dJO[] eS()
  {
    El localEl = El.Q(this.kBr.bmk());
    if (dDE.dft().VN().Q(localEl.tw())) {
      return dJO.lWj;
    }
    return new dJO[] { dJO.lVv };
  }

  public csx[] am()
  {
    El localEl = El.Q(this.kBr.bmk());
    if (dDE.dft().VN().Q(localEl.tw())) {
      return csx.icw;
    }
    csl localcsl = (csl)aiI.dfO.avt();
    if (!bjY.ais()) {
      localcsl.setEnabled(false);
      localcsl.lZ(bU.fH().getString("krosmoz.gameBoard.systemRequirementsNotMet"));
    }

    return new csx[] { localcsl };
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
    if ((!bB) && (this.kBr != null)) throw new AssertionError();
  }

  public void bc()
  {
    super.bc();
    this.kBr = null;
  }

  public boolean sO() {
    return true;
  }

  public String getName()
  {
    if (this.kBr != null) {
      return bU.fH().b(135, this.kBr.getId(), new Object[0]);
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

    dNh localdNh = (dNh)aKY.epr.a(cdc.hwm, i);
    if (localdNh == null) {
      K.error("[LD] La borne de krosmoz " + this.aTz + " a un parametre [" + Integer.valueOf(arrayOfString[0]) + "] qui ne correspond a rien dans les Admins");
      return;
    }
    this.kBr = localdNh;
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
      this.krh = new YN(this);
    return this.krh;
  }
}