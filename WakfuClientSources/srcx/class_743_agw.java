import java.util.ArrayList;

public class agw extends cGj
{
  public static final String bC = "name";
  public static final String dak = "authorisations";
  public static final String dal = "canBeDeleted";
  public static final String bHJ = "id";
  public static final String[] bF = { "name", "authorisations", "canBeDeleted", "id" };
  private final en[] dam;
  private final aUJ dan;

  public agw(aUJ paramaUJ)
  {
    this.dan = paramaUJ;
    cnm[] arrayOfcnm = cnm.values();
    this.dam = new en[arrayOfcnm.length];
    for (int i = 0; i < this.dam.length; i++)
      this.dam[i] = new en(arrayOfcnm[i]);
    for (en localen : this.dam) {
      boolean bool = this.dan.a(localen.lj());
      localen.setChecked(bool);
    }
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("canBeDeleted")) {
      long l1 = dqB.cXD().CE();
      long l2 = dqB.cXD().aNq();
      return Boolean.valueOf((this.dan.getId() != l1) && (this.dan.getId() != l2));
    }if (paramString.equals("id"))
      return Long.valueOf(this.dan.getId());
    if (paramString.equals("authorisations")) {
      return this.dam;
    }
    return null;
  }

  public String getName() {
    return this.dan.getName();
  }

  public long arU() {
    ArrayList localArrayList = new ArrayList();
    for (en localen : this.dam)
      if (localen.isChecked())
        localArrayList.add(localen.lj());
    return cnm.d(localArrayList);
  }

  public long arV() {
    return this.dan.bjT();
  }

  public long getId() {
    return this.dan.getId();
  }

  public aUJ arW() {
    return this.dan;
  }

  public sP arX() {
    return new sP(this.dan);
  }

  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof agw))
      return false;
    agw localagw = (agw)paramObject;
    return (localagw.arU() == arU()) && (localagw.getId() == getId()) && (localagw.getName().equals(getName()));
  }
}