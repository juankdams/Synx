import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.xml.sax.AttributeList;
import org.xml.sax.helpers.AttributeListImpl;

public class bTW
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private static final Hashtable hfJ = new Hashtable(0);

  private String hfK = null;

  private List children = null;

  private transient Object hfL = null;
  private transient AttributeList hfM;
  private transient boolean hfN = false;

  private LinkedHashMap hfO = null;

  private StringBuffer hfP = null;

  private boolean hfQ = false;

  private String dTH = null;

  private String id = null;

  public bTW(Object paramObject, String paramString)
  {
    aD(paramObject);
    kr(paramString);

    if ((paramObject instanceof aGK))
      ((aGK)paramObject).b(this);
  }

  public synchronized void aD(Object paramObject)
  {
    this.hfL = paramObject;
    this.hfQ = false;
  }

  public boolean c(aQS paramaQS)
  {
    if (!this.hfN) {
      return true;
    }
    aXW localaXW = aXW.v(paramaQS.Ga());

    wE localwE = wE.a(paramaQS.Ga(), aws.class);

    for (int i = 0; i < this.hfO.keySet().size(); i++) {
      String str1 = (String)this.hfO.keySet().toArray()[i];
      if (str1.indexOf(':') != -1)
      {
        String str2 = kq(str1);
        String str3 = dhB.pd(str2);
        if (localaXW.hy(dhB.pf(str3)) != null)
        {
          String str4 = (String)this.hfO.get(str1);

          cRR localcRR = null;
          try {
            localcRR = (cRR)localwE.c(paramaQS.Ga(), new aws(null), str2);
          }
          catch (cJ localcJ)
          {
            throw new cJ("Unsupported attribute " + str2);
          }

          if (localcRR != null)
          {
            str4 = paramaQS.Ga().bH(str4);
            if (!localcRR.a(paramaQS, str4))
              return false; 
          }
        }
      }
    }
    return true;
  }

  private String kq(String paramString)
  {
    int i = paramString.lastIndexOf(':');
    int j = paramString.lastIndexOf(':', i - 1);
    return paramString.substring(0, j) + paramString.substring(i);
  }

  synchronized void a(aAK paramaAK)
  {
  }

  public synchronized Object bsm()
  {
    return this.hfL;
  }

  public synchronized String getId()
  {
    return this.id;
  }

  public synchronized String cab()
  {
    return this.dTH;
  }

  public synchronized void ga(String paramString)
  {
    this.dTH = paramString;
  }

  public synchronized void a(AttributeList paramAttributeList)
  {
    this.hfM = new AttributeListImpl(paramAttributeList);
    for (int i = 0; i < paramAttributeList.getLength(); i++)
      setAttribute(paramAttributeList.getName(i), paramAttributeList.getValue(i));
  }

  public synchronized void setAttribute(String paramString1, String paramString2)
  {
    if (paramString1.indexOf(':') != -1) {
      this.hfN = true;
    }
    setAttribute(paramString1, paramString2);
  }

  public synchronized void setAttribute(String paramString, Object paramObject)
  {
    if (paramString.equalsIgnoreCase("ant-type")) {
      this.dTH = (paramObject == null ? null : paramObject.toString());
    } else {
      if (this.hfO == null) {
        this.hfO = new LinkedHashMap();
      }
      if ((paramString.equalsIgnoreCase("refid")) && (!this.hfO.isEmpty())) {
        LinkedHashMap localLinkedHashMap = new LinkedHashMap();
        localLinkedHashMap.put(paramString, paramObject);
        localLinkedHashMap.putAll(this.hfO);
        this.hfO = localLinkedHashMap;
      } else {
        this.hfO.put(paramString, paramObject);
      }
      if (paramString.equals("id"))
        this.id = (paramObject == null ? null : paramObject.toString());
    }
  }

  public synchronized void removeAttribute(String paramString)
  {
    this.hfO.remove(paramString);
  }

  public synchronized Hashtable cac()
  {
    return this.hfO == null ? hfJ : new Hashtable(this.hfO);
  }

  public synchronized AttributeList cad()
  {
    return this.hfM;
  }

  public synchronized void c(bTW parambTW)
  {
    this.children = (this.children == null ? new ArrayList() : this.children);
    this.children.add(parambTW);
  }

  synchronized bTW ud(int paramInt)
  {
    return (bTW)this.children.get(paramInt);
  }

  public synchronized Enumeration cae()
  {
    return this.children == null ? new dkH() : Collections.enumeration(this.children);
  }

  public synchronized void addText(String paramString)
  {
    if (paramString.length() == 0) {
      return;
    }
    this.hfP = (this.hfP == null ? new StringBuffer(paramString) : this.hfP.append(paramString));
  }

  public synchronized void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return;
    }
    this.hfP = (this.hfP == null ? new StringBuffer(paramInt2) : this.hfP).append(paramArrayOfChar, paramInt1, paramInt2);
  }

  public synchronized StringBuffer caf()
  {
    return this.hfP == null ? new StringBuffer(0) : this.hfP;
  }

  public synchronized void kr(String paramString)
  {
    this.hfK = paramString;
  }

  public synchronized String cag()
  {
    return this.hfK;
  }

  public void N(FF paramFF)
  {
    a(paramFF, true);
  }

  public synchronized void a(FF paramFF, boolean paramBoolean)
  {
    if (this.hfQ) {
      return;
    }

    Object localObject1 = (this.hfL instanceof bew) ? ((bew)this.hfL).bsm() : this.hfL;

    wE localwE = wE.a(paramFF, localObject1.getClass());

    if (this.hfO != null) {
      for (Map.Entry localEntry : this.hfO.entrySet()) {
        String str = (String)localEntry.getKey();
        Object localObject2 = localEntry.getValue();
        Object localObject3;
        if ((localObject2 instanceof HP))
          localObject3 = ((HP)localObject2).eval();
        else {
          localObject3 = afR.t(paramFF).ei(localObject2.toString());
        }
        if ((localObject1 instanceof cmA)) {
          for (bxN localbxN : ((cmA)localObject1).cnr().getAttributes()) {
            if (localbxN.getName().equals(str)) {
              if (localbxN.bFb()) break;
              localObject3 = localObject2; break;
            }
          }
        }

        try
        {
          localwE.a(paramFF, localObject1, str, localObject3);
        }
        catch (EG localEG) {
          if (!str.equals("id"))
          {
            if (cag() == null) {
              throw localEG;
            }
            throw new cJ(cag() + " doesn't support the \"" + localEG.getAttribute() + "\" attribute", localEG);
          }
        }
        catch (cJ localcJ)
        {
          if (!str.equals("id"))
          {
            throw localcJ;
          }
        }
      }
    }

    if (this.hfP != null) {
      dhB.a(paramFF, this.hfL, this.hfP.substring(0));
    }

    if (this.id != null) {
      paramFF.g(this.id, this.hfL);
    }
    this.hfQ = true;
  }

  public void O(FF paramFF)
  {
    this.hfQ = false;
    N(paramFF);
  }

  public void d(bTW parambTW)
  {
    Object localObject;
    if (parambTW.hfO != null) {
      for (localObject = parambTW.hfO.keySet().iterator(); ((Iterator)localObject).hasNext(); ) { String str = (String)((Iterator)localObject).next();
        if ((this.hfO == null) || (this.hfO.get(str) == null)) {
          setAttribute(str, (String)parambTW.hfO.get(str));
        }
      }

    }

    this.dTH = (this.dTH == null ? parambTW.dTH : this.dTH);

    if (parambTW.children != null) {
      localObject = new ArrayList();
      ((List)localObject).addAll(parambTW.children);
      if (this.children != null) {
        ((List)localObject).addAll(this.children);
      }
      this.children = ((List)localObject);
    }

    if ((parambTW.hfP != null) && (
      (this.hfP == null) || (this.hfP.toString().trim().length() == 0)))
    {
      this.hfP = new StringBuffer(parambTW.hfP.toString());
    }
  }
}