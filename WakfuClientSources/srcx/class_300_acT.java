import org.apache.log4j.Logger;

public class acT extends cMb
{
  private static final Logger K = Logger.getLogger(acT.class);

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    d(paramdJO);
    a(paramdJO);
    return false;
  }

  public dJO eR()
  {
    return dJO.lVZ;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVZ };
  }

  public csx[] am()
  {
    aCH localaCH = clR.cni().vL(83);
    csl localcsl = (csl)aiI.dfO.avt();
    localcsl.iT(localaCH.aOR());
    localcsl.ma("desc.mru." + localaCH.aOS());
    return new csx[] { localcsl };
  }

  public short OL()
  {
    return 60;
  }

  public String getName()
  {
    return bU.fH().getString("ie.ladderBoard");
  }

  public void al()
  {
    String[] arrayOfString = this.fgH.split(";");
    if (arrayOfString.length != getParamCount()) {
      K.error("[LevelDesign] La DungeonLadderBoard " + this.aTz + " doit avoir " + getParamCount() + " paramètres : instanceId");
      return;
    }

    super.al();
  }

  protected int getParamCount() {
    return 1;
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
  }
}