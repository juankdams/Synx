public class col extends byK
{
  private final bCJ aYR;

  public col(bCJ parambCJ)
  {
    this.aYR = parambCJ;
  }

  public Object getFieldValue(String paramString)
  {
    Object localObject;
    if (paramString.equals("bagName")) {
      localObject = Hh.QM().dh(this.aYR.ok());
      if (localObject != null)
        return ((bBn)localObject).getName();
    }
    else if (paramString.equals("bagIconUrl")) {
      localObject = Hh.QM().dh(this.aYR.ok());
      if (localObject != null)
        return ay.bd().u(((bBn)localObject).oc());
    } else {
      if (paramString.equals("bagId"))
        return Long.valueOf(this.aYR.EN());
      if (paramString.equals("bagInventory")) {
        localObject = new Object[this.aYR.cHT().cFy()];
        gA[] arrayOfgA = (gA[])this.aYR.cHT().a(new gA[this.aYR.cHT().cFy()]);
        cty localcty = new cty();
        for (int i = 0; i < arrayOfgA.length; i++) {
          if (arrayOfgA[i] == null)
            localObject[i] = localcty;
          else {
            localObject[i] = arrayOfgA[i];
          }
        }
        return localObject;
      }if (paramString.equals("bagNameSize"))
        return getFieldValue("bagName") + " (" + this.aYR.size() + "/" + this.aYR.cFy() + ")";
      if (paramString.equals("bagSize"))
        return Integer.valueOf(this.aYR.size());
      if (paramString.equals("bagPosition"))
        return Byte.valueOf(this.aYR.cHq());
    }
    return super.getFieldValue(paramString);
  }

  public bCJ aQC() {
    return this.aYR;
  }
}