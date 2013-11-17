import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class chz extends cMb
{
  protected static final Logger K = Logger.getLogger(chz.class);
  private int aSg;
  private int bMw;
  private int bMx;
  private final cCH kC;

  public chz()
  {
    this.kC = new Iq(this, 22);
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    K.info("Action performed on interactive element : " + paramdJO.toString());
    a(paramdJO);
    d(paramdJO);
    return true;
  }

  public dJO eR()
  {
    return dJO.lVR;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVR };
  }

  public csx[] am()
  {
    if (this.bMx == -1) {
      return csx.icw;
    }
    csx[] arrayOfcsx = new csx[1];

    aXi localaXi = (aXi)aiI.dfP.avt();
    localaXi.iT(this.bMx);
    localaXi.setName("ie.scenario.mru." + this.bMw);
    localaXi.b(dJO.lVR);
    arrayOfcsx[0] = localaXi;
    return arrayOfcsx;
  }

  public short OL()
  {
    return (short)(int)(bY() * 10.0F);
  }

  public void aJ()
  {
    super.aJ();
    eu(true);
    ev(true);
    D(true);
    this.aSg = 0;
    this.bMw = -1;
    this.bMx = -1;
  }

  protected cCH ak()
  {
    return this.kC;
  }

  public String getName()
  {
    return bU.fH().getString("ie.scenario.name." + this.bMw);
  }

  void initialize()
  {
    Object localObject;
    abc localabc;
    if (this.aSg != -1) {
      if (sL().isEmpty()) {
        localObject = new cPP();
        localabc = (abc)((dfN)localObject).p();
        localabc.bP(1);
        localabc.bQ(0);
        localabc.y((byte)4);
        c(localabc);
      }
      for (localObject = sL().iterator(); ((Iterator)localObject).hasNext(); ) { localabc = (abc)((Iterator)localObject).next();
        if ((localabc instanceof djm))
          localabc.bQ(this.aSg);
      }
    }
  }

  public void al()
  {
    super.al();
    String[] arrayOfString = this.fgH.split(";");
    if ((arrayOfString.length != 1) && (arrayOfString.length != 2)) {
      K.error("[LevelDesign] Un élément de scénario générique doit avoir 1 ou 2 paramètres : id dans le translator et id du gfx du MRU (-1 si cet élément ne doit pas avoir de MRU");
      return;
    }
    this.bMw = Integer.valueOf(arrayOfString[0].trim()).intValue();
    c(CG.bFI);
  }

  public void tk()
  {
    super.tk();
  }

  public void a(abc paramabc)
  {
  }

  public CG E()
  {
    return CG.bFI;
  }

  public boolean ta()
  {
    byz localbyz = byv.bFN().bFO();

    return bGP.gDx.a(new aGH[] { localbyz });
  }
}