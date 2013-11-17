import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class bsC extends AbstractList
  implements Serializable, List
{
  private static final String bdh = "@(#) $RCSfile: AttributeList.java,v $ $Revision: 1.23 $ $Date: 2004/02/28 03:30:27 $ $Name: jdom_1_0 $";
  private static final int fZx = 5;
  private dbr[] fZy;
  private int size;
  private dRW fZz;

  private bsC()
  {
  }

  bsC(dRW paramdRW)
  {
    this.fZz = paramdRW;
  }

  public void add(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof dbr)) {
      dbr localdbr = (dbr)paramObject;
      int i = a(localdbr);
      if (i >= 0) {
        throw new bLc("Cannot add duplicate attribute");
      }
      a(paramInt, localdbr);
    } else {
      if (paramObject == null) {
        throw new bLc("Cannot add null attribute");
      }

      throw new bLc("Class " + 
        paramObject.getClass().getName() + 
        " is not an attribute");
    }
    this.modCount += 1;
  }

  void a(int paramInt, dbr paramdbr)
  {
    if (paramdbr.cNf() != null) {
      throw new bLc(
        "The attribute already has an existing parent \"" + 
        paramdbr.cNf().getQualifiedName() + "\"");
    }

    String str = asE.a(paramdbr, this.fZz);
    if (str != null) {
      throw new bLc(this.fZz, paramdbr, str);
    }

    if ((paramInt < 0) || (paramInt > this.size)) {
      throw new IndexOutOfBoundsException("Index: " + paramInt + 
        " Size: " + size());
    }

    paramdbr.d(this.fZz);

    ensureCapacity(this.size + 1);
    if (paramInt == this.size) {
      this.fZy[(this.size++)] = paramdbr;
    } else {
      System.arraycopy(this.fZy, paramInt, this.fZy, paramInt + 1, this.size - paramInt);
      this.fZy[paramInt] = paramdbr;
      this.size += 1;
    }
    this.modCount += 1;
  }

  public boolean add(Object paramObject)
  {
    if ((paramObject instanceof dbr)) {
      dbr localdbr = (dbr)paramObject;
      int i = a(localdbr);
      if (i < 0) {
        a(size(), localdbr);
      }
      else
        b(i, localdbr);
    }
    else {
      if (paramObject == null) {
        throw new bLc("Cannot add null attribute");
      }

      throw new bLc("Class " + 
        paramObject.getClass().getName() + 
        " is not an attribute");
    }
    return true;
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
    try
    {
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
    if (this.fZy != null) {
      for (int i = 0; i < this.size; i++) {
        dbr localdbr = this.fZy[i];
        localdbr.d(null);
      }
      this.fZy = null;
      this.size = 0;
    }
    this.modCount += 1;
  }

  void q(Collection paramCollection)
  {
    dbr[] arrayOfdbr = this.fZy;
    int i = this.size;

    this.fZy = null;
    this.size = 0;

    if ((paramCollection != null) && (paramCollection.size() != 0)) {
      ensureCapacity(paramCollection.size());
      try {
        addAll(0, paramCollection);
      }
      catch (RuntimeException localRuntimeException) {
        this.fZy = arrayOfdbr;
        this.size = i;
        throw localRuntimeException;
      }
    }

    if (arrayOfdbr != null) {
      for (int j = 0; j < i; j++) {
        dbr localdbr = arrayOfdbr[j];
        localdbr.d(null);
      }
    }
    this.modCount += 1;
  }

  private void ensureCapacity(int paramInt)
  {
    if (this.fZy == null) {
      this.fZy = new dbr[Math.max(paramInt, 5)];
    }
    else {
      int i = this.fZy.length;
      if (paramInt > i) {
        dbr[] arrayOfdbr = this.fZy;
        int j = i * 3 / 2 + 1;
        if (j < paramInt)
          j = paramInt;
        this.fZy = new dbr[j];
        System.arraycopy(arrayOfdbr, 0, this.fZy, 0, this.size);
      }
    }
  }

  public Object get(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.size)) {
      throw new IndexOutOfBoundsException("Index: " + paramInt + 
        " Size: " + size());
    }

    return this.fZy[paramInt];
  }

  Object a(String paramString, bkj parambkj)
  {
    int i = b(paramString, parambkj);
    if (i < 0) {
      return null;
    }
    return this.fZy[i];
  }

  int b(String paramString, bkj parambkj)
  {
    String str1 = parambkj.getURI();
    if (this.fZy != null) {
      for (int i = 0; i < this.size; i++) {
        dbr localdbr = this.fZy[i];
        String str2 = localdbr.getNamespaceURI();
        String str3 = localdbr.getName();
        if ((str2.equals(str1)) && (str3.equals(paramString))) {
          return i;
        }
      }
    }
    return -1;
  }

  private int a(dbr paramdbr)
  {
    int i = -1;
    String str = paramdbr.getName();
    bkj localbkj = paramdbr.cNd();
    i = b(str, localbkj);
    return i;
  }

  public Object remove(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.size)) {
      throw new IndexOutOfBoundsException("Index: " + paramInt + 
        " Size: " + size());
    }
    dbr localdbr = this.fZy[paramInt];
    localdbr.d(null);
    int i = this.size - paramInt - 1;
    if (i > 0)
      System.arraycopy(this.fZy, paramInt + 1, this.fZy, paramInt, i);
    this.fZy[(--this.size)] = null;
    this.modCount += 1;
    return localdbr;
  }

  boolean c(String paramString, bkj parambkj)
  {
    int i = b(paramString, parambkj);
    if (i < 0) {
      return false;
    }
    remove(i);
    return true;
  }

  public Object set(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof dbr)) {
      dbr localdbr = (dbr)paramObject;
      int i = a(localdbr);
      if ((i >= 0) && (i != paramInt)) {
        throw new bLc("Cannot set duplicate attribute");
      }
      return b(paramInt, localdbr);
    }
    if (paramObject == null) {
      throw new bLc("Cannot add null attribute");
    }

    throw new bLc("Class " + 
      paramObject.getClass().getName() + 
      " is not an attribute");
  }

  Object b(int paramInt, dbr paramdbr)
  {
    if ((paramInt < 0) || (paramInt >= this.size)) {
      throw new IndexOutOfBoundsException("Index: " + paramInt + 
        " Size: " + size());
    }
    if (paramdbr.cNf() != null) {
      throw new bLc(
        "The attribute already has an existing parent \"" + 
        paramdbr.cNf().getQualifiedName() + "\"");
    }

    String str = asE.a(paramdbr, this.fZz);
    if (str != null) {
      throw new bLc(this.fZz, paramdbr, str);
    }

    dbr localdbr = this.fZy[paramInt];
    localdbr.d(null);

    this.fZy[paramInt] = paramdbr;
    paramdbr.d(this.fZz);
    return localdbr;
  }

  public int size()
  {
    return this.size;
  }

  public String toString()
  {
    return super.toString();
  }

  final void b(dbr paramdbr)
  {
    paramdbr.dTF = this.fZz;
    ensureCapacity(this.size + 1);
    this.fZy[(this.size++)] = paramdbr;
    this.modCount += 1;
  }
}