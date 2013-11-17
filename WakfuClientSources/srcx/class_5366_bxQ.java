import java.io.File;
import java.util.Vector;

public class bxQ extends wM
{
  private String classname = null;
  private ank giV = null;
  private Vector giW = new Vector();
  private aoo cdY = null;

  public void setClassname(String paramString)
  {
    this.classname = paramString;
  }

  public void bFf()
  {
    if ((this.classname != null) && (this.classname.length() > 0)) {
      try {
        Class localClass = null;
        if (this.cdY == null) {
          localClass = Class.forName(this.classname);
        }
        else {
          localObject = Ga().b(this.cdY);

          localClass = Class.forName(this.classname, true, (ClassLoader)localObject);
        }
        this.giV = ((ank)localClass.asSubclass(ank.class).newInstance());
        Object localObject = Ga();
        if (localObject != null)
          ((FF)localObject).G(this.giV);
      }
      catch (ClassNotFoundException localClassNotFoundException) {
        be("Selector " + this.classname + " not initialized, no such class");
      }
      catch (InstantiationException localInstantiationException) {
        be("Selector " + this.classname + " not initialized, could not create class");
      }
      catch (IllegalAccessException localIllegalAccessException) {
        be("Selector " + this.classname + " not initialized, class not accessible");
      }
    }
    else
      be("There is no classname specified");
  }

  public void a(daL paramdaL)
  {
    this.giW.addElement(paramdaL);
  }

  public final void h(aoo paramaoo)
  {
    if (cum()) {
      throw cuq();
    }
    if (this.cdY == null)
      this.cdY = paramaoo;
    else
      this.cdY.e(paramaoo);
  }

  public final aoo aKw()
  {
    if (cum()) {
      throw cur();
    }
    if (this.cdY == null) {
      this.cdY = new aoo(Ga());
    }
    return this.cdY.aAD();
  }

  public final aoo bwY()
  {
    return this.cdY;
  }

  public void c(cxK paramcxK)
  {
    if (cum()) {
      throw cuq();
    }
    aKw().a(paramcxK);
  }

  public void cd()
  {
    if (this.giV == null) {
      bFf();
    }
    if ((this.classname == null) || (this.classname.length() < 1))
      be("The classname attribute is required");
    else if (this.giV == null)
      be("Internal Error: The custom selector was not created");
    else if ((!(this.giV instanceof MT)) && (this.giW.size() > 0))
    {
      be("Cannot set parameters on custom selector that does not implement ExtendFileSelector");
    }
  }

  public boolean a(File paramFile1, String paramString, File paramFile2)
  {
    validate();
    if ((this.giW.size() > 0) && ((this.giV instanceof MT))) {
      daL[] arrayOfdaL = new daL[this.giW.size()];
      this.giW.copyInto(arrayOfdaL);

      ((MT)this.giV).a(arrayOfdaL);
    }
    return this.giV.a(paramFile1, paramString, paramFile2);
  }
}