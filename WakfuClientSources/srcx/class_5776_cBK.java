import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class cBK extends ave
{
  private static final String bdh = "@(#) $RCSfile: ElementFilter.java,v $ $Revision: 1.18 $ $Date: 2004/09/07 06:37:20 $ $Name: jdom_1_0 $";
  private String name;
  private transient bkj isK;

  public cBK()
  {
  }

  public cBK(String paramString)
  {
    this.name = paramString;
  }

  public cBK(String paramString, bkj parambkj)
  {
    this.name = paramString;
    this.isK = parambkj;
  }

  public cBK(bkj parambkj)
  {
    this.isK = parambkj;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) return true;
    if (!(paramObject instanceof cBK)) return false;

    cBK localcBK = (cBK)paramObject;

    if (localcBK.name == null) tmpTernaryOp = (this.name != null ? this.name.equals(localcBK.name) ^ true : 0);
  }

  public int hashCode()
  {
    int i = this.name != null ? this.name.hashCode() : 0;
    i = 29 * i + (this.isK != null ? this.isK.hashCode() : 0);
    return i;
  }

  public boolean matches(Object paramObject)
  {
    if ((paramObject instanceof dRW)) {
      dRW localdRW = (dRW)paramObject;
      return 
        ((this.name == null) || (this.name.equals(localdRW.getName()))) && (
        (this.isK == null) || (this.isK.equals(localdRW.cNd())));
    }
    return false;
  }

  private void a(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();

    this.isK = bkj.aa(
      (String)paramObjectInputStream.readObject(), (String)paramObjectInputStream.readObject());
  }

  private void a(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.defaultWriteObject();

    paramObjectOutputStream.writeObject(this.isK.getPrefix());
    paramObjectOutputStream.writeObject(this.isK.getURI());
  }
}