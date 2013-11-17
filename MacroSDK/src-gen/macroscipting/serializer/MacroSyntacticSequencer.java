package macroscipting.serializer;

import com.google.inject.Inject;
import java.util.List;
import macroscipting.services.MacroGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MacroSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MacroGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ifDirective_LeftCurlyBracketKeyword_6_q;
	protected AbstractElementAlias match_ifDirective_RightCurlyBracketKeyword_8_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MacroGrammarAccess) access;
		match_ifDirective_LeftCurlyBracketKeyword_6_q = new TokenAlias(false, true, grammarAccess.getIfDirectiveAccess().getLeftCurlyBracketKeyword_6());
		match_ifDirective_RightCurlyBracketKeyword_8_q = new TokenAlias(false, true, grammarAccess.getIfDirectiveAccess().getRightCurlyBracketKeyword_8());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ifDirective_LeftCurlyBracketKeyword_6_q.equals(syntax))
				emit_ifDirective_LeftCurlyBracketKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ifDirective_RightCurlyBracketKeyword_8_q.equals(syntax))
				emit_ifDirective_RightCurlyBracketKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '{'?
	 */
	protected void emit_ifDirective_LeftCurlyBracketKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '}'?
	 */
	protected void emit_ifDirective_RightCurlyBracketKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
