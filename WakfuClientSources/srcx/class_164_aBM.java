import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;

public class aBM
  implements ctF
{
  private File dVQ = null;

  private Properties dVR = new Properties();

  private boolean dVS = false;

  private boolean dVT = true;

  public aBM()
  {
  }

  public aBM(File paramFile)
  {
    this.dVQ = paramFile;
  }

  public void F(File paramFile)
  {
    this.dVQ = paramFile;
  }

  public File aNO()
  {
    return this.dVQ;
  }

  public boolean isValid()
  {
    return this.dVQ != null;
  }

  public void load()
  {
    if ((this.dVQ != null) && (this.dVQ.isFile()) && (this.dVQ.canRead())) {
      try {
        BufferedInputStream localBufferedInputStream = new BufferedInputStream(new FileInputStream(this.dVQ));

        this.dVR.load(localBufferedInputStream);
        localBufferedInputStream.close();
      } catch (Exception localException) {
        localException.printStackTrace();
      }
    }

    this.dVS = true;
    this.dVT = false;
  }

  public void save()
  {
    if (!this.dVT) {
      return;
    }
    if ((this.dVQ != null) && (this.dVR.propertyNames().hasMoreElements())) {
      try {
        BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.dVQ));

        this.dVR.store(localBufferedOutputStream, null);
        localBufferedOutputStream.flush();
        localBufferedOutputStream.close();
      } catch (Exception localException) {
        localException.printStackTrace();
      }
    }
    this.dVT = false;
  }

  public void DL()
  {
    this.dVR = new Properties();
    this.dVQ.delete();
    this.dVS = true;
    this.dVT = false;
  }

  public Object get(Object paramObject)
  {
    if (!this.dVS)
      load();
    try
    {
      return this.dVR.getProperty(String.valueOf(paramObject)); } catch (ClassCastException localClassCastException) {
    }
    return null;
  }

  public void put(Object paramObject1, Object paramObject2)
  {
    this.dVR.put(String.valueOf(paramObject1), String.valueOf(paramObject2));
    this.dVT = true;
  }

  public Iterator iterator()
  {
    Vector localVector = new Vector();
    Enumeration localEnumeration = this.dVR.propertyNames();
    while (localEnumeration.hasMoreElements()) {
      localVector.add(localEnumeration.nextElement().toString());
    }
    return localVector.iterator();
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("<PropertiesfileCache:");
    localStringBuffer.append("cachefile=").append(this.dVQ);
    localStringBuffer.append(";noOfEntries=").append(this.dVR.size());
    localStringBuffer.append(">");
    return localStringBuffer.toString();
  }
}