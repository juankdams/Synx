import java.io.PrintStream;

public final class dzb
  implements cph
{
  public void a(dBN paramdBN, Throwable paramThrowable)
  {
    System.err.println("JNA: Callback " + paramdBN + " threw the following exception:");
    paramThrowable.printStackTrace();
  }
}