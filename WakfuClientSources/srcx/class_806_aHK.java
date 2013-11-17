import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Stack;

public abstract class aHK extends bFe
{
  private bFe efS;

  protected aHK()
  {
  }

  protected aHK(Ae paramAe)
  {
    d(paramAe);
  }

  public final void d(Ae paramAe)
  {
    cuv();
    if (this.efS != null) {
      throw new cJ("you must not specify more than one resource");
    }

    if (paramAe.size() != 1) {
      throw new cJ("only single argument resource collections are supported");
    }

    setChecked(false);
    this.efS = ((bFe)paramAe.iterator().next());
  }

  public String getName()
  {
    return aTM().getName();
  }

  public boolean TY()
  {
    return aTM().TY();
  }

  public long getLastModified()
  {
    return aTM().getLastModified();
  }

  public boolean isDirectory()
  {
    return aTM().isDirectory();
  }

  public long getSize()
  {
    return aTM().getSize();
  }

  public InputStream getInputStream()
  {
    return aTM().getInputStream();
  }

  public OutputStream getOutputStream()
  {
    return aTM().getOutputStream();
  }

  public boolean Jm()
  {
    return G(dmo.class) != null;
  }

  public void a(cxK paramcxK)
  {
    if (this.efS != null) {
      throw cur();
    }
    super.a(paramcxK);
  }

  public Object G(Class paramClass)
  {
    return aTM().G(paramClass);
  }

  public int b(bFe parambFe)
  {
    if (parambFe == this) {
      return 0;
    }
    if ((parambFe instanceof aHK)) {
      return aTM().b(((aHK)parambFe).aTM());
    }

    return aTM().b(parambFe);
  }

  public int hashCode()
  {
    return getClass().hashCode() << 4 | aTM().hashCode();
  }

  protected final bFe aTM()
  {
    if (cum()) {
      return (bFe)cup();
    }
    if (this.efS == null) {
      throw new cJ("no resource specified");
    }
    cuo();
    return this.efS;
  }

  protected void a(Stack paramStack, FF paramFF)
  {
    if (isChecked()) {
      return;
    }
    if (cum()) {
      super.a(paramStack, paramFF);
    } else {
      b(this.efS, paramStack, paramFF);
      setChecked(true);
    }
  }

  public void setName(String paramString)
  {
    throw new cJ("you can't change the name of a " + cun());
  }

  public void ds(boolean paramBoolean)
  {
    throw new cJ("you can't change the exists state of a " + cun());
  }

  public void setLastModified(long paramLong)
  {
    throw new cJ("you can't change the timestamp of a " + cun());
  }

  public void aI(boolean paramBoolean)
  {
    throw new cJ("you can't change the directory state of a " + cun());
  }

  public void setSize(long paramLong)
  {
    throw new cJ("you can't change the size of a " + cun());
  }
}