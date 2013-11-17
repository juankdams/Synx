import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class aFz
  implements aTe
{
  private static final String bdh = "@(#) $RCSfile: Document.java,v $ $Revision: 1.84 $ $Date: 2004/08/31 21:47:51 $ $Name: jdom_1_0 $";
  cPo ebT = new cPo(this);

  protected String baseURI = null;

  private HashMap ebU = null;

  public aFz()
  {
  }

  public aFz(List paramList)
  {
    d(paramList);
  }

  public aFz(dRW paramdRW)
  {
    this(paramdRW, null, null);
  }

  public aFz(dRW paramdRW, tk paramtk)
  {
    this(paramdRW, paramtk, null);
  }

  public aFz(dRW paramdRW, tk paramtk, String paramString)
  {
    if (paramdRW != null) {
      b(paramdRW);
    }
    if (paramtk != null) {
      a(paramtk);
    }
    if (paramString != null)
      setBaseURI(paramString);
  }

  public aFz a(int paramInt, Collection paramCollection)
  {
    this.ebT.addAll(paramInt, paramCollection);
    return this;
  }

  public aFz a(int paramInt, djh paramdjh)
  {
    this.ebT.c(paramInt, paramdjh);
    return this;
  }

  public aFz c(Collection paramCollection)
  {
    this.ebT.addAll(paramCollection);
    return this;
  }

  public aFz a(djh paramdjh)
  {
    this.ebT.add(paramdjh);
    return this;
  }

  public Object clone()
  {
    aFz localaFz = null;
    try
    {
      localaFz = (aFz)super.clone();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }

    localaFz.ebT = new cPo(localaFz);

    for (int i = 0; i < this.ebT.size(); i++) {
      Object localObject1 = this.ebT.get(i);
      Object localObject2;
      if ((localObject1 instanceof dRW)) {
        localObject2 = (dRW)((dRW)localObject1).clone();
        localaFz.ebT.add(localObject2);
      }
      else if ((localObject1 instanceof cft)) {
        localObject2 = (cft)((cft)localObject1).clone();
        localaFz.ebT.add(localObject2);
      }
      else if ((localObject1 instanceof Re)) {
        localObject2 = (Re)
          ((Re)localObject1).clone();
        localaFz.ebT.add(localObject2);
      }
      else if ((localObject1 instanceof tk)) {
        localObject2 = (tk)((tk)localObject1).clone();
        localaFz.ebT.add(localObject2);
      }
    }

    return localaFz;
  }

  public List aRU()
  {
    int i = getContentSize();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      djh localdjh = mq(j);
      localArrayList.add(localdjh.clone());
    }
    return localArrayList;
  }

  public dRW aRV()
  {
    int i = this.ebT.cGA();
    if (i < 0)
      return null;
    return (dRW)mr(i);
  }

  public final boolean equals(Object paramObject)
  {
    return paramObject == this;
  }

  public final String getBaseURI()
  {
    return this.baseURI;
  }

  public List getContent()
  {
    if (!aSa())
      throw new IllegalStateException("Root element not set");
    return this.ebT;
  }

  public djh mq(int paramInt)
  {
    return (djh)this.ebT.get(paramInt);
  }

  public List c(KN paramKN)
  {
    if (!aSa())
      throw new IllegalStateException("Root element not set");
    return this.ebT.f(paramKN);
  }

  public int getContentSize()
  {
    return this.ebT.size();
  }

  public Iterator aRW()
  {
    return new cgk(this);
  }

  public Iterator d(KN paramKN)
  {
    return new bOG(new cgk(this), paramKN);
  }

  public tk aRX()
  {
    int i = this.ebT.cGz();
    if (i < 0) {
      return null;
    }

    return (tk)this.ebT.get(i);
  }

  public aFz getDocument()
  {
    return this;
  }

  public aTe aRY()
  {
    return null;
  }

  public Object getProperty(String paramString)
  {
    if (this.ebU == null) return null;
    return this.ebU.get(paramString);
  }

  public dRW aRZ()
  {
    int i = this.ebT.cGA();
    if (i < 0) {
      throw new IllegalStateException("Root element not set");
    }
    return (dRW)this.ebT.get(i);
  }

  public boolean aSa()
  {
    return this.ebT.cGA() >= 0;
  }

  public final int hashCode()
  {
    return super.hashCode();
  }

  public int b(djh paramdjh)
  {
    return this.ebT.indexOf(paramdjh);
  }

  public List aSb()
  {
    ArrayList localArrayList = new ArrayList(this.ebT);
    this.ebT.clear();
    return localArrayList;
  }

  public djh mr(int paramInt)
  {
    return (djh)this.ebT.remove(paramInt);
  }

  public boolean c(djh paramdjh)
  {
    return this.ebT.remove(paramdjh);
  }

  public List e(KN paramKN)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.ebT.f(paramKN).iterator();
    while (localIterator.hasNext()) {
      djh localdjh = (djh)localIterator.next();
      localArrayList.add(localdjh);
      localIterator.remove();
    }
    return localArrayList;
  }

  public final void setBaseURI(String paramString)
  {
    this.baseURI = paramString;
  }

  public aFz b(int paramInt, Collection paramCollection)
  {
    this.ebT.remove(paramInt);
    this.ebT.addAll(paramInt, paramCollection);
    return this;
  }

  public aFz b(int paramInt, djh paramdjh)
  {
    this.ebT.set(paramInt, paramdjh);
    return this;
  }

  public aFz d(Collection paramCollection)
  {
    this.ebT.q(paramCollection);
    return this;
  }

  public aFz d(djh paramdjh)
  {
    this.ebT.clear();
    this.ebT.add(paramdjh);
    return this;
  }

  public aFz a(tk paramtk)
  {
    if (paramtk == null)
    {
      i = this.ebT.cGz();
      if (i >= 0) this.ebT.remove(i);
      return this;
    }

    if (paramtk.aRY() != null) {
      throw new bLc(paramtk, 
        "The DocType already is attached to a document");
    }

    int i = this.ebT.cGz();
    if (i < 0) {
      this.ebT.c(0, paramtk);
    }
    else {
      this.ebT.set(i, paramtk);
    }

    return this;
  }

  public void setProperty(String paramString, Object paramObject)
  {
    if (this.ebU == null) {
      this.ebU = new HashMap();
    }
    this.ebU.put(paramString, paramObject);
  }

  public aFz b(dRW paramdRW)
  {
    int i = this.ebT.cGA();
    if (i < 0) {
      this.ebT.add(paramdRW);
    }
    else {
      this.ebT.set(i, paramdRW);
    }
    return this;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer()
      .append("[Document: ");

    tk localtk = aRX();
    if (localtk != null)
      localStringBuffer.append(localtk.toString())
        .append(", ");
    else {
      localStringBuffer.append(" No DOCTYPE declaration, ");
    }

    dRW localdRW = aRZ();
    if (localdRW != null)
      localStringBuffer.append("Root is ")
        .append(localdRW.toString());
    else {
      localStringBuffer.append(" No root element");
    }

    localStringBuffer.append("]");

    return localStringBuffer.toString();
  }
}