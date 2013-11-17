import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class bkS
  implements ListIterator
{
  private int fBn = 0;
  private aUw fBo;
  private aUw fBp;

  bkS(cjX paramcjX, int paramInt)
  {
    if ((paramInt < 0) || (paramInt > paramcjX._size)) {
      throw new IndexOutOfBoundsException();
    }

    this.fBn = paramInt;
    if (paramInt == 0) {
      this.fBo = paramcjX.hKg;
    } else if (paramInt == paramcjX._size) {
      this.fBo = null;
    }
    else
    {
      int i;
      if (paramInt < paramcjX._size >> 1) {
        i = 0;
        for (this.fBo = paramcjX.hKg; i < paramInt; i++)
          this.fBo = this.fBo.bjx();
      }
      else {
        i = paramcjX._size - 1;
        for (this.fBo = paramcjX.hKh; i > paramInt; i--)
          this.fBo = this.fBo.bjy();
      }
    }
  }

  public final void c(aUw paramaUw)
  {
    this.fBp = null;
    this.fBn += 1;

    if (this.fBq._size == 0)
      this.fBq.e(paramaUw);
    else
      this.fBq.b(this.fBo, paramaUw);
  }

  public final boolean hasNext()
  {
    return this.fBn != this.fBq._size;
  }

  public final boolean hasPrevious()
  {
    return this.fBn != 0;
  }

  public final aUw bvA()
  {
    if (this.fBn == this.fBq._size) {
      throw new NoSuchElementException();
    }

    this.fBp = this.fBo;
    this.fBo = this.fBo.bjx();
    this.fBn += 1;
    return this.fBp;
  }

  public final int nextIndex()
  {
    return this.fBn;
  }

  public final aUw bvB()
  {
    if (this.fBn == 0) {
      throw new NoSuchElementException();
    }

    if (this.fBn == this.fBq._size)
      this.fBp = (this.fBo = this.fBq.hKh);
    else {
      this.fBp = (this.fBo = this.fBo.bjy());
    }

    this.fBn -= 1;
    return this.fBp;
  }

  public final int previousIndex()
  {
    return this.fBn - 1;
  }

  public final void remove()
  {
    if (this.fBp == null) {
      throw new IllegalStateException("must invoke next or previous before invoking remove");
    }

    if (this.fBp != this.fBo) {
      this.fBn -= 1;
    }
    this.fBo = this.fBp.bjx();
    this.fBq.remove(this.fBp);
    this.fBp = null;
  }

  public final void d(aUw paramaUw)
  {
    if (this.fBp == null) {
      throw new IllegalStateException();
    }
    aUw localaUw = paramaUw;

    if (this.fBp == this.fBq.hKg) {
      this.fBq.hKg = localaUw;
    }

    if (this.fBp == this.fBq.hKh) {
      this.fBq.hKh = localaUw;
    }

    a(this.fBp, localaUw);
    this.fBp = localaUw;
  }

  private void a(aUw paramaUw1, aUw paramaUw2)
  {
    aUw localaUw1 = paramaUw1.bjy();
    aUw localaUw2 = paramaUw1.bjx();

    if (null != localaUw1) {
      paramaUw2.b(localaUw1);
      localaUw1.a(paramaUw2);
    }
    if (null != localaUw2) {
      paramaUw2.a(localaUw2);
      localaUw2.b(paramaUw2);
    }
    paramaUw1.a(null);
    paramaUw1.b(null);
  }
}