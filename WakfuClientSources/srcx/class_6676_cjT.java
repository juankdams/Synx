import java.lang.reflect.Array;
import java.util.Iterator;

public class cjT
  implements Iterable
{
  private Object[] hKe;

  public cjT()
  {
    this.hKe = ((Object[])Array.newInstance(Object.class, 0));
  }

  public cjT(Object[] paramArrayOfObject) {
    this.hKe = ((Object[])paramArrayOfObject.clone());
  }

  public void add(Object paramObject) {
    if (paramObject == null)
      return;
    int i = this.hKe.length;
    Object[] arrayOfObject = (Object[])Array.newInstance(Object.class, i + 1);
    System.arraycopy(this.hKe, 0, arrayOfObject, 0, i);
    arrayOfObject[i] = paramObject;
    this.hKe = arrayOfObject;
  }

  public void add(Object[] paramArrayOfObject) {
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0))
      return;
    int i = this.hKe.length;
    Object[] arrayOfObject = (Object[])Array.newInstance(Object.class, i + paramArrayOfObject.length);
    if (i > 0)
      System.arraycopy(this.hKe, 0, arrayOfObject, 0, i);
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject, i, paramArrayOfObject.length);
    this.hKe = arrayOfObject;
  }

  public void q(Object[] paramArrayOfObject) {
    if (paramArrayOfObject == null) {
      this.hKe = ((Object[])Array.newInstance(Object.class, 0));
      return;
    }
    this.hKe = paramArrayOfObject;
  }

  public void set(int paramInt, Object paramObject) {
    if (paramInt < 0)
      return;
    if (paramInt >= this.hKe.length) {
      Object[] arrayOfObject = (Object[])Array.newInstance(Object.class, paramInt + 1);
      System.arraycopy(this.hKe, 0, arrayOfObject, 0, this.hKe.length);
      this.hKe = arrayOfObject;
    }
    this.hKe[paramInt] = paramObject;
  }

  public Object get(int paramInt) {
    if ((paramInt < 0) || (paramInt >= this.hKe.length))
      return null;
    return this.hKe[paramInt];
  }

  public int size() {
    return this.hKe.length;
  }

  public void clear() {
    this.hKe = ((Object[])Array.newInstance(Object.class, 0));
  }

  public Iterator iterator() {
    return new tK(this.hKe, false);
  }

  public void S(dGy paramdGy) {
    for (int i = 0; i < this.hKe.length; i++)
      if (!paramdGy.d(this.hKe[i]))
        return;
  }
}