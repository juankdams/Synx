import java.util.Properties;

public class aqp extends bxd
{
  private Properties dxS;

  public aqp()
  {
    this.dxS = new Properties();
    this.dxS.put("identity", "org.apache.tools.ant.util.IdentityMapper");

    this.dxS.put("flatten", "org.apache.tools.ant.util.FlatFileNameMapper");

    this.dxS.put("glob", "org.apache.tools.ant.util.GlobPatternMapper");

    this.dxS.put("merge", "org.apache.tools.ant.util.MergingMapper");

    this.dxS.put("regexp", "org.apache.tools.ant.util.RegexpPatternMapper");

    this.dxS.put("package", "org.apache.tools.ant.util.PackageNameMapper");

    this.dxS.put("unpackage", "org.apache.tools.ant.util.UnPackageNameMapper");
  }

  public String[] wp()
  {
    return new String[] { "identity", "flatten", "glob", "merge", "regexp", "package", "unpackage" };
  }

  public String aCu()
  {
    return this.dxS.getProperty(getValue());
  }
}