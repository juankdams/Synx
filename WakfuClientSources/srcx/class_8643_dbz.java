public class dbz extends dIM
{
  public dbz()
  {
  }

  public dbz(ank paramank)
  {
    this();
    a(paramank);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (lT()) {
      localStringBuilder.append("{notselect: ");
      localStringBuilder.append(super.toString());
      localStringBuilder.append("}");
    }
    return localStringBuilder.toString();
  }

  public void cd()
  {
    if (lU() != 1)
      be("One and only one selector is allowed within the <not> tag");
  }
}