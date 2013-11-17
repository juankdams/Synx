import org.apache.log4j.Logger;

public class bTF extends cMb
  implements bPF
{
  private static final Logger K = Logger.getLogger(bTF.class);
  private ass heV;

  protected cCH ak()
  {
    return this.heV != null ? this.heV.yI() : cCH.ivi;
  }

  public void initialize() {
    JZ();
    sM();
  }

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

  public short OL()
  {
    return 60;
  }

  public String getName()
  {
    dPl localdPl = yJ();
    return localdPl == null ? "" : localdPl.getName();
  }

  public void al()
  {
    String[] arrayOfString = this.fgH.split(";");
    int i = arrayOfString.length;
    if ((i != 2) && (i != 4)) {
      K.error("[LevelDesign] La CharacterStatue " + this.aTz + " n'a pas le bon nombre de paramètres");
      return;
    }
    int k;
    if (i == 2) {
      String str1 = arrayOfString[0];
      k = Integer.parseInt(arrayOfString[1]);
      this.heV = new sm(this, str1);
      super.al();
    } else {
      int j = Short.parseShort(arrayOfString[0]);
      k = Byte.parseByte(arrayOfString[1]);
      String str2 = arrayOfString[2];
      int m = Integer.parseInt(arrayOfString[3]);
      this.heV = new dNV(this, str2, m);
      super.al();
    }
  }

  public void bc()
  {
    super.bc();
    this.heV = null;
  }

  public void aJ()
  {
    super.aJ();
    this.aTn = 1;
    setVisible(true);
    eu(true);
    ev(true);
    this.krb = true;
    this.haI = false;
    if ((!bB) && (this.heV != null)) throw new AssertionError();
  }

  public ass bXi()
  {
    return this.heV;
  }

  public dPl yJ() {
    return this.heV.yJ();
  }
}