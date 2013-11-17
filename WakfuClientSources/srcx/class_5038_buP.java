import java.io.File;

public class buP extends Ee
{
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{dependselector targetdir: ");
    if (this.bII == null)
      localStringBuilder.append("NOT YET SET");
    else {
      localStringBuilder.append(this.bII.getName());
    }
    localStringBuilder.append(" granularity: ");
    localStringBuilder.append(this.bIK);
    if (this.bIJ != null) {
      localStringBuilder.append(" mapper: ");
      localStringBuilder.append(this.bIJ.toString());
    } else if (this.Rz != null) {
      localStringBuilder.append(" mapper: ");
      localStringBuilder.append(this.Rz.toString());
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public boolean j(File paramFile1, File paramFile2)
  {
    boolean bool = dvA.a(paramFile1, paramFile2, this.bIK);

    return bool;
  }
}