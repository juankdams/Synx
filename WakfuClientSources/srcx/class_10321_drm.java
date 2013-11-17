import java.util.Stack;
import java.util.Vector;

class drm
{
  private static final String bdh = "@(#) $RCSfile: NamespaceStack.java,v $ $Revision: 1.13 $ $Date: 2004/02/06 09:28:32 $ $Name: jdom_1_0 $";
  private Stack ltJ = new Stack();
  private Stack ltK = new Stack();

  public String getURI(String paramString)
  {
    int i = this.ltJ.lastIndexOf(paramString);
    if (i == -1) {
      return null;
    }
    String str = (String)this.ltK.elementAt(i);
    return str;
  }

  public String pop()
  {
    String str = (String)this.ltJ.pop();
    this.ltK.pop();

    return str;
  }

  public void b(bkj parambkj)
  {
    this.ltJ.push(parambkj.getPrefix());
    this.ltK.push(parambkj.getURI());
  }

  public int size()
  {
    return this.ltJ.size();
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    String str = System.getProperty("line.separator");
    localStringBuffer.append("Stack: " + this.ltJ.size() + str);
    for (int i = 0; i < this.ltJ.size(); i++) {
      localStringBuffer.append(String.valueOf(this.ltJ.elementAt(i)) + "&" + this.ltK.elementAt(i) + str);
    }
    return localStringBuffer.toString();
  }
}