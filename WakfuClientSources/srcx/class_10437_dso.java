import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Stack;
import org.apache.log4j.Logger;

public class dso extends bxE
{
  public static final String TAG = "Form";
  private HashMap luF;
  private bAu luG = null;

  public static final int luH = "validate".hashCode();

  public dso()
  {
    this.luF = new HashMap();
  }

  public void c(bbo parambbo)
  {
    a(parambbo.getName(), parambbo);
  }

  public void a(String paramString, bbo parambbo)
  {
    this.luF.put(paramString, parambbo);
  }

  public String getTag() {
    return "Form";
  }

  public bbo getProperty(String paramString)
  {
    return (bbo)this.luF.get(paramString);
  }

  public Collection getProperties()
  {
    return this.luF.values();
  }

  public Set getPropertyNames()
  {
    return this.luF.keySet();
  }

  public void cYU()
  {
    for (bbo localbbo : this.luF.values())
      localbbo.bpF();
  }

  public boolean isValid()
  {
    if (this.luG != null) {
      Object localObject = this.luG.bif();
      return (localObject != null) && ((localObject instanceof Boolean)) && (((Boolean)localObject).booleanValue());
    }
    return true;
  }

  public void setValidate(bAu parambAu)
  {
    this.luG = parambAu;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Form : ");
    for (bbo localbbo : this.luF.values()) {
      localStringBuilder.append("\n\t").append(localbbo.toString());
    }
    return localStringBuilder.toString();
  }

  public void bc()
  {
    this.cUY.coO().a(this);
    super.bc();
  }

  public void c(bdj parambdj)
  {
    dso localdso = (dso)parambdj;
    super.c(localdso);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == luH)
      setValidate((bAu)paramaKN.b(bAu.class, paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public void a(K paramK, aNL paramaNL, Stack paramStack, cDA paramcDA) {
    super.a(paramK, paramaNL, paramStack, paramcDA);

    String str = null;
    K localK = paramK.e("id");
    if (localK != null)
      str = localK.getStringValue();
    else {
      K.warn("Attention : l'id du formulaire est nulle.");
    }
    paramcDA.a(((cpa)paramStack.peek()).getId() + '.' + str, this);
  }

  public void d(K paramK, aNL paramaNL, Stack paramStack, cDA paramcDA) {
    super.d(paramK, paramaNL, paramStack, paramcDA);

    paramcDA.nh(((cpa)paramStack.peek()).getId() + '.' + paramK.e("id").getStringValue());
  }
}