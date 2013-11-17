package macroscipting.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import macroscipting.macro.Bloc;
import macroscipting.macro.Domain;
import macroscipting.macro.MacroPackage;
import macroscipting.macro.ifDirective;
import macroscipting.macro.intDirective;
import macroscipting.macro.lockDirective;
import macroscipting.macro.onLoadBloc;
import macroscipting.macro.strDirective;
import macroscipting.macro.varDirective;
import macroscipting.macro.waitDirective;
import macroscipting.services.MacroGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MacroSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MacroGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MacroPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MacroPackage.BLOC:
				if(context == grammarAccess.getBlocRule()) {
					sequence_Bloc(context, (Bloc) semanticObject); 
					return; 
				}
				else break;
			case MacroPackage.CLASS:
				if(context == grammarAccess.getClassRule()) {
					sequence_Class(context, (macroscipting.macro.Class) semanticObject); 
					return; 
				}
				else break;
			case MacroPackage.DOMAIN:
				if(context == grammarAccess.getDomainRule()) {
					sequence_Domain(context, (Domain) semanticObject); 
					return; 
				}
				else break;
			case MacroPackage.IF_DIRECTIVE:
				if(context == grammarAccess.getDirectiveRule() ||
				   context == grammarAccess.getConditionnalDirectiveRule() ||
				   context == grammarAccess.getIfDirectiveRule()) {
					sequence_ifDirective(context, (ifDirective) semanticObject); 
					return; 
				}
				else break;
			case MacroPackage.INT_DIRECTIVE:
				if(context == grammarAccess.getDirectiveRule() ||
				   context == grammarAccess.getIntDirectiveRule()) {
					sequence_intDirective(context, (intDirective) semanticObject); 
					return; 
				}
				else break;
			case MacroPackage.LOCK_DIRECTIVE:
				if(context == grammarAccess.getDirectiveRule() ||
				   context == grammarAccess.getConditionnalDirectiveRule() ||
				   context == grammarAccess.getLockDirectiveRule()) {
					sequence_lockDirective(context, (lockDirective) semanticObject); 
					return; 
				}
				else break;
			case MacroPackage.ON_LOAD_BLOC:
				if(context == grammarAccess.getOnLoadBlocRule()) {
					sequence_onLoadBloc(context, (onLoadBloc) semanticObject); 
					return; 
				}
				else break;
			case MacroPackage.STR_DIRECTIVE:
				if(context == grammarAccess.getDirectiveRule() ||
				   context == grammarAccess.getStrDirectiveRule()) {
					sequence_strDirective(context, (strDirective) semanticObject); 
					return; 
				}
				else break;
			case MacroPackage.VAR_DIRECTIVE:
				if(context == grammarAccess.getDirectiveRule() ||
				   context == grammarAccess.getVarDirectiveRule()) {
					sequence_varDirective(context, (varDirective) semanticObject); 
					return; 
				}
				else break;
			case MacroPackage.WAIT_DIRECTIVE:
				if(context == grammarAccess.getDirectiveRule() ||
				   context == grammarAccess.getConditionnalDirectiveRule() ||
				   context == grammarAccess.getWaitDirectiveRule()) {
					sequence_waitDirective(context, (waitDirective) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=INT directives+=Directive*)
	 */
	protected void sequence_Bloc(EObject context, Bloc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superType=Class?)
	 */
	protected void sequence_Class(EObject context, macroscipting.macro.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=onLoadBloc elements+=Bloc* elements+=Class*)
	 */
	protected void sequence_Domain(EObject context, Domain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='IF' left=ID operator=operator right=ID directives+=Directive*)
	 */
	protected void sequence_ifDirective(EObject context, ifDirective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IntegerDirective value=INT)
	 */
	protected void sequence_intDirective(EObject context, intDirective semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MacroPackage.Literals.DIRECTIVE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MacroPackage.Literals.DIRECTIVE__NAME));
			if(transientValues.isValueTransient(semanticObject, MacroPackage.Literals.INT_DIRECTIVE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MacroPackage.Literals.INT_DIRECTIVE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntDirectiveAccess().getNameIntegerDirectiveParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getIntDirectiveAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='LOCK' variable=ID)
	 */
	protected void sequence_lockDirective(EObject context, lockDirective semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MacroPackage.Literals.DIRECTIVE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MacroPackage.Literals.DIRECTIVE__NAME));
			if(transientValues.isValueTransient(semanticObject, MacroPackage.Literals.LOCK_DIRECTIVE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MacroPackage.Literals.LOCK_DIRECTIVE__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLockDirectiveAccess().getNameLOCKKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLockDirectiveAccess().getVariableIDTerminalRuleCall_2_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (filePath=STRING fileName=STRING characterID=INT scope=ScopeType compactMicro='true'?)
	 */
	protected void sequence_onLoadBloc(EObject context, onLoadBloc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=StringDirective value=STRING)
	 */
	protected void sequence_strDirective(EObject context, strDirective semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MacroPackage.Literals.DIRECTIVE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MacroPackage.Literals.DIRECTIVE__NAME));
			if(transientValues.isValueTransient(semanticObject, MacroPackage.Literals.STR_DIRECTIVE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MacroPackage.Literals.STR_DIRECTIVE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStrDirectiveAccess().getNameStringDirectiveParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStrDirectiveAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='VAR' left=ID right=ID)
	 */
	protected void sequence_varDirective(EObject context, varDirective semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MacroPackage.Literals.DIRECTIVE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MacroPackage.Literals.DIRECTIVE__NAME));
			if(transientValues.isValueTransient(semanticObject, MacroPackage.Literals.VAR_DIRECTIVE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MacroPackage.Literals.VAR_DIRECTIVE__LEFT));
			if(transientValues.isValueTransient(semanticObject, MacroPackage.Literals.VAR_DIRECTIVE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MacroPackage.Literals.VAR_DIRECTIVE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarDirectiveAccess().getNameVARKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVarDirectiveAccess().getLeftIDTerminalRuleCall_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getVarDirectiveAccess().getRightIDTerminalRuleCall_4_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='WAIT' time=INT)
	 */
	protected void sequence_waitDirective(EObject context, waitDirective semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MacroPackage.Literals.DIRECTIVE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MacroPackage.Literals.DIRECTIVE__NAME));
			if(transientValues.isValueTransient(semanticObject, MacroPackage.Literals.WAIT_DIRECTIVE__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MacroPackage.Literals.WAIT_DIRECTIVE__TIME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWaitDirectiveAccess().getNameWAITKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getWaitDirectiveAccess().getTimeINTTerminalRuleCall_2_0(), semanticObject.getTime());
		feeder.finish();
	}
}
