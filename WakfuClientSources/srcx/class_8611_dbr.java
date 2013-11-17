import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class dbr
  implements Serializable, Cloneable
{
  private static final String bdh = "@(#) $RCSfile: Attribute.java,v $ $Revision: 1.52 $ $Date: 2004/03/01 23:58:28 $ $Name: jdom_1_0 $";
  public static final int kTh = 0;
  public static final int kTi = 1;
  public static final int kTj = 2;
  public static final int kTk = 3;
  public static final int kTl = 4;
  public static final int kTm = 5;
  public static final int kTn = 6;
  public static final int kTo = 7;
  public static final int kTp = 8;
  public static final int kTq = 9;
  public static final int kTr = 10;
  protected String name;
  protected transient bkj isK;
  protected String value;
  protected int type = 0;
  protected Object dTF;

  protected dbr()
  {
  }

  public dbr(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, 0, bkj.fAF);
  }

  public dbr(String paramString1, String paramString2, int paramInt)
  {
    this(paramString1, paramString2, paramInt, bkj.fAF);
  }

  public dbr(String paramString1, String paramString2, int paramInt, bkj parambkj)
  {
    oI(paramString1);
    oJ(paramString2);
    zA(paramInt);
    a(parambkj);
  }

  public dbr(String paramString1, String paramString2, bkj parambkj)
  {
    oI(paramString1);
    oJ(paramString2);
    a(parambkj);
  }

  public Object clone()
  {
    dbr localdbr = null;
    try
    {
      localdbr = (dbr)super.clone();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }

    localdbr.dTF = null;
    return localdbr;
  }

  public dbr cNb()
  {
    dRW localdRW = cNf();
    if (localdRW != null) {
      localdRW.i(getName(), cNd());
    }
    return this;
  }

  public final boolean equals(Object paramObject)
  {
    return paramObject == this;
  }

  public int cNc()
  {
    return this.type;
  }

  public boolean getBooleanValue()
  {
    String str = this.value.trim();
    if ((str.equalsIgnoreCase("true")) || 
      (str.equalsIgnoreCase("on")) || 
      (str.equalsIgnoreCase("1")) || 
      (str.equalsIgnoreCase("yes")))
      return true;
    if ((str.equalsIgnoreCase("false")) || 
      (str.equalsIgnoreCase("off")) || 
      (str.equalsIgnoreCase("0")) || 
      (str.equalsIgnoreCase("no"))) {
      return false;
    }
    throw new asG(this.name, "boolean");
  }

  public aFz getDocument()
  {
    if (this.dTF != null) {
      return ((dRW)this.dTF).getDocument();
    }
    return null;
  }

  public double getDoubleValue()
  {
    try
    {
      return Double.valueOf(this.value.trim()).doubleValue(); } catch (NumberFormatException localNumberFormatException) {
    }
    throw new asG(this.name, "double");
  }

  public float ai()
  {
    try
    {
      return Float.valueOf(this.value.trim()).floatValue(); } catch (NumberFormatException localNumberFormatException) {
    }
    throw new asG(this.name, "float");
  }

  public int getIntValue()
  {
    try
    {
      return Integer.parseInt(this.value.trim()); } catch (NumberFormatException localNumberFormatException) {
    }
    throw new asG(this.name, "int");
  }

  public long ah()
  {
    try
    {
      return Long.parseLong(this.value.trim()); } catch (NumberFormatException localNumberFormatException) {
    }
    throw new asG(this.name, "long");
  }

  public String getName()
  {
    return this.name;
  }

  public bkj cNd()
  {
    return this.isK;
  }

  public String cNe()
  {
    return this.isK.getPrefix();
  }

  public String getNamespaceURI()
  {
    return this.isK.getURI();
  }

  public dRW cNf()
  {
    return (dRW)this.dTF;
  }

  public String getQualifiedName()
  {
    String str = this.isK.getPrefix();
    if ((str != null) && (!str.equals(""))) {
      return str + 
        ':' + 
        getName();
    }

    return getName();
  }

  public String getValue()
  {
    return this.value;
  }

  public final int hashCode()
  {
    return super.hashCode();
  }

  private void a(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();

    this.isK = bkj.aa(
      (String)paramObjectInputStream.readObject(), (String)paramObjectInputStream.readObject());
  }

  public dbr zA(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 10)) {
      throw new aim(String.valueOf(paramInt), 
        "attribute", "Illegal attribute type");
    }
    this.type = paramInt;
    return this;
  }

  public dbr oI(String paramString)
  {
    String str;
    if ((str = asE.ft(paramString)) != null) {
      throw new cCz(paramString, "attribute", str);
    }
    this.name = paramString;
    return this;
  }

  public dbr a(bkj parambkj)
  {
    if (parambkj == null) {
      parambkj = bkj.fAF;
    }

    if ((parambkj != bkj.fAF) && 
      (parambkj.getPrefix().equals(""))) {
      throw new cCz("", "attribute namespace", 
        "An attribute namespace without a prefix can only be the NO_NAMESPACE namespace");
    }

    this.isK = parambkj;
    return this;
  }

  protected dbr d(dRW paramdRW)
  {
    this.dTF = paramdRW;
    return this;
  }

  public dbr oJ(String paramString)
  {
    String str = null;
    if ((str = asE.fv(paramString)) != null) {
      throw new aim(paramString, "attribute", str);
    }
    this.value = paramString;
    return this;
  }

  public String toString()
  {
    return 
      "[Attribute: " + 
      getQualifiedName() + 
      "=\"" + 
      this.value + 
      "\"" + 
      "]";
  }

  private void a(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.defaultWriteObject();

    paramObjectOutputStream.writeObject(this.isK.getPrefix());
    paramObjectOutputStream.writeObject(this.isK.getURI());
  }
}