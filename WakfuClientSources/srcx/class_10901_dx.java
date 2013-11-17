import java.util.Comparator;

class dx
  implements Comparator
{
  private static dx TO = new dx();

  public int a(axU paramaxU1, axU paramaxU2)
  {
    return paramaxU1.getTreeDepth() - paramaxU2.getTreeDepth();
  }
}