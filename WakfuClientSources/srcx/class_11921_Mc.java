import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;

public abstract class Mc extends axX
  implements Serializable
{
  private static final long serialVersionUID = 6249888059822088500L;

  protected Mc(Collection paramCollection)
  {
    super(paramCollection);
  }

  private void a(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(this.dNw);
  }

  private void a(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();
    this.dNw = ((Collection)paramObjectInputStream.readObject());
  }
}