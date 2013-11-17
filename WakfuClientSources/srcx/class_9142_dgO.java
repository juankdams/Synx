import org.apache.log4j.Logger;

public class dgO extends cMb
{
  private static final Logger K = Logger.getLogger(dgO.class);
  protected cBC lbW;

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    d(paramdJO);
    return false;
  }

  public dJO eR()
  {
    return dJO.lVV;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVV };
  }

  public csx[] am()
  {
    csx[] arrayOfcsx = new csx[4];

    csx localcsx1 = aiI.dfT.avt();
    csx localcsx2 = aiI.dgw.avt();
    bti localbti1 = (bti)aiI.dgx.avt();
    localbti1.fk(true);
    bti localbti2 = (bti)aiI.dgx.avt();
    localbti2.fk(false);

    arrayOfcsx[0] = localcsx1;
    arrayOfcsx[1] = localcsx2;
    arrayOfcsx[2] = localbti1;
    arrayOfcsx[3] = localbti2;
    return arrayOfcsx;
  }

  public short OL()
  {
    return 60;
  }

  public String getName()
  {
    return bU.fH().b(110, this.lbW.getId(), new Object[0]);
  }

  public void al()
  {
    if (dzp.qF(this.fgH)) {
      this.lbW = null;
      return;
    }
    String[] arrayOfString = this.fgH.split(";");
    if (arrayOfString.length != 1) {
      K.error("[LD] L'IE de Stool " + this.aTz + " doit avoir 1 paramètre");
      return;
    }
    cBC localcBC = (cBC)aKY.epr.a(cdc.hwe, Integer.valueOf(arrayOfString[0]).intValue());
    if (localcBC == null) {
      K.error("[LD] L'IE de Recycle " + this.aTz + " à un parametre [" + Integer.valueOf(arrayOfString[0]) + "] qui ne correspond a rien dans les Admins");
      return;
    }
    this.lbW = localcBC;
  }

  protected int getParamCount() {
    return 1;
  }

  public void bc()
  {
    super.bc();
    this.lbW = null;
  }

  public void aJ()
  {
    super.aJ();
    this.aTn = 1;
    setVisible(true);
    eu(false);
    ev(true);
    this.krb = true;
    this.haI = true;
    if ((!bB) && (this.lbW != null)) throw new AssertionError();
  }
}