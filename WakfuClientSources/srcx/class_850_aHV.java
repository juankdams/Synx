import java.security.PrivilegedAction;

final class aHV
  implements PrivilegedAction
{
  public Object run()
  {
    try
    {
      aHA.debug("Attempting to load jawt...", new Object[0]);
      System.loadLibrary("jawt");
      aHA.debug("...loaded jawt", new Object[0]);
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError) {
      aHA.b("Failed to load jawt", localUnsatisfiedLinkError, new Object[0]);
    }
    return null;
  }
}