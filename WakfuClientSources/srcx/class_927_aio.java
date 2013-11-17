import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class aio
  implements Jf
{
  private List del = new ArrayList();

  public void a(cYd paramcYd)
  {
    a(paramcYd.cLA());
  }

  public void b(Jf paramJf)
  {
    a(paramJf);
  }

  public synchronized void a(Jf paramJf)
  {
    if ((this == paramJf) || (((paramJf instanceof aio)) && (((aio)paramJf).c(this))))
    {
      throw new IllegalArgumentException("Circular mapper containment condition detected");
    }

    this.del.add(paramJf);
  }

  protected synchronized boolean c(Jf paramJf)
  {
    boolean bool = false;
    for (Iterator localIterator = this.del.iterator(); (localIterator.hasNext()) && (!bool); ) {
      Jf localJf = (Jf)localIterator.next();
      bool = (localJf == paramJf) || (((localJf instanceof aio)) && (((aio)localJf).c(paramJf)));
    }

    return bool;
  }

  public synchronized List avg()
  {
    return Collections.unmodifiableList(this.del);
  }

  public void setFrom(String paramString)
  {
  }

  public void setTo(String paramString)
  {
  }
}