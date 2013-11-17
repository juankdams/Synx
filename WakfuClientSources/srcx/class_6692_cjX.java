import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractSequentialList;
import java.util.ListIterator;

public class cjX extends AbstractSequentialList
  implements Externalizable
{
  static final long serialVersionUID = 1L;
  protected aUw hKg;
  protected aUw hKh;
  protected int _size = 0;

  public ListIterator listIterator(int paramInt)
  {
    return new bkS(this, paramInt);
  }

  public int size()
  {
    return this._size;
  }

  public void a(int paramInt, aUw paramaUw)
  {
    if ((paramInt < 0) || (paramInt > size())) {
      throw new IndexOutOfBoundsException("index:" + paramInt);
    }
    b(paramInt, paramaUw);
  }

  public boolean e(aUw paramaUw)
  {
    b(this._size, paramaUw);
    return true;
  }

  public void f(aUw paramaUw)
  {
    b(0, paramaUw);
  }

  public void g(aUw paramaUw)
  {
    b(size(), paramaUw);
  }

  public void clear()
  {
    if (null != this.hKg) {
      for (aUw localaUw1 = this.hKg.bjx(); 
        localaUw1 != null; 
        localaUw1 = localaUw1.bjx()) {
        aUw localaUw2 = localaUw1.bjy();
        localaUw2.a(null);
        localaUw1.b(null);
      }
      this.hKg = (this.hKh = null);
    }
    this._size = 0;
  }

  public Object[] toArray()
  {
    Object[] arrayOfObject = new Object[this._size];
    int i = 0;
    for (aUw localaUw = this.hKg; localaUw != null; localaUw = localaUw.bjx()) {
      arrayOfObject[(i++)] = localaUw;
    }
    return arrayOfObject;
  }

  public Object[] clT()
  {
    Object[] arrayOfObject = new Object[this._size];
    int i = 0;
    aUw localaUw1 = this.hKg; for (aUw localaUw2 = null; localaUw1 != null; i++) {
      arrayOfObject[i] = localaUw1;
      localaUw2 = localaUw1;
      localaUw1 = localaUw1.bjx();
      localaUw2.a(null);
      localaUw2.b(null);
    }
    this._size = 0;
    this.hKg = (this.hKh = null);
    return arrayOfObject;
  }

  public boolean contains(Object paramObject)
  {
    for (aUw localaUw = this.hKg; localaUw != null; localaUw = localaUw.bjx()) {
      if (paramObject.equals(localaUw)) {
        return true;
      }
    }
    return false;
  }

  public aUw vB(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this._size)) {
      throw new IndexOutOfBoundsException("Index: " + paramInt + ", Size: " + this._size);
    }

    if (paramInt > this._size >> 1) {
      i = this._size - 1;
      localaUw = this.hKh;

      while (i > paramInt) {
        localaUw = localaUw.bjy();
        i--;
      }

      return localaUw;
    }

    int i = 0;
    aUw localaUw = this.hKg;

    while (i < paramInt) {
      localaUw = localaUw.bjx();
      i++;
    }

    return localaUw;
  }

  public aUw clU()
  {
    return this.hKg;
  }

  public aUw clV()
  {
    return this.hKh;
  }

  public aUw h(aUw paramaUw)
  {
    return paramaUw.bjx();
  }

  public aUw i(aUw paramaUw)
  {
    return paramaUw.bjy();
  }

  public aUw clW()
  {
    aUw localaUw1 = this.hKg;

    if (localaUw1 == null) return null;

    aUw localaUw2 = localaUw1.bjx();
    localaUw1.a(null);

    if (null != localaUw2) {
      localaUw2.b(null);
    }

    this.hKg = localaUw2;
    if (--this._size == 0) {
      this.hKh = null;
    }
    return localaUw1;
  }

  public aUw clX()
  {
    aUw localaUw1 = this.hKh;

    if (localaUw1 == null) return null;

    aUw localaUw2 = localaUw1.bjy();
    localaUw1.b(null);

    if (null != localaUw2) {
      localaUw2.a(null);
    }
    this.hKh = localaUw2;
    if (--this._size == 0) {
      this.hKg = null;
    }
    return localaUw1;
  }

  protected void b(int paramInt, aUw paramaUw)
  {
    aUw localaUw1 = paramaUw;

    if (this._size == 0) {
      this.hKg = (this.hKh = localaUw1);
    } else if (paramInt == 0) {
      localaUw1.a(this.hKg);
      this.hKg.b(localaUw1);
      this.hKg = localaUw1;
    } else if (paramInt == this._size) {
      this.hKh.a(localaUw1);
      localaUw1.b(this.hKh);
      this.hKh = localaUw1;
    } else {
      aUw localaUw2 = vB(paramInt);

      aUw localaUw3 = localaUw2.bjy();
      if (localaUw3 != null) localaUw3.a(paramaUw);

      paramaUw.b(localaUw3);
      paramaUw.a(localaUw2);
      localaUw2.b(paramaUw);
    }
    this._size += 1;
  }

  public boolean remove(Object paramObject)
  {
    if ((paramObject instanceof aUw))
    {
      aUw localaUw3 = (aUw)paramObject;

      aUw localaUw1 = localaUw3.bjy();
      aUw localaUw2 = localaUw3.bjx();

      if ((localaUw2 == null) && (localaUw1 == null))
      {
        if (paramObject != this.hKg) return false;

        this.hKg = (this.hKh = null);
      } else if (localaUw2 == null)
      {
        localaUw3.b(null);
        localaUw1.a(null);
        this.hKh = localaUw1;
      } else if (localaUw1 == null)
      {
        localaUw3.a(null);
        localaUw2.b(null);
        this.hKg = localaUw2;
      } else {
        localaUw1.a(localaUw2);
        localaUw2.b(localaUw1);
        localaUw3.a(null);
        localaUw3.b(null);
      }

      this._size -= 1;
      return true;
    }
    return false;
  }

  public void b(aUw paramaUw1, aUw paramaUw2)
  {
    if (paramaUw1 == this.hKg) {
      f(paramaUw2);
    } else if (paramaUw1 == null) {
      g(paramaUw2);
    } else {
      aUw localaUw = paramaUw1.bjy();
      paramaUw2.a(paramaUw1);
      localaUw.a(paramaUw2);
      paramaUw2.b(localaUw);
      paramaUw1.b(paramaUw2);
      this._size += 1;
    }
  }

  public void c(aUw paramaUw1, aUw paramaUw2)
  {
    if (paramaUw1 == this.hKh) {
      g(paramaUw2);
    } else if (paramaUw1 == null) {
      f(paramaUw2);
    } else {
      aUw localaUw = paramaUw1.bjx();
      paramaUw2.b(paramaUw1);
      paramaUw2.a(localaUw);
      paramaUw1.a(paramaUw2);
      localaUw.b(paramaUw2);
      this._size += 1;
    }
  }

  public boolean s(dGy paramdGy)
  {
    aUw localaUw = this.hKg;
    while (localaUw != null) {
      boolean bool = paramdGy.d(localaUw);
      if (!bool) return false;

      localaUw = localaUw.bjx();
    }

    return true;
  }

  public void writeExternal(ObjectOutput paramObjectOutput)
  {
    paramObjectOutput.writeByte(0);

    paramObjectOutput.writeInt(this._size);

    paramObjectOutput.writeObject(this.hKg);

    paramObjectOutput.writeObject(this.hKh);
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    this._size = paramObjectInput.readInt();

    this.hKg = ((aUw)paramObjectInput.readObject());

    this.hKh = ((aUw)paramObjectInput.readObject());
  }
}