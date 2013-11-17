import java.io.File;

public class bMy extends bRt
{
  private String type = null;
  public static final String gQe = "type";

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{typeselector type: ");
    localStringBuilder.append(this.type);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public void a(aVM paramaVM)
  {
    this.type = paramaVM.getValue();
  }

  public void a(daL[] paramArrayOfdaL)
  {
    super.a(paramArrayOfdaL);
    if (paramArrayOfdaL != null)
      for (int i = 0; i < paramArrayOfdaL.length; i++) {
        String str = paramArrayOfdaL[i].getName();
        if ("type".equalsIgnoreCase(str)) {
          aVM localaVM = new aVM();
          localaVM.setValue(paramArrayOfdaL[i].getValue());
          a(localaVM);
        } else {
          be("Invalid parameter " + str);
        }
      }
  }

  public void cd()
  {
    if (this.type == null)
      be("The type attribute is required");
  }

  public boolean a(File paramFile1, String paramString, File paramFile2)
  {
    validate();

    if (paramFile2.isDirectory()) {
      return this.type.equals("dir");
    }
    return this.type.equals("file");
  }
}