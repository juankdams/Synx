import org.apache.log4j.Logger;

class aav extends Zp
{
  public aav(dnK paramdnK)
  {
    super(null);
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("id"))
      return Integer.valueOf(-1);
    if (paramString.equals("name"))
      return bU.fH().getString("randomBreed");
    if (paramString.equals("maleFemalePortraitIllustration")) {
      try {
        String[] arrayOfString = new String[2];
        String str = String.format(ay.bd().getString("breedPortraitIllustrationPath"), new Object[] { "aleat" });
        arrayOfString[0] = str;
        arrayOfString[1] = str;
        return arrayOfString;
      } catch (bdh localbdh) {
        K.error("Exception", localbdh);
      }
    }

    return null;
  }
}