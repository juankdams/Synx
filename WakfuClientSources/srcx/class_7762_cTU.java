import org.apache.log4j.Logger;

public class cTU extends cMb
{
  private static final Logger K = Logger.getLogger(cTU.class);
  private Wa kGn;

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    return false;
  }

  public dJO eR()
  {
    return null;
  }

  public dJO[] eS()
  {
    return dJO.lWj;
  }

  public csx[] am()
  {
    return csx.icw;
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
    ev(true);
    D(true);
    if ((!bB) && (this.kGn != null)) throw new AssertionError();
  }

  public void bc()
  {
    super.bc();
    this.kGn = null;
  }

  public String getName()
  {
    if (this.kGn != null) {
      return bU.fH().b(78, this.kGn.getId(), new Object[0]);
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
      K.error("[LD] Le panneau " + this.aTz + " doit avoir " + 1 + " paramètre");
      return;
    }
    int i;
    try {
      i = Integer.valueOf(arrayOfString[0]).intValue();
    } catch (NumberFormatException localNumberFormatException) {
      K.error("[LD] Le panneau " + this.aTz + " a un parametre [" + Integer.valueOf(arrayOfString[0]) + "] qui n'est pas du bon type (id attendu)");
      return;
    }

    Wa localWa = (Wa)aKY.epr.a(cdc.hvR, i);
    if (localWa == null) {
      K.error("[LD] Le panneau " + this.aTz + " a un parametre [" + Integer.valueOf(arrayOfString[0]) + "] qui ne correspond a rien dans les Admins");
      return;
    }
    this.kGn = localWa;
  }

  public void a(abc paramabc)
  {
    K.info("[ON VIEW UPDATED] " + paramabc);
  }

  public void bCM()
  {
    super.bCM();
    this.krd = false;
  }
}