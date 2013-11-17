import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public abstract class awD extends On
  implements Serializable
{
  private static final long serialVersionUID = 2684959196747496299L;

  protected awD(List paramList)
  {
    super(paramList);
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