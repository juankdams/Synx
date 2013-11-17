public class Zh
{
  private static final String cKt = ";";
  private static final String cKu = ":";

  public static String a(aeK paramaeK)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, paramaeK);
    b(localStringBuilder, paramaeK);

    for (int i = 0; i < paramaeK.size(); i++) {
      a(localStringBuilder, paramaeK.hO(i));
    }
    return localStringBuilder.toString();
  }

  public static aeK dS(String paramString)
  {
    aeK localaeK = new aeK("");
    return a(localaeK, paramString) ? localaeK : null;
  }

  public static boolean a(aeK paramaeK, String paramString) {
    if (paramString == null) {
      paramaeK.reset();
      return false;
    }

    paramaeK.clear();
    try
    {
      String[] arrayOfString1 = paramString.split(";");
      for (String str : arrayOfString1) {
        String[] arrayOfString3 = str.split(":");
        a(paramaeK, arrayOfString3[0], arrayOfString3[1]);
      }
      paramaeK.sort();
    } catch (Exception localException) {
      paramaeK.reset();
    }
    return true;
  }

  private static void a(aeK paramaeK, String paramString1, String paramString2) {
    if (paramString1.equals("bounds"))
      b(paramaeK, paramString2);
    else if (paramString1.equals("point"))
      c(paramaeK, paramString2);
    else if (paramString1.equals("name"))
      paramaeK.setName(paramString2);
  }

  private static void a(StringBuilder paramStringBuilder, aeK paramaeK)
  {
    paramStringBuilder.append("name").append(":");
    paramStringBuilder.append(paramaeK.getName());
    paramStringBuilder.append(";");
  }

  private static void b(StringBuilder paramStringBuilder, aeK paramaeK) {
    paramStringBuilder.append("bounds").append(":");
    paramStringBuilder.append(paramaeK.aqs()).append(",");
    paramStringBuilder.append(paramaeK.aqu()).append(",");
    paramStringBuilder.append(paramaeK.aqt()).append(",");
    paramStringBuilder.append(paramaeK.aqv());
    paramStringBuilder.append(";");
  }

  private static void b(aeK paramaeK, String paramString) {
    String[] arrayOfString = paramString.split(",");
    double d1 = Double.parseDouble(arrayOfString[0]);
    double d2 = Double.parseDouble(arrayOfString[1]);
    double d3 = Double.parseDouble(arrayOfString[2]);
    double d4 = Double.parseDouble(arrayOfString[3]);
    paramaeK.a(d1, d2, d3, d4);
  }

  private static void a(StringBuilder paramStringBuilder, bJP parambJP) {
    paramStringBuilder.append("point").append(":");
    paramStringBuilder.append(parambJP.getX()).append(",").append(parambJP.getY());
    if (parambJP.bRw())
      paramStringBuilder.append(",").append("i").append(",").append(parambJP.bRr()).append(",").append(parambJP.bRs());
    if (parambJP.bRx())
      paramStringBuilder.append(",").append("o").append(",").append(parambJP.bRt()).append(",").append(parambJP.bRu());
    paramStringBuilder.append(";");
  }

  private static void c(aeK paramaeK, String paramString) {
    String[] arrayOfString = paramString.split(",");
    double d1 = Double.parseDouble(arrayOfString[0]);
    double d2 = Double.parseDouble(arrayOfString[1]);

    bJP localbJP = new bJP(d1, d2);

    if (arrayOfString.length > 2) {
      a(localbJP, arrayOfString, 2);
    }
    if (arrayOfString.length > 5) {
      a(localbJP, arrayOfString, 5);
    }
    paramaeK.a(localbJP);
  }

  private static void a(bJP parambJP, String[] paramArrayOfString, int paramInt) {
    double d1 = Double.parseDouble(paramArrayOfString[(paramInt + 1)]);
    double d2 = Double.parseDouble(paramArrayOfString[(paramInt + 2)]);

    if (paramArrayOfString[paramInt].equals("i")) {
      parambJP.i(d1, d2);
      return;
    }
    if (paramArrayOfString[paramInt].equals("o")) {
      parambJP.j(d1, d2);
      return;
    }
  }
}