import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.DFA;

class apL extends DFA
{
  public apL(aJc paramaJc, BaseRecognizer paramBaseRecognizer)
  {
    this.recognizer = paramBaseRecognizer;
    this.decisionNumber = 50;
    this.eot = aJc.eiZ;
    this.eof = aJc.eja;
    this.min = aJc.ejb;
    this.max = aJc.ejc;
    this.accept = aJc.ejd;
    this.special = aJc.eje;
    this.transition = aJc.ejf;
  }

  public String getDescription() {
    return "190:1: FLOAT : ( NUMBER | NUMBER '.' ( NUMERAL )+ );";
  }
}