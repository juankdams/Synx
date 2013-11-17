import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

public abstract class dWu extends aZK
  implements duA
{
  private static final Logger K = Logger.getLogger(dWu.class);
  private static final String dD = "ie_actions";
  private final ArrayList bYx = new ArrayList(1);
  private final EnumMap mwH = new EnumMap(dJO.class);
  protected boolean mwI;
  private final cCH iag = new cqR(this);

  public final Collection sL()
  {
    return this.bYx;
  }

  public boolean b(dJO paramdJO, bhL parambhL)
  {
    if (!this.dgA) {
      return false;
    }
    boolean bool = a(paramdJO, parambhL);
    if (!bool) {
      K.warn("Action non prise en compte par le ModelControler (ClientMapInteractiveElement) : " + paramdJO.toString());
    }
    return bool;
  }

  public void bc()
  {
    super.bc();
    this.bYx.clear();
    this.mwH.clear();
  }

  public void aJ()
  {
    super.aJ();
    this.mwI = false;
    if ((!bB) && (!this.bYx.isEmpty())) throw new AssertionError();
    if ((!bB) && (!this.mwH.isEmpty())) throw new AssertionError(); 
  }

  public boolean c(abc paramabc)
  {
    paramabc.a(this);
    a(paramabc);
    return this.bYx.add(paramabc);
  }

  public final void dvF() {
    for (int i = 0; i < this.bYx.size(); i++) {
      b((dTm)this.bYx.get(i));
    }
    this.bYx.clear();
  }

  public abstract List bVi();

  protected cCH boH()
  {
    return this.iag;
  }

  protected final cCH boJ()
  {
    return cCH.ivi;
  }

  protected final cCH boK()
  {
    return cCH.ivi;
  }

  public tF boL()
  {
    cYk localcYk = ML();
    return cwO.dV(localcYk.getX(), localcYk.getY());
  }

  public abstract boolean cFe();

  public final void sM()
  {
    for (abc localabc : this.bYx)
      b(localabc);
  }

  protected void b(abc paramabc)
  {
    paramabc.update();
  }

  public void MW() {
    this.mwI = true;
  }

  public void tk() {
    this.mwI = false;
  }

  public abstract void a(abc paramabc);

  public boolean d(abc paramabc)
  {
    b(paramabc);
    return this.bYx.remove(paramabc);
  }

  protected final void d(dJO paramdJO) {
    Integer localInteger = (Integer)this.mwH.get(paramdJO);
    if ((localInteger != null) && (localInteger.intValue() != 0)) {
      Map localMap = Collections.singletonMap("elementId", Long.valueOf(this.aTz));

      if ((!bB) && (dlD.cTt().getPath() == null)) throw new AssertionError();
      String str = String.format("%s/%d%s", new Object[] { "ie_actions", localInteger, dlD.cTt().getExtension() });

      dlD.cTt().a(str, null, localMap, null, false);
    }
  }
}