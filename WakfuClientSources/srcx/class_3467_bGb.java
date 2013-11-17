import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public abstract class bGb
  implements Externalizable, Cloneable
{
  static final long serialVersionUID = -1792948471915530295L;
  protected static final float gBZ = 0.5F;
  protected static final int gCa = 10;
  protected transient int _size;
  protected transient int gCb;
  protected float gCc;
  protected int gCd;
  protected int gCe;
  protected float gCf;
  private transient boolean gCg = false;

  public bGb()
  {
    this(10, 0.5F);
  }

  public bGb(int paramInt)
  {
    this(paramInt, 0.5F);
  }

  public bGb(int paramInt, float paramFloat)
  {
    this.gCc = paramFloat;

    this.gCf = paramFloat;

    aO(asd.aB(paramInt / paramFloat));
  }

  public Object clone() {
    try {
      return super.clone(); } catch (CloneNotSupportedException localCloneNotSupportedException) {
    }
    return null;
  }

  public boolean isEmpty()
  {
    return 0 == this._size;
  }

  public int size()
  {
    return this._size;
  }

  protected abstract int capacity();

  public void ensureCapacity(int paramInt)
  {
    if (paramInt > this.gCd - size()) {
      rehash(aKv.mS(asd.aB((paramInt + size()) / this.gCc) + 1));

      sF(capacity());
    }
  }

  public void compact()
  {
    rehash(aKv.mS(asd.aB(size() / this.gCc) + 1));
    sF(capacity());

    if (this.gCf != 0.0F)
      sG(size());
  }

  public void bP(float paramFloat)
  {
    if (paramFloat < 0.0F) {
      throw new IllegalArgumentException("Factor must be >= 0: " + paramFloat);
    }

    this.gCf = paramFloat;
  }

  public float bOk()
  {
    return this.gCf;
  }

  public final void trimToSize()
  {
    compact();
  }

  protected void aQ(int paramInt)
  {
    this._size -= 1;

    if (this.gCf != 0.0F) {
      this.gCe -= 1;

      if ((!this.gCg) && (this.gCe <= 0))
      {
        compact();
      }
    }
  }

  public void clear()
  {
    this._size = 0;
    this.gCb = capacity();
  }

  protected int aO(int paramInt)
  {
    int i = aKv.mS(paramInt);
    sF(i);
    sG(paramInt);

    return i;
  }

  protected abstract void rehash(int paramInt);

  protected void bOl()
  {
    this.gCg = true;
  }

  protected void fY(boolean paramBoolean)
  {
    this.gCg = false;

    if ((paramBoolean) && (this.gCe <= 0) && (this.gCf != 0.0F))
    {
      compact();
    }
  }

  private void sF(int paramInt)
  {
    this.gCd = Math.min(paramInt - 1, (int)(paramInt * this.gCc));
    this.gCb = (paramInt - this._size);
  }

  private void sG(int paramInt)
  {
    if (this.gCf != 0.0F)
    {
      this.gCe = ((int)(paramInt * this.gCf + 0.5F));
    }
  }

  protected final void fZ(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.gCb -= 1;
    }

    if ((++this._size > this.gCd) || (this.gCb == 0))
    {
      int i = this._size > this.gCd ? aKv.mS(capacity() << 1) : capacity();
      rehash(i);
      sF(capacity());
    }
  }

  protected int bOm() {
    return capacity() << 1;
  }

  public void writeExternal(ObjectOutput paramObjectOutput)
  {
    paramObjectOutput.writeByte(0);

    paramObjectOutput.writeFloat(this.gCc);

    paramObjectOutput.writeFloat(this.gCf);
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    paramObjectInput.readByte();

    float f = this.gCc;
    this.gCc = paramObjectInput.readFloat();

    this.gCf = paramObjectInput.readFloat();

    if (f != this.gCc)
      aO((int)Math.ceil(10.0F / this.gCc));
  }
}