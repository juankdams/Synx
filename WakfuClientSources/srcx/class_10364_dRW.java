import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class dRW extends djh
  implements aTe
{
  private static final String bdh = "@(#) $RCSfile: Element.java,v $ $Revision: 1.152 $ $Date: 2004/09/03 06:35:39 $ $Name: jdom_1_0 $";
  private static final int fZx = 5;
  protected String name;
  protected transient bkj isK;
  protected transient List moe;
  bsC mof = new bsC(this);

  cPo ebT = new cPo(this);

  protected dRW()
  {
  }

  public dRW(String paramString, bkj parambkj)
  {
    rT(paramString);
    c(parambkj);
  }

  public dRW(String paramString)
  {
    this(paramString, (bkj)null);
  }

  public dRW(String paramString1, String paramString2)
  {
    this(paramString1, bkj.aa("", paramString2));
  }

  public dRW(String paramString1, String paramString2, String paramString3)
  {
    this(paramString1, bkj.aa(paramString2, paramString3));
  }

  public String getName()
  {
    return this.name;
  }

  public dRW rT(String paramString)
  {
    String str = asE.fx(paramString);
    if (str != null) {
      throw new cCz(paramString, "element", str);
    }
    this.name = paramString;
    return this;
  }

  public bkj cNd()
  {
    return this.isK;
  }

  public dRW c(bkj parambkj)
  {
    if (parambkj == null) {
      parambkj = bkj.fAF;
    }

    this.isK = parambkj;
    return this;
  }

  public String cNe()
  {
    return this.isK.getPrefix();
  }

  public String getNamespaceURI()
  {
    return this.isK.getURI();
  }

  public bkj it(String paramString)
  {
    if (paramString == null) {
      return null;
    }

    if (paramString.equals("xml"))
    {
      return bkj.fAG;
    }

    if (paramString.equals(cNe())) {
      return cNd();
    }

    if (this.moe != null) {
      for (int i = 0; i < this.moe.size(); i++) {
        bkj localbkj = (bkj)this.moe.get(i);
        if (paramString.equals(localbkj.getPrefix())) {
          return localbkj;
        }
      }

    }

    if ((this.kyj instanceof dRW)) {
      return ((dRW)this.kyj).it(paramString);
    }

    return null;
  }

  public String getQualifiedName()
  {
    if (this.isK.getPrefix().equals("")) {
      return getName();
    }

    return this.isK.getPrefix() + ':' + this.name;
  }

  public void d(bkj parambkj)
  {
    String str = asE.a(parambkj, this);
    if (str != null) {
      throw new bLc(this, parambkj, str);
    }

    if (this.moe == null) {
      this.moe = new ArrayList(5);
    }

    this.moe.add(parambkj);
  }

  public void e(bkj parambkj)
  {
    if (this.moe == null) {
      return;
    }
    this.moe.remove(parambkj);
  }

  public List dsN()
  {
    if (this.moe == null) {
      return Collections.EMPTY_LIST;
    }
    return Collections.unmodifiableList(this.moe);
  }

  public String getValue()
  {
    StringBuffer localStringBuffer = new StringBuffer();

    Iterator localIterator = getContent().iterator();
    while (localIterator.hasNext()) {
      djh localdjh = (djh)localIterator.next();
      if (((localdjh instanceof dRW)) || ((localdjh instanceof cDP))) {
        localStringBuffer.append(localdjh.getValue());
      }
    }
    return localStringBuffer.toString();
  }

  public boolean isRootElement()
  {
    return this.kyj instanceof aFz;
  }

  public int getContentSize() {
    return this.ebT.size();
  }

  public int b(djh paramdjh) {
    return this.ebT.indexOf(paramdjh);
  }

  public String getText()
  {
    if (this.ebT.size() == 0) {
      return "";
    }

    if (this.ebT.size() == 1) {
      localObject1 = this.ebT.get(0);
      if ((localObject1 instanceof cDP)) {
        return ((cDP)localObject1).getText();
      }
      return "";
    }

    Object localObject1 = new StringBuffer();
    int i = 0;

    for (int j = 0; j < this.ebT.size(); j++) {
      Object localObject2 = this.ebT.get(j);
      if ((localObject2 instanceof cDP)) {
        ((StringBuffer)localObject1).append(((cDP)localObject2).getText());
        i = 1;
      }
    }

    if (i == 0) {
      return "";
    }

    return ((StringBuffer)localObject1).toString();
  }

  public String czI()
  {
    return getText().trim();
  }

  public String czH()
  {
    return cDP.nk(getText());
  }

  public String rU(String paramString)
  {
    dRW localdRW = sd(paramString);
    if (localdRW == null) {
      return null;
    }
    return localdRW.getText();
  }

  public String rV(String paramString)
  {
    dRW localdRW = sd(paramString);
    if (localdRW == null) {
      return null;
    }
    return localdRW.czI();
  }

  public String rW(String paramString)
  {
    dRW localdRW = sd(paramString);
    if (localdRW == null) {
      return null;
    }
    return localdRW.czH();
  }

  public String d(String paramString, bkj parambkj)
  {
    dRW localdRW = k(paramString, parambkj);
    if (localdRW == null) {
      return null;
    }
    return localdRW.getText();
  }

  public String e(String paramString, bkj parambkj)
  {
    dRW localdRW = k(paramString, parambkj);
    if (localdRW == null) {
      return null;
    }
    return localdRW.czI();
  }

  public String f(String paramString, bkj parambkj)
  {
    dRW localdRW = k(paramString, parambkj);
    if (localdRW == null) {
      return null;
    }
    return localdRW.czH();
  }

  public dRW rX(String paramString)
  {
    this.ebT.clear();

    if (paramString != null) {
      g(new cDP(paramString));
    }

    return this;
  }

  public List getContent()
  {
    return this.ebT;
  }

  public List c(KN paramKN)
  {
    return this.ebT.f(paramKN);
  }

  public List aSb()
  {
    ArrayList localArrayList = new ArrayList(this.ebT);
    this.ebT.clear();
    return localArrayList;
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

  public dRW A(Collection paramCollection)
  {
    this.ebT.q(paramCollection);
    return this;
  }

  public dRW f(int paramInt, djh paramdjh)
  {
    this.ebT.set(paramInt, paramdjh);
    return this;
  }

  public aTe e(int paramInt, Collection paramCollection)
  {
    this.ebT.remove(paramInt);
    this.ebT.addAll(paramInt, paramCollection);
    return this;
  }

  public dRW rY(String paramString)
  {
    return g(new cDP(paramString));
  }

  public dRW g(djh paramdjh)
  {
    this.ebT.add(paramdjh);
    return this;
  }

  public dRW e(dRW paramdRW)
  {
    this.ebT.add(paramdRW);
    return this;
  }

  public dRW B(Collection paramCollection)
  {
    this.ebT.addAll(paramCollection);
    return this;
  }

  public dRW g(int paramInt, djh paramdjh)
  {
    this.ebT.c(paramInt, paramdjh);
    return this;
  }

  public dRW f(int paramInt, Collection paramCollection)
  {
    this.ebT.addAll(paramInt, paramCollection);
    return this;
  }

  public List aRU() {
    int i = getContentSize();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      djh localdjh = mq(j);
      localArrayList.add(localdjh.clone());
    }
    return localArrayList;
  }

  public djh mq(int paramInt) {
    return (djh)this.ebT.get(paramInt);
  }

  public boolean c(djh paramdjh)
  {
    return this.ebT.remove(paramdjh);
  }

  public djh mr(int paramInt) {
    return (djh)this.ebT.remove(paramInt);
  }

  public dRW h(djh paramdjh)
  {
    this.ebT.clear();
    this.ebT.add(paramdjh);
    return this;
  }

  public boolean f(dRW paramdRW)
  {
    aTe localaTe = paramdRW.aRY();
    while ((localaTe instanceof dRW)) {
      if (localaTe == this) {
        return true;
      }
      localaTe = ((dRW)localaTe).aRY();
    }
    return false;
  }

  public List getAttributes()
  {
    return this.mof;
  }

  public dbr rZ(String paramString)
  {
    return g(paramString, bkj.fAF);
  }

  public dbr g(String paramString, bkj parambkj)
  {
    return (dbr)this.mof.a(paramString, parambkj);
  }

  public String sa(String paramString)
  {
    return h(paramString, bkj.fAF);
  }

  public String getAttributeValue(String paramString1, String paramString2)
  {
    return a(paramString1, bkj.fAF, paramString2);
  }

  public String h(String paramString, bkj parambkj)
  {
    return a(paramString, parambkj, null);
  }

  public String a(String paramString1, bkj parambkj, String paramString2)
  {
    dbr localdbr = (dbr)this.mof.a(paramString1, parambkj);
    return localdbr == null ? paramString2 : localdbr.getValue();
  }

  public dRW S(List paramList)
  {
    this.mof.q(paramList);
    return this;
  }

  public dRW bu(String paramString1, String paramString2)
  {
    return c(new dbr(paramString1, paramString2));
  }

  public dRW a(String paramString1, String paramString2, bkj parambkj)
  {
    return c(new dbr(paramString1, paramString2, parambkj));
  }

  public dRW c(dbr paramdbr)
  {
    this.mof.add(paramdbr);
    return this;
  }

  public boolean sb(String paramString)
  {
    return i(paramString, bkj.fAF);
  }

  public boolean i(String paramString, bkj parambkj)
  {
    return this.mof.c(paramString, parambkj);
  }

  public boolean d(dbr paramdbr)
  {
    return this.mof.remove(paramdbr);
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer(64).append("[Element: <").append(getQualifiedName());

    String str = getNamespaceURI();
    if (!str.equals("")) {
      localStringBuffer.append(" [Namespace: ").append(str).append("]");
    }

    localStringBuffer.append("/>]");

    return localStringBuffer.toString();
  }

  public Object clone()
  {
    dRW localdRW = null;

    localdRW = (dRW)super.clone();

    localdRW.ebT = new cPo(localdRW);
    localdRW.mof = new bsC(localdRW);
    int i;
    Object localObject3;
    if (this.mof != null) {
      for (i = 0; i < this.mof.size(); i++) {
        Object localObject1 = this.mof.get(i);
        localObject3 = (dbr)((dbr)localObject1).clone();
        localdRW.mof.add(localObject3);
      }

    }

    if (this.moe != null) {
      i = this.moe.size();
      localdRW.moe = new ArrayList(i);
      for (int j = 0; j < i; j++) {
        localObject3 = this.moe.get(j);
        localdRW.moe.add(localObject3);
      }

    }

    if (this.ebT != null) {
      for (i = 0; i < this.ebT.size(); i++) {
        Object localObject2 = this.ebT.get(i);
        if ((localObject2 instanceof dRW)) {
          localObject3 = (dRW)((dRW)localObject2).clone();
          localdRW.ebT.add(localObject3);
        } else if ((localObject2 instanceof cbG)) {
          localObject3 = (cbG)((cbG)localObject2).clone();
          localdRW.ebT.add(localObject3);
        } else if ((localObject2 instanceof cDP)) {
          localObject3 = (cDP)((cDP)localObject2).clone();
          localdRW.ebT.add(localObject3);
        } else if ((localObject2 instanceof cft)) {
          localObject3 = (cft)((cft)localObject2).clone();
          localdRW.ebT.add(localObject3);
        } else if ((localObject2 instanceof Re)) {
          localObject3 = (Re)((Re)localObject2).clone();

          localdRW.ebT.add(localObject3);
        } else if ((localObject2 instanceof dHQ)) {
          localObject3 = (dHQ)((dHQ)localObject2).clone();
          localdRW.ebT.add(localObject3);
        }
      }

    }

    if (this.moe != null)
    {
      localdRW.moe = new ArrayList();
      localdRW.moe.addAll(this.moe);
    }

    return localdRW;
  }

  private void a(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.defaultWriteObject();

    paramObjectOutputStream.writeObject(this.isK.getPrefix());
    paramObjectOutputStream.writeObject(this.isK.getURI());

    if (this.moe == null) {
      paramObjectOutputStream.write(0);
    }
    else {
      int i = this.moe.size();
      paramObjectOutputStream.write(i);
      for (int j = 0; j < i; j++) {
        bkj localbkj = (bkj)this.moe.get(j);
        paramObjectOutputStream.writeObject(localbkj.getPrefix());
        paramObjectOutputStream.writeObject(localbkj.getURI());
      }
    }
  }

  private void a(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();

    this.isK = bkj.aa((String)paramObjectInputStream.readObject(), (String)paramObjectInputStream.readObject());

    int i = paramObjectInputStream.read();

    if (i != 0) {
      this.moe = new ArrayList(i);
      for (int j = 0; j < i; j++) {
        bkj localbkj = bkj.aa((String)paramObjectInputStream.readObject(), (String)paramObjectInputStream.readObject());

        this.moe.add(localbkj);
      }
    }
  }

  public Iterator aRW()
  {
    return new cgk(this);
  }

  public Iterator d(KN paramKN)
  {
    return new bOG(new cgk(this), paramKN);
  }

  public List getChildren()
  {
    return this.ebT.f(new cBK());
  }

  public List sc(String paramString)
  {
    return j(paramString, bkj.fAF);
  }

  public List j(String paramString, bkj parambkj)
  {
    return this.ebT.f(new cBK(paramString, parambkj));
  }

  public dRW k(String paramString, bkj parambkj)
  {
    List localList = this.ebT.f(new cBK(paramString, parambkj));
    Iterator localIterator = localList.iterator();
    if (localIterator.hasNext()) {
      return (dRW)localIterator.next();
    }
    return null;
  }

  public dRW sd(String paramString)
  {
    return k(paramString, bkj.fAF);
  }

  public boolean se(String paramString)
  {
    return l(paramString, bkj.fAF);
  }

  public boolean l(String paramString, bkj parambkj)
  {
    List localList = this.ebT.f(new cBK(paramString, parambkj));
    Iterator localIterator = localList.iterator();
    if (localIterator.hasNext()) {
      localIterator.next();
      localIterator.remove();
      return true;
    }

    return false;
  }

  public boolean sf(String paramString)
  {
    return m(paramString, bkj.fAF);
  }

  public boolean m(String paramString, bkj parambkj)
  {
    boolean bool = false;

    List localList = this.ebT.f(new cBK(paramString, parambkj));
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
      localIterator.remove();
      bool = true;
    }

    return bool;
  }
}