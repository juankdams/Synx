import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class cPo extends AbstractList
  implements Serializable
{
  private static final String bdh = "@(#) $RCSfile: ContentList.java,v $ $Revision: 1.39 $ $Date: 2004/02/28 03:30:27 $ $Name: jdom_1_0 $";
  private static final int fZx = 5;
  private static final int kye = 0;
  private static final int kyf = 1;
  private static final int kyg = 2;
  private static final int kyh = 3;
  private static final int NEXT = 4;
  private static final int ADD = 5;
  private static final int aat = 6;
  private djh[] kyi;
  private int size;
  private aTe kyj;

  cPo(aTe paramaTe)
  {
    this.kyj = paramaTe;
  }

  static int a(cPo paramcPo)
  {
    return paramcPo.cGy();
  }

  static djh[] b(cPo paramcPo)
  {
    return paramcPo.kyi; } 
  static int c(cPo paramcPo) { return paramcPo.size; }


  public void add(int paramInt, Object paramObject)
  {
    if (paramObject == null) {
      throw new bLc("Cannot add null object");
    }
    if ((paramObject instanceof djh))
      c(paramInt, (djh)paramObject);
    else
      throw new bLc("Class " + 
        paramObject.getClass().getName() + 
        " is of unrecognized type and cannot be added");
  }

  void c(int paramInt, djh paramdjh)
  {
    if (paramdjh == null) {
      throw new bLc("Cannot add null object");
    }
    if ((this.kyj instanceof aFz)) {
      d(paramInt, paramdjh);
    }
    else {
      e(paramInt, paramdjh);
    }

    if (paramdjh.aRY() != null) {
      aTe localaTe = paramdjh.aRY();
      if ((localaTe instanceof aFz)) {
        throw new bLc((dRW)paramdjh, 
          "The Content already has an existing parent document");
      }

      throw new bLc(
        "The Content already has an existing parent \"" + 
        ((dRW)localaTe).getQualifiedName() + "\"");
    }

    if (paramdjh == this.kyj) {
      throw new bLc(
        "The Element cannot be added to itself");
    }

    if (((this.kyj instanceof dRW)) && ((paramdjh instanceof dRW)) && 
      (((dRW)paramdjh).f((dRW)this.kyj))) {
      throw new bLc(
        "The Element cannot be added as a descendent of itself");
    }

    if ((paramInt < 0) || (paramInt > this.size)) {
      throw new IndexOutOfBoundsException("Index: " + paramInt + 
        " Size: " + size());
    }

    paramdjh.a(this.kyj);

    ensureCapacity(this.size + 1);
    if (paramInt == this.size) {
      this.kyi[(this.size++)] = paramdjh;
    } else {
      System.arraycopy(this.kyi, paramInt, this.kyi, paramInt + 1, this.size - paramInt);
      this.kyi[paramInt] = paramdjh;
      this.size += 1;
    }
    this.modCount += 1;
  }

  public boolean addAll(int paramInt, Collection paramCollection)
  {
    if ((paramInt < 0) || (paramInt > this.size)) {
      throw new IndexOutOfBoundsException("Index: " + paramInt + 
        " Size: " + size());
    }

    if ((paramCollection == null) || (paramCollection.size() == 0)) {
      return false;
    }
    ensureCapacity(size() + paramCollection.size());

    int i = 0;
    try {
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext()) {
        Object localObject = localIterator.next();
        add(paramInt + i, localObject);
        i++;
      }
    }
    catch (RuntimeException localRuntimeException) {
      for (int j = 0; j < i; j++) {
        remove(paramInt);
      }
      throw localRuntimeException;
    }

    return true;
  }

  public boolean addAll(Collection paramCollection)
  {
    return addAll(size(), paramCollection);
  }

  public void clear()
  {
    if (this.kyi != null) {
      for (int i = 0; i < this.size; i++) {
        djh localdjh = this.kyi[i];
        e(localdjh);
      }
      this.kyi = null;
      this.size = 0;
    }
    this.modCount += 1;
  }

  void q(Collection paramCollection)
  {
    djh[] arrayOfdjh = this.kyi;
    int i = this.size;

    this.kyi = null;
    this.size = 0;

    if ((paramCollection != null) && (paramCollection.size() != 0)) {
      ensureCapacity(paramCollection.size());
      try {
        addAll(0, paramCollection);
      }
      catch (RuntimeException localRuntimeException) {
        this.kyi = arrayOfdjh;
        this.size = i;
        throw localRuntimeException;
      }
    }

    if (arrayOfdjh != null) {
      for (int j = 0; j < i; j++) {
        e(arrayOfdjh[j]);
      }
    }
    this.modCount += 1;
  }

  private void d(int paramInt, djh paramdjh)
  {
    if ((paramdjh instanceof dRW)) {
      if (cGA() >= 0) {
        throw new bLc(
          "Cannot add a second root element, only one is allowed");
      }
      if (cGz() > paramInt) {
        throw new bLc(
          "A root element cannot be added before the DocType");
      }
    }
    if ((paramdjh instanceof tk)) {
      if (cGz() >= 0) {
        throw new bLc(
          "Cannot add a second doctype, only one is allowed");
      }
      int i = cGA();
      if ((i != -1) && (i < paramInt)) {
        throw new bLc(
          "A DocType cannot be added after the root element");
      }
    }
    if ((paramdjh instanceof cbG)) {
      throw new bLc("A CDATA is not allowed at the document root");
    }

    if ((paramdjh instanceof cDP)) {
      throw new bLc("A Text is not allowed at the document root");
    }

    if ((paramdjh instanceof dHQ))
      throw new bLc("An EntityRef is not allowed at the document root");
  }

  private static void e(int paramInt, djh paramdjh)
  {
    if ((paramdjh instanceof tk))
      throw new bLc(
        "A DocType is not allowed except at the document level");
  }

  void ensureCapacity(int paramInt)
  {
    if (this.kyi == null) {
      this.kyi = new djh[Math.max(paramInt, 5)];
    } else {
      int i = this.kyi.length;
      if (paramInt > i) {
        djh[] arrayOfdjh = this.kyi;
        int j = i * 3 / 2 + 1;
        if (j < paramInt)
          j = paramInt;
        this.kyi = new djh[j];
        System.arraycopy(arrayOfdjh, 0, this.kyi, 0, this.size);
      }
    }
  }

  public Object get(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.size)) {
      throw new IndexOutOfBoundsException("Index: " + paramInt + 
        " Size: " + size());
    }
    return this.kyi[paramInt];
  }

  private int cGy()
  {
    return this.modCount;
  }

  List f(KN paramKN)
  {
    return new cGi(this, paramKN);
  }

  int cGz()
  {
    if (this.kyi != null) {
      for (int i = 0; i < this.size; i++) {
        if ((this.kyi[i] instanceof tk)) {
          return i;
        }
      }
    }
    return -1;
  }

  int cGA()
  {
    if (this.kyi != null) {
      for (int i = 0; i < this.size; i++) {
        if ((this.kyi[i] instanceof dRW)) {
          return i;
        }
      }
    }
    return -1;
  }

  public Object remove(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.size)) {
      throw new IndexOutOfBoundsException("Index: " + paramInt + 
        " Size: " + size());
    }
    djh localdjh = this.kyi[paramInt];
    e(localdjh);
    int i = this.size - paramInt - 1;
    if (i > 0)
      System.arraycopy(this.kyi, paramInt + 1, this.kyi, paramInt, i);
    this.kyi[(--this.size)] = null;
    this.modCount += 1;
    return localdjh;
  }

  private static void e(djh paramdjh)
  {
    paramdjh.a(null);
  }

  public Object set(int paramInt, Object paramObject)
  {
    if ((paramInt < 0) || (paramInt >= this.size))
      throw new IndexOutOfBoundsException("Index: " + paramInt + 
        " Size: " + size());
    int i;
    if (((paramObject instanceof dRW)) && ((this.kyj instanceof aFz))) {
      i = cGA();
      if ((i >= 0) && (i != paramInt)) {
        throw new bLc(
          "Cannot add a second root element, only one is allowed");
      }
    }

    if (((paramObject instanceof tk)) && ((this.kyj instanceof aFz))) {
      i = cGz();
      if ((i >= 0) && (i != paramInt)) {
        throw new bLc(
          "Cannot add a second doctype, only one is allowed");
      }
    }

    Object localObject = remove(paramInt);
    try {
      add(paramInt, paramObject);
    }
    catch (RuntimeException localRuntimeException) {
      add(paramInt, localObject);
      throw localRuntimeException;
    }
    return localObject;
  }

  public int size()
  {
    return this.size;
  }

  public String toString()
  {
    return super.toString();
  }

  final void f(djh paramdjh)
  {
    paramdjh.kyj = this.kyj;
    ensureCapacity(this.size + 1);
    this.kyi[(this.size++)] = paramdjh;
    this.modCount += 1;
  }
}