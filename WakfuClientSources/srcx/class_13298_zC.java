import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class zC
{
  private static Logger K = Logger.getLogger(zC.class);

  private static zC buo = new zC();
  private dOc bup;
  private final HashMap buq = new HashMap();

  private boolean bur = false;
  private dOc bus = null;

  public void c(dOc paramdOc)
  {
    dRq localdRq = paramdOc.getRootFocusParent();
    if (localdRq != null) {
      ArrayList localArrayList = (ArrayList)this.buq.get(localdRq);
      if (localArrayList == null) {
        localArrayList = new ArrayList();
        this.buq.put(localdRq, localArrayList);
      }
      if (!localArrayList.contains(paramdOc))
        localArrayList.add(paramdOc);
    }
  }

  public void d(dOc paramdOc)
  {
    if (this.bup == paramdOc) {
      It();
    }

    if (this.bup == paramdOc) {
      this.bup = null;
    }
    if (this.bus == paramdOc) {
      this.bus = null;
    }
    dRq localdRq = paramdOc.getRootFocusParent();
    Object localObject;
    if (localdRq != null) {
      localObject = (ArrayList)this.buq.get(localdRq);
      a(paramdOc, localdRq, (Collection)localObject);
    } else {
      localObject = this.buq.values().iterator();

      while (((Iterator)localObject).hasNext()) {
        ArrayList localArrayList = (ArrayList)((Iterator)localObject).next();
        a(paramdOc, localdRq, localArrayList);
      }
    }
  }

  private void a(dOc paramdOc, dRq paramdRq, Collection paramCollection) {
    if (paramCollection != null) {
      paramCollection.remove(paramdOc);
      if (paramCollection.isEmpty())
        this.buq.remove(paramdRq);
    }
  }

  public void b(dRq paramdRq)
  {
    this.buq.remove(paramdRq);
  }

  public static zC Ip()
  {
    return buo;
  }

  public void setEnabled(boolean paramBoolean) {
    if (this.bur == paramBoolean) {
      return;
    }
    if (!paramBoolean) {
      this.bus = this.bup;
      b(null, true);
    } else {
      b(this.bus, true);
      this.bus = null;
    }

    this.bur = paramBoolean;
  }

  public void e(dOc paramdOc)
  {
    b(paramdOc, false);
  }

  private void b(dOc paramdOc, boolean paramBoolean) {
    int i = (this.bur) || (paramBoolean) ? 1 : 0;

    Object localObject = (paramdOc != null) && (paramdOc.getFocusable()) ? paramdOc : null;

    if (((i != 0) && (localObject == this.bup)) || ((i == 0) && (localObject == this.bus))) {
      return;
    }
    dOc localdOc = this.bup;

    if (i != 0) {
      this.bup = localObject;
    } else {
      this.bus = localObject;
      this.bup = null;
    }
    Gy localGy;
    if ((localdOc != null) && (localdOc.getFocusable())) {
      localGy = new Gy(localdOc, false);
      localdOc.g(localGy);
    }

    if ((this.bup != null) && (this.bup.getFocusable())) {
      localGy = new Gy(this.bup, true);
      this.bup.g(localGy);
    }
  }

  public dOc Iq()
  {
    return this.bup;
  }

  public void Ir()
  {
    if (this.bup != null) {
      Object localObject = this.bup;
      while ((localObject != null) && (localObject != bsP.getInstance()) && (((dOc)localObject).getModalLevel() == -1)) {
        localObject = ((dOc)localObject).getContainer();
      }
      if ((localObject != null) && 
        (((dOc)localObject).getModalLevel() < Ts.agx().agy()))
        e(null);
    }
  }

  public void Is()
  {
    ao(false);
  }

  public void It()
  {
    ao(true);
  }

  private void ao(boolean paramBoolean)
  {
    dOc localdOc = null;
    Object localObject;
    ArrayList localArrayList;
    if (this.bup == null)
    {
      for (localObject = this.buq.values().iterator(); ((Iterator)localObject).hasNext(); ) { localArrayList = (ArrayList)((Iterator)localObject).next();
        if (!localArrayList.isEmpty()) {
          localdOc = (dOc)localArrayList.get(0);
          break;
        } }
    }
    else {
      localObject = this.bup.getRootFocusParent();
      if (localObject != null) {
        localArrayList = (ArrayList)this.buq.get(localObject);
        if ((localArrayList != null) && 
          (!localArrayList.isEmpty())) {
          int i = localArrayList.indexOf(this.bup);
          int j = localArrayList.size() - 1;
          if ((paramBoolean) && (i == j))
            localdOc = (dOc)localArrayList.get(0);
          else if ((!paramBoolean) && (i == 0))
            localdOc = (dOc)localArrayList.get(j);
          else if ((i >= 0) && (i <= j))
            localdOc = (dOc)localArrayList.get(i + (paramBoolean ? 1 : -1));
          else {
            K.error("m_focused (" + this.bup + ") n'est pas enregistré dans les listes de widgets Focusables");
          }
        }
      }

    }

    e(localdOc);
  }
}