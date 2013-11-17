import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class oK extends cav
{
  public static oK a(Ae paramAe)
  {
    return (paramAe instanceof oK) ? (oK)paramAe : new oK(paramAe);
  }

  public oK()
  {
  }

  public oK(FF paramFF)
  {
    super(paramFF);
  }

  public oK(Ae paramAe)
  {
    this(FF.E(paramAe), paramAe);
  }

  public oK(FF paramFF, Ae paramAe)
  {
    super(paramFF);
    b(paramAe);
  }

  public String[] list()
  {
    if (cum()) {
      return ((oK)i(oK.class, cun())).list();
    }
    Collection localCollection = wm();
    return (String[])localCollection.toArray(new String[localCollection.size()]);
  }

  public bFe[] wl()
  {
    if (cum()) {
      return ((oK)i(oK.class, cun())).wl();
    }
    Set localSet = wn();
    return (bFe[])localSet.toArray(new bFe[localSet.size()]);
  }

  protected Collection getCollection()
  {
    return wn();
  }

  protected Collection M(boolean paramBoolean)
  {
    return paramBoolean ? wm() : wn();
  }

  protected Collection wm()
  {
    Set localSet = wn();
    ArrayList localArrayList = new ArrayList(localSet.size());
    for (bFe localbFe : localSet) {
      localArrayList.add(localbFe.toString());
    }
    return localArrayList;
  }

  protected Set wn()
  {
    List localList = ceH();
    if (localList.isEmpty()) {
      return Collections.emptySet();
    }
    LinkedHashSet localLinkedHashSet = new LinkedHashSet(localList.size() * 2);

    for (Ae localAe : localList) {
      for (bFe localbFe : localAe) {
        localLinkedHashSet.add(localbFe);
      }
    }
    return localLinkedHashSet;
  }
}