import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class cex extends cwV
  implements Ae
{
  private boolean hyZ;
  private boolean dFF;
  private Set hza;
  private List hzb;
  private List hzc;
  private cYd hzd;
  private boolean hze;

  public cex()
  {
    this.hyZ = true;
    this.dFF = false;

    this.hzb = new ArrayList();
    this.hzc = new ArrayList();

    this.hze = true;
  }

  public void kT(String paramString)
  {
    pm localpm = new pm();
    localpm.setName(paramString);
    e(localpm);
  }

  public void kU(String paramString)
  {
    pm localpm = new pm();
    localpm.setRegex(paramString);
    e(localpm);
  }

  public void kV(String paramString)
  {
    pm localpm = new pm();
    localpm.setPrefix(paramString);
    e(localpm);
  }

  public void b(dmq paramdmq)
  {
    pm localpm = new pm();
    localpm.a(paramdmq);
    e(localpm);
  }

  public void g(String paramString1, String paramString2, String paramString3)
  {
    cYd localcYd = gg();
    aqp localaqp = new aqp();
    localaqp.setValue(paramString1);
    localcYd.a(localaqp);
    localcYd.setFrom(paramString2);
    localcYd.setTo(paramString3);
  }

  public void e(pm parampm)
  {
    chC();
    setChecked(false);
    this.hzb.add(parampm);
  }

  public void a(cex paramcex)
  {
    chC();
    setChecked(false);
    this.hzc.add(paramcex);
  }

  public cYd gg()
  {
    chC();
    if (this.hzd != null) {
      throw new cJ("Too many <mapper>s!");
    }
    this.hzd = new cYd(Ga());
    setChecked(false);
    return this.hzd;
  }

  public void a(Jf paramJf)
  {
    gg().a(paramJf);
  }

  public void gS(boolean paramBoolean)
  {
    chC();
    this.hyZ = paramBoolean;
  }

  public void cN(boolean paramBoolean)
  {
    chC();
    this.dFF = paramBoolean;
  }

  public boolean chx()
  {
    if (cum()) {
      return chB().hyZ;
    }
    cuo();
    return this.hyZ;
  }

  public cYd chy()
  {
    if (cum()) {
      return chB().hzd;
    }
    cuo();
    return this.hzd;
  }

  private Hashtable chz()
  {
    Hashtable localHashtable = new Hashtable();
    Enumeration localEnumeration = System.getProperties().propertyNames();
    while (localEnumeration.hasMoreElements()) {
      String str = (String)localEnumeration.nextElement();
      localHashtable.put(str, System.getProperties().getProperty(str));
    }
    return localHashtable;
  }

  public Properties getProperties()
  {
    Properties localProperties = new Properties();
    localProperties.putAll(getPropertyMap());
    return localProperties;
  }

  private Map getPropertyMap()
  {
    if (cum()) {
      return chB().getPropertyMap();
    }
    cuo();
    cYd localcYd = chy();
    Jf localJf = localcYd == null ? null : localcYd.cLA();

    Map localMap = chA();
    Set localSet = o(localMap);
    HashMap localHashMap = new HashMap();

    for (String str : localSet) {
      Object localObject = localMap.get(str);

      if (localObject != null)
      {
        if (localJf != null)
        {
          String[] arrayOfString = localJf.cg(str);
          if (arrayOfString != null) {
            str = arrayOfString[0];
          }
        }
        localHashMap.put(str, localObject);
      }
    }
    return localHashMap;
  }

  private Map chA()
  {
    FF localFF = Ga();
    Hashtable localHashtable = localFF == null ? chz() : localFF.Pz();

    for (cex localcex : this.hzc) {
      localHashtable.putAll(localcex.getPropertyMap());
    }
    return localHashtable;
  }

  private Set o(Map paramMap)
  {
    Object localObject1;
    if ((chx()) || (this.hza == null)) {
      localObject1 = new HashSet();
      a((Set)localObject1, paramMap);

      for (Object localObject2 = this.hzc.iterator(); ((Iterator)localObject2).hasNext(); ) { cex localcex = (cex)((Iterator)localObject2).next();
        ((Set)localObject1).addAll(localcex.getPropertyMap().keySet());
      }
      if (this.dFF)
      {
        localObject2 = new HashSet(paramMap.keySet());
        ((HashSet)localObject2).removeAll((Collection)localObject1);
        localObject1 = localObject2;
      }
      if (!chx())
        this.hza = ((Set)localObject1);
    }
    else {
      localObject1 = this.hza;
    }
    return localObject1;
  }

  private void a(Set paramSet, Map paramMap)
  {
    if (cum()) {
      chB().a(paramSet, paramMap);
    }
    cuo();

    for (pm localpm : this.hzb)
      if (pm.a(localpm) != null) {
        if (paramMap.get(pm.a(localpm)) != null)
          paramSet.add(pm.a(localpm));
      }
      else
      {
        Object localObject1;
        Object localObject2;
        if (pm.b(localpm) != null) {
          for (localObject1 = paramMap.keySet().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (String)((Iterator)localObject1).next();
            if (((String)localObject2).startsWith(pm.b(localpm)))
              paramSet.add(localObject2);
          }
        }
        else if (pm.c(localpm) != null) {
          localObject1 = new cwT();
          localObject2 = ((cwT)localObject1).cul();
          ((biv)localObject2).setPattern(pm.c(localpm));
          for (String str : paramMap.keySet()) {
            if (((biv)localObject2).matches(str))
              paramSet.add(str);
          }
        }
        else if (pm.d(localpm) != null)
        {
          if (pm.d(localpm).equals("all"))
            paramSet.addAll(paramMap.keySet());
          else if (pm.d(localpm).equals("system"))
            paramSet.addAll(chz().keySet());
          else if (pm.d(localpm).equals("commandline"))
          {
            paramSet.addAll(Ga().PA().keySet());
          }
          else throw new cJ("Impossible: Invalid builtin attribute!");
        }
        else
        {
          throw new cJ("Impossible: Invalid PropertyRef!");
        }
      }
  }

  protected cex chB()
  {
    return (cex)i(cex.class, "propertyset");
  }

  public final void a(cxK paramcxK)
  {
    if (!this.hze) {
      throw cuq();
    }
    super.a(paramcxK);
  }

  protected final void chC()
  {
    if (cum()) {
      throw cuq();
    }
    this.hze = false;
  }

  public String toString()
  {
    if (cum()) {
      return chB().toString();
    }
    cuo();
    StringBuilder localStringBuilder = new StringBuilder();
    TreeMap localTreeMap = new TreeMap(getPropertyMap());
    for (Map.Entry localEntry : localTreeMap.entrySet()) {
      if (localStringBuilder.length() != 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append((String)localEntry.getKey());
      localStringBuilder.append("=");
      localStringBuilder.append(localEntry.getValue());
    }
    return localStringBuilder.toString();
  }

  public Iterator iterator()
  {
    if (cum()) {
      return chB().iterator();
    }
    cuo();
    Set localSet = o(chA());

    cYd localcYd = chy();
    Jf localJf = localcYd == null ? null : localcYd.cLA();
    Iterator localIterator = localSet.iterator();

    return new FE(this, localIterator, localJf);
  }

  public int size()
  {
    return cum() ? chB().size() : getProperties().size();
  }

  public boolean Jm()
  {
    if (cum()) {
      return chB().Jm();
    }
    cuo();
    return false;
  }

  protected synchronized void a(Stack paramStack, FF paramFF)
  {
    if (isChecked()) {
      return;
    }
    if (cum()) {
      super.a(paramStack, paramFF);
    } else {
      if (this.hzd != null) {
        b(this.hzd, paramStack, paramFF);
      }
      for (cex localcex : this.hzc) {
        b(localcex, paramStack, paramFF);
      }

      setChecked(true);
    }
  }
}