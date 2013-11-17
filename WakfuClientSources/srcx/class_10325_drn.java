import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class drn
{
  protected static final Logger K = Logger.getLogger(drn.class);

  protected final bPu ltL = new bPu();
  protected final cSR ltM = new cSR();

  public bhh dQ(short paramShort)
  {
    return (bhh)this.ltL.cx(paramShort);
  }

  public void e(bhh parambhh)
  {
    if (parambhh == null) {
      K.error("[espèce ignorée] on tente d'ajouter une espèce null");
      return;
    }

    if (this.ltL.N(parambhh.uO())) {
      K.error("[espèce ignorée] on tente de rajouter une espèce dont l'id existe déjà pour une autre " + parambhh.uO());
      return;
    }

    this.ltL.c(parambhh.uO(), parambhh);

    int i = parambhh.nn();
    Object localObject = (List)this.ltM.get(i);
    if (localObject == null) {
      localObject = new ArrayList();
      this.ltM.put(i, localObject);
    }
    ((List)localObject).add(parambhh);
  }

  public List Bi(int paramInt) {
    if (!this.ltM.containsKey(paramInt)) {
      return Collections.emptyList();
    }
    return (List)this.ltM.get(paramInt);
  }

  public void Y(dGy paramdGy) {
    this.ltL.s(paramdGy);
  }
}