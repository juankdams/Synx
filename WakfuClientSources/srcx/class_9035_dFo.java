import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dFo extends cMb
{
  private static final Logger K = Logger.getLogger(dFo.class);
  private aRz lPh;
  private long RY;

  protected cCH ak()
  {
    return new dWy(this);
  }

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    d(paramdJO);
    a(paramdJO);
    return true;
  }

  public dJO eR()
  {
    return dJO.lVX;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVX, dJO.lVP };
  }

  public void al()
  {
    this.lPh = ((aRz)aKY.epr.a(cdc.hwl, Integer.parseInt(this.fgH)));
  }

  public csx[] am()
  {
    aCH localaCH = clR.cni().vL(this.lPh.gC());

    ArrayList localArrayList = new ArrayList();

    dDd localdDd = new dDd("informations", coH.hWi.aw);
    localdDd.b(dJO.lVX);
    localArrayList.add(localdDd);

    if (byv.bFN().bFO().bSu().a(bBc.gtj)) {
      aXi localaXi = new aXi();
      localaXi.b(dJO.lVP);
      localaXi.setName("XXX---> 3V01U7!0N <---XXX");
      localaXi.iT(coH.hXd.aw);
      localArrayList.add(localaXi);
    }

    return (csx[])localArrayList.toArray(new csx[localArrayList.size()]);
  }

  public String getName()
  {
    return "TODO";
  }

  public long gv() {
    return this.RY;
  }

  public aRz dgM() {
    return this.lPh;
  }

  public void aJ()
  {
    super.aJ();
    this.lPh = null;
  }

  public void bc()
  {
    super.bc();
    this.lPh = null;
  }
}